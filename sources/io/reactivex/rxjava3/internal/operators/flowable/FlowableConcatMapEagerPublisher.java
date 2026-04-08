package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapEager;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
