package androidx.media3.exoplayer.source;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: renamed from: androidx.media3.exoplayer.source.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1881b implements MediaSource.MediaSourceCaller {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompositeMediaSource f27470a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f27471b;

    public /* synthetic */ C1881b(CompositeMediaSource compositeMediaSource, Object obj) {
        this.f27470a = compositeMediaSource;
        this.f27471b = obj;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
    /* JADX INFO: renamed from: a */
    public final void mo10015a(BaseMediaSource baseMediaSource, Timeline timeline) {
        this.f27470a.mo10487c0(this.f27471b, baseMediaSource, timeline);
    }
}
