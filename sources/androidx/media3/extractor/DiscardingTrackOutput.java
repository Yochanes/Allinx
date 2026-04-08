package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DiscardingTrackOutput implements TrackOutput {

    /* JADX INFO: renamed from: a */
    public final byte[] f28195a = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: b */
    public final void mo10560b(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.m9547H(i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: c */
    public final int mo10561c(DataReader dataReader, int i, boolean z2) throws EOFException {
        byte[] bArr = this.f28195a;
        int i2 = dataReader.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: d */
    public final void mo10562d(Format format) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: f */
    public final void mo9961f(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
    }
}
