package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {

    /* JADX INFO: renamed from: a */
    public final Observer f49479a;

    /* JADX INFO: renamed from: b */
    public Object f49480b;

    public DeferredScalarDisposable(Observer observer) {
        this.f49479a = observer;
    }

    /* JADX INFO: renamed from: a */
    public final void m17973a(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        Observer observer = this.f49479a;
        if (i == 8) {
            this.f49480b = obj;
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
    public final void m17974b(Throwable th) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.m18275b(th);
        } else {
            lazySet(2);
            this.f49479a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f49480b = null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return get() == 4;
    }

    public void dispose() {
        set(4);
        this.f49480b = null;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17962e(int i) {
        lazySet(8);
        return 2;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onError(Throwable th) {
        m17974b(th);
    }

    public void onSuccess(Object obj) {
        m17973a(obj);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f49480b;
        this.f49480b = null;
        lazySet(32);
        return obj;
    }
}
