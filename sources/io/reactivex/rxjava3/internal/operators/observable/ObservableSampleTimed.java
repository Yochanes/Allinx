package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSampleTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        /* JADX INFO: renamed from: a */
        public final void mo18176a() {
            T andSet = getAndSet(null);
            if (andSet == null) {
                throw null;
            }
            this.f50788a.onNext(andSet);
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        /* JADX INFO: renamed from: a */
        public final void mo18176a() {
            this.f50788a.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f50788a.onNext(andSet);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f50788a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50789b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public Disposable f50790c;

        public SampleTimedObserver(SerializedObserver serializedObserver) {
            this.f50788a = serializedObserver;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo18176a();

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50790c, disposable)) {
                this.f50790c = disposable;
                this.f50788a.mo12365c(this);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50790c.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f50789b);
            this.f50790c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.m17952a(this.f50789b);
            mo18176a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f50789b);
            this.f50788a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            lazySet(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new SampleTimedNoLast(new SerializedObserver(observer)));
    }
}
