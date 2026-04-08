package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* JADX INFO: renamed from: a */
    public Object f47572a;

    /* JADX INFO: renamed from: b */
    public Disposable f47573b;

    @Override // io.reactivex.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo17602c(Disposable disposable) {
        this.f47573b = disposable;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        this.f47572a = obj;
        countDown();
    }
}
