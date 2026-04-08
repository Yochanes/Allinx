package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ConcatMapXMainObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicThrowable f50286a = new AtomicThrowable();

    /* JADX INFO: renamed from: b */
    public SimpleQueue f50287b;

    /* JADX INFO: renamed from: c */
    public Disposable f50288c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f50289d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f50290f;

    /* JADX INFO: renamed from: b */
    public abstract void mo18112b();

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17956f(this.f50288c, disposable)) {
            this.f50288c = disposable;
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iMo17962e = queueDisposable.mo17962e(7);
                if (iMo17962e == 1) {
                    this.f50287b = queueDisposable;
                    this.f50289d = true;
                    mo18114f();
                    mo18113e();
                    return;
                }
                if (iMo17962e == 2) {
                    this.f50287b = queueDisposable;
                    mo18114f();
                    return;
                }
            }
            this.f50287b = new SpscLinkedArrayQueue(0);
            mo18114f();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f50290f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f50290f = true;
        this.f50288c.dispose();
        mo18112b();
        this.f50286a.m18232b();
        if (getAndIncrement() == 0) {
            this.f50287b.clear();
            mo18111a();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo18113e();

    /* JADX INFO: renamed from: f */
    public abstract void mo18114f();

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        this.f50289d = true;
        mo18113e();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.f50286a.m18231a(th)) {
            this.f50289d = true;
            mo18113e();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (obj != null) {
            this.f50287b.offer(obj);
        }
        mo18113e();
    }

    /* JADX INFO: renamed from: a */
    public void mo18111a() {
    }
}
