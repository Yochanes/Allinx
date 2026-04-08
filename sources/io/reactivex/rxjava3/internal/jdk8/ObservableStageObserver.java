package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class ObservableStageObserver<T> extends CompletableFuture<T> implements Observer<T> {

    /* JADX INFO: renamed from: a */
    public Object f49451a;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
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

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        this.f49451a = null;
        throw null;
    }
}
