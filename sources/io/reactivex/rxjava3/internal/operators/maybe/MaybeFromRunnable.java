package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFromRunnable<T> extends Maybe<T> implements Supplier<T> {
    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        Disposable disposableM17946k = Disposable.m17946k(Functions.f49388b);
        maybeObserver.mo12364c(disposableM17946k);
        if (disposableM17946k.mo12353d()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            if (disposableM17946k.mo12353d()) {
                RxJavaPlugins.m18275b(th);
            } else {
                maybeObserver.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        throw null;
    }
}
