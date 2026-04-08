package androidx.media3.extractor.wav;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.math.RoundingMode;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WavSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final WavFormat f29797a;

    /* JADX INFO: renamed from: b */
    public final int f29798b;

    /* JADX INFO: renamed from: c */
    public final long f29799c;

    /* JADX INFO: renamed from: d */
    public final long f29800d;

    /* JADX INFO: renamed from: e */
    public final long f29801e;

    public WavSeekMap(WavFormat wavFormat, int i, long j, long j2) {
        this.f29797a = wavFormat;
        this.f29798b = i;
        this.f29799c = j;
        long j3 = (j2 - j) / ((long) wavFormat.f29792c);
        this.f29800d = j3;
        this.f29801e = m11093a(j3);
    }

    /* JADX INFO: renamed from: a */
    public final long m11093a(long j) {
        long j2 = j * ((long) this.f29798b);
        long j3 = this.f29797a.f29791b;
        int i = Util.f25665a;
        return Util.m9604N(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        WavFormat wavFormat = this.f29797a;
        long j2 = (((long) wavFormat.f29791b) * j) / (((long) this.f29798b) * 1000000);
        long j3 = this.f29800d;
        long jM9619j = Util.m9619j(j2, 0L, j3 - 1);
        long j4 = ((long) wavFormat.f29792c) * jM9619j;
        long j5 = this.f29799c;
        long jM11093a = m11093a(jM9619j);
        SeekPoint seekPoint = new SeekPoint(jM11093a, j4 + j5);
        if (jM11093a >= j || jM9619j == j3 - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long j6 = jM9619j + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(m11093a(j6), (((long) wavFormat.f29792c) * j6) + j5));
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f29801e;
    }
}
