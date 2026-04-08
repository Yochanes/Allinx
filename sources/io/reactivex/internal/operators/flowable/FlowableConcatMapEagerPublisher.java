package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
