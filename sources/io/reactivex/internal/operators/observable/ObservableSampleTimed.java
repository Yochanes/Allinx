package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSampleTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        /* JADX INFO: renamed from: a */
        public final void mo17821a() {
            T andSet = getAndSet(null);
            if (andSet == null) {
                throw null;
            }
            this.f48836a.onNext(andSet);
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        /* JADX INFO: renamed from: a */
        public final void mo17821a() {
            this.f48836a.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f48836a.onNext(andSet);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f48836a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48837b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public Disposable f48838c;

        public SampleTimedObserver(SerializedObserver serializedObserver) {
            this.f48836a = serializedObserver;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo17821a();

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48838c, disposable)) {
                this.f48838c = disposable;
                this.f48836a.mo17593c(this);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48838c.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f48837b);
            this.f48838c.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.m17615a(this.f48837b);
            mo17821a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f48837b);
            this.f48836a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            lazySet(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SampleTimedNoLast(new SerializedObserver(observer));
        throw null;
    }
}
