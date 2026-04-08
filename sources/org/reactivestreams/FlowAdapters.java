package org.reactivestreams;

import androidx.work.impl.utils.AbstractC2335a;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.util.concurrent.Flow;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowAdapters {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlowPublisherFromReactive<T> implements Flow.Publisher<T> {
        @Override // java.util.concurrent.Flow.Publisher
        public final void subscribe(Flow.Subscriber subscriber) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlowToReactiveProcessor<T, U> implements Flow.Processor<T, U> {
        @Override // java.util.concurrent.Flow.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onSubscribe(Flow.Subscription subscription) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public final void subscribe(Flow.Subscriber subscriber) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlowToReactiveSubscriber<T> implements Flow.Subscriber<T> {

        /* JADX INFO: renamed from: a */
        public final Subscriber f59282a;

        public FlowToReactiveSubscriber(Subscriber subscriber) {
            this.f59282a = subscriber;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onComplete() {
            this.f59282a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onError(Throwable th) {
            this.f59282a.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onNext(Object obj) {
            this.f59282a.onNext(obj);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onSubscribe(Flow.Subscription subscription) {
            this.f59282a.mo12367j(subscription == null ? null : new ReactiveToFlowSubscription(subscription));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FlowToReactiveSubscription implements Flow.Subscription {

        /* JADX INFO: renamed from: a */
        public final Subscription f59283a;

        public FlowToReactiveSubscription(Subscription subscription) {
            this.f59283a = subscription;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public final void cancel() {
            this.f59283a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public final void request(long j) {
            this.f59283a.request(j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReactivePublisherFromFlow<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        /* JADX INFO: renamed from: g */
        public final void mo15432g(Subscriber subscriber) {
            AbstractC2929c.m13710o(subscriber == null ? null : new FlowToReactiveSubscriber(subscriber));
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReactiveToFlowProcessor<T, U> implements Processor<T, U> {
        @Override // org.reactivestreams.Publisher
        /* JADX INFO: renamed from: g */
        public final void mo15432g(Subscriber subscriber) {
            AbstractC2929c.m13710o(subscriber == null ? null : new FlowToReactiveSubscriber(subscriber));
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (subscription != null) {
                new FlowToReactiveSubscription(subscription);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReactiveToFlowSubscriber<T> implements Subscriber<T> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReactiveToFlowSubscription implements Subscription {

        /* JADX INFO: renamed from: a */
        public final Flow.Subscription f59284a;

        public ReactiveToFlowSubscription(Flow.Subscription subscription) {
            this.f59284a = subscription;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            AbstractC2335a.m12312u(this.f59284a);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            AbstractC2335a.m12313v(this.f59284a, j);
        }
    }
}
