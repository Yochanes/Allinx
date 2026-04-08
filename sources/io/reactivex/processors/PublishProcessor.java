package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: d */
    public static final PublishSubscription[] f49320d = new PublishSubscription[0];

    /* JADX INFO: renamed from: f */
    public static final PublishSubscription[] f49321f = new PublishSubscription[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference f49322b = new AtomicReference(f49321f);

    /* JADX INFO: renamed from: c */
    public Throwable f49323c;

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49324a;

        /* JADX INFO: renamed from: b */
        public final PublishProcessor f49325b;

        public PublishSubscription(FlowableSubscriber flowableSubscriber, PublishProcessor publishProcessor) {
            this.f49324a = flowableSubscriber;
            this.f49325b = publishProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f49325b.m17915h(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17879b(this, j);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        PublishSubscription publishSubscription = new PublishSubscription((FlowableSubscriber) subscriber, this);
        subscriber.mo12367j(publishSubscription);
        while (true) {
            AtomicReference atomicReference = this.f49322b;
            PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) atomicReference.get();
            if (publishSubscriptionArr == f49320d) {
                Throwable th = this.f49323c;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            int length = publishSubscriptionArr.length;
            PublishSubscription[] publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
            while (!atomicReference.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2)) {
                if (atomicReference.get() != publishSubscriptionArr) {
                    break;
                }
            }
            if (publishSubscription.get() == Long.MIN_VALUE) {
                m17915h(publishSubscription);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m17915h(PublishSubscription publishSubscription) {
        PublishSubscription[] publishSubscriptionArr;
        while (true) {
            AtomicReference atomicReference = this.f49322b;
            PublishSubscription[] publishSubscriptionArr2 = (PublishSubscription[]) atomicReference.get();
            if (publishSubscriptionArr2 == f49320d || publishSubscriptionArr2 == (publishSubscriptionArr = f49321f)) {
                return;
            }
            int length = publishSubscriptionArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishSubscriptionArr2[i] == publishSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishSubscriptionArr = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr2, 0, publishSubscriptionArr, 0, i);
                System.arraycopy(publishSubscriptionArr2, i + 1, publishSubscriptionArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(publishSubscriptionArr2, publishSubscriptionArr)) {
                if (atomicReference.get() != publishSubscriptionArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (this.f49322b.get() == f49320d) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        AtomicReference atomicReference = this.f49322b;
        Object obj = atomicReference.get();
        Object obj2 = f49320d;
        if (obj == obj2) {
            return;
        }
        PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) atomicReference.getAndSet(obj2);
        for (PublishSubscription publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.f49324a.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f49322b;
        Object obj = atomicReference.get();
        Object obj2 = f49320d;
        if (obj == obj2) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        this.f49323c = th;
        PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) atomicReference.getAndSet(obj2);
        for (PublishSubscription publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.f49324a.onError(th);
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.f49322b.get()) {
            long j = publishSubscription.get();
            if (j != Long.MIN_VALUE) {
                FlowableSubscriber flowableSubscriber = publishSubscription.f49324a;
                if (j != 0) {
                    flowableSubscriber.onNext(obj);
                    BackpressureHelper.m17883f(publishSubscription, 1L);
                } else {
                    publishSubscription.cancel();
                    flowableSubscriber.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }
}
