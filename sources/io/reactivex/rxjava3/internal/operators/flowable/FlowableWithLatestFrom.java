package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f50163a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50164b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f50165c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference f50166d = new AtomicReference();

        public WithLatestFromSubscriber(SerializedSubscriber serializedSubscriber) {
            this.f50163a = serializedSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m18221a(this.f50164b);
            SubscriptionHelper.m18221a(this.f50166d);
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17969f(Object obj) {
            if (get() == null) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                cancel();
                this.f50163a.onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m18223c(this.f50164b, this.f50165c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m18221a(this.f50166d);
            this.f50163a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m18221a(this.f50166d);
            this.f50163a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17969f(obj);
            ((Subscription) this.f50164b.get()).request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m18222b(this.f50164b, this.f50165c, j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber((FlowableSubscriber) subscriber);
        serializedSubscriber.mo12367j(new WithLatestFromSubscriber(serializedSubscriber));
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
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

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }
    }
}
