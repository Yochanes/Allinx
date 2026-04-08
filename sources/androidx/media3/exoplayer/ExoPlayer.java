package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.image.ImageOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends Player {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final Context f26053a;

        /* JADX INFO: renamed from: b */
        public final SystemClock f26054b;

        /* JADX INFO: renamed from: c */
        public final C1817c f26055c;

        /* JADX INFO: renamed from: d */
        public final C1817c f26056d;

        /* JADX INFO: renamed from: e */
        public final C1817c f26057e;

        /* JADX INFO: renamed from: f */
        public final C1817c f26058f;

        /* JADX INFO: renamed from: g */
        public final Looper f26059g;

        /* JADX INFO: renamed from: h */
        public final int f26060h;

        /* JADX INFO: renamed from: i */
        public final AudioAttributes f26061i;

        /* JADX INFO: renamed from: j */
        public final int f26062j;

        /* JADX INFO: renamed from: k */
        public final boolean f26063k;

        /* JADX INFO: renamed from: l */
        public final SeekParameters f26064l;

        /* JADX INFO: renamed from: m */
        public final long f26065m;

        /* JADX INFO: renamed from: n */
        public final long f26066n;

        /* JADX INFO: renamed from: o */
        public final long f26067o;

        /* JADX INFO: renamed from: p */
        public final DefaultLivePlaybackSpeedControl f26068p;

        /* JADX INFO: renamed from: q */
        public final long f26069q;

        /* JADX INFO: renamed from: r */
        public final long f26070r;

        /* JADX INFO: renamed from: s */
        public final boolean f26071s;

        /* JADX INFO: renamed from: t */
        public boolean f26072t;

        /* JADX INFO: renamed from: u */
        public final String f26073u;

        /* JADX INFO: renamed from: v */
        public final SuitableOutputChecker f26074v;

        public Builder(Context context) {
            C1817c c1817c = new C1817c(context, 1);
            C1817c c1817c2 = new C1817c(context, 2);
            C1817c c1817c3 = new C1817c(context, 3);
            C1817c c1817c4 = new C1817c(context, 4);
            context.getClass();
            this.f26053a = context;
            this.f26055c = c1817c;
            this.f26056d = c1817c2;
            this.f26057e = c1817c3;
            this.f26058f = c1817c4;
            int i = Util.f25665a;
            Looper looperMyLooper = Looper.myLooper();
            this.f26059g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f26061i = AudioAttributes.f25095b;
            this.f26062j = 1;
            this.f26063k = true;
            this.f26064l = SeekParameters.f26349c;
            this.f26065m = 5000L;
            this.f26066n = 15000L;
            this.f26067o = 3000L;
            this.f26068p = new DefaultLivePlaybackSpeedControl(0.999f, Util.m9598H(20L), Util.m9598H(500L));
            this.f26054b = Clock.f25579a;
            this.f26069q = 500L;
            this.f26070r = 2000L;
            this.f26071s = true;
            this.f26073u = "";
            this.f26060h = -1000;
            this.f26074v = new DefaultSuitableOutputChecker();
        }

        /* JADX INFO: renamed from: a */
        public final ExoPlayer m9821a() {
            Assertions.m9464e(!this.f26072t);
            this.f26072t = true;
            return new ExoPlayerImpl(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static class PreloadConfiguration {

        /* JADX INFO: renamed from: a */
        public static final PreloadConfiguration f26075a = new PreloadConfiguration();
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: a */
    /* bridge */ /* synthetic */ default PlaybackException mo9271a() {
        return mo9271a();
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: a */
    ExoPlaybackException mo9271a();

    void release();

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public interface AudioOffloadListener {
        /* JADX INFO: renamed from: z */
        default void mo9820z() {
        }
    }
}
