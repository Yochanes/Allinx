package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {

    /* JADX INFO: renamed from: a */
    public final ExtractorOutput f29004a;

    /* JADX INFO: renamed from: b */
    public final SubtitleParser.Factory f29005b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f29006c = new SparseArray();

    /* JADX INFO: renamed from: d */
    public boolean f29007d;

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.f29004a = extractorOutput;
        this.f29005b = factory;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: a */
    public final void mo9958a(SeekMap seekMap) {
        this.f29004a.mo9958a(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: h */
    public final void mo9959h() {
        this.f29004a.mo9959h();
        if (!this.f29007d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f29006c;
            if (i >= sparseArray.size()) {
                return;
            }
            ((SubtitleTranscodingTrackOutput) sparseArray.valueAt(i)).f29016i = true;
            i++;
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: j */
    public final TrackOutput mo9960j(int i, int i2) {
        ExtractorOutput extractorOutput = this.f29004a;
        if (i2 != 3) {
            this.f29007d = true;
            return extractorOutput.mo9960j(i, i2);
        }
        SparseArray sparseArray = this.f29006c;
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = (SubtitleTranscodingTrackOutput) sparseArray.get(i);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new SubtitleTranscodingTrackOutput(extractorOutput.mo9960j(i, i2), this.f29005b);
        sparseArray.put(i, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }
}
