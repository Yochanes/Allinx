package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: b */
    public static final Object[] f51265b = new Object[0];

    /* JADX INFO: compiled from: Proguard */
    public static final class BehaviorSubscription<T> extends AtomicLong implements Subscription, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f51266a;

        /* JADX INFO: renamed from: b */
        public final BehaviorProcessor f51267b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f51268c;

        public BehaviorSubscription(FlowableSubscriber flowableSubscriber, BehaviorProcessor behaviorProcessor) {
            this.f51266a = flowableSubscriber;
            this.f51267b = behaviorProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f51268c) {
                return;
            }
            this.f51268c = true;
            this.f51267b.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m18226f(j)) {
                BackpressureHelper.m18237a(this, j);
            }
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            if (this.f51268c) {
                return true;
            }
            if (NotificationLite.m18264h(obj)) {
                this.f51266a.onComplete();
                return true;
            }
            if (NotificationLite.m18265i(obj)) {
                this.f51266a.onError(NotificationLite.m18263f(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.f51266a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f51266a.onNext(obj);
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        subscriber.mo12367j(new BehaviorSubscription((FlowableSubscriber) subscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        Throwable th = ExceptionHelper.f51225a;
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        throw null;
    }
}
