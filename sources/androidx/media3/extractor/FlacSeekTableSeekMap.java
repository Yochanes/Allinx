package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FlacSeekTableSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final FlacStreamMetadata f28212a;

    /* JADX INFO: renamed from: b */
    public final long f28213b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j) {
        this.f28212a = flacStreamMetadata;
        this.f28213b = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        FlacStreamMetadata flacStreamMetadata = this.f28212a;
        Assertions.m9466g(flacStreamMetadata.f28224k);
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.f28224k;
        long[] jArr = seekTable.f28226a;
        int iM9613d = Util.m9613d(jArr, Util.m9619j((((long) flacStreamMetadata.f28218e) * j) / 1000000, 0L, flacStreamMetadata.f28223j - 1), false);
        long j2 = iM9613d == -1 ? 0L : jArr[iM9613d];
        long[] jArr2 = seekTable.f28227b;
        long j3 = iM9613d != -1 ? jArr2[iM9613d] : 0L;
        int i = flacStreamMetadata.f28218e;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.f28213b;
        SeekPoint seekPoint = new SeekPoint(j4, j3 + j5);
        if (j4 == j || iM9613d == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i2 = iM9613d + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return this.f28212a.m10809b();
    }
}
