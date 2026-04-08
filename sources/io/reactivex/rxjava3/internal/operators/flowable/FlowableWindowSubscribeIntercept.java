package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class FlowableWindowSubscribeIntercept<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final FlowableProcessor f50143b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f50144c = new AtomicBoolean();

    public FlowableWindowSubscribeIntercept(FlowableProcessor flowableProcessor) {
        this.f50143b = flowableProcessor;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        this.f50143b.mo15432g(subscriber);
        this.f50144c.set(true);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18099c() {
        AtomicBoolean atomicBoolean = this.f50144c;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }
}
