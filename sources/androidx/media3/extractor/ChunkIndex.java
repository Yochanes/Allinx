package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChunkIndex implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final int f28166a;

    /* JADX INFO: renamed from: b */
    public final int[] f28167b;

    /* JADX INFO: renamed from: c */
    public final long[] f28168c;

    /* JADX INFO: renamed from: d */
    public final long[] f28169d;

    /* JADX INFO: renamed from: e */
    public final long[] f28170e;

    /* JADX INFO: renamed from: f */
    public final long f28171f;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f28167b = iArr;
        this.f28168c = jArr;
        this.f28169d = jArr2;
        this.f28170e = jArr3;
        int length = iArr.length;
        this.f28166a = length;
        if (length > 0) {
            this.f28171f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f28171f = 0L;
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        long[] jArr = this.f28170e;
        int iM9613d = Util.m9613d(jArr, j, true);
        long j2 = jArr[iM9613d];
        long[] jArr2 = this.f28168c;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iM9613d]);
        if (j2 >= j || iM9613d == this.f28166a - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = iM9613d + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f28171f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f28166a + ", sizes=" + Arrays.toString(this.f28167b) + ", offsets=" + Arrays.toString(this.f28168c) + ", timeUs=" + Arrays.toString(this.f28170e) + ", durationsUs=" + Arrays.toString(this.f28169d) + ")";
    }
}
