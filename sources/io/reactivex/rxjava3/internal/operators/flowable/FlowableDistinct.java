package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDistinct<T, K> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DistinctSubscriber<T, K> extends BasicFuseableSubscriber<T, T> {
        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f51175d) {
                return;
            }
            this.f51175d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f51175d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f51175d = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f51175d) {
                return;
            }
            if (this.f51176f != 0) {
                this.f51172a.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m18207a(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f51174c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptySubscription.m18217b(th, subscriber);
        }
    }
}
