package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.SystemClock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class DefaultMediaClock implements MediaClock {

    /* JADX INFO: renamed from: a */
    public final StandaloneMediaClock f26037a;

    /* JADX INFO: renamed from: b */
    public final PlaybackParametersListener f26038b;

    /* JADX INFO: renamed from: c */
    public Renderer f26039c;

    /* JADX INFO: renamed from: d */
    public MediaClock f26040d;

    /* JADX INFO: renamed from: f */
    public boolean f26041f = true;

    /* JADX INFO: renamed from: g */
    public boolean f26042g;

    /* JADX INFO: compiled from: Proguard */
    public interface PlaybackParametersListener {
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, SystemClock systemClock) {
        this.f26038b = playbackParametersListener;
        this.f26037a = new StandaloneMediaClock(systemClock);
    }

    /* JADX INFO: renamed from: a */
    public final void m9812a(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaClock mediaClockMo9771D = renderer.mo9771D();
        if (mediaClockMo9771D == null || mediaClockMo9771D == (mediaClock = this.f26040d)) {
            return;
        }
        if (mediaClock != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f26040d = mediaClockMo9771D;
        this.f26039c = renderer;
        mediaClockMo9771D.mo9813d(this.f26037a.f26356f);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    /* JADX INFO: renamed from: d */
    public final void mo9813d(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.f26040d;
        if (mediaClock != null) {
            mediaClock.mo9813d(playbackParameters);
            playbackParameters = this.f26040d.mo9814e();
        }
        this.f26037a.mo9813d(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    /* JADX INFO: renamed from: e */
    public final PlaybackParameters mo9814e() {
        MediaClock mediaClock = this.f26040d;
        return mediaClock != null ? mediaClock.mo9814e() : this.f26037a.f26356f;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    /* JADX INFO: renamed from: s */
    public final long mo9815s() {
        if (this.f26041f) {
            return this.f26037a.mo9815s();
        }
        MediaClock mediaClock = this.f26040d;
        mediaClock.getClass();
        return mediaClock.mo9815s();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    /* JADX INFO: renamed from: u */
    public final boolean mo9816u() {
        if (this.f26041f) {
            this.f26037a.getClass();
            return false;
        }
        MediaClock mediaClock = this.f26040d;
        mediaClock.getClass();
        return mediaClock.mo9816u();
    }
}
