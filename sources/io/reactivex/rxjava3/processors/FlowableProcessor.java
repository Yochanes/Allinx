package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import org.reactivestreams.Processor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements Processor<T, T>, FlowableSubscriber<T> {
    /* JADX INFO: renamed from: c */
    public final void m18276c() {
        boolean z2 = this instanceof SerializedProcessor;
    }
}
