package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {

    /* JADX INFO: renamed from: a */
    public Object f48279a;

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48280a;

        public CacheDisposable(MaybeObserver maybeObserver, MaybeCache maybeCache) {
            super(maybeCache);
            this.f48280a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(new CacheDisposable(maybeObserver, this));
        throw null;
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
        this.f48279a = obj;
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo17586c(Disposable disposable) {
    }
}
