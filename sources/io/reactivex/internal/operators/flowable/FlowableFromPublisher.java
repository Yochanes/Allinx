package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Publisher f47850b;

    public FlowableFromPublisher(Publisher publisher) {
        this.f47850b = publisher;
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47850b.mo15432g(subscriber);
    }
}
