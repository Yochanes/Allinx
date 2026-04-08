package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TrueHdSampleRechunker {

    /* JADX INFO: renamed from: a */
    public final byte[] f28283a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f28284b;

    /* JADX INFO: renamed from: c */
    public int f28285c;

    /* JADX INFO: renamed from: d */
    public long f28286d;

    /* JADX INFO: renamed from: e */
    public int f28287e;

    /* JADX INFO: renamed from: f */
    public int f28288f;

    /* JADX INFO: renamed from: g */
    public int f28289g;

    /* JADX INFO: renamed from: a */
    public final void m10819a(TrackOutput trackOutput, TrackOutput.CryptoData cryptoData) {
        if (this.f28285c > 0) {
            trackOutput.mo9961f(this.f28286d, this.f28287e, this.f28288f, this.f28289g, cryptoData);
            this.f28285c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10820b(TrackOutput trackOutput, long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        Assertions.m9465f(this.f28289g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f28284b) {
            int i4 = this.f28285c;
            int i5 = i4 + 1;
            this.f28285c = i5;
            if (i4 == 0) {
                this.f28286d = j;
                this.f28287e = i;
                this.f28288f = 0;
            }
            this.f28288f += i2;
            this.f28289g = i3;
            if (i5 >= 16) {
                m10819a(trackOutput, cryptoData);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10821c(ExtractorInput extractorInput) {
        if (this.f28284b) {
            return;
        }
        byte[] bArr = this.f28283a;
        int i = 0;
        extractorInput.mo10786j(bArr, 0, 10);
        extractorInput.mo10784g();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                i = 40 << ((bArr[(b2 & UnsignedBytes.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f28284b = true;
    }
}
