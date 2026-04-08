package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AsyncSubject<T> extends Subject<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {

        /* JADX INFO: renamed from: c */
        public final AsyncSubject f51364c;

        public AsyncDisposable(Observer observer, AsyncSubject asyncSubject) {
            super(observer);
            this.f51364c = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(4) == 4) {
                return;
            }
            this.f51364c.getClass();
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new AsyncDisposable(observer, this));
        throw null;
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
