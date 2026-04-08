package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class LiveDataObservable<T> implements Observable<T> {

    /* JADX INFO: renamed from: a */
    public final MutableLiveData f2742a = new MutableLiveData();

    /* JADX INFO: renamed from: b */
    public final HashMap f2743b = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    public static final class LiveDataObserverAdapter<T> implements Observer<Result<T>> {

        /* JADX INFO: renamed from: a */
        public final AtomicBoolean f2744a = new AtomicBoolean(true);

        /* JADX INFO: renamed from: b */
        public final Observable.Observer f2745b;

        /* JADX INFO: renamed from: c */
        public final Executor f2746c;

        public LiveDataObserverAdapter(Executor executor, Observable.Observer observer) {
            this.f2746c = executor;
            this.f2745b = observer;
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a */
        public final void mo1166a(Object obj) {
            this.f2746c.execute(new RunnableC0279e(this, (Result) obj));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Result<T> {

        /* JADX INFO: renamed from: a */
        public final CameraInternal.State f2747a;

        public Result(CameraInternal.State state) {
            this.f2747a = state;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[Result: <");
            sb.append("Value: " + this.f2747a);
            sb.append(">]");
            return sb.toString();
        }
    }

    @Override // androidx.camera.core.impl.Observable
    /* JADX INFO: renamed from: a */
    public final void mo1474a(Observable.Observer observer) {
        synchronized (this.f2743b) {
            try {
                LiveDataObserverAdapter liveDataObserverAdapter = (LiveDataObserverAdapter) this.f2743b.remove(observer);
                if (liveDataObserverAdapter != null) {
                    liveDataObserverAdapter.f2744a.set(false);
                    CameraXExecutors.m1618d().execute(new RunnableC0279e(0, this, liveDataObserverAdapter));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    /* JADX INFO: renamed from: b */
    public final void mo1475b(Executor executor, Observable.Observer observer) {
        synchronized (this.f2743b) {
            LiveDataObserverAdapter liveDataObserverAdapter = (LiveDataObserverAdapter) this.f2743b.get(observer);
            if (liveDataObserverAdapter != null) {
                liveDataObserverAdapter.f2744a.set(false);
            }
            LiveDataObserverAdapter liveDataObserverAdapter2 = new LiveDataObserverAdapter(executor, observer);
            this.f2743b.put(observer, liveDataObserverAdapter2);
            CameraXExecutors.m1618d().execute(new RunnableC0280f(this, 0, liveDataObserverAdapter, liveDataObserverAdapter2));
        }
    }
}
