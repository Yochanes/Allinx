package androidx.media3.extractor.bmp;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BmpExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final SingleSampleExtractor f28373a = new SingleSampleExtractor(16973, 2, "image/bmp");

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: a */
    public final void mo10503a(long j, long j2) {
        this.f28373a.mo10503a(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: f */
    public final boolean mo10504f(ExtractorInput extractorInput) {
        return this.f28373a.mo10504f(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: g */
    public final void mo10505g(ExtractorOutput extractorOutput) {
        this.f28373a.mo10505g(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: i */
    public final int mo10506i(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f28373a.mo10506i(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
