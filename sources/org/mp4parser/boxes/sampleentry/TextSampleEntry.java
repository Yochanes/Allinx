package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TextSampleEntry extends AbstractSampleEntry {

    /* JADX INFO: compiled from: Proguard */
    public static class BoxRecord {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class StyleRecord {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Arrays.equals((int[]) null, (int[]) null);
        }

        public final int hashCode() {
            return 0;
        }
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(mo21840g());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(38);
        byteBufferAllocate.position(6);
        IsoTypeWriter.m21854e(this.f59099c, byteBufferAllocate);
        byteBufferAllocate.putInt((int) 0);
        byte b2 = (byte) 0;
        byteBufferAllocate.put(b2);
        byteBufferAllocate.put(b2);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final long getSize() {
        long jM21817b = m21817b() + 38;
        return jM21817b + ((long) (jM21817b >= 4294967296L ? 16 : 8));
    }

    @Override // org.mp4parser.BasicContainer
    public final String toString() {
        return "TextSampleEntry";
    }
}
