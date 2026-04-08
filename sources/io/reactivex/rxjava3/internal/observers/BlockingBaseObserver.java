package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Object f49471a;

    /* JADX INFO: renamed from: b */
    public Disposable f49472b;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        this.f49472b = disposable;
        disposable.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Disposable disposable = this.f49472b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        countDown();
    }
}
