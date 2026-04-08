package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureReduceWith<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureReduceWithSubscriber<T, R> extends AbstractBackpressureThrottlingSubscriber<T, R> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f49555i;
            Object andSet = atomicReference.get();
            if (andSet != null) {
                andSet = atomicReference.getAndSet(null);
            }
            try {
                if (andSet != null) {
                    throw null;
                }
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49550b.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new BackpressureReduceWithSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
