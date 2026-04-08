package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47979a;

        /* JADX INFO: renamed from: b */
        public Subscription f47980b;

        /* JADX INFO: renamed from: c */
        public boolean f47981c;

        public BackpressureDropSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47979a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47980b.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47980b, subscription)) {
                this.f47980b = subscription;
                this.f47979a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47981c) {
                return;
            }
            this.f47981c = true;
            this.f47979a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47981c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47981c = true;
                this.f47979a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f47981c) {
                return;
            }
            if (get() != 0) {
                this.f47979a.onNext(obj);
                BackpressureHelper.m17882e(this, 1L);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                cancel();
                onError(th);
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
        this.f47628b.m17582b(new BackpressureDropSubscriber((FlowableSubscriber) subscriber));
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
    }
}
