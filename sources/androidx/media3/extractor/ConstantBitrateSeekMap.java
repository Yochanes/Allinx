package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ConstantBitrateSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final long f28172a;

    /* JADX INFO: renamed from: b */
    public final long f28173b;

    /* JADX INFO: renamed from: c */
    public final int f28174c;

    /* JADX INFO: renamed from: d */
    public final long f28175d;

    /* JADX INFO: renamed from: e */
    public final int f28176e;

    /* JADX INFO: renamed from: f */
    public final long f28177f;

    /* JADX INFO: renamed from: g */
    public final boolean f28178g;

    public ConstantBitrateSeekMap(long j, long j2, int i, int i2, boolean z2) {
        this.f28172a = j;
        this.f28173b = j2;
        this.f28174c = i2 == -1 ? 1 : i2;
        this.f28176e = i;
        this.f28178g = z2;
        if (j == -1) {
            this.f28175d = -1L;
            this.f28177f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f28175d = j3;
            this.f28177f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return this.f28175d != -1 || this.f28178g;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        long j2 = this.f28175d;
        long j3 = this.f28173b;
        if (j2 == -1 && !this.f28178g) {
            SeekPoint seekPoint = new SeekPoint(0L, j3);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = this.f28176e;
        long j4 = this.f28174c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        SeekPoint seekPoint2 = new SeekPoint(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f28172a) {
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f28177f;
    }
}
