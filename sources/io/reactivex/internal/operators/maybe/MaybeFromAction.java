package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFromAction<T> extends Maybe<T> implements Callable<T> {
    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        Disposable disposableM17608a = Disposables.m17608a(Functions.f47560b);
        maybeObserver.mo17586c(disposableM17608a);
        if (disposableM17608a.mo17596d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            if (disposableM17608a.mo17596d()) {
                RxJavaPlugins.m17911b(th);
            } else {
                maybeObserver.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        throw null;
    }
}
