package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeZipArray<T, R> extends Maybe<R> {

    /* JADX INFO: compiled from: Proguard */
    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() <= 0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ZipMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
