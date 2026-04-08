package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class DeferrableSurface {

    /* JADX INFO: renamed from: k */
    public static final Size f2690k = new Size(0, 0);

    /* JADX INFO: renamed from: l */
    public static final boolean f2691l = Logger.m1285f("DeferrableSurface");

    /* JADX INFO: renamed from: m */
    public static final AtomicInteger f2692m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n */
    public static final AtomicInteger f2693n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final Object f2694a = new Object();

    /* JADX INFO: renamed from: b */
    public int f2695b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f2696c = false;

    /* JADX INFO: renamed from: d */
    public CallbackToFutureAdapter.Completer f2697d;

    /* JADX INFO: renamed from: e */
    public final ListenableFuture f2698e;

    /* JADX INFO: renamed from: f */
    public CallbackToFutureAdapter.Completer f2699f;

    /* JADX INFO: renamed from: g */
    public final ListenableFuture f2700g;

    /* JADX INFO: renamed from: h */
    public final Size f2701h;

    /* JADX INFO: renamed from: i */
    public final int f2702i;

    /* JADX INFO: renamed from: j */
    public Class f2703j;

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static final class SurfaceClosedException extends Exception {

        /* JADX INFO: renamed from: a */
        public final DeferrableSurface f2704a;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.f2704a = deferrableSurface;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SurfaceUnavailableException extends Exception {
    }

    public DeferrableSurface(Size size, int i) {
        this.f2701h = size;
        this.f2702i = i;
        ListenableFuture listenableFutureM6740a = CallbackToFutureAdapter.m6740a(new C0277c(this, 0));
        this.f2698e = listenableFutureM6740a;
        this.f2700g = CallbackToFutureAdapter.m6740a(new C0277c(this, 1));
        if (Logger.m1285f("DeferrableSurface")) {
            m1481e(f2693n.incrementAndGet(), f2692m.get(), "Surface created");
            listenableFutureM6740a.addListener(new RunnableC0279e(3, this, Log.getStackTraceString(new Exception())), CameraXExecutors.m1615a());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1477a() {
        CallbackToFutureAdapter.Completer completer;
        synchronized (this.f2694a) {
            try {
                if (this.f2696c) {
                    completer = null;
                } else {
                    this.f2696c = true;
                    this.f2699f.m6742b(null);
                    if (this.f2695b == 0) {
                        completer = this.f2697d;
                        this.f2697d = null;
                    } else {
                        completer = null;
                    }
                    if (Logger.m1285f("DeferrableSurface")) {
                        Logger.m1280a("DeferrableSurface", "surface closed,  useCount=" + this.f2695b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (completer != null) {
            completer.m6742b(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1478b() {
        CallbackToFutureAdapter.Completer completer;
        synchronized (this.f2694a) {
            try {
                int i = this.f2695b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.f2695b = i2;
                if (i2 == 0 && this.f2696c) {
                    completer = this.f2697d;
                    this.f2697d = null;
                } else {
                    completer = null;
                }
                if (Logger.m1285f("DeferrableSurface")) {
                    Logger.m1280a("DeferrableSurface", "use count-1,  useCount=" + this.f2695b + " closed=" + this.f2696c + " " + this);
                    if (this.f2695b == 0) {
                        m1481e(f2693n.get(), f2692m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (completer != null) {
            completer.m6742b(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final ListenableFuture m1479c() {
        synchronized (this.f2694a) {
            try {
                if (this.f2696c) {
                    return Futures.m1628e(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return mo1310f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1480d() {
        synchronized (this.f2694a) {
            try {
                int i = this.f2695b;
                if (i == 0 && this.f2696c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f2695b = i + 1;
                if (Logger.m1285f("DeferrableSurface")) {
                    if (this.f2695b == 1) {
                        m1481e(f2693n.get(), f2692m.incrementAndGet(), "New surface in use");
                    }
                    Logger.m1280a("DeferrableSurface", "use count+1, useCount=" + this.f2695b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1481e(int i, int i2, String str) {
        if (!f2691l && Logger.m1285f("DeferrableSurface")) {
            Logger.m1280a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.m1280a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    /* JADX INFO: renamed from: f */
    public abstract ListenableFuture mo1310f();
}
