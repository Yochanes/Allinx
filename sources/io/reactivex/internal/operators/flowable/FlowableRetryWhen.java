package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            long j = this.f48046j;
            if (j != 0) {
                this.f48046j = 0L;
                m17865d(j);
            }
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new UnicastProcessor(null, 8).m17914e();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptySubscription.m17863b(th, subscriber);
        }
    }
}
