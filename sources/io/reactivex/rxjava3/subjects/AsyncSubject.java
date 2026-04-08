package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncSubject<T> extends Subject<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {

        /* JADX INFO: renamed from: c */
        public final AsyncSubject f51303c;

        public AsyncDisposable(Observer observer, AsyncSubject asyncSubject) {
            super(observer);
            this.f51303c = asyncSubject;
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (getAndSet(4) == 4) {
                return;
            }
            this.f51303c.getClass();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new AsyncDisposable(observer, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        throw null;
    }
}
