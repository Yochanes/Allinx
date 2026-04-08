package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.DefaultAllocator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface LoadControl {

    /* JADX INFO: compiled from: Proguard */
    public static final class Parameters {

        /* JADX INFO: renamed from: a */
        public final PlayerId f26220a;

        /* JADX INFO: renamed from: b */
        public final long f26221b;

        /* JADX INFO: renamed from: c */
        public final float f26222c;

        /* JADX INFO: renamed from: d */
        public final boolean f26223d;

        /* JADX INFO: renamed from: e */
        public final long f26224e;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, float f, boolean z2, long j3) {
            this.f26220a = playerId;
            this.f26221b = j2;
            this.f26222c = f;
            this.f26223d = z2;
            this.f26224e = j3;
        }
    }

    /* JADX INFO: renamed from: a */
    default boolean mo9800a(Parameters parameters) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    /* JADX INFO: renamed from: b */
    default boolean mo9801b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    /* JADX INFO: renamed from: c */
    default void mo9802c(PlayerId playerId) {
        throw new IllegalStateException("onReleased not implemented");
    }

    /* JADX INFO: renamed from: d */
    default boolean mo9803d(Parameters parameters) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    /* JADX INFO: renamed from: e */
    default boolean mo9804e() {
        Log.m9511g("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    /* JADX INFO: renamed from: f */
    default void mo9805f(PlayerId playerId) {
        throw new IllegalStateException("onStopped not implemented");
    }

    /* JADX INFO: renamed from: g */
    default void mo9806g(Parameters parameters, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    /* JADX INFO: renamed from: h */
    default long mo9807h() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    /* JADX INFO: renamed from: i */
    default void mo9808i(PlayerId playerId) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    /* JADX INFO: renamed from: j */
    DefaultAllocator mo9809j();
}
