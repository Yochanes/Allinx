package com.google.protobuf;

import androidx.compose.animation.AbstractC0455a;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.slf4j.Marker;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final ByteArrayCopier byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C48801 extends AbstractByteIterator {
        private final int limit;
        private int position = 0;

        public C48801() {
            this.limit = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i = this.position;
            if (i >= this.limit) {
                throw new NoSuchElementException();
            }
            this.position = i + 1;
            return ByteString.this.internalByteAt(i);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C48812 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ByteString byteString, ByteString byteString2) {
            return compare2(byteString, byteString2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(ByteString byteString, ByteString byteString2) {
            ?? it = byteString.iterator();
            ?? it2 = byteString2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(ByteString.access$200(it.nextByte())).compareTo(Integer.valueOf(ByteString.access$200(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Byte next() {
            return next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ ArraysByteArrayCopier(C48801 c48801) {
            this();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        public /* synthetic */ CodedBuilder(int i, C48801 c48801) {
            this(i);
        }

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new LiteralByteString(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }

        private CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.buffer = bArr;
            this.output = CodedOutputStream.newInstance(bArr);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        @Override // com.google.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        @Override // com.google.protobuf.ByteString
        public void writeToReverse(ByteOutput byteOutput) {
            writeTo(byteOutput);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                StringBuilder sbM24u = AbstractC0000a.m24u("Ran off end of other: ", ", ", ", ", i, i2);
                sbM24u.append(byteString.size());
                throw new IllegalArgumentException(sbM24u.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.substring(i, i3).equals(substring(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final int partialHash(int i, int i2, int i3) {
            return Internal.partialHash(i, this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        @Override // com.google.protobuf.ByteString
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            return Utf8.partialIsValidUtf8(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + i, iCheckRange);
        }

        @Override // com.google.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(ByteOutput byteOutput) {
            byteOutput.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ SystemByteArrayCopier(C48801 c48801) {
            this();
        }
    }

    static {
        byteArrayCopier = Android.isOnAndroidDevice() ? new SystemByteArrayCopier(null) : new ArraysByteArrayCopier(null);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new C48812();
    }

    public static /* synthetic */ int access$200(byte b2) {
        return toInt(b2);
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0000a.m9f(i, "Index < 0: "));
        }
    }

    @CanIgnoreReturnValue
    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m10g(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i2, i3, "End index: ", " >= "));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        checkRange(i, i + i2, bArr.length);
        return new LiteralByteString(byteArrayCopier.copyFrom(bArr, i, i2));
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(Internal.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i) {
        int iHexDigit = hexDigit(str.charAt(i));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        StringBuilder sbM23t = AbstractC0000a.m23t("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbM23t.append(str.charAt(i));
        sbM23t.append(" at index ");
        sbM23t.append(i);
        throw new NumberFormatException(sbM23t.toString());
    }

    public static ByteString fromHex(@CompileTimeConstant String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbM23t = AbstractC0000a.m23t("Invalid hexString ", str, " of length ");
            sbM23t.append(str.length());
            sbM23t.append(" must be even.");
            throw new NumberFormatException(sbM23t.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (extractHexDigit(str, i2 + 1) | (extractHexDigit(str, i2) << 4));
        }
        return new LiteralByteString(bArr);
    }

    private static int hexDigit(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 < 'a' || c2 > 'f') {
            return -1;
        }
        return c2 - 'W';
    }

    public static CodedBuilder newCodedBuilder(int i) {
        return new CodedBuilder(i, null);
    }

    public static Output newOutput(int i) {
        return new Output(i);
    }

    private static ByteString readChunk(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static ByteString readFrom(InputStream inputStream) {
        return readFrom(inputStream, MIN_READ_FROM_CHUNK_SIZE, 8192);
    }

    private static int toInt(byte b2) {
        return b2 & UnsignedBytes.MAX_VALUE;
    }

    private String truncateAndEscapeForDisplay() {
        return size() <= 50 ? TextFormatEscaper.escapeBytes(this) : AbstractC0000a.m19p(new StringBuilder(), TextFormatEscaper.escapeBytes(substring(0, 47)), "...");
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + Marker.ANY_NON_NULL_MARKER + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator2() {
        return iterator();
    }

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.UTF_8);
    }

    public abstract void writeTo(ByteOutput byteOutput);

    public abstract void writeTo(OutputStream outputStream);

    public final void writeTo(OutputStream outputStream, int i, int i2) {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2);

    public abstract void writeToReverse(ByteOutput byteOutput);

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i) {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C48801();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(inputStream, i);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i = Math.min(i * 2, i2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i];
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new LiteralByteString(Arrays.copyOf(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i2 = this.bufferPos;
                this.bufferPos = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            int i;
            ByteString[] byteStringArr;
            byte[] bArr;
            int i2;
            synchronized (this) {
                byteStringArr = (ByteString[]) this.flushedBuffers.toArray(new ByteString[0]);
                bArr = this.buffer;
                i2 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i2));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i3 = this.bufferPos;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.bufferPos += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    flushFullBuffer(i4);
                    System.arraycopy(bArr, i + length2, this.buffer, 0, i4);
                    this.bufferPos = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strTruncateAndEscapeForDisplay = truncateAndEscapeForDisplay();
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0000a.m19p(sb, strTruncateAndEscapeForDisplay, "\">");
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
