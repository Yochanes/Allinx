package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ForwardingExtractorInput implements ExtractorInput {

    /* JADX INFO: renamed from: a */
    public final DefaultExtractorInput f28228a;

    public ForwardingExtractorInput(DefaultExtractorInput defaultExtractorInput) {
        this.f28228a = defaultExtractorInput;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: a */
    public final boolean mo10780a(byte[] bArr, int i, int i2, boolean z2) {
        return this.f28228a.mo10780a(bArr, 0, i2, z2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: c */
    public final boolean mo10781c(byte[] bArr, int i, int i2, boolean z2) {
        return this.f28228a.mo10781c(bArr, 0, i2, z2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: d */
    public long mo10782d() {
        return this.f28228a.mo10782d();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: e */
    public final void mo10783e(int i) throws EOFException, InterruptedIOException {
        this.f28228a.m10787k(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: g */
    public final void mo10784g() {
        this.f28228a.f28184f = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.f28228a.f28181c;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.f28228a.f28182d;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: h */
    public final void mo10785h(int i) throws EOFException, InterruptedIOException {
        this.f28228a.mo10785h(i);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    /* JADX INFO: renamed from: j */
    public final void mo10786j(byte[] bArr, int i, int i2) {
        this.f28228a.mo10781c(bArr, i, i2, false);
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        return this.f28228a.read(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        this.f28228a.mo10780a(bArr, i, i2, false);
    }
}
