package androidx.media3.extractor.avif;

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
public final class AvifExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f28371a = new ParsableByteArray(4);

    /* JADX INFO: renamed from: b */
    public final SingleSampleExtractor f28372b = new SingleSampleExtractor(-1, -1, "image/avif");

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: a */
    public final void mo10503a(long j, long j2) {
        this.f28372b.mo10503a(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: f */
    public final boolean mo10504f(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.m10787k(4, false);
        ParsableByteArray parsableByteArray = this.f28371a;
        parsableByteArray.m9543D(4);
        defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, 4, false);
        if (parsableByteArray.m9570w() == 1718909296) {
            parsableByteArray.m9543D(4);
            defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, 4, false);
            if (parsableByteArray.m9570w() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: g */
    public final void mo10505g(ExtractorOutput extractorOutput) {
        this.f28372b.mo10505g(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    /* JADX INFO: renamed from: i */
    public final int mo10506i(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f28372b.mo10506i(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
