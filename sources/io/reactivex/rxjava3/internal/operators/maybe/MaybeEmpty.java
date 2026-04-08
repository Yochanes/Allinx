package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeEmpty extends Maybe<Object> implements ScalarSupplier<Object> {
    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        maybeObserver.mo12364c(EmptyDisposable.f49382a);
        maybeObserver.onComplete();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return null;
    }
}
