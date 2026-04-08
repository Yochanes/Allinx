package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* JADX INFO: renamed from: a */
    public Object f49474a;

    /* JADX INFO: renamed from: b */
    public Throwable f49475b;

    /* JADX INFO: renamed from: c */
    public Disposable f49476c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f49477d;

    @Override // io.reactivex.rxjava3.core.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo12366c(Disposable disposable) {
        this.f49476c = disposable;
        if (this.f49477d) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f49475b = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f49474a = obj;
        countDown();
    }
}
