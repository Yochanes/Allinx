package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.RunnableC0312o;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class SurfaceEdge {

    /* JADX INFO: renamed from: a */
    public final int f3095a;

    /* JADX INFO: renamed from: b */
    public final Matrix f3096b;

    /* JADX INFO: renamed from: c */
    public final boolean f3097c;

    /* JADX INFO: renamed from: d */
    public final Rect f3098d;

    /* JADX INFO: renamed from: e */
    public final boolean f3099e;

    /* JADX INFO: renamed from: f */
    public final int f3100f;

    /* JADX INFO: renamed from: g */
    public final StreamSpec f3101g;

    /* JADX INFO: renamed from: h */
    public int f3102h;

    /* JADX INFO: renamed from: i */
    public int f3103i;

    /* JADX INFO: renamed from: j */
    public SurfaceOutputImpl f3104j;

    /* JADX INFO: renamed from: l */
    public SurfaceRequest f3106l;

    /* JADX INFO: renamed from: m */
    public SettableSurface f3107m;

    /* JADX INFO: renamed from: k */
    public boolean f3105k = false;

    /* JADX INFO: renamed from: n */
    public final HashSet f3108n = new HashSet();

    /* JADX INFO: renamed from: o */
    public boolean f3109o = false;

    /* JADX INFO: compiled from: Proguard */
    public static class SettableSurface extends DeferrableSurface {

        /* JADX INFO: renamed from: o */
        public final ListenableFuture f3110o;

        /* JADX INFO: renamed from: p */
        public CallbackToFutureAdapter.Completer f3111p;

        /* JADX INFO: renamed from: q */
        public DeferrableSurface f3112q;

        public SettableSurface(Size size, int i) {
            super(size, i);
            this.f3110o = CallbackToFutureAdapter.m6740a(new C0330n(this, 0));
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        /* JADX INFO: renamed from: f */
        public final ListenableFuture mo1310f() {
            return this.f3110o;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m1724g(DeferrableSurface deferrableSurface, Runnable runnable) {
            boolean z2;
            Threads.m1607a();
            deferrableSurface.getClass();
            DeferrableSurface deferrableSurface2 = this.f3112q;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            Preconditions.m7699f(deferrableSurface2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            Preconditions.m7695b(this.f2701h.equals(deferrableSurface.f2701h), "The provider's size must match the parent");
            Preconditions.m7695b(this.f2702i == deferrableSurface.f2702i, "The provider's format must match the parent");
            synchronized (this.f2694a) {
                z2 = this.f2696c;
            }
            Preconditions.m7699f(!z2, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f3112q = deferrableSurface;
            Futures.m1632i(true, deferrableSurface.m1479c(), this.f3111p, CameraXExecutors.m1615a());
            deferrableSurface.m1480d();
            Futures.m1631h(this.f2698e).addListener(new RunnableC0326j(deferrableSurface, 1), CameraXExecutors.m1615a());
            Futures.m1631h(deferrableSurface.f2700g).addListener(runnable, CameraXExecutors.m1618d());
            return true;
        }
    }

    public SurfaceEdge(int i, int i2, StreamSpec streamSpec, Matrix matrix, boolean z2, Rect rect, int i3, int i4, boolean z3) {
        this.f3100f = i;
        this.f3095a = i2;
        this.f3101g = streamSpec;
        this.f3096b = matrix;
        this.f3097c = z2;
        this.f3098d = rect;
        this.f3103i = i3;
        this.f3102h = i4;
        this.f3099e = z3;
        this.f3107m = new SettableSurface(streamSpec.mo1420e(), i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1716a(Runnable runnable) {
        Threads.m1607a();
        m1717b();
        this.f3108n.add(runnable);
    }

    /* JADX INFO: renamed from: b */
    public final void m1717b() {
        Preconditions.m7699f(!this.f3109o, "Edge is already closed.");
    }

    /* JADX INFO: renamed from: c */
    public final SurfaceRequest m1718c(CameraInternal cameraInternal) {
        Threads.m1607a();
        m1717b();
        StreamSpec streamSpec = this.f3101g;
        SurfaceRequest surfaceRequest = new SurfaceRequest(streamSpec.mo1420e(), cameraInternal, streamSpec.mo1417b(), streamSpec.mo1418c(), new RunnableC0325i(this, 0));
        try {
            DeferrableSurface deferrableSurface = surfaceRequest.f2371i;
            if (this.f3107m.m1724g(deferrableSurface, new RunnableC0325i(this, 1))) {
                Futures.m1631h(this.f3107m.f2698e).addListener(new RunnableC0326j(deferrableSurface, 0), CameraXExecutors.m1615a());
            }
            this.f3106l = surfaceRequest;
            m1721f();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            surfaceRequest.m1309c();
            throw e2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1719d() {
        Threads.m1607a();
        this.f3107m.m1477a();
        SurfaceOutputImpl surfaceOutputImpl = this.f3104j;
        if (surfaceOutputImpl != null) {
            surfaceOutputImpl.m1725a();
            this.f3104j = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1720e() {
        boolean z2;
        Threads.m1607a();
        m1717b();
        SettableSurface settableSurface = this.f3107m;
        settableSurface.getClass();
        Threads.m1607a();
        if (settableSurface.f3112q == null) {
            synchronized (settableSurface.f2694a) {
                z2 = settableSurface.f2696c;
            }
            if (!z2) {
                return;
            }
        }
        m1719d();
        this.f3105k = false;
        this.f3107m = new SettableSurface(this.f3101g.mo1420e(), this.f3095a);
        Iterator it = this.f3108n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1721f() {
        SurfaceRequest.TransformationInfoListener transformationInfoListener;
        Executor executor;
        Threads.m1607a();
        SurfaceRequest surfaceRequest = this.f3106l;
        if (surfaceRequest != null) {
            SurfaceRequest.TransformationInfo transformationInfoM1311g = SurfaceRequest.TransformationInfo.m1311g(this.f3098d, this.f3103i, this.f3102h, this.f3097c, this.f3096b, this.f3099e);
            synchronized (surfaceRequest.f2363a) {
                surfaceRequest.f2372j = transformationInfoM1311g;
                transformationInfoListener = surfaceRequest.f2373k;
                executor = surfaceRequest.f2374l;
            }
            if (transformationInfoListener == null || executor == null) {
                return;
            }
            executor.execute(new RunnableC0312o(transformationInfoListener, transformationInfoM1311g, 0));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1722g(DeferrableSurface deferrableSurface) {
        Threads.m1607a();
        m1717b();
        this.f3107m.m1724g(deferrableSurface, new RunnableC0325i(this, 1));
    }

    /* JADX INFO: renamed from: h */
    public final void m1723h(int i, int i2) {
        RunnableC0327k runnableC0327k = new RunnableC0327k(this, i, i2);
        if (Threads.m1608b()) {
            runnableC0327k.run();
        } else {
            Preconditions.m7699f(new Handler(Looper.getMainLooper()).post(runnableC0327k), "Unable to post to main thread");
        }
    }
}
