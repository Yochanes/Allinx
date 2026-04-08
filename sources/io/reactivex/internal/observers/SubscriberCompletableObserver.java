package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, Subscription {

    /* JADX INFO: renamed from: a */
    public Disposable f47590a;

    @Override // io.reactivex.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo17580c(Disposable disposable) {
        if (DisposableHelper.m17620h(this.f47590a, disposable)) {
            this.f47590a = disposable;
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f47590a.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
