package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TrackSampleTable {

    /* JADX INFO: renamed from: a */
    public final Track f28902a;

    /* JADX INFO: renamed from: b */
    public final int f28903b;

    /* JADX INFO: renamed from: c */
    public final long[] f28904c;

    /* JADX INFO: renamed from: d */
    public final int[] f28905d;

    /* JADX INFO: renamed from: e */
    public final int f28906e;

    /* JADX INFO: renamed from: f */
    public final long[] f28907f;

    /* JADX INFO: renamed from: g */
    public final int[] f28908g;

    /* JADX INFO: renamed from: h */
    public final long f28909h;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        Assertions.m9460a(iArr.length == jArr2.length);
        Assertions.m9460a(jArr.length == jArr2.length);
        Assertions.m9460a(iArr2.length == jArr2.length);
        this.f28902a = track;
        this.f28904c = jArr;
        this.f28905d = iArr;
        this.f28906e = i;
        this.f28907f = jArr2;
        this.f28908g = iArr2;
        this.f28909h = j;
        this.f28903b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m10934a(long j) {
        long[] jArr = this.f28907f;
        for (int iM9610a = Util.m9610a(jArr, j, true); iM9610a < jArr.length; iM9610a++) {
            if ((this.f28908g[iM9610a] & 1) != 0) {
                return iM9610a;
            }
        }
        return -1;
    }
}
