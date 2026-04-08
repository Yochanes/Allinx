package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {
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
            th = th;
            Exceptions.m17950a(th);
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            Exceptions.m17950a(th);
            if (disposableM17946k.mo12353d()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
