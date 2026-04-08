package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ExtractorOutput {

    /* JADX INFO: renamed from: l */
    public static final ExtractorOutput f28209l = new C19531();

    /* JADX INFO: renamed from: androidx.media3.extractor.ExtractorOutput$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C19531 implements ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        /* JADX INFO: renamed from: a */
        public final void mo9958a(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        /* JADX INFO: renamed from: h */
        public final void mo9959h() {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        /* JADX INFO: renamed from: j */
        public final TrackOutput mo9960j(int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo9958a(SeekMap seekMap);

    /* JADX INFO: renamed from: h */
    void mo9959h();

    /* JADX INFO: renamed from: j */
    TrackOutput mo9960j(int i, int i2);
}
