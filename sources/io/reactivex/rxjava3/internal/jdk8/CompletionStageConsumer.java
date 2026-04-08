package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletionStageConsumer<T> extends CompletableFuture<T> implements MaybeObserver<T>, SingleObserver<T>, CompletableObserver {
    @Override // io.reactivex.rxjava3.core.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo12364c(Disposable disposable) {
        DisposableHelper.m17955e(null, disposable);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        DisposableHelper.m17952a(null);
        throw null;
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(Object obj) {
        DisposableHelper.m17952a(null);
        throw null;
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th) {
        DisposableHelper.m17952a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        new NoSuchElementException("The source was empty");
        DisposableHelper.m17952a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
        throw null;
    }
}
