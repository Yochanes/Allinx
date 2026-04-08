package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class StandaloneMediaClock implements MediaClock {

    /* JADX INFO: renamed from: a */
    public final SystemClock f26352a;

    /* JADX INFO: renamed from: b */
    public boolean f26353b;

    /* JADX INFO: renamed from: c */
    public long f26354c;

    /* JADX INFO: renamed from: d */
    public long f26355d;

    /* JADX INFO: renamed from: f */
    public PlaybackParameters f26356f = PlaybackParameters.f25321d;

    public StandaloneMediaClock(SystemClock systemClock) {
        this.f26352a = systemClock;
    }

    /* JADX INFO: renamed from: a */
    public final void m10048a(long j) {
        this.f26354c = j;
        if (this.f26353b) {
            this.f26352a.getClass();
            this.f26355d = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    /* JADX INFO: renamed from: d */
    public final void mo9813d(PlaybackParameters playbackParameters) {
        if (this.f26353b) {
            m10048a(mo9815s());
        }
        this.f26356f = playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    /* JADX INFO: renamed from: e */
    public final PlaybackParameters mo9814e() {
        return this.f26356f;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    /* JADX INFO: renamed from: s */
    public final long mo9815s() {
        long j = this.f26354c;
        if (!this.f26353b) {
            return j;
        }
        this.f26352a.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f26355d;
        PlaybackParameters playbackParameters = this.f26356f;
        return playbackParameters.f25322a == 1.0f ? Util.m9598H(jElapsedRealtime) + j : (jElapsedRealtime * ((long) playbackParameters.f25324c)) + j;
    }
}
