package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: androidx.camera.core.impl.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0279e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2835c;

    public /* synthetic */ RunnableC0279e(int i, Object obj, Object obj2) {
        this.f2833a = i;
        this.f2835c = obj;
        this.f2834b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2833a) {
            case 0:
                ((LiveDataObservable) this.f2835c).f2742a.m9146j((LiveDataObservable.LiveDataObserverAdapter) this.f2834b);
                return;
            case 1:
                LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter = (LiveDataObservable.LiveDataObserverAdapter) this.f2834b;
                if (liveDataObserverAdapter.f2744a.get()) {
                    LiveDataObservable.Result result = (LiveDataObservable.Result) this.f2835c;
                    result.getClass();
                    liveDataObserverAdapter.f2745b.mo1510a(result.f2747a);
                    return;
                }
                return;
            case 2:
                Observable.Observer observer = (Observable.Observer) this.f2834b;
                ConstantObservable constantObservable = ConstantObservable.f2688b;
                ConstantObservable constantObservable2 = (ConstantObservable) this.f2835c;
                constantObservable2.getClass();
                try {
                    observer.mo1510a(constantObservable2.f2689a.get());
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    observer.onError(e);
                    return;
                }
            case 3:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f2835c;
                String str = (String) this.f2834b;
                Size size = DeferrableSurface.f2690k;
                deferrableSurface.getClass();
                try {
                    deferrableSurface.f2698e.get();
                    deferrableSurface.m1481e(DeferrableSurface.f2693n.decrementAndGet(), DeferrableSurface.f2692m.get(), "Surface terminated");
                    return;
                } catch (Exception e2) {
                    Logger.m1282c("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
                    synchronized (deferrableSurface.f2694a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f2696c), Integer.valueOf(deferrableSurface.f2695b)), e2);
                    }
                }
            default:
                ListenableFuture listenableFuture = (ListenableFuture) this.f2835c;
                if (listenableFuture.isDone()) {
                    return;
                }
                ((CallbackToFutureAdapter.Completer) this.f2834b).m6744d(new TimeoutException("Cannot complete surfaceList within 5000"));
                listenableFuture.cancel(true);
                return;
        }
    }

    public /* synthetic */ RunnableC0279e(LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.Result result) {
        this.f2833a = 1;
        this.f2834b = liveDataObserverAdapter;
        this.f2835c = result;
    }
}
