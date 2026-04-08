package org.mp4parser.boxes.iso14496.part30;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class WebVTTSampleEntry extends AbstractSampleEntry {
    @Override // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(mo21840g());
        m21818d(writableByteChannel);
    }
}
