package org.mp4parser;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SkipBox implements ParsableBox {
    @Override // org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) {
        throw new RuntimeException("Cannot retrieve a skipped box - type null");
    }

    @Override // org.mp4parser.Box
    public final long getSize() {
        return 0L;
    }
}
