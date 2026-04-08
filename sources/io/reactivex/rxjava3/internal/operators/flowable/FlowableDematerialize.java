package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDematerialize<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DematerializeSubscriber<T, R> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f49686a;

        /* JADX INFO: renamed from: b */
        public boolean f49687b;

        /* JADX INFO: renamed from: c */
        public Subscription f49688c;

        public DematerializeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f49686a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f49688c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f49688c, subscription)) {
                this.f49688c = subscription;
                this.f49686a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f49687b) {
                return;
            }
            this.f49687b = true;
            this.f49686a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f49687b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f49687b = true;
                this.f49686a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.f49687b) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    this.f49688c.cancel();
                    onError(th);
                    return;
                }
            }
            if (obj instanceof Notification) {
                Notification notification = (Notification) obj;
                if (NotificationLite.m18265i(notification.f49362a)) {
                    RxJavaPlugins.m18275b(notification.m17926b());
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f49688c.request(j);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new DematerializeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
