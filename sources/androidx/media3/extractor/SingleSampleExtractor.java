package androidx.media3.extractor;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SingleSampleExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final int f28272a;

    /* JADX INFO: renamed from: b */
    public final int f28273b;

    /* JADX INFO: renamed from: c */
    public final String f28274c;

    /* JADX INFO: renamed from: d */
    public int f28275d;

    /* JADX INFO: renamed from: e */
    public int f28276e;

    /* JADX INFO: renamed from: f */
    public ExtractorOutput f28277f;

    /* JADX INFO: renamed from: g */
    public TrackOutput f28278g;

    public SingleSampleExtractor(int i, int i2, String str) {
        this.f28272a = i;
        this.f28273b = i2;
        this.f28274c = str;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: a */
    public final void mo10503a(long j, long j2) {
        if (j == 0 || this.f28276e == 1) {
            this.f28276e = 1;
            this.f28275d = 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: f */
    public final boolean mo10504f(ExtractorInput extractorInput) {
        int i = this.f28273b;
        int i2 = this.f28272a;
        Assertions.m9464e((i2 == -1 || i == -1) ? false : true);
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        ((DefaultExtractorInput) extractorInput).mo10781c(parsableByteArray.f25644a, 0, i, false);
        return parsableByteArray.m9540A() == i2;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: g */
    public final void mo10505g(ExtractorOutput extractorOutput) {
        this.f28277f = extractorOutput;
        TrackOutput trackOutputMo9960j = extractorOutput.mo9960j(UserMetadata.MAX_ATTRIBUTE_SIZE, 4);
        this.f28278g = trackOutputMo9960j;
        Format.Builder builder = new Format.Builder();
        String str = this.f28274c;
        builder.f25197l = MimeTypes.m9342m(str);
        builder.f25198m = MimeTypes.m9342m(str);
        trackOutputMo9960j.mo10562d(new Format(builder));
        this.f28277f.mo9959h();
        this.f28277f.mo9958a(new SingleSampleSeekMap());
        this.f28276e = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: i */
    public final int mo10506i(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i = this.f28276e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        TrackOutput trackOutput = this.f28278g;
        trackOutput.getClass();
        int iMo10799a = trackOutput.mo10799a(extractorInput, UserMetadata.MAX_ATTRIBUTE_SIZE, true);
        if (iMo10799a != -1) {
            this.f28275d += iMo10799a;
            return 0;
        }
        this.f28276e = 2;
        this.f28278g.mo9961f(0L, 1, this.f28275d, 0, null);
        this.f28275d = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
