package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableScalarXMap {

    /* JADX INFO: compiled from: Proguard */
    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == 3;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(3);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ScalarXMapObservable<T, R> extends Observable<R> {
        @Override // io.reactivex.Observable
        /* JADX INFO: renamed from: b */
        public final void mo17592b(Observer observer) {
            try {
                throw null;
            } catch (Throwable th) {
                EmptyDisposable.m17624f(th, observer);
            }
        }
    }
}
