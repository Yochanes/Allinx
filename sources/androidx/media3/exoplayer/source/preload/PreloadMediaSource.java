package androidx.media3.exoplayer.source.preload;

import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PreloadMediaSource extends WrappingMediaSource {

    /* JADX INFO: renamed from: q */
    public boolean f27517q;

    /* JADX INFO: renamed from: r */
    public Timeline f27518r;

    /* JADX INFO: renamed from: s */
    public Pair f27519s;

    /* JADX INFO: renamed from: t */
    public Pair f27520t;

    /* JADX INFO: renamed from: u */
    public boolean f27521u;

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements MediaSource.Factory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        /* JADX INFO: renamed from: a */
        public final MediaSource mo10498a(MediaItem mediaItem) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MediaPeriodKey {

        /* JADX INFO: renamed from: a */
        public final MediaSource.MediaPeriodId f27522a;

        /* JADX INFO: renamed from: b */
        public final Long f27523b;

        public MediaPeriodKey(MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.f27522a = mediaPeriodId;
            this.f27523b = Long.valueOf(j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodKey)) {
                return false;
            }
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) obj;
            return PreloadMediaSource.m10621p0(this.f27522a, mediaPeriodKey.f27522a) && this.f27523b.equals(mediaPeriodKey.f27523b);
        }

        public final int hashCode() {
            MediaSource.MediaPeriodId mediaPeriodId = this.f27522a;
            return this.f27523b.intValue() + ((((((((mediaPeriodId.f27230a.hashCode() + 527) * 31) + mediaPeriodId.f27231b) * 31) + mediaPeriodId.f27232c) * 31) + mediaPeriodId.f27234e) * 31);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PreloadControl {
    }

    /* JADX INFO: compiled from: Proguard */
    public class PreloadMediaPeriodCallback implements MediaPeriod.Callback {
        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        /* JADX INFO: renamed from: b */
        public final void mo9903b(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: d */
        public final void mo9907d(SequenceableLoader sequenceableLoader) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m10621p0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.f27230a.equals(mediaPeriodId2.f27230a) && mediaPeriodId.f27231b == mediaPeriodId2.f27231b && mediaPeriodId.f27232c == mediaPeriodId2.f27232c && mediaPeriodId.f27234e == mediaPeriodId2.f27234e;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: C */
    public final MediaPeriod mo10480C(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaPeriodKey mediaPeriodKey = new MediaPeriodKey(mediaPeriodId, j);
        Pair pair = this.f27519s;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            Pair pair2 = this.f27519s;
            pair2.getClass();
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair2.first;
            if (!m10622o0()) {
                return preloadMediaPeriod;
            }
            this.f27519s = null;
            this.f27520t = new Pair(preloadMediaPeriod, mediaPeriodId);
            return preloadMediaPeriod;
        }
        Pair pair3 = this.f27519s;
        MediaSource mediaSource = this.f27454p;
        if (pair3 != null) {
            mediaSource.mo10482N(((PreloadMediaPeriod) pair3.first).f27511a);
            this.f27519s = null;
        }
        PreloadMediaPeriod preloadMediaPeriod2 = new PreloadMediaPeriod(mediaSource.mo10480C(mediaPeriodId, allocator, j));
        if (!m10622o0()) {
            this.f27519s = new Pair(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: N */
    public final void mo10482N(MediaPeriod mediaPeriod) {
        PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
        Pair pair = this.f27519s;
        if (pair == null || preloadMediaPeriod != pair.first) {
            Pair pair2 = this.f27520t;
            if (pair2 != null && preloadMediaPeriod == pair2.first) {
                this.f27520t = null;
            }
        } else {
            this.f27519s = null;
        }
        this.f27454p.mo10482N(preloadMediaPeriod.f27511a);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    /* JADX INFO: renamed from: U */
    public final void mo10450U(Timeline timeline) {
        this.f27518r = timeline;
        m10452W(timeline);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    /* JADX INFO: renamed from: X */
    public final void mo10453X() {
        if (m10622o0()) {
            return;
        }
        this.f27521u = false;
        this.f27518r = null;
        this.f27517q = false;
        super.mo10453X();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    /* JADX INFO: renamed from: j0 */
    public final MediaSource.MediaPeriodId mo10508j0(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair pair = this.f27520t;
        if (pair == null) {
            return mediaPeriodId;
        }
        pair.getClass();
        if (!m10621p0(mediaPeriodId, (MediaSource.MediaPeriodId) pair.second)) {
            return mediaPeriodId;
        }
        Pair pair2 = this.f27520t;
        pair2.getClass();
        return (MediaSource.MediaPeriodId) pair2.second;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    /* JADX INFO: renamed from: n0 */
    public final void mo10514n0() {
        if (m10622o0() && !this.f27521u) {
            throw null;
        }
        Timeline timeline = this.f27518r;
        if (timeline != null) {
            mo10450U(timeline);
            throw null;
        }
        if (this.f27517q) {
            return;
        }
        this.f27517q = true;
        m10584m0();
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m10622o0() {
        return !this.f27106a.isEmpty();
    }
}
