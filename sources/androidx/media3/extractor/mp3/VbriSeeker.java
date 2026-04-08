package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class VbriSeeker implements Seeker {

    /* JADX INFO: renamed from: a */
    public final long[] f28709a;

    /* JADX INFO: renamed from: b */
    public final long[] f28710b;

    /* JADX INFO: renamed from: c */
    public final long f28711c;

    /* JADX INFO: renamed from: d */
    public final long f28712d;

    /* JADX INFO: renamed from: e */
    public final int f28713e;

    public VbriSeeker(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.f28709a = jArr;
        this.f28710b = jArr2;
        this.f28711c = j;
        this.f28712d = j2;
        this.f28713e = i;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: c */
    public final long mo10891c() {
        return this.f28712d;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: e */
    public final long mo10892e(long j) {
        return this.f28709a[Util.m9613d(this.f28710b, j, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        long[] jArr = this.f28709a;
        int iM9613d = Util.m9613d(jArr, j, true);
        long j2 = jArr[iM9613d];
        long[] jArr2 = this.f28710b;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iM9613d]);
        if (j2 >= j || iM9613d == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = iM9613d + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: k */
    public final int mo10893k() {
        return this.f28713e;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f28711c;
    }
}
