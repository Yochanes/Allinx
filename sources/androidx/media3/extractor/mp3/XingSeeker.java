package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class XingSeeker implements Seeker {

    /* JADX INFO: renamed from: a */
    public final long f28716a;

    /* JADX INFO: renamed from: b */
    public final int f28717b;

    /* JADX INFO: renamed from: c */
    public final long f28718c;

    /* JADX INFO: renamed from: d */
    public final int f28719d;

    /* JADX INFO: renamed from: e */
    public final long f28720e;

    /* JADX INFO: renamed from: f */
    public final long f28721f;

    /* JADX INFO: renamed from: g */
    public final long[] f28722g;

    public XingSeeker(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f28716a = j;
        this.f28717b = i;
        this.f28718c = j2;
        this.f28719d = i2;
        this.f28720e = j3;
        this.f28722g = jArr;
        this.f28721f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: c */
    public final long mo10891c() {
        return this.f28721f;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return this.f28722g != null;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: e */
    public final long mo10892e(long j) {
        long j2 = j - this.f28716a;
        if (!mo10589d() || j2 <= this.f28717b) {
            return 0L;
        }
        long[] jArr = this.f28722g;
        Assertions.m9466g(jArr);
        double d = (j2 * 256.0d) / this.f28720e;
        int iM9613d = Util.m9613d(jArr, (long) d, true);
        long j3 = this.f28718c;
        long j4 = (((long) iM9613d) * j3) / 100;
        long j5 = jArr[iM9613d];
        int i = iM9613d + 1;
        long j6 = (j3 * ((long) i)) / 100;
        return Math.round((j5 == (iM9613d == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        double d;
        double d2;
        boolean zMo10589d = mo10589d();
        int i = this.f28717b;
        long j2 = this.f28716a;
        if (!zMo10589d) {
            SeekPoint seekPoint = new SeekPoint(0L, j2 + ((long) i));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long jM9619j = Util.m9619j(j, 0L, this.f28718c);
        double d3 = (jM9619j * 100.0d) / this.f28718c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.f28722g;
            Assertions.m9466g(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.f28720e;
        SeekPoint seekPoint2 = new SeekPoint(jM9619j, j2 + Util.m9619j(Math.round((d4 / d) * j3), i, j3 - 1));
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: k */
    public final int mo10893k() {
        return this.f28719d;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f28718c;
    }
}
