package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.CancellableQueueFuseable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromRunnable<T> extends Observable<T> implements Supplier<T> {
    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        CancellableQueueFuseable cancellableQueueFuseable = new CancellableQueueFuseable();
        observer.mo12365c(cancellableQueueFuseable);
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
                observer.onError(th);
            }
        }
    }
}
