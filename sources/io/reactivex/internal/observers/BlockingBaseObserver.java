package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Object f47570a;

    /* JADX INFO: renamed from: b */
    public Disposable f47571b;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        this.f47571b = disposable;
        disposable.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Disposable disposable = this.f47571b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        countDown();
    }
}
