package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeUntil<T, U> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50877a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50878b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f50879c = new OtherObserver();

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50880d = new AtomicThrowable();

        /* JADX INFO: compiled from: Proguard */
        public final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
            public OtherObserver() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            /* JADX INFO: renamed from: c */
            public final void mo12365c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m17952a(takeUntilMainObserver.f50878b);
                HalfSerializer.m18252a(takeUntilMainObserver.f50877a, takeUntilMainObserver, takeUntilMainObserver.f50880d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m17952a(takeUntilMainObserver.f50878b);
                HalfSerializer.m18254c(takeUntilMainObserver.f50877a, th, takeUntilMainObserver, takeUntilMainObserver.f50880d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                DisposableHelper.m17952a(this);
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.m17952a(takeUntilMainObserver.f50878b);
                HalfSerializer.m18252a(takeUntilMainObserver.f50877a, takeUntilMainObserver, takeUntilMainObserver.f50880d);
            }
        }

        public TakeUntilMainObserver(Observer observer) {
            this.f50877a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this.f50878b, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b((Disposable) this.f50878b.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f50878b);
            DisposableHelper.m17952a(this.f50879c);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.m17952a(this.f50879c);
            HalfSerializer.m18252a(this.f50877a, this, this.f50880d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f50879c);
            HalfSerializer.m18254c(this.f50877a, th, this, this.f50880d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            HalfSerializer.m18256e(this.f50877a, obj, this, this.f50880d);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new TakeUntilMainObserver(observer));
        throw null;
    }
}
