package io.reactivex.internal.operators.maybe;

import com.tinder.scarlet.Event;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeJust<T> extends Maybe<T> implements ScalarCallable<T> {

    /* JADX INFO: renamed from: a */
    public final Event f48353a;

    public MaybeJust(Event event) {
        this.f48353a = event;
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(EmptyDisposable.f47554a);
        maybeObserver.onSuccess(this.f48353a);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f48353a;
    }
}
