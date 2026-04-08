package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SafeMaybeObserver<T> implements MaybeObserver<T> {
    @Override // io.reactivex.rxjava3.core.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo12364c(Disposable disposable) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            disposable.dispose();
            RxJavaPlugins.m18275b(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        RxJavaPlugins.m18275b(th);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
    }
}
