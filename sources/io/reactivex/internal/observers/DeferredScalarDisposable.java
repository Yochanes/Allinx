package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {

    /* JADX INFO: renamed from: a */
    public final Observer f47575a;

    /* JADX INFO: renamed from: b */
    public Object f47576b;

    public DeferredScalarDisposable(Observer observer) {
        this.f47575a = observer;
    }

    /* JADX INFO: renamed from: a */
    public final void m17632a(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        Observer observer = this.f47575a;
        if (i == 8) {
            this.f47576b = obj;
            lazySet(16);
            observer.onNext(null);
        } else {
            lazySet(2);
            observer.onNext(obj);
        }
        if (get() != 4) {
            observer.onComplete();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17633b(Throwable th) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.m17911b(th);
        } else {
            lazySet(2);
            this.f47575a.onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f47576b = null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get() == 4;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        set(4);
        this.f47576b = null;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17626e(int i) {
        lazySet(8);
        return 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onError(Throwable th) {
        m17633b(th);
    }

    public void onSuccess(Object obj) {
        m17632a(obj);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f47576b;
        this.f47576b = null;
        lazySet(32);
        return obj;
    }
}
