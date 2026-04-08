package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {

    /* JADX INFO: renamed from: a */
    public final Observer f49466a;

    /* JADX INFO: renamed from: b */
    public Disposable f49467b;

    /* JADX INFO: renamed from: c */
    public QueueDisposable f49468c;

    /* JADX INFO: renamed from: d */
    public boolean f49469d;

    /* JADX INFO: renamed from: f */
    public int f49470f;

    public BasicFuseableObserver(Observer observer) {
        this.f49466a = observer;
    }

    /* JADX INFO: renamed from: a */
    public final void m17972a(Throwable th) {
        Exceptions.m17950a(th);
        this.f49467b.dispose();
        onError(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17956f(this.f49467b, disposable)) {
            this.f49467b = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f49468c = (QueueDisposable) disposable;
            }
            this.f49466a.mo12365c(this);
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public void clear() {
        this.f49468c.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f49467b.mo12353d();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f49467b.dispose();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public int mo17962e(int i) {
        QueueDisposable queueDisposable = this.f49468c;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int iMo17962e = queueDisposable.mo17962e(i);
        if (iMo17962e == 0) {
            return iMo17962e;
        }
        this.f49470f = iMo17962e;
        return iMo17962e;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.f49468c.isEmpty();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.f49469d) {
            return;
        }
        this.f49469d = true;
        this.f49466a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        if (this.f49469d) {
            RxJavaPlugins.m18275b(th);
        } else {
            this.f49469d = true;
            this.f49466a.onError(th);
        }
    }
}
