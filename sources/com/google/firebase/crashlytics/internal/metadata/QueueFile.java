package com.google.firebase.crashlytics.internal.metadata;

import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class QueueFile implements Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFile$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C46651 implements ElementReader {
        boolean first = true;
        final /* synthetic */ StringBuilder val$builder;

        public C46651(StringBuilder sb) {
            this.val$builder = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) {
            if (this.first) {
                this.first = false;
            } else {
                this.val$builder.append(", ");
            }
            this.val$builder.append(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final int position;

        public Element(int i, int i2) {
            this.position = i;
            this.length = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.position);
            sb.append(", length = ");
            return AbstractC0000a.m11h(this.length, "]", sb);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        public /* synthetic */ ElementInputStream(QueueFile queueFile, Element element, C46651 c46651) {
            this(element);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.access$200(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.remaining;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            QueueFile.access$300(QueueFile.this, this.position, bArr, i, i2);
            this.position = QueueFile.access$100(QueueFile.this, this.position + i2);
            this.remaining -= i2;
            return i2;
        }

        private ElementInputStream(Element element) {
            this.position = QueueFile.access$100(QueueFile.this, element.position + 4);
            this.remaining = element.length;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.access$400(QueueFile.this).seek(this.position);
            int i = QueueFile.access$400(QueueFile.this).read();
            this.position = QueueFile.access$100(QueueFile.this, this.position + 1);
            this.remaining--;
            return i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ElementReader {
        void read(InputStream inputStream, int i);
    }

    public QueueFile(File file) throws IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    public static /* synthetic */ int access$100(QueueFile queueFile, int i) {
        return queueFile.wrapPosition(i);
    }

    public static /* synthetic */ Object access$200(Object obj, String str) {
        return nonNull(obj, str);
    }

    public static /* synthetic */ void access$300(QueueFile queueFile, int i, byte[] bArr, int i2, int i3) throws IOException {
        queueFile.ringRead(i, bArr, i2, i3);
    }

    public static /* synthetic */ RandomAccessFile access$400(QueueFile queueFile) {
        return queueFile.raf;
    }

    private void expandIfNecessary(int i) throws IOException {
        int i2 = i + 4;
        int iRemainingBytes = remainingBytes();
        if (iRemainingBytes >= i2) {
            return;
        }
        int i3 = this.fileLength;
        do {
            iRemainingBytes += i3;
            i3 <<= 1;
        } while (iRemainingBytes < i2);
        setLength(i3);
        Element element = this.last;
        int iWrapPosition = wrapPosition(element.position + 4 + element.length);
        if (iWrapPosition < this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            long j = iWrapPosition - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.last.position;
        int i5 = this.first.position;
        if (i4 < i5) {
            int i6 = (this.fileLength + i4) - 16;
            writeHeader(i3, this.elementCount, i5, i6);
            this.last = new Element(i6, this.last.length);
        } else {
            writeHeader(i3, this.elementCount, i5, i4);
        }
        this.fileLength = i3;
    }

    private static void initialize(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileOpen = open(file2);
        try {
            randomAccessFileOpen.setLength(4096L);
            randomAccessFileOpen.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, 4096, 0, 0, 0);
            randomAccessFileOpen.write(bArr);
            randomAccessFileOpen.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileOpen.close();
            throw th;
        }
    }

    private static <T> T nonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile open(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int i) throws IOException {
        if (i == 0) {
            return Element.NULL;
        }
        this.raf.seek(i);
        return new Element(i, this.raf.readInt());
    }

    private void readHeader() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        int i = readInt(this.buffer, 0);
        this.fileLength = i;
        if (i > this.raf.length()) {
            throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
        }
        this.elementCount = readInt(this.buffer, 4);
        int i2 = readInt(this.buffer, 8);
        int i3 = readInt(this.buffer, 12);
        this.first = readElement(i2);
        this.last = readElement(i3);
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) + ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i + 3] & UnsignedBytes.MAX_VALUE);
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    private void ringRead(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iWrapPosition = wrapPosition(i);
        int i4 = iWrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek(iWrapPosition);
            this.raf.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iWrapPosition;
        this.raf.seek(iWrapPosition);
        this.raf.readFully(bArr, i2, i6);
        this.raf.seek(16L);
        this.raf.readFully(bArr, i2 + i6, i3 - i6);
    }

    private void ringWrite(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iWrapPosition = wrapPosition(i);
        int i4 = iWrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek(iWrapPosition);
            this.raf.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iWrapPosition;
        this.raf.seek(iWrapPosition);
        this.raf.write(bArr, i2, i6);
        this.raf.seek(16L);
        this.raf.write(bArr, i2 + i6, i3 - i6);
    }

    private void setLength(int i) throws IOException {
        this.raf.setLength(i);
        this.raf.getChannel().force(true);
    }

    private int wrapPosition(int i) {
        int i2 = this.fileLength;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void writeHeader(int i, int i2, int i3, int i4) throws IOException {
        writeInts(this.buffer, i, i2, i3, i4);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }

    private static void writeInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            writeInt(bArr, i, i2);
            i += 4;
        }
    }

    public void add(byte[] bArr) {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() {
        try {
            writeHeader(4096, 0, 0, 0);
            this.elementCount = 0;
            Element element = Element.NULL;
            this.first = element;
            this.last = element;
            if (this.fileLength > 4096) {
                setLength(4096);
            }
            this.fileLength = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.raf.close();
    }

    public synchronized void forEach(ElementReader elementReader) {
        int iWrapPosition = this.first.position;
        for (int i = 0; i < this.elementCount; i++) {
            Element element = readElement(iWrapPosition);
            elementReader.read(new ElementInputStream(this, element, null), element.length);
            iWrapPosition = wrapPosition(element.position + 4 + element.length);
        }
    }

    public boolean hasSpaceFor(int i, int i2) {
        return (usedBytes() + 4) + i <= i2;
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    public synchronized byte[] peek() {
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i = element.length;
        byte[] bArr = new byte[i];
        ringRead(element.position + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized void remove() {
        try {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.elementCount == 1) {
                clear();
            } else {
                Element element = this.first;
                int iWrapPosition = wrapPosition(element.position + 4 + element.length);
                ringRead(iWrapPosition, this.buffer, 0, 4);
                int i = readInt(this.buffer, 0);
                writeHeader(this.fileLength, this.elementCount - 1, iWrapPosition, this.last.position);
                this.elementCount--;
                this.first = new Element(iWrapPosition, i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.fileLength);
        sb.append(", size=");
        sb.append(this.elementCount);
        sb.append(", first=");
        sb.append(this.first);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", element lengths=[");
        try {
            forEach(new C46651(sb));
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int i = element.position;
        int i2 = this.first.position;
        return i >= i2 ? (i - i2) + 4 + element.length + 16 : (((i + 4) + element.length) + this.fileLength) - i2;
    }

    public synchronized void add(byte[] bArr, int i, int i2) {
        int iWrapPosition;
        try {
            nonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            expandIfNecessary(i2);
            boolean zIsEmpty = isEmpty();
            if (zIsEmpty) {
                iWrapPosition = 16;
            } else {
                Element element = this.last;
                iWrapPosition = wrapPosition(element.position + 4 + element.length);
            }
            Element element2 = new Element(iWrapPosition, i2);
            writeInt(this.buffer, 0, i2);
            ringWrite(element2.position, this.buffer, 0, 4);
            ringWrite(element2.position + 4, bArr, i, i2);
            writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element2.position : this.first.position, element2.position);
            this.last = element2;
            this.elementCount++;
            if (zIsEmpty) {
                this.first = element2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.buffer = new byte[16];
        this.raf = randomAccessFile;
        readHeader();
    }

    public synchronized void peek(ElementReader elementReader) {
        if (this.elementCount > 0) {
            elementReader.read(new ElementInputStream(this, this.first, null), this.first.length);
        }
    }
}
