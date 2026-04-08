package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureError<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47982a;

        /* JADX INFO: renamed from: b */
        public Subscription f47983b;

        /* JADX INFO: renamed from: c */
        public boolean f47984c;

        public BackpressureErrorSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47982a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47983b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47983b, subscription)) {
                this.f47983b = subscription;
                this.f47982a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47984c) {
                return;
            }
            this.f47984c = true;
            this.f47982a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47984c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47984c = true;
                this.f47982a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47984c) {
                return;
            }
            if (get() == 0) {
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            } else {
                this.f47982a.onNext(obj);
                BackpressureHelper.m17882e(this, 1L);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this, j);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new BackpressureErrorSubscriber((FlowableSubscriber) subscriber));
    }
}
