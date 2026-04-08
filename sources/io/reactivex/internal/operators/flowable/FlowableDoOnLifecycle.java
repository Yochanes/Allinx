package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47779a;

        /* JADX INFO: renamed from: b */
        public final Consumer f47780b;

        /* JADX INFO: renamed from: c */
        public final LongConsumer f47781c;

        /* JADX INFO: renamed from: d */
        public final Action f47782d;

        /* JADX INFO: renamed from: f */
        public Subscription f47783f;

        public SubscriptionLambdaSubscriber(FlowableSubscriber flowableSubscriber, Consumer consumer, LongConsumer longConsumer, Action action) {
            this.f47779a = flowableSubscriber;
            this.f47780b = consumer;
            this.f47782d = action;
            this.f47781c = longConsumer;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                this.f47782d.run();
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
            }
            this.f47783f.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            try {
                this.f47780b.accept(subscription);
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                subscription.cancel();
                this.f47783f = SubscriptionHelper.f49266a;
                EmptySubscription.m17863b(th, this.f47779a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47783f != SubscriptionHelper.f49266a) {
                this.f47779a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47783f != SubscriptionHelper.f49266a) {
                this.f47779a.onError(th);
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47779a.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                this.f47781c.getClass();
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
            }
            this.f47783f.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new SubscriptionLambdaSubscriber((FlowableSubscriber) subscriber, null, null, null));
    }
}
