package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f51192a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                this.f51192a.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f51195d++;
            this.f51192a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new OnErrorReturnSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
