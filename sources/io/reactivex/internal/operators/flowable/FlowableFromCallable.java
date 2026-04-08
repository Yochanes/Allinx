package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Callable<T> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        subscriber.mo12367j(new DeferredScalarSubscription(subscriber));
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            subscriber.onError(th);
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        throw null;
    }
}
