package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        if (FlowableScalarXMap.m17736a(null, (FlowableSubscriber) subscriber)) {
            return;
        }
        new FlowableFlatMap.MergeSubscriber(subscriber);
        throw null;
    }
}
