package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDistinct<T, K> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DistinctSubscriber<T, K> extends BasicFuseableSubscriber<T, T> {
        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49227d) {
                return;
            }
            this.f49227d = true;
            throw null;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49227d) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49227d = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f49227d) {
                return;
            }
            if (this.f49228f != 0) {
                this.f49224a.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17853a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49226c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptySubscription.m17863b(th, subscriber);
        }
    }
}
