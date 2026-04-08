package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicFuseableObserver;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDistinct<T, K> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DistinctObserver<T, K> extends BasicFuseableObserver<T, T> {
        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public final void onComplete() {
            if (this.f47568c) {
                return;
            }
            this.f47568c = true;
            throw null;
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f47568c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47568c = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f47568c) {
                return;
            }
            if (this.f47569d != 0) {
                throw null;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17631a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f47567b.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17624f(th, observer);
        }
    }
}
