package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingDisposableMultiObserver<T> extends CountDownLatch implements MaybeObserver<T>, SingleObserver<T>, CompletableObserver, Disposable {

    /* JADX INFO: renamed from: a */
    public Object f49473a;

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo12364c(Disposable disposable) {
        DisposableHelper.m17955e(null, disposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
        this.f49473a = obj;
        throw null;
    }
}
