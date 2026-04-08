package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
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
        public final SerializedSubscriber f48266a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48267b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicLong f48268c = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final AtomicReference f48269d = new AtomicReference();

        public WithLatestFromSubscriber(SerializedSubscriber serializedSubscriber) {
            this.f48266a = serializedSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.m17867a(this.f48267b);
            SubscriptionHelper.m17867a(this.f48269d);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* JADX INFO: renamed from: f */
        public final boolean mo17630f(Object obj) {
            if (get() == null) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                cancel();
                this.f48266a.onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            SubscriptionHelper.m17869c(this.f48267b, this.f48268c, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.m17867a(this.f48269d);
            this.f48266a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.m17867a(this.f48269d);
            this.f48266a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            mo17630f(obj);
            ((Subscription) this.f48267b.get()).request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.m17868b(this.f48267b, this.f48268c, j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
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
