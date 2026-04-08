package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SubscriberObserver<T> implements Observer<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public Disposable f47849a;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            this.f47849a = disposable;
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47849a.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
        }
    }
}
