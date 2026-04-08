package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {

    /* JADX INFO: renamed from: a */
    public Disposable f47566a;

    /* JADX INFO: renamed from: b */
    public QueueDisposable f47567b;

    /* JADX INFO: renamed from: c */
    public boolean f47568c;

    /* JADX INFO: renamed from: d */
    public int f47569d;

    /* JADX INFO: renamed from: a */
    public final void m17631a(Throwable th) {
        Exceptions.m17612a(th);
        this.f47566a.dispose();
        onError(th);
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (DisposableHelper.m17620h(this.f47566a, disposable)) {
            this.f47566a = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f47567b = (QueueDisposable) disposable;
            }
            throw null;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f47567b.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f47566a.mo17596d();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f47566a.dispose();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* JADX INFO: renamed from: e */
    public int mo17626e(int i) {
        QueueDisposable queueDisposable = this.f47567b;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int iMo17626e = queueDisposable.mo17626e(i);
        if (iMo17626e == 0) {
            return iMo17626e;
        }
        this.f47569d = iMo17626e;
        return iMo17626e;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f47567b.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f47568c) {
            return;
        }
        this.f47568c = true;
        throw null;
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (this.f47568c) {
            RxJavaPlugins.m17911b(th);
        } else {
            this.f47568c = true;
            throw null;
        }
    }
}
