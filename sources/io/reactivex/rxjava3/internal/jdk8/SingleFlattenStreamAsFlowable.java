package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.jdk8.MaybeFlattenStreamAsFlowable;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlattenStreamAsFlowable<T, R> extends Flowable<R> {
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new MaybeFlattenStreamAsFlowable.FlattenStreamMultiObserver((FlowableSubscriber) subscriber);
        throw null;
    }
}
