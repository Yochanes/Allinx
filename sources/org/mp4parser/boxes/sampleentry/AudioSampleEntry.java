package org.mp4parser.boxes.sampleentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import org.mp4parser.Box;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioSampleEntry extends AbstractSampleEntry {

    /* JADX INFO: renamed from: i */
    public static final Logger f59107i = LoggerFactory.getLogger((Class<?>) AudioSampleEntry.class);

    /* JADX INFO: renamed from: d */
    public int f59108d;

    /* JADX INFO: renamed from: f */
    public int f59109f;

    /* JADX INFO: renamed from: g */
    public long f59110g;

    /* JADX INFO: renamed from: org.mp4parser.boxes.sampleentry.AudioSampleEntry$1 */
    /* JADX INFO: compiled from: Proguard */
    class C64121 implements Box {
        @Override // org.mp4parser.Box
        public final void getBox(WritableByteChannel writableByteChannel) {
            throw null;
        }

        @Override // org.mp4parser.Box
        public final long getSize() {
            return 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioSampleEntry.class != obj.getClass()) {
            return false;
        }
        AudioSampleEntry audioSampleEntry = (AudioSampleEntry) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            getBox(Channels.newChannel(byteArrayOutputStream));
            try {
                audioSampleEntry.getBox(Channels.newChannel(byteArrayOutputStream2));
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
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(28);
        byteBufferAllocate.position(6);
        IsoTypeWriter.m21854e(this.f59099c, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        byteBufferAllocate.putInt((int) 0);
        IsoTypeWriter.m21854e(this.f59108d, byteBufferAllocate);
        IsoTypeWriter.m21854e(this.f59109f, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        if (this.f59260b.equals("mlpa")) {
            byteBufferAllocate.putInt((int) this.f59110g);
        } else {
            byteBufferAllocate.putInt((int) (this.f59110g << 16));
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        m21818d(writableByteChannel);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final long getSize() {
        long jM21817b = m21817b() + ((long) 28);
        return jM21817b + ((long) (8 + jM21817b >= 4294967296L ? 16 : 8));
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

    @Override // org.mp4parser.BasicContainer
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.f59110g + ", sampleSize=" + this.f59109f + ", channelCount=" + this.f59108d + ", boxes=" + this.f58259a + '}';
    }
}
