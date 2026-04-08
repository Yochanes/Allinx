package androidx.media3.extractor.webp;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class WebpExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f29802a = new ParsableByteArray(4);

    /* JADX INFO: renamed from: b */
    public final SingleSampleExtractor f29803b = new SingleSampleExtractor(-1, -1, "image/webp");

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: a */
    public final void mo10503a(long j, long j2) {
        this.f29803b.mo10503a(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: f */
    public final boolean mo10504f(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f29802a;
        parsableByteArray.m9543D(4);
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, 4, false);
        if (parsableByteArray.m9570w() == 1380533830) {
            defaultExtractorInput.m10787k(4, false);
            parsableByteArray.m9543D(4);
            defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, 4, false);
            if (parsableByteArray.m9570w() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: g */
    public final void mo10505g(ExtractorOutput extractorOutput) {
        this.f29803b.mo10505g(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: i */
    public final int mo10506i(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f29803b.mo10506i(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
