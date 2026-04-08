package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeErrorCallable<T> extends Maybe<T> {
    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(EmptyDisposable.f47554a);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            maybeObserver.onError(th);
        }
    }
}
