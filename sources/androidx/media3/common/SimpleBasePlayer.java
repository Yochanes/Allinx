package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SimpleBasePlayer extends BasePlayer {

    /* JADX INFO: compiled from: Proguard */
    public static final class LivePositionSupplier implements PositionSupplier {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MediaItemData {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        /* JADX INFO: renamed from: a */
        public static Object m9351a(MediaItemData mediaItemData, int i) {
            mediaItemData.getClass();
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public static void m9352b(MediaItemData mediaItemData, int i, int i2, Timeline.Period period) {
            mediaItemData.getClass();
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            ((MediaItemData) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PeriodData {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            ((PeriodData) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PlaceholderUid {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PlaylistTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: b */
        public final int mo9353b(Object obj) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: f */
        public final Timeline.Period mo9354f(int i, Timeline.Period period, boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: g */
        public final Timeline.Period mo9355g(Object obj, Timeline.Period period) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: h */
        public final int mo9356h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: l */
        public final Object mo9357l(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: n */
        public final Timeline.Window mo9358n(int i, Timeline.Window window, long j) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        /* JADX INFO: renamed from: o */
        public final int mo9359o() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PositionSupplier {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class State {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            ((State) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: A */
    public final Tracks mo9251A() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: C */
    public final CueGroup mo9252C() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: D */
    public final void mo9253D(Player.Listener listener) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: F */
    public final int mo9254F() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: G */
    public final int mo9255G() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: I */
    public final void mo9256I(int i) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: J */
    public final void mo9257J(TrackSelectionParameters trackSelectionParameters) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: K */
    public final void mo9258K(SurfaceView surfaceView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: L */
    public final void mo9259L(Player.Listener listener) {
        listener.getClass();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: M */
    public final int mo9260M() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: N */
    public final int mo9261N() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: O */
    public final Timeline mo9262O() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: P */
    public final Looper mo9263P() {
        return null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: Q */
    public final boolean mo9264Q() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: R */
    public final TrackSelectionParameters mo9265R() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: S */
    public final long mo9266S() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: V */
    public final void mo9267V(TextureView textureView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: X */
    public final MediaMetadata mo9268X() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: Y */
    public final long mo9269Y() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: Z */
    public final long mo9270Z() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: a */
    public final PlaybackException mo9271a() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: b */
    public final long mo9346b() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: c */
    public final void mo9272c() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: d */
    public final void mo9273d(PlaybackParameters playbackParameters) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: e */
    public final PlaybackParameters mo9274e() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: f */
    public final boolean mo9275f() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: g */
    public final long mo9276g() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.BasePlayer
    /* JADX INFO: renamed from: g0 */
    public final void mo9225g0(int i, long j, boolean z2) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: i */
    public final Player.Commands mo9277i() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: j */
    public final boolean mo9278j() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: k */
    public final void mo9279k(boolean z2) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: l */
    public final long mo9280l() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: n */
    public final int mo9281n() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: o */
    public final void mo9282o(TextureView textureView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: p */
    public final VideoSize mo9283p() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: r */
    public final void mo9347r(ImmutableList immutableList) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: s */
    public final int mo9284s() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: t */
    public final void mo9285t(SurfaceView surfaceView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: w */
    public final void mo9286w(boolean z2) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: x */
    public final long mo9287x() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: y */
    public final long mo9288y() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: z */
    public final int mo9289z() {
        Thread.currentThread();
        throw null;
    }
}
