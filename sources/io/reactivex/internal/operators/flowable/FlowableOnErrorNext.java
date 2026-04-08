package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorNextSubscriber<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47992a;

        /* JADX INFO: renamed from: b */
        public final SubscriptionArbiter f47993b = new SubscriptionArbiter();

        /* JADX INFO: renamed from: c */
        public boolean f47994c;

        /* JADX INFO: renamed from: d */
        public boolean f47995d;

        public OnErrorNextSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47992a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            this.f47993b.m17866e(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47995d) {
                return;
            }
            this.f47995d = true;
            this.f47994c = true;
            this.f47992a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            boolean z2 = this.f47994c;
            FlowableSubscriber flowableSubscriber = this.f47992a;
            if (z2) {
                if (this.f47995d) {
                    RxJavaPlugins.m17911b(th);
                    return;
                } else {
                    flowableSubscriber.onError(th);
                    return;
                }
            }
            this.f47994c = true;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                flowableSubscriber.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47995d) {
                return;
            }
            this.f47992a.onNext(obj);
            if (this.f47994c) {
                return;
            }
            this.f47993b.m17865d(1L);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber((FlowableSubscriber) subscriber);
        subscriber.mo12367j(onErrorNextSubscriber.f47993b);
        this.f47628b.m17582b(onErrorNextSubscriber);
    }
}
