package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: a */
    public Object f49044a;

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49045a;

        /* JADX INFO: renamed from: b */
        public final SingleCache f49046b;

        public CacheDisposable(SingleObserver singleObserver, SingleCache singleCache) {
            this.f49045a = singleObserver;
            this.f49046b = singleCache;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f49046b.getClass();
                throw null;
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new CacheDisposable(singleObserver, this));
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        this.f49044a = obj;
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo17602c(Disposable disposable) {
    }
}
