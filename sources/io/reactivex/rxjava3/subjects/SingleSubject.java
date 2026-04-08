package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51335a;

        public SingleDisposable(SingleObserver singleObserver, SingleSubject singleSubject) {
            this.f51335a = singleObserver;
            lazySet(singleSubject);
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

    @Override // io.reactivex.rxjava3.core.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo12366c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new SingleDisposable(singleObserver, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        ExceptionHelper.m18248c(obj, "onSuccess called with a null value.");
        throw null;
    }
}
