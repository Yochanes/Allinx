package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureLatestSubscriber<T> extends AbstractBackpressureThrottlingSubscriber<T, T> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49555i.lazySet(obj);
            m17987b();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        new BackpressureLatestSubscriber((FlowableSubscriber) subscriber);
        throw null;
    }
}
