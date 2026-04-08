package androidx.media3.exoplayer;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultLoadControl implements LoadControl {

    /* JADX INFO: renamed from: a */
    public final DefaultAllocator f26026a;

    /* JADX INFO: renamed from: b */
    public final long f26027b;

    /* JADX INFO: renamed from: c */
    public final long f26028c;

    /* JADX INFO: renamed from: d */
    public final long f26029d;

    /* JADX INFO: renamed from: e */
    public final long f26030e;

    /* JADX INFO: renamed from: f */
    public final int f26031f;

    /* JADX INFO: renamed from: g */
    public final long f26032g;

    /* JADX INFO: renamed from: h */
    public final HashMap f26033h;

    /* JADX INFO: renamed from: i */
    public long f26034i;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PlayerLoadingState {

        /* JADX INFO: renamed from: a */
        public boolean f26035a;

        /* JADX INFO: renamed from: b */
        public int f26036b;
    }

    public DefaultLoadControl() {
        DefaultAllocator defaultAllocator = new DefaultAllocator();
        m9799k(1000, 0, "bufferForPlaybackMs", "0");
        m9799k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m9799k(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        m9799k(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m9799k(50000, 50000, "maxBufferMs", "minBufferMs");
        m9799k(0, 0, "backBufferDurationMs", "0");
        this.f26026a = defaultAllocator;
        long j = 50000;
        this.f26027b = Util.m9598H(j);
        this.f26028c = Util.m9598H(j);
        this.f26029d = Util.m9598H(1000);
        this.f26030e = Util.m9598H(2000);
        this.f26031f = -1;
        this.f26032g = Util.m9598H(0);
        this.f26033h = new HashMap();
        this.f26034i = -1L;
    }

    /* JADX INFO: renamed from: k */
    public static void m9799k(int i, int i2, String str, String str2) {
        Assertions.m9461b(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: a */
    public final boolean mo9800a(LoadControl.Parameters parameters) {
        int i;
        long jRound = parameters.f26221b;
        float f = parameters.f26222c;
        int i2 = Util.f25665a;
        if (f != 1.0f) {
            jRound = Math.round(jRound / ((double) f));
        }
        long jMin = parameters.f26223d ? this.f26030e : this.f26029d;
        long j = parameters.f26224e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jRound >= jMin) {
            return true;
        }
        DefaultAllocator defaultAllocator = this.f26026a;
        synchronized (defaultAllocator) {
            i = defaultAllocator.f27692e * defaultAllocator.f27689b;
        }
        return i >= m9810l();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: b */
    public final boolean mo9801b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: c */
    public final void mo9802c(PlayerId playerId) {
        HashMap map = this.f26033h;
        if (map.remove(playerId) != null) {
            m9811m();
        }
        if (map.isEmpty()) {
            this.f26034i = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: d */
    public final boolean mo9803d(LoadControl.Parameters parameters) {
        int i;
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.f26033h.get(parameters.f26220a);
        playerLoadingState.getClass();
        DefaultAllocator defaultAllocator = this.f26026a;
        synchronized (defaultAllocator) {
            i = defaultAllocator.f27692e * defaultAllocator.f27689b;
        }
        boolean z2 = i >= m9810l();
        float f = parameters.f26222c;
        long j = this.f26028c;
        long jMin = this.f26027b;
        if (f > 1.0f) {
            jMin = Math.min(Util.m9631v(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = parameters.f26221b;
        if (j2 < jMax) {
            playerLoadingState.f26035a = !z2;
            if (z2 && j2 < 500000) {
                Log.m9511g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            playerLoadingState.f26035a = false;
        }
        return playerLoadingState.f26035a;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: e */
    public final boolean mo9804e() {
        Iterator it = this.f26033h.values().iterator();
        while (it.hasNext()) {
            if (((PlayerLoadingState) it.next()).f26035a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: f */
    public final void mo9805f(PlayerId playerId) {
        if (this.f26033h.remove(playerId) != null) {
            m9811m();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: g */
    public final void mo9806g(LoadControl.Parameters parameters, ExoTrackSelection[] exoTrackSelectionArr) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) this.f26033h.get(parameters.f26220a);
        playerLoadingState.getClass();
        int iMax = this.f26031f;
        if (iMax == -1) {
            int length = exoTrackSelectionArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                    if (exoTrackSelection != null) {
                        switch (exoTrackSelection.mo10520a().f25367c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        playerLoadingState.f26036b = iMax;
        m9811m();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: h */
    public final long mo9807h() {
        return this.f26032g;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: i */
    public final void mo9808i(PlayerId playerId) {
        long id = Thread.currentThread().getId();
        long j = this.f26034i;
        Assertions.m9465f(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f26034i = id;
        HashMap map = this.f26033h;
        if (!map.containsKey(playerId)) {
            map.put(playerId, new PlayerLoadingState());
        }
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) map.get(playerId);
        playerLoadingState.getClass();
        int i = this.f26031f;
        if (i == -1) {
            i = 13107200;
        }
        playerLoadingState.f26036b = i;
        playerLoadingState.f26035a = false;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    /* JADX INFO: renamed from: j */
    public final DefaultAllocator mo9809j() {
        return this.f26026a;
    }

    /* JADX INFO: renamed from: l */
    public final int m9810l() {
        Iterator it = this.f26033h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((PlayerLoadingState) it.next()).f26036b;
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public final void m9811m() {
        if (!this.f26033h.isEmpty()) {
            this.f26026a.m10662f(m9810l());
            return;
        }
        DefaultAllocator defaultAllocator = this.f26026a;
        synchronized (defaultAllocator) {
            if (defaultAllocator.f27688a) {
                defaultAllocator.m10662f(0);
            }
        }
    }
}
