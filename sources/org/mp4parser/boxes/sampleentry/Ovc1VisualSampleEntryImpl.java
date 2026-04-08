package org.mp4parser.boxes.sampleentry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry {
    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(mo21840g());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.position(6);
        IsoTypeWriter.m21854e(this.f59099c, byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        writableByteChannel.write(ByteBuffer.wrap(null));
    }

    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final long getSize() {
        throw null;
    }
}
