package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: a */
    public Object f51003a;

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51004a;

        /* JADX INFO: renamed from: b */
        public final SingleCache f51005b;

        public CacheDisposable(SingleObserver singleObserver, SingleCache singleCache) {
            this.f51004a = singleObserver;
            this.f51005b = singleCache;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f51005b.getClass();
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new CacheDisposable(singleObserver, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f51003a = obj;
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo12366c(Disposable disposable) {
    }
}
