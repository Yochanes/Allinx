package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableDematerialize<T> extends AbstractFlowableWithUpstream<Notification<T>, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DematerializeSubscriber<T> implements FlowableSubscriber<Notification<T>>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47748a;

        /* JADX INFO: renamed from: b */
        public boolean f47749b;

        /* JADX INFO: renamed from: c */
        public Subscription f47750c;

        public DematerializeSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47748a = flowableSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f47750c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47750c, subscription)) {
                this.f47750c = subscription;
                this.f47748a.mo12367j(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f47749b) {
                return;
            }
            this.f47749b = true;
            this.f47748a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f47749b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f47749b = true;
                this.f47748a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f47749b) {
                if (NotificationLite.m17903i(notification.f47534a)) {
                    RxJavaPlugins.m17911b(notification.m17588b());
                }
            } else if (NotificationLite.m17903i(notification.f47534a)) {
                this.f47750c.cancel();
                onError(notification.m17588b());
            } else if (notification.f47534a != null) {
                this.f47748a.onNext(notification.m17589c());
            } else {
                this.f47750c.cancel();
                onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f47750c.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new DematerializeSubscriber((FlowableSubscriber) subscriber));
    }
}
