package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableMapNotification<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f49245a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                this.f49245a.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f49245a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new MapNotificationSubscriber((FlowableSubscriber) subscriber));
    }
}
