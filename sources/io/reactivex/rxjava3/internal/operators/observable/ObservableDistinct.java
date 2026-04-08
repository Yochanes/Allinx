package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDistinct<T, K> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DistinctObserver<T, K> extends BasicFuseableObserver<T, T> {
        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f49469d) {
                return;
            }
            this.f49469d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f49469d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49469d = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f49469d) {
                return;
            }
            if (this.f49470f != 0) {
                this.f49466a.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17972a(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49468c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptyDisposable.m17960f(th, observer);
        }
    }
}
