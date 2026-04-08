package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMaterialize<T> extends AbstractFlowableWithUpstream<T, Notification<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo17696b(Object obj) {
            Notification notification = (Notification) obj;
            if (NotificationLite.m17903i(notification.f47534a)) {
                RxJavaPlugins.m17911b(notification.m17588b());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m17860a(Notification.f47533b);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            m17860a(Notification.m17587a(th));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49248d++;
            ObjectHelper.m17628b(obj, "value is null");
            this.f49245a.onNext(new Notification(obj));
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new MaterializeSubscriber((FlowableSubscriber) subscriber));
    }
}
