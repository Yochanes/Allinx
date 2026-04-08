package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {

    /* JADX INFO: renamed from: a */
    public Object f50176a;

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50177a;

        public CacheDisposable(MaybeObserver maybeObserver, MaybeCache maybeCache) {
            super(maybeCache);
            this.f50177a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        maybeObserver.mo12364c(new CacheDisposable(maybeObserver, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
        this.f50176a = obj;
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo12364c(Disposable disposable) {
    }
}
