package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeAmb<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AmbMaybeObserver<T> extends AtomicBoolean implements MaybeObserver<T>, Disposable {
        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                throw null;
            }
            RxJavaPlugins.m17911b(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17623c(th, maybeObserver);
        }
    }
}
