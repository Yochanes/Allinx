package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public SimpleQueue f47581a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f47582b;

    /* JADX INFO: renamed from: c */
    public int f47583c;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (DisposableHelper.m17619f(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iMo17626e = queueDisposable.mo17626e(3);
                if (iMo17626e == 1) {
                    this.f47583c = iMo17626e;
                    this.f47581a = queueDisposable;
                    this.f47582b = true;
                    throw null;
                }
                if (iMo17626e == 2) {
                    this.f47583c = iMo17626e;
                    this.f47581a = queueDisposable;
                    return;
                }
            }
            this.f47581a = new SpscArrayQueue(0);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return DisposableHelper.m17616b(get());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(this);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f47583c != 0) {
            throw null;
        }
        throw null;
    }
}
