package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableAutoReleaseObserver<T> extends AbstractDisposableAutoRelease implements Observer<T> {
    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (get() == DisposableHelper.f49380a) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            get().dispose();
            onError(th);
            throw null;
        }
    }
}
