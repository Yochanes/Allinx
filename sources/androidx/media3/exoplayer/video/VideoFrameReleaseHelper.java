package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AbstractC1740a;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.FixedFrameRateEstimator;
import com.google.firebase.messaging.Constants;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class VideoFrameReleaseHelper {

    /* JADX INFO: renamed from: a */
    public final FixedFrameRateEstimator f27953a;

    /* JADX INFO: renamed from: b */
    public final DisplayHelper f27954b;

    /* JADX INFO: renamed from: c */
    public final VSyncSampler f27955c;

    /* JADX INFO: renamed from: d */
    public boolean f27956d;

    /* JADX INFO: renamed from: e */
    public Surface f27957e;

    /* JADX INFO: renamed from: f */
    public float f27958f;

    /* JADX INFO: renamed from: g */
    public float f27959g;

    /* JADX INFO: renamed from: h */
    public float f27960h;

    /* JADX INFO: renamed from: i */
    public float f27961i;

    /* JADX INFO: renamed from: j */
    public int f27962j;

    /* JADX INFO: renamed from: k */
    public long f27963k;

    /* JADX INFO: renamed from: l */
    public long f27964l;

    /* JADX INFO: renamed from: m */
    public long f27965m;

    /* JADX INFO: renamed from: n */
    public long f27966n;

    /* JADX INFO: renamed from: o */
    public long f27967o;

    /* JADX INFO: renamed from: p */
    public long f27968p;

    /* JADX INFO: renamed from: q */
    public long f27969q;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api30 {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f */
        public static final VSyncSampler f27972f = new VSyncSampler();

        /* JADX INFO: renamed from: a */
        public volatile long f27973a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public final Handler f27974b;

        /* JADX INFO: renamed from: c */
        public Choreographer f27975c;

        /* JADX INFO: renamed from: d */
        public int f27976d;

        public VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = Util.f25665a;
            Handler handler = new Handler(looper, this);
            this.f27974b = handler;
            handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.f27973a = j;
            Choreographer choreographer = this.f27975c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    this.f27975c = Choreographer.getInstance();
                } catch (RuntimeException e) {
                    Log.m9512h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
                return true;
            }
            if (i == 2) {
                Choreographer choreographer = this.f27975c;
                if (choreographer != null) {
                    int i2 = this.f27976d + 1;
                    this.f27976d = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f27975c;
            if (choreographer2 != null) {
                int i3 = this.f27976d - 1;
                this.f27976d = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f27973a = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        DisplayManager displayManager;
        FixedFrameRateEstimator fixedFrameRateEstimator = new FixedFrameRateEstimator();
        fixedFrameRateEstimator.f27800a = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.f27801b = new FixedFrameRateEstimator.Matcher();
        fixedFrameRateEstimator.f27803d = -9223372036854775807L;
        this.f27953a = fixedFrameRateEstimator;
        DisplayHelper displayHelper = (context == null || (displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) == null) ? null : new DisplayHelper(displayManager);
        this.f27954b = displayHelper;
        this.f27955c = displayHelper != null ? VSyncSampler.f27972f : null;
        this.f27963k = -9223372036854775807L;
        this.f27964l = -9223372036854775807L;
        this.f27958f = -1.0f;
        this.f27961i = 1.0f;
        this.f27962j = 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m10749a(VideoFrameReleaseHelper videoFrameReleaseHelper, Display display) {
        videoFrameReleaseHelper.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            videoFrameReleaseHelper.f27963k = refreshRate;
            videoFrameReleaseHelper.f27964l = (refreshRate * 80) / 100;
        } else {
            Log.m9511g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            videoFrameReleaseHelper.f27963k = -9223372036854775807L;
            videoFrameReleaseHelper.f27964l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10750b() {
        Surface surface;
        if (Util.f25665a < 30 || (surface = this.f27957e) == null || this.f27962j == Integer.MIN_VALUE || this.f27960h == 0.0f) {
            return;
        }
        this.f27960h = 0.0f;
        try {
            AbstractC1740a.m9429z(surface, 0.0f, 0);
        } catch (IllegalStateException e) {
            Log.m9508d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10751c() {
        float f;
        float f2;
        if (Util.f25665a < 30 || this.f27957e == null) {
            return;
        }
        FixedFrameRateEstimator fixedFrameRateEstimator = this.f27953a;
        if (!fixedFrameRateEstimator.f27800a.m10697a()) {
            f = this.f27958f;
        } else if (fixedFrameRateEstimator.f27800a.m10697a()) {
            f = (float) (1.0E9d / (fixedFrameRateEstimator.f27800a.f27809e != 0 ? r2.f27810f / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.f27959g;
        if (f == f3) {
            return;
        }
        if (f == -1.0f || f3 == -1.0f) {
            if (f == -1.0f && fixedFrameRateEstimator.f27804e < 30) {
                return;
            }
        } else if (fixedFrameRateEstimator.f27800a.m10697a()) {
            if ((fixedFrameRateEstimator.f27800a.m10697a() ? fixedFrameRateEstimator.f27800a.f27810f : -9223372036854775807L) >= 5000000000L) {
                f2 = 0.02f;
            }
            if (Math.abs(f - this.f27959g) < f2) {
            }
        } else {
            f2 = 1.0f;
            if (Math.abs(f - this.f27959g) < f2) {
                return;
            }
        }
        this.f27959g = f;
        m10752d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10752d(boolean z2) {
        Surface surface;
        float f;
        if (Util.f25665a < 30 || (surface = this.f27957e) == null || this.f27962j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f27956d) {
            float f2 = this.f27959g;
            f = f2 != -1.0f ? f2 * this.f27961i : 0.0f;
        }
        if (z2 || this.f27960h != f) {
            this.f27960h = f;
            try {
                AbstractC1740a.m9429z(surface, f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                Log.m9508d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class DisplayHelper implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        public final DisplayManager f27970a;

        public DisplayHelper(DisplayManager displayManager) {
            this.f27970a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                VideoFrameReleaseHelper.m10749a(VideoFrameReleaseHelper.this, this.f27970a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
