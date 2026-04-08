package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class MlltSeeker implements Seeker {

    /* JADX INFO: renamed from: a */
    public final long[] f28686a;

    /* JADX INFO: renamed from: b */
    public final long[] f28687b;

    /* JADX INFO: renamed from: c */
    public final long f28688c;

    public MlltSeeker(long j, long[] jArr, long[] jArr2) {
        this.f28686a = jArr;
        this.f28687b = jArr2;
        this.f28688c = j == -9223372036854775807L ? Util.m9598H(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: a */
    public static Pair m10894a(long j, long[] jArr, long[] jArr2) {
        int iM9613d = Util.m9613d(jArr, j, true);
        long j2 = jArr[iM9613d];
        long j3 = jArr2[iM9613d];
        int i = iM9613d + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: c */
    public final long mo10891c() {
        return -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: e */
    public final long mo10892e(long j) {
        return Util.m9598H(((Long) m10894a(j, this.f28686a, this.f28687b).second).longValue());
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        Pair pairM10894a = m10894a(Util.m9609S(Util.m9619j(j, 0L, this.f28688c)), this.f28687b, this.f28686a);
        SeekPoint seekPoint = new SeekPoint(Util.m9598H(((Long) pairM10894a.first).longValue()), ((Long) pairM10894a.second).longValue());
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: k */
    public final int mo10893k() {
        return -2147483647;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f28688c;
    }
}
