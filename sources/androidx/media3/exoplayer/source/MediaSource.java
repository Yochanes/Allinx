package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface MediaSource {

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static final class MediaPeriodId {

        /* JADX INFO: renamed from: a */
        public final Object f27230a;

        /* JADX INFO: renamed from: b */
        public final int f27231b;

        /* JADX INFO: renamed from: c */
        public final int f27232c;

        /* JADX INFO: renamed from: d */
        public final long f27233d;

        /* JADX INFO: renamed from: e */
        public final int f27234e;

        public MediaPeriodId(Object obj) {
            this(-1L, obj);
        }

        /* JADX INFO: renamed from: a */
        public final MediaPeriodId m10517a(Object obj) {
            if (this.f27230a.equals(obj)) {
                return this;
            }
            return new MediaPeriodId(obj, this.f27231b, this.f27232c, this.f27233d, this.f27234e);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m10518b() {
            return this.f27231b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodId)) {
                return false;
            }
            MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
            return this.f27230a.equals(mediaPeriodId.f27230a) && this.f27231b == mediaPeriodId.f27231b && this.f27232c == mediaPeriodId.f27232c && this.f27233d == mediaPeriodId.f27233d && this.f27234e == mediaPeriodId.f27234e;
        }

        public final int hashCode() {
            return ((((((((this.f27230a.hashCode() + 527) * 31) + this.f27231b) * 31) + this.f27232c) * 31) + ((int) this.f27233d)) * 31) + this.f27234e;
        }

        public MediaPeriodId(long j, Object obj) {
            this(obj, -1, -1, j, -1);
        }

        public MediaPeriodId(Object obj, int i, long j) {
            this(obj, -1, -1, j, i);
        }

        public MediaPeriodId(Object obj, int i, int i2, long j, int i3) {
            this.f27230a = obj;
            this.f27231b = i;
            this.f27232c = i2;
            this.f27233d = j;
            this.f27234e = i3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public interface MediaSourceCaller {
        /* JADX INFO: renamed from: a */
        void mo10015a(BaseMediaSource baseMediaSource, Timeline timeline);
    }

    /* JADX INFO: renamed from: B */
    void mo10444B(MediaSourceCaller mediaSourceCaller);

    /* JADX INFO: renamed from: C */
    MediaPeriod mo10480C(MediaPeriodId mediaPeriodId, Allocator allocator, long j);

    /* JADX INFO: renamed from: D */
    MediaItem mo10492D();

    /* JADX INFO: renamed from: E */
    void mo10481E();

    /* JADX INFO: renamed from: F */
    default boolean mo10507F() {
        return !(this instanceof ConcatenatingMediaSource);
    }

    /* JADX INFO: renamed from: H */
    default Timeline mo10493H() {
        return null;
    }

    /* JADX INFO: renamed from: I */
    void mo10445I(Handler handler, DrmSessionEventListener drmSessionEventListener);

    /* JADX INFO: renamed from: J */
    void mo10446J(DrmSessionEventListener drmSessionEventListener);

    /* JADX INFO: renamed from: N */
    void mo10482N(MediaPeriod mediaPeriod);

    /* JADX INFO: renamed from: P */
    void mo10447P(MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId);

    /* JADX INFO: renamed from: m */
    void mo10454m(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    /* JADX INFO: renamed from: n */
    void mo10455n(MediaSourceCaller mediaSourceCaller);

    /* JADX INFO: renamed from: r */
    void mo10456r(MediaSourceEventListener mediaSourceEventListener);

    /* JADX INFO: renamed from: z */
    void mo10457z(MediaSourceCaller mediaSourceCaller);

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {

        /* JADX INFO: renamed from: a */
        public static final Factory f27229a = MediaSourceFactory.f27240b;

        /* JADX INFO: renamed from: a */
        MediaSource mo10498a(MediaItem mediaItem);

        /* JADX INFO: renamed from: c */
        default void mo10500c() {
        }

        /* JADX INFO: renamed from: b */
        default void mo10499b(boolean z2) {
        }

        /* JADX INFO: renamed from: d */
        default void mo10501d(DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        }
    }

    /* JADX INFO: renamed from: o */
    default void mo10495o(MediaItem mediaItem) {
    }
}
