package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.support.AbstractContainerBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MetaBox extends AbstractContainerBox {
    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(mo21840g());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        IsoTypeWriter.m21857h(0, byteBufferAllocate);
        IsoTypeWriter.m21856g(0, byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        m21818d(writableByteChannel);
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final long getSize() {
        long jM21817b = m21817b() + ((long) 4);
        return jM21817b + ((long) (jM21817b >= 4294967296L ? 16 : 8));
    }
}
