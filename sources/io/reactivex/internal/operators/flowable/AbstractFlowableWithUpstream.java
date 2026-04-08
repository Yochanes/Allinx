package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> implements HasUpstreamPublisher<T> {

    /* JADX INFO: renamed from: b */
    public final Flowable f47628b;

    public AbstractFlowableWithUpstream(Flowable flowable) {
        ObjectHelper.m17628b(flowable, "source is null");
        this.f47628b = flowable;
    }
}
