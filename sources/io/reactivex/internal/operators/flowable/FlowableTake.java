package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public boolean f48154a;

        /* JADX INFO: renamed from: b */
        public Subscription f48155b;

        /* JADX INFO: renamed from: c */
        public final FlowableSubscriber f48156c;

        /* JADX INFO: renamed from: d */
        public long f48157d = 0;

        public TakeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f48156c = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f48155b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48155b, subscription)) {
                this.f48155b = subscription;
                subscription.cancel();
                this.f48154a = true;
                EmptySubscription.m17862a(this.f48156c);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f48154a) {
                return;
            }
            this.f48154a = true;
            this.f48156c.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f48154a) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            this.f48154a = true;
            this.f48155b.cancel();
            this.f48156c.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f48154a) {
                return;
            }
            long j = this.f48157d;
            long j2 = j - 1;
            this.f48157d = j2;
            if (j > 0) {
                boolean z2 = j2 == 0;
                this.f48156c.onNext(obj);
                if (z2) {
                    this.f48155b.cancel();
                    onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                if (get() || !compareAndSet(false, true) || j < 0) {
                    this.f48155b.request(j);
                } else {
                    this.f48155b.request(Long.MAX_VALUE);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new TakeSubscriber((FlowableSubscriber) subscriber));
    }
}
