package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ThreadFactoryC1752e;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Loader implements LoaderErrorThrower {

    /* JADX INFO: renamed from: d */
    public static final LoadErrorAction f27724d = new LoadErrorAction(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e */
    public static final LoadErrorAction f27725e = new LoadErrorAction(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a */
    public final ReleasableExecutor f27726a;

    /* JADX INFO: renamed from: b */
    public LoadTask f27727b;

    /* JADX INFO: renamed from: c */
    public IOException f27728c;

    /* JADX INFO: compiled from: Proguard */
    public static final class LoadErrorAction {

        /* JADX INFO: renamed from: a */
        public final int f27729a;

        /* JADX INFO: renamed from: b */
        public final long f27730b;

        public LoadErrorAction(int i, long j) {
            this.f27729a = i;
            this.f27730b = j;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SuppressLint({"HandlerLeak"})
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f27731a;

        /* JADX INFO: renamed from: b */
        public final Loadable f27732b;

        /* JADX INFO: renamed from: c */
        public final long f27733c;

        /* JADX INFO: renamed from: d */
        public Object f27734d;

        /* JADX INFO: renamed from: f */
        public IOException f27735f;

        /* JADX INFO: renamed from: g */
        public int f27736g;

        /* JADX INFO: renamed from: i */
        public Thread f27737i;

        /* JADX INFO: renamed from: j */
        public boolean f27738j;

        /* JADX INFO: renamed from: n */
        public volatile boolean f27739n;

        public LoadTask(Looper looper, Loadable loadable, Callback callback, int i, long j) {
            super(looper);
            this.f27732b = loadable;
            this.f27734d = callback;
            this.f27731a = i;
            this.f27733c = j;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        /* JADX INFO: renamed from: a */
        public final void m10671a(boolean z2) {
            this.f27739n = z2;
            this.f27735f = null;
            if (hasMessages(1)) {
                this.f27738j = true;
                removeMessages(1);
                if (!z2) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f27738j = true;
                        this.f27732b.mo10550b();
                        Thread thread = this.f27737i;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z2) {
                Loader.this.f27727b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ?? r1 = this.f27734d;
                r1.getClass();
                r1.mo10542u(this.f27732b, jElapsedRealtime, jElapsedRealtime - this.f27733c, true);
                this.f27734d = null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        /* JADX INFO: renamed from: b */
        public final void m10672b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f27733c;
            ?? r0 = this.f27734d;
            r0.getClass();
            r0.mo10539l(this.f27732b, jElapsedRealtime, j, this.f27736g);
            this.f27735f = null;
            Loader loader = Loader.this;
            ReleasableExecutor releasableExecutor = loader.f27726a;
            LoadTask loadTask = loader.f27727b;
            loadTask.getClass();
            releasableExecutor.execute(loadTask);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f27739n) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                m10672b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.f27727b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f27733c;
            ?? r3 = this.f27734d;
            r3.getClass();
            if (this.f27738j) {
                r3.mo10542u(this.f27732b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    r3.mo10541q(this.f27732b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    Log.m9508d("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.f27728c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f27735f = iOException;
            int i3 = this.f27736g + 1;
            this.f27736g = i3;
            LoadErrorAction loadErrorActionMo10538d = r3.mo10538d(this.f27732b, jElapsedRealtime, j, iOException, i3);
            int i4 = loadErrorActionMo10538d.f27729a;
            if (i4 == 3) {
                Loader.this.f27728c = this.f27735f;
                return;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    this.f27736g = 1;
                }
                long jMin = loadErrorActionMo10538d.f27730b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f27736g - 1) * 1000, 5000);
                }
                Loader loader = Loader.this;
                Assertions.m9464e(loader.f27727b == null);
                loader.f27727b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    m10672b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            try {
                synchronized (this) {
                    z2 = this.f27738j;
                    this.f27737i = Thread.currentThread();
                }
                if (!z2) {
                    Trace.beginSection("load:".concat(this.f27732b.getClass().getSimpleName()));
                    try {
                        this.f27732b.mo10549a();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f27737i = null;
                    Thread.interrupted();
                }
                if (this.f27739n) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.f27739n) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.f27739n) {
                    return;
                }
                Log.m9508d("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.f27739n) {
                    return;
                }
                Log.m9508d("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.f27739n) {
                    Log.m9508d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Loadable {
        /* JADX INFO: renamed from: a */
        void mo10549a();

        /* JADX INFO: renamed from: b */
        void mo10550b();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ReleaseCallback {
        /* JADX INFO: renamed from: b */
        void mo10537b();
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReleaseTask implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ReleaseCallback f27741a;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.f27741a = releaseCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27741a.mo10537b();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = Util.f25665a;
        this(ReleasableExecutor.m10682M(Executors.newSingleThreadExecutor(new ThreadFactoryC1752e(strConcat)), new C1918c()));
    }

    /* JADX INFO: renamed from: a */
    public final void m10666a() {
        LoadTask loadTask = this.f27727b;
        Assertions.m9466g(loadTask);
        loadTask.m10671a(false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10667b() {
        return this.f27727b != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m10668c(int i) throws IOException {
        IOException iOException = this.f27728c;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask loadTask = this.f27727b;
        if (loadTask != null) {
            if (i == Integer.MIN_VALUE) {
                i = loadTask.f27731a;
            }
            IOException iOException2 = loadTask.f27735f;
            if (iOException2 != null && loadTask.f27736g > i) {
                throw iOException2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10669d(ReleaseCallback releaseCallback) {
        LoadTask loadTask = this.f27727b;
        if (loadTask != null) {
            loadTask.m10671a(true);
        }
        ReleasableExecutor releasableExecutor = this.f27726a;
        if (releaseCallback != null) {
            releasableExecutor.execute(new ReleaseTask(releaseCallback));
        }
        releasableExecutor.release();
    }

    /* JADX INFO: renamed from: e */
    public final void m10670e(Loadable loadable, Callback callback, int i) {
        Looper looperMyLooper = Looper.myLooper();
        Assertions.m9466g(looperMyLooper);
        this.f27728c = null;
        LoadTask loadTask = new LoadTask(looperMyLooper, loadable, callback, i, SystemClock.elapsedRealtime());
        Assertions.m9464e(this.f27727b == null);
        this.f27727b = loadTask;
        loadTask.m10672b();
    }

    public Loader(ReleasableExecutor releasableExecutor) {
        this.f27726a = releasableExecutor;
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Callback<T extends Loadable> {
        /* JADX INFO: renamed from: d */
        LoadErrorAction mo10538d(Loadable loadable, long j, long j2, IOException iOException, int i);

        /* JADX INFO: renamed from: q */
        void mo10541q(Loadable loadable, long j, long j2);

        /* JADX INFO: renamed from: u */
        void mo10542u(Loadable loadable, long j, long j2, boolean z2);

        /* JADX INFO: renamed from: l */
        default void mo10539l(Loadable loadable, long j, long j2, int i) {
        }
    }
}
