package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableAutoReleaseMultiObserver<T> extends AbstractDisposableAutoRelease implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver {
    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        Disposable disposable = get();
        DisposableHelper disposableHelper = DisposableHelper.f49380a;
        if (disposable == disposableHelper) {
            throw null;
        }
        lazySet(disposableHelper);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
            throw null;
        }
    }
}
