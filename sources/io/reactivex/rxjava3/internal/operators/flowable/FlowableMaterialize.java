package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMaterialize<T> extends AbstractFlowableWithUpstream<T, Notification<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo18042b(Object obj) {
            Notification notification = (Notification) obj;
            if (NotificationLite.m18265i(notification.f49362a)) {
                RxJavaPlugins.m18275b(notification.m17926b());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            m18213a(Notification.f49361b);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            m18213a(Notification.m17925a(th));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f51195d++;
            Objects.requireNonNull(obj, "value is null");
            this.f51192a.onNext(new Notification(obj));
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new MaterializeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
