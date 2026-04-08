package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
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
                Exceptions.m17950a(th);
                this.f51192a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                this.f51192a.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f51192a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new MapNotificationSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
