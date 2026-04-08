package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.RunnableC0325i;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class SurfaceRequest {

    /* JADX INFO: renamed from: m */
    public static final Range f2362m = StreamSpec.f2781a;

    /* JADX INFO: renamed from: a */
    public final Object f2363a = new Object();

    /* JADX INFO: renamed from: b */
    public final Size f2364b;

    /* JADX INFO: renamed from: c */
    public final CameraInternal f2365c;

    /* JADX INFO: renamed from: d */
    public final ListenableFuture f2366d;

    /* JADX INFO: renamed from: e */
    public final CallbackToFutureAdapter.Completer f2367e;

    /* JADX INFO: renamed from: f */
    public final ListenableFuture f2368f;

    /* JADX INFO: renamed from: g */
    public final CallbackToFutureAdapter.Completer f2369g;

    /* JADX INFO: renamed from: h */
    public final CallbackToFutureAdapter.Completer f2370h;

    /* JADX INFO: renamed from: i */
    public final DeferrableSurface f2371i;

    /* JADX INFO: renamed from: j */
    public TransformationInfo f2372j;

    /* JADX INFO: renamed from: k */
    public TransformationInfoListener f2373k;

    /* JADX INFO: renamed from: l */
    public Executor f2374l;

    /* JADX INFO: renamed from: androidx.camera.core.SurfaceRequest$1 */
    /* JADX INFO: compiled from: Proguard */
    class C02361 implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f2375a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ListenableFuture f2376b;

        public C02361(CallbackToFutureAdapter.Completer completer, ListenableFuture listenableFuture) {
            this.f2375a = completer;
            this.f2376b = listenableFuture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            if (th instanceof RequestCancelledException) {
                Preconditions.m7699f(this.f2376b.cancel(false), null);
            } else {
                Preconditions.m7699f(this.f2375a.m6742b(null), null);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            Preconditions.m7699f(this.f2375a.m6742b(null), null);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.SurfaceRequest$2 */
    /* JADX INFO: compiled from: Proguard */
    class C02372 extends DeferrableSurface {
        public C02372(Size size) {
            super(size, 34);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        /* JADX INFO: renamed from: f */
        public final ListenableFuture mo1310f() {
            return SurfaceRequest.this.f2366d;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.SurfaceRequest$3 */
    /* JADX INFO: compiled from: Proguard */
    class C02383 implements FutureCallback<Surface> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ListenableFuture f2378a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f2379b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f2380c;

        public C02383(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer, String str) {
            this.f2378a = listenableFuture;
            this.f2379b = completer;
            this.f2380c = str;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            boolean z2 = th instanceof CancellationException;
            CallbackToFutureAdapter.Completer completer = this.f2379b;
            if (z2) {
                Preconditions.m7699f(completer.m6744d(new RequestCancelledException(AbstractC0000a.m19p(new StringBuilder(), this.f2380c, " cancelled."), th)), null);
            } else {
                completer.m6742b(null);
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            Futures.m1632i(true, this.f2378a, this.f2379b, CameraXExecutors.m1615a());
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.SurfaceRequest$4 */
    /* JADX INFO: compiled from: Proguard */
    class C02394 implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Consumer f2381a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Surface f2382b;

        public C02394(Consumer consumer, Surface surface) {
            this.f2381a = consumer;
            this.f2382b = surface;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Preconditions.m7699f(th instanceof RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f2381a.accept(new AutoValue_SurfaceRequest_Result(1, this.f2382b));
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            this.f2381a.accept(new AutoValue_SurfaceRequest_Result(0, this.f2382b));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RequestCancelledException extends RuntimeException {
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class Result {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ResultCode {
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo1204a();

        /* JADX INFO: renamed from: b */
        public abstract Surface mo1205b();
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class TransformationInfo {
        /* JADX INFO: renamed from: g */
        public static TransformationInfo m1311g(Rect rect, int i, int i2, boolean z2, Matrix matrix, boolean z3) {
            return new AutoValue_SurfaceRequest_TransformationInfo(rect, i, i2, z2, matrix, z3);
        }

        /* JADX INFO: renamed from: a */
        public abstract Rect mo1206a();

        /* JADX INFO: renamed from: b */
        public abstract boolean mo1207b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1208c();

        /* JADX INFO: renamed from: d */
        public abstract Matrix mo1209d();

        /* JADX INFO: renamed from: e */
        public abstract int mo1210e();

        /* JADX INFO: renamed from: f */
        public abstract boolean mo1211f();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TransformationInfoListener {
        /* JADX INFO: renamed from: a */
        void mo1312a(TransformationInfo transformationInfo);
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, DynamicRange dynamicRange, Range range, RunnableC0325i runnableC0325i) {
        this.f2364b = size;
        this.f2365c = cameraInternal;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        ListenableFuture listenableFutureM6740a = CallbackToFutureAdapter.m6740a(new C0331q(atomicReference, str, 0));
        CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) atomicReference.get();
        completer.getClass();
        this.f2370h = completer;
        AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture listenableFutureM6740a2 = CallbackToFutureAdapter.m6740a(new C0331q(atomicReference2, str, 1));
        this.f2368f = listenableFutureM6740a2;
        Futures.m1624a(listenableFutureM6740a2, new C02361(completer, listenableFutureM6740a), CameraXExecutors.m1615a());
        CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) atomicReference2.get();
        completer2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture listenableFutureM6740a3 = CallbackToFutureAdapter.m6740a(new C0331q(atomicReference3, str, 2));
        this.f2366d = listenableFutureM6740a3;
        CallbackToFutureAdapter.Completer completer3 = (CallbackToFutureAdapter.Completer) atomicReference3.get();
        completer3.getClass();
        this.f2367e = completer3;
        C02372 c02372 = new C02372(size);
        this.f2371i = c02372;
        ListenableFuture listenableFutureM1631h = Futures.m1631h(c02372.f2698e);
        Futures.m1624a(listenableFutureM6740a3, new C02383(listenableFutureM1631h, completer2, str), CameraXExecutors.m1615a());
        listenableFutureM1631h.addListener(new RunnableC0309l(this, 2), CameraXExecutors.m1615a());
        Executor executorM1615a = CameraXExecutors.m1615a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        Futures.m1624a(CallbackToFutureAdapter.m6740a(new C0245d(2, this, atomicReference4)), new C02405(runnableC0325i), executorM1615a);
        CallbackToFutureAdapter.Completer completer4 = (CallbackToFutureAdapter.Completer) atomicReference4.get();
        completer4.getClass();
        this.f2369g = completer4;
    }

    /* JADX INFO: renamed from: a */
    public final void m1307a(Surface surface, Executor executor, Consumer consumer) {
        if (!this.f2367e.m6742b(surface)) {
            ListenableFuture listenableFuture = this.f2366d;
            if (!listenableFuture.isCancelled()) {
                Preconditions.m7699f(listenableFuture.isDone(), null);
                try {
                    listenableFuture.get();
                    executor.execute(new RunnableC0313p(consumer, surface, 0));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new RunnableC0313p(consumer, surface, 1));
                    return;
                }
            }
        }
        Futures.m1624a(this.f2368f, new C02394(consumer, surface), executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m1308b(Executor executor, TransformationInfoListener transformationInfoListener) {
        TransformationInfo transformationInfo;
        synchronized (this.f2363a) {
            this.f2373k = transformationInfoListener;
            this.f2374l = executor;
            transformationInfo = this.f2372j;
        }
        if (transformationInfo != null) {
            executor.execute(new RunnableC0312o(transformationInfoListener, transformationInfo, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1309c() {
        this.f2367e.m6744d(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    /* JADX INFO: renamed from: androidx.camera.core.SurfaceRequest$5 */
    /* JADX INFO: compiled from: Proguard */
    class C02405 implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RunnableC0325i f2383a;

        public C02405(RunnableC0325i runnableC0325i) {
            this.f2383a = runnableC0325i;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            this.f2383a.run();
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
        }
    }
}
