package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSampleWithObservable<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: a */
        public final void mo18177a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: b */
        public final void mo18178b() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: a */
        public final void mo18177a() {
            this.f50791a.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* JADX INFO: renamed from: b */
        public final void mo18178b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f50791a.onNext(andSet);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f50791a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50792b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public Disposable f50793c;

        public SampleMainObserver(SerializedObserver serializedObserver) {
            this.f50791a = serializedObserver;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo18177a();

        /* JADX INFO: renamed from: b */
        public abstract void mo18178b();

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50793c, disposable)) {
                this.f50793c = disposable;
                this.f50791a.mo12365c(this);
                if (this.f50792b.get() == null) {
                    throw null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50792b.get() == DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f50792b);
            this.f50793c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.m17952a(this.f50792b);
            mo18177a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f50792b);
            this.f50791a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            lazySet(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SamplerObserver<T> implements Observer<Object> {
        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new SampleMainNoLast(new SerializedObserver(observer)));
    }
}
