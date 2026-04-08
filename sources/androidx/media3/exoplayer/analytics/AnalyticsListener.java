package androidx.media3.exoplayer.analytics;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsListener {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface EventFlags {
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static final class EventTime {

        /* JADX INFO: renamed from: a */
        public final long f26363a;

        /* JADX INFO: renamed from: b */
        public final Timeline f26364b;

        /* JADX INFO: renamed from: c */
        public final int f26365c;

        /* JADX INFO: renamed from: d */
        public final MediaSource.MediaPeriodId f26366d;

        /* JADX INFO: renamed from: e */
        public final long f26367e;

        /* JADX INFO: renamed from: f */
        public final Timeline f26368f;

        /* JADX INFO: renamed from: g */
        public final int f26369g;

        /* JADX INFO: renamed from: h */
        public final MediaSource.MediaPeriodId f26370h;

        /* JADX INFO: renamed from: i */
        public final long f26371i;

        /* JADX INFO: renamed from: j */
        public final long f26372j;

        public EventTime(long j, Timeline timeline, int i, MediaSource.MediaPeriodId mediaPeriodId, long j2, Timeline timeline2, int i2, MediaSource.MediaPeriodId mediaPeriodId2, long j3, long j4) {
            this.f26363a = j;
            this.f26364b = timeline;
            this.f26365c = i;
            this.f26366d = mediaPeriodId;
            this.f26367e = j2;
            this.f26368f = timeline2;
            this.f26369g = i2;
            this.f26370h = mediaPeriodId2;
            this.f26371i = j3;
            this.f26372j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTime.class == obj.getClass()) {
                EventTime eventTime = (EventTime) obj;
                if (this.f26363a == eventTime.f26363a && this.f26365c == eventTime.f26365c && this.f26367e == eventTime.f26367e && this.f26369g == eventTime.f26369g && this.f26371i == eventTime.f26371i && this.f26372j == eventTime.f26372j && Objects.equals(this.f26364b, eventTime.f26364b) && Objects.equals(this.f26366d, eventTime.f26366d) && Objects.equals(this.f26368f, eventTime.f26368f) && Objects.equals(this.f26370h, eventTime.f26370h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f26363a), this.f26364b, Integer.valueOf(this.f26365c), this.f26366d, Long.valueOf(this.f26367e), this.f26368f, Integer.valueOf(this.f26369g), this.f26370h, Long.valueOf(this.f26371i), Long.valueOf(this.f26372j));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static final class Events {

        /* JADX INFO: renamed from: a */
        public final FlagSet f26373a;

        /* JADX INFO: renamed from: b */
        public final SparseArray f26374b;

        public Events(FlagSet flagSet, SparseArray sparseArray) {
            this.f26373a = flagSet;
            SparseBooleanArray sparseBooleanArray = flagSet.f25130a;
            SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                int iM9244a = flagSet.m9244a(i);
                EventTime eventTime = (EventTime) sparseArray.get(iM9244a);
                eventTime.getClass();
                sparseArray2.append(iM9244a, eventTime);
            }
            this.f26374b = sparseArray2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m10119a(int i) {
            return this.f26373a.f25130a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public final EventTime m10120b(int i) {
            EventTime eventTime = (EventTime) this.f26374b.get(i);
            eventTime.getClass();
            return eventTime;
        }
    }

    /* JADX INFO: renamed from: L */
    default void mo10087L(EventTime eventTime) {
    }

    /* JADX INFO: renamed from: e */
    default void mo10097e(EventTime eventTime) {
    }

    /* JADX INFO: renamed from: u */
    default void mo10113u(EventTime eventTime) {
    }

    /* JADX INFO: renamed from: v */
    default void mo10114v(EventTime eventTime) {
    }

    /* JADX INFO: renamed from: x */
    default void mo10116x(EventTime eventTime) {
    }

    /* JADX INFO: renamed from: y */
    default void mo10117y(EventTime eventTime) {
    }

    /* JADX INFO: renamed from: A */
    default void mo10076A(EventTime eventTime, Tracks tracks) {
    }

    /* JADX INFO: renamed from: C */
    default void mo10078C(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: D */
    default void mo10079D(EventTime eventTime, VideoSize videoSize) {
    }

    /* JADX INFO: renamed from: E */
    default void mo10080E(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: F */
    default void mo10081F(EventTime eventTime, Exception exc) {
    }

    /* JADX INFO: renamed from: G */
    default void mo10082G(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    /* JADX INFO: renamed from: H */
    default void mo10083H(Player player, Events events) {
    }

    /* JADX INFO: renamed from: I */
    default void mo10084I(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: K */
    default void mo10086K(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: M */
    default void mo10088M(EventTime eventTime, String str) {
    }

    /* JADX INFO: renamed from: N */
    default void mo10089N(EventTime eventTime, boolean z2) {
    }

    /* JADX INFO: renamed from: O */
    default void mo10090O(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: Q */
    default void mo10092Q(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: a */
    default void mo10093a(EventTime eventTime, boolean z2) {
    }

    /* JADX INFO: renamed from: b */
    default void mo10094b(EventTime eventTime, Object obj) {
    }

    /* JADX INFO: renamed from: c */
    default void mo10095c(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    /* JADX INFO: renamed from: d */
    default void mo10096d(EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    /* JADX INFO: renamed from: f */
    default void mo10098f(EventTime eventTime, String str) {
    }

    /* JADX INFO: renamed from: g */
    default void mo10099g(EventTime eventTime, String str) {
    }

    /* JADX INFO: renamed from: h */
    default void mo10100h(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    /* JADX INFO: renamed from: i */
    default void mo10101i(EventTime eventTime, String str) {
    }

    /* JADX INFO: renamed from: j */
    default void mo10102j(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: k */
    default void mo10103k(EventTime eventTime, boolean z2) {
    }

    /* JADX INFO: renamed from: l */
    default void mo10104l(EventTime eventTime, Metadata metadata) {
    }

    /* JADX INFO: renamed from: m */
    default void mo10105m(EventTime eventTime, boolean z2) {
    }

    /* JADX INFO: renamed from: n */
    default void mo10106n(EventTime eventTime, PlaybackException playbackException) {
    }

    /* JADX INFO: renamed from: p */
    default void mo10108p(EventTime eventTime, int i) {
    }

    /* JADX INFO: renamed from: s */
    default void mo10111s(EventTime eventTime, Format format) {
    }

    /* JADX INFO: renamed from: t */
    default void mo10112t(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    /* JADX INFO: renamed from: w */
    default void mo10115w(EventTime eventTime, Format format) {
    }

    /* JADX INFO: renamed from: B */
    default void mo10077B(EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }

    /* JADX INFO: renamed from: J */
    default void mo10085J(EventTime eventTime, int i, int i2) {
    }

    /* JADX INFO: renamed from: o */
    default void mo10107o(int i, long j, EventTime eventTime) {
    }

    /* JADX INFO: renamed from: r */
    default void mo10110r(EventTime eventTime, boolean z2, int i) {
    }

    /* JADX INFO: renamed from: P */
    default void mo10091P(EventTime eventTime, int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: q */
    default void mo10109q(EventTime eventTime, int i, int i2, boolean z2) {
    }

    /* JADX INFO: renamed from: z */
    default void mo10118z(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, EventTime eventTime) {
    }
}
