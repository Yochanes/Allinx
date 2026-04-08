package org.mp4parser.boxes.apple;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class QuicktimeTextSampleEntry extends AbstractSampleEntry {
    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(mo21840g());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(52);
        byteBufferAllocate.position(6);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort((short) 0);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        IsoTypeWriter.m21854e(0, byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final long getSize() {
        long jM21817b = m21817b() + 52 + ((long) 0);
        return jM21817b + ((long) (8 + jM21817b >= 4294967296L ? 16 : 8));
    }
}
