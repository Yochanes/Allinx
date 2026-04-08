package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.CancellableQueueFuseable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromAction<T> extends Flowable<T> implements Supplier<T> {
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        CancellableQueueFuseable cancellableQueueFuseable = new CancellableQueueFuseable();
        subscriber.mo12367j(cancellableQueueFuseable);
        if (cancellableQueueFuseable.f49395a) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            if (cancellableQueueFuseable.f49395a) {
                RxJavaPlugins.m18275b(th);
            } else {
                subscriber.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        throw null;
    }
}
