package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public SimpleQueue f49485a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f49486b;

    /* JADX INFO: renamed from: c */
    public int f49487c;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17955e(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iMo17962e = queueDisposable.mo17962e(3);
                if (iMo17962e == 1) {
                    this.f49487c = iMo17962e;
                    this.f49485a = queueDisposable;
                    this.f49486b = true;
                    throw null;
                }
                if (iMo17962e == 2) {
                    this.f49487c = iMo17962e;
                    this.f49485a = queueDisposable;
                    return;
                }
            }
            this.f49485a = new SpscArrayQueue(0);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return DisposableHelper.m17953b(get());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17952a(this);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.f49487c != 0) {
            throw null;
        }
        throw null;
    }
}
