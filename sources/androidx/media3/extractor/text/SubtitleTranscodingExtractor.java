package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public class SubtitleTranscodingExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public SubtitleTranscodingExtractorOutput f29003a;

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: a */
    public final void mo10503a(long j, long j2) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = this.f29003a;
        if (subtitleTranscodingExtractorOutput != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = subtitleTranscodingExtractorOutput.f29006c;
                if (i >= sparseArray.size()) {
                    break;
                }
                SubtitleParser subtitleParser = ((SubtitleTranscodingTrackOutput) sparseArray.valueAt(i)).f29014g;
                if (subtitleParser != null) {
                    subtitleParser.reset();
                }
                i++;
            }
        }
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: b */
    public final Extractor mo10801b() {
        return null;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: f */
    public final boolean mo10504f(ExtractorInput extractorInput) {
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: g */
    public final void mo10505g(ExtractorOutput extractorOutput) {
        this.f29003a = new SubtitleTranscodingExtractorOutput(extractorOutput, null);
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: i */
    public final int mo10506i(ExtractorInput extractorInput, PositionHolder positionHolder) {
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        throw null;
    }
}
