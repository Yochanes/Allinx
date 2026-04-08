package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public final class DummyTrackOutput implements TrackOutput {
    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: a */
    public final int mo10799a(DataReader dataReader, int i, boolean z2) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: b */
    public final void mo10560b(ParsableByteArray parsableByteArray, int i, int i2) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: c */
    public final int mo10561c(DataReader dataReader, int i, boolean z2) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: d */
    public final void mo10562d(Format format) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: e */
    public final void mo10800e(int i, ParsableByteArray parsableByteArray) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: f */
    public final void mo9961f(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        throw null;
    }
}
