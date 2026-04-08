package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SinglePeriodTimeline extends Timeline {

    /* JADX INFO: renamed from: g */
    public static final Object f27408g = new Object();

    /* JADX INFO: renamed from: b */
    public final long f27409b;

    /* JADX INFO: renamed from: c */
    public final long f27410c;

    /* JADX INFO: renamed from: d */
    public final boolean f27411d;

    /* JADX INFO: renamed from: e */
    public final MediaItem f27412e;

    /* JADX INFO: renamed from: f */
    public final MediaItem.LiveConfiguration f27413f;

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f25221a = "SinglePeriodTimeline";
        builder.f25222b = Uri.EMPTY;
        builder.m9320a();
    }

    public SinglePeriodTimeline(long j, boolean z2, boolean z3, MediaItem mediaItem) {
        MediaItem.LiveConfiguration liveConfiguration = z3 ? mediaItem.f25217c : null;
        this.f27409b = j;
        this.f27410c = j;
        this.f27411d = z2;
        mediaItem.getClass();
        this.f27412e = mediaItem;
        this.f27413f = liveConfiguration;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: b */
    public final int mo9353b(Object obj) {
        return f27408g.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: f */
    public final Timeline.Period mo9354f(int i, Timeline.Period period, boolean z2) {
        Assertions.m9462c(i, 1);
        Object obj = z2 ? f27408g : null;
        period.getClass();
        period.m9376h(null, obj, 0, this.f27409b, 0L, AdPlaybackState.f25084c, false);
        return period;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: h */
    public final int mo9356h() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: l */
    public final Object mo9357l(int i) {
        Assertions.m9462c(i, 1);
        return f27408g;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: n */
    public final Timeline.Window mo9358n(int i, Timeline.Window window, long j) {
        Assertions.m9462c(i, 1);
        window.m9378b(Timeline.Window.f25348p, this.f27412e, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f27411d, false, this.f27413f, 0L, this.f27410c, 0, 0, 0L);
        return window;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: o */
    public final int mo9359o() {
        return 1;
    }
}
