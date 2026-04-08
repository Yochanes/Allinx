package androidx.media3.exoplayer.source;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class ForwardingTimeline extends Timeline {

    /* JADX INFO: renamed from: b */
    public final Timeline f27190b;

    public ForwardingTimeline(Timeline timeline) {
        this.f27190b = timeline;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: a */
    public final int mo9360a(boolean z2) {
        return this.f27190b.mo9360a(z2);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: b */
    public int mo9353b(Object obj) {
        return this.f27190b.mo9353b(obj);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: c */
    public final int mo9361c(boolean z2) {
        return this.f27190b.mo9361c(z2);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: e */
    public int mo9363e(int i, int i2, boolean z2) {
        return this.f27190b.mo9363e(i, i2, z2);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: f */
    public Timeline.Period mo9354f(int i, Timeline.Period period, boolean z2) {
        return this.f27190b.mo9354f(i, period, z2);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: h */
    public final int mo9356h() {
        return this.f27190b.mo9356h();
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: k */
    public int mo9366k(int i, int i2, boolean z2) {
        return this.f27190b.mo9366k(i, i2, z2);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: l */
    public Object mo9357l(int i) {
        return this.f27190b.mo9357l(i);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: n */
    public Timeline.Window mo9358n(int i, Timeline.Window window, long j) {
        return this.f27190b.mo9358n(i, window, j);
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: o */
    public final int mo9359o() {
        return this.f27190b.mo9359o();
    }
}
