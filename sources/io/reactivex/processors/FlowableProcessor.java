package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import org.reactivestreams.Processor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements Processor<T, T>, FlowableSubscriber<T> {
    /* JADX INFO: renamed from: e */
    public final FlowableProcessor m17914e() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor(this);
    }
}
