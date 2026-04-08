package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: j */
    public final TrackOutput mo9960j(int i, int i2) {
        return new DiscardingTrackOutput();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: h */
    public final void mo9959h() {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: a */
    public final void mo9958a(SeekMap seekMap) {
    }
}
