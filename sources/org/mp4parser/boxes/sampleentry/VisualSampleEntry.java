package org.mp4parser.boxes.sampleentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import org.mp4parser.Container;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class VisualSampleEntry extends AbstractSampleEntry implements Container {

    /* JADX INFO: renamed from: d */
    public int f59111d;

    /* JADX INFO: renamed from: f */
    public int f59112f;

    /* JADX INFO: renamed from: g */
    public double f59113g;

    /* JADX INFO: renamed from: i */
    public double f59114i;

    /* JADX INFO: renamed from: j */
    public int f59115j;

    /* JADX INFO: renamed from: n */
    public String f59116n;

    /* JADX INFO: renamed from: o */
    public int f59117o;

    /* JADX INFO: renamed from: p */
    public final long[] f59118p;

    public VisualSampleEntry(String str) {
        super(str);
        this.f59113g = 72.0d;
        this.f59114i = 72.0d;
        this.f59115j = 1;
        this.f59116n = "";
        this.f59117o = 24;
        this.f59118p = new long[3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VisualSampleEntry.class != obj.getClass()) {
            return false;
        }
        VisualSampleEntry visualSampleEntry = (VisualSampleEntry) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                visualSampleEntry.getBox(Channels.newChannel(byteArrayOutputStream2));
                return Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(mo21840g());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        IsoTypeWriter.m21854e(this.f59099c, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        long[] jArr = this.f59118p;
        byteBufferAllocate.putInt((int) jArr[0]);
        byteBufferAllocate.putInt((int) jArr[1]);
        byteBufferAllocate.putInt((int) jArr[2]);
        IsoTypeWriter.m21854e(this.f59111d, byteBufferAllocate);
        IsoTypeWriter.m21854e(this.f59112f, byteBufferAllocate);
        IsoTypeWriter.m21851b(byteBufferAllocate, this.f59113g);
        IsoTypeWriter.m21851b(byteBufferAllocate, this.f59114i);
        byteBufferAllocate.putInt((int) 0);
        IsoTypeWriter.m21854e(this.f59115j, byteBufferAllocate);
        byteBufferAllocate.put((byte) (Utf8.m21861b(this.f59116n) & 255));
        byteBufferAllocate.put(Utf8.m21860a(this.f59116n));
        int iM21861b = Utf8.m21861b(this.f59116n);
        while (iM21861b < 31) {
            iM21861b++;
            byteBufferAllocate.put((byte) 0);
        }
        IsoTypeWriter.m21854e(this.f59117o, byteBufferAllocate);
        IsoTypeWriter.m21854e(65535, byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        m21818d(writableByteChannel);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final long getSize() {
        long jM21817b = m21817b();
        return 78 + jM21817b + ((long) (jM21817b + 86 >= 4294967296L ? 16 : 8));
    }

    public final int hashCode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            return Arrays.hashCode(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
