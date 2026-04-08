package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(subscriber);
        subscriber.mo12367j(deferredScalarSubscription);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            if (deferredScalarSubscription.get() == 4) {
                return;
            }
            subscriber.onError(th);
        }
    }
}
