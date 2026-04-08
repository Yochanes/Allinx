package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48698a;

        /* JADX INFO: renamed from: b */
        public boolean f48699b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48700c;

        public FromArrayDisposable(Observer observer) {
            this.f48698a = observer;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48700c;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48700c = true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            this.f48699b = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer);
        observer.mo17593c(fromArrayDisposable);
        if (!fromArrayDisposable.f48699b) {
            throw null;
        }
    }
}
