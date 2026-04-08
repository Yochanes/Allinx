package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSkip<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50832a;

        /* JADX INFO: renamed from: b */
        public long f50833b = 1;

        /* JADX INFO: renamed from: c */
        public Disposable f50834c;

        public SkipObserver(Observer observer) {
            this.f50832a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50834c, disposable)) {
                this.f50834c = disposable;
                this.f50832a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50834c.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50834c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50832a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50832a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            long j = this.f50833b;
            if (j != 0) {
                this.f50833b = j - 1;
            } else {
                this.f50832a.onNext(obj);
            }
        }
    }

    public ObservableSkip(Observable observable) {
        super(observable);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new SkipObserver(observer));
    }
}
