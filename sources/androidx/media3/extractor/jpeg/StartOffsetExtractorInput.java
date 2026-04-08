package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ForwardingExtractorInput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {

    /* JADX INFO: renamed from: b */
    public final long f28439b;

    public StartOffsetExtractorInput(DefaultExtractorInput defaultExtractorInput, long j) {
        super(defaultExtractorInput);
        Assertions.m9460a(defaultExtractorInput.f28182d >= j);
        this.f28439b = j;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: d */
    public final long mo10782d() {
        return super.mo10782d() - this.f28439b;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long getLength() {
        return super.getLength() - this.f28439b;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long getPosition() {
        return super.getPosition() - this.f28439b;
    }
}
