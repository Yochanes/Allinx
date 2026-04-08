package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapMaybe;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMapMaybePublisher<T, R> extends Flowable<R> {
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new FlowableConcatMapMaybe.ConcatMapMaybeSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
