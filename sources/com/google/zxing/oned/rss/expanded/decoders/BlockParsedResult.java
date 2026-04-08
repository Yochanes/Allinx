package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class BlockParsedResult {
    private final DecodedInformation decodedInformation;
    private final boolean finished;

    public BlockParsedResult() {
        this(null, false);
    }

    public DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public BlockParsedResult(DecodedInformation decodedInformation, boolean z2) {
        this.finished = z2;
        this.decodedInformation = decodedInformation;
    }
}
