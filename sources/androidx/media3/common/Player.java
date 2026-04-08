package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.FlagSet;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface Player {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Commands {

        /* JADX INFO: renamed from: a */
        public final FlagSet f25325a;

        /* JADX INFO: compiled from: Proguard */
        @UnstableApi
        public static final class Builder {

            /* JADX INFO: renamed from: a */
            public final FlagSet.Builder f25326a = new FlagSet.Builder();

            /* JADX INFO: renamed from: a */
            public final void m9348a(int i, boolean z2) {
                FlagSet.Builder builder = this.f25326a;
                if (z2) {
                    builder.m9245a(i);
                } else {
                    builder.getClass();
                }
            }
        }

        static {
            new Builder().f25326a.m9246b();
            Util.m9594D(0);
        }

        public Commands(FlagSet flagSet) {
            this.f25325a = flagSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.f25325a.equals(((Commands) obj).f25325a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f25325a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Events {

        /* JADX INFO: renamed from: a */
        public final FlagSet f25327a;

        public Events(FlagSet flagSet) {
            this.f25327a = flagSet;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9349a(int... iArr) {
            FlagSet flagSet = this.f25327a;
            for (int i : iArr) {
                if (flagSet.f25130a.get(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.f25327a.equals(((Events) obj).f25327a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f25327a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PositionInfo {

        /* JADX INFO: renamed from: a */
        public final Object f25328a;

        /* JADX INFO: renamed from: b */
        public final int f25329b;

        /* JADX INFO: renamed from: c */
        public final MediaItem f25330c;

        /* JADX INFO: renamed from: d */
        public final Object f25331d;

        /* JADX INFO: renamed from: e */
        public final int f25332e;

        /* JADX INFO: renamed from: f */
        public final long f25333f;

        /* JADX INFO: renamed from: g */
        public final long f25334g;

        /* JADX INFO: renamed from: h */
        public final int f25335h;

        /* JADX INFO: renamed from: i */
        public final int f25336i;

        static {
            AbstractC1610a.m8737o(0, 1, 2, 3, 4);
            Util.m9594D(5);
            Util.m9594D(6);
        }

        public PositionInfo(Object obj, int i, MediaItem mediaItem, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f25328a = obj;
            this.f25329b = i;
            this.f25330c = mediaItem;
            this.f25331d = obj2;
            this.f25332e = i2;
            this.f25333f = j;
            this.f25334g = j2;
            this.f25335h = i3;
            this.f25336i = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PositionInfo.class == obj.getClass()) {
                PositionInfo positionInfo = (PositionInfo) obj;
                if (this.f25329b == positionInfo.f25329b && this.f25332e == positionInfo.f25332e && this.f25333f == positionInfo.f25333f && this.f25334g == positionInfo.f25334g && this.f25335h == positionInfo.f25335h && this.f25336i == positionInfo.f25336i && Objects.equals(this.f25330c, positionInfo.f25330c) && Objects.equals(this.f25328a, positionInfo.f25328a) && Objects.equals(this.f25331d, positionInfo.f25331d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f25328a, Integer.valueOf(this.f25329b), this.f25330c, this.f25331d, Integer.valueOf(this.f25332e), Long.valueOf(this.f25333f), Long.valueOf(this.f25334g), Integer.valueOf(this.f25335h), Integer.valueOf(this.f25336i));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    /* JADX INFO: renamed from: A */
    Tracks mo9251A();

    /* JADX INFO: renamed from: B */
    boolean mo9213B();

    /* JADX INFO: renamed from: C */
    CueGroup mo9252C();

    /* JADX INFO: renamed from: D */
    void mo9253D(Listener listener);

    /* JADX INFO: renamed from: E */
    void mo9214E();

    /* JADX INFO: renamed from: F */
    int mo9254F();

    /* JADX INFO: renamed from: G */
    int mo9255G();

    /* JADX INFO: renamed from: H */
    boolean mo9215H(int i);

    /* JADX INFO: renamed from: I */
    void mo9256I(int i);

    /* JADX INFO: renamed from: J */
    void mo9257J(TrackSelectionParameters trackSelectionParameters);

    /* JADX INFO: renamed from: K */
    void mo9258K(SurfaceView surfaceView);

    /* JADX INFO: renamed from: L */
    void mo9259L(Listener listener);

    /* JADX INFO: renamed from: M */
    int mo9260M();

    /* JADX INFO: renamed from: N */
    int mo9261N();

    /* JADX INFO: renamed from: O */
    Timeline mo9262O();

    /* JADX INFO: renamed from: P */
    Looper mo9263P();

    /* JADX INFO: renamed from: Q */
    boolean mo9264Q();

    /* JADX INFO: renamed from: R */
    TrackSelectionParameters mo9265R();

    /* JADX INFO: renamed from: S */
    long mo9266S();

    /* JADX INFO: renamed from: T */
    void mo9216T();

    /* JADX INFO: renamed from: U */
    void mo9217U();

    /* JADX INFO: renamed from: V */
    void mo9267V(TextureView textureView);

    /* JADX INFO: renamed from: W */
    void mo9218W();

    /* JADX INFO: renamed from: X */
    MediaMetadata mo9268X();

    /* JADX INFO: renamed from: Y */
    long mo9269Y();

    /* JADX INFO: renamed from: Z */
    long mo9270Z();

    /* JADX INFO: renamed from: a */
    PlaybackException mo9271a();

    /* JADX INFO: renamed from: b */
    long mo9346b();

    /* JADX INFO: renamed from: c */
    void mo9272c();

    /* JADX INFO: renamed from: d */
    void mo9273d(PlaybackParameters playbackParameters);

    /* JADX INFO: renamed from: e */
    PlaybackParameters mo9274e();

    /* JADX INFO: renamed from: f */
    boolean mo9275f();

    /* JADX INFO: renamed from: g */
    long mo9276g();

    /* JADX INFO: renamed from: h */
    void mo9226h(int i, long j);

    /* JADX INFO: renamed from: i */
    Commands mo9277i();

    /* JADX INFO: renamed from: j */
    boolean mo9278j();

    /* JADX INFO: renamed from: k */
    void mo9279k(boolean z2);

    /* JADX INFO: renamed from: l */
    long mo9280l();

    /* JADX INFO: renamed from: m */
    long mo9228m();

    /* JADX INFO: renamed from: n */
    int mo9281n();

    /* JADX INFO: renamed from: o */
    void mo9282o(TextureView textureView);

    /* JADX INFO: renamed from: p */
    VideoSize mo9283p();

    void pause();

    /* JADX INFO: renamed from: q */
    void mo9229q();

    /* JADX INFO: renamed from: r */
    void mo9347r(ImmutableList immutableList);

    /* JADX INFO: renamed from: s */
    int mo9284s();

    /* JADX INFO: renamed from: t */
    void mo9285t(SurfaceView surfaceView);

    /* JADX INFO: renamed from: u */
    void mo9230u(long j);

    /* JADX INFO: renamed from: v */
    void mo9231v();

    /* JADX INFO: renamed from: w */
    void mo9286w(boolean z2);

    /* JADX INFO: renamed from: x */
    long mo9287x();

    /* JADX INFO: renamed from: y */
    long mo9288y();

    /* JADX INFO: renamed from: z */
    int mo9289z();

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        /* JADX INFO: renamed from: W */
        default void mo9304W() {
        }

        /* JADX INFO: renamed from: B */
        default void mo9290B(boolean z2) {
        }

        /* JADX INFO: renamed from: C */
        default void mo9291C(int i) {
        }

        /* JADX INFO: renamed from: E */
        default void mo9293E(Events events) {
        }

        /* JADX INFO: renamed from: F */
        default void mo9294F(boolean z2) {
        }

        /* JADX INFO: renamed from: I */
        default void mo9296I(int i) {
        }

        /* JADX INFO: renamed from: J */
        default void mo9297J(int i) {
        }

        /* JADX INFO: renamed from: P */
        default void mo9299P(boolean z2) {
        }

        /* JADX INFO: renamed from: Q */
        default void mo9300Q(PlaybackParameters playbackParameters) {
        }

        /* JADX INFO: renamed from: S */
        default void mo9301S(MediaMetadata mediaMetadata) {
        }

        /* JADX INFO: renamed from: U */
        default void mo9302U(TrackSelectionParameters trackSelectionParameters) {
        }

        /* JADX INFO: renamed from: V */
        default void mo9303V(int i) {
        }

        /* JADX INFO: renamed from: X */
        default void mo9305X(Tracks tracks) {
        }

        /* JADX INFO: renamed from: a */
        default void mo9307a(VideoSize videoSize) {
        }

        /* JADX INFO: renamed from: c0 */
        default void mo9309c0(PlaybackException playbackException) {
        }

        /* JADX INFO: renamed from: g0 */
        default void mo9310g0(PlaybackException playbackException) {
        }

        /* JADX INFO: renamed from: j0 */
        default void mo9312j0(Commands commands) {
        }

        /* JADX INFO: renamed from: m */
        default void mo9313m(CueGroup cueGroup) {
        }

        /* JADX INFO: renamed from: m0 */
        default void mo9314m0(boolean z2) {
        }

        /* JADX INFO: renamed from: n */
        default void mo9315n(Metadata metadata) {
        }

        /* JADX INFO: renamed from: o */
        default void mo9316o(boolean z2) {
        }

        /* JADX INFO: renamed from: r */
        default void mo9317r(List list) {
        }

        /* JADX INFO: renamed from: z */
        default void mo9318z(int i) {
        }

        /* JADX INFO: renamed from: H */
        default void mo9295H(int i, boolean z2) {
        }

        /* JADX INFO: renamed from: N */
        default void mo9298N(Timeline timeline, int i) {
        }

        /* JADX INFO: renamed from: Z */
        default void mo9306Z(MediaItem mediaItem, int i) {
        }

        /* JADX INFO: renamed from: a0 */
        default void mo9308a0(int i, boolean z2) {
        }

        /* JADX INFO: renamed from: i0 */
        default void mo9311i0(int i, int i2) {
        }

        /* JADX INFO: renamed from: D */
        default void mo9292D(int i, PositionInfo positionInfo, PositionInfo positionInfo2) {
        }
    }
}
