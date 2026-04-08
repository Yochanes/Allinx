package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class IndexSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final LongArray f28247a;

    /* JADX INFO: renamed from: b */
    public final LongArray f28248b;

    /* JADX INFO: renamed from: c */
    public long f28249c;

    public IndexSeekMap(long j, long[] jArr, long[] jArr2) {
        Assertions.m9460a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f28247a = new LongArray(length);
            this.f28248b = new LongArray(length);
        } else {
            int i = length + 1;
            LongArray longArray = new LongArray(i);
            this.f28247a = longArray;
            LongArray longArray2 = new LongArray(i);
            this.f28248b = longArray2;
            longArray.m9513a(0L);
            longArray2.m9513a(0L);
        }
        this.f28247a.m9514b(jArr);
        this.f28248b.m9514b(jArr2);
        this.f28249c = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return this.f28248b.f25620a > 0;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        LongArray longArray = this.f28248b;
        if (longArray.f25620a == 0) {
            SeekPoint seekPoint = SeekPoint.f28269c;
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int iM9611b = Util.m9611b(longArray, j);
        long jM9515c = longArray.m9515c(iM9611b);
        LongArray longArray2 = this.f28247a;
        SeekPoint seekPoint2 = new SeekPoint(jM9515c, longArray2.m9515c(iM9611b));
        if (jM9515c == j || iM9611b == longArray.f25620a - 1) {
            return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
        }
        int i = iM9611b + 1;
        return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(longArray.m9515c(i), longArray2.m9515c(i)));
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f28249c;
    }
}
