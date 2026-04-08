package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ForwardingSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final SeekMap f28229a;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.f28229a = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: d */
    public final boolean mo10589d() {
        return this.f28229a.mo10589d();
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: j */
    public SeekMap.SeekPoints mo10590j(long j) {
        return this.f28229a.mo10590j(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    /* JADX INFO: renamed from: l */
    public long mo10548l() {
        return this.f28229a.mo10548l();
    }
}
