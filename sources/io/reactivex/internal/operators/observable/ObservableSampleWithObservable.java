package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSampleWithObservable<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: a */
        public final void mo17822a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: b */
        public final void mo17823b() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: e */
        public final void mo17824e() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: a */
        public final void mo17822a() {
            this.f48839a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: b */
        public final void mo17823b() {
            this.f48839a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: e */
        public final void mo17824e() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f48839a.onNext(andSet);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f48839a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48840b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public Disposable f48841c;

        public SampleMainObserver(SerializedObserver serializedObserver) {
            this.f48839a = serializedObserver;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo17822a();

        /* JADX INFO: renamed from: b */
        public abstract void mo17823b();

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48841c, disposable)) {
                this.f48841c = disposable;
                this.f48839a.mo17593c(this);
                if (this.f48840b.get() == null) {
                    throw null;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48840b.get() == DisposableHelper.f47552a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f48840b);
            this.f48841c.dispose();
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo17824e();

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.m17615a(this.f48840b);
            mo17822a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f48840b);
            this.f48839a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            lazySet(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SamplerObserver<T> implements Observer<Object> {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SampleMainNoLast(new SerializedObserver(observer));
        throw null;
    }
}
