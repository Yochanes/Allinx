package io.reactivex.subjects;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51383a;

        public SingleDisposable(SingleObserver singleObserver, SingleSubject singleSubject) {
            this.f51383a = singleObserver;
            lazySet(singleSubject);
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

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new SingleDisposable(singleObserver, this));
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo17602c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        ObjectHelper.m17628b(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
