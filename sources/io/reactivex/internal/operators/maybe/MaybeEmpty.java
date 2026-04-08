package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeEmpty extends Maybe<Object> implements ScalarCallable<Object> {

    /* JADX INFO: renamed from: a */
    public static final MaybeEmpty f48316a = new MaybeEmpty();

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(EmptyDisposable.f47554a);
        maybeObserver.onComplete();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }
}
