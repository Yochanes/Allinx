package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {

    /* JADX INFO: renamed from: h */
    public final long f28681h;

    /* JADX INFO: renamed from: i */
    public final int f28682i;

    /* JADX INFO: renamed from: j */
    public final int f28683j;

    /* JADX INFO: renamed from: k */
    public final boolean f28684k;

    /* JADX INFO: renamed from: l */
    public final long f28685l;

    public ConstantBitrateSeeker(long j, long j2, int i, int i2, boolean z2) {
        super(j, j2, i, i2, z2);
        long j3 = j;
        this.f28681h = j2;
        this.f28682i = i;
        this.f28683j = i2;
        this.f28684k = z2;
        this.f28685l = j3 == -1 ? -1L : j3;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: c */
    public final long mo10891c() {
        return this.f28685l;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: e */
    public final long mo10892e(long j) {
        return (Math.max(0L, j - this.f28173b) * 8000000) / ((long) this.f28176e);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    /* JADX INFO: renamed from: k */
    public final int mo10893k() {
        return this.f28682i;
    }
}
