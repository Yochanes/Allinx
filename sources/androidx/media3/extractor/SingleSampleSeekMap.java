package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SingleSampleSeekMap implements SeekMap {
    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public final SeekMap.SeekPoints mo10590j(long j) {
        SeekPoint seekPoint = new SeekPoint(j, 0L);
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public final long mo10548l() {
        return -9223372036854775807L;
    }
}
