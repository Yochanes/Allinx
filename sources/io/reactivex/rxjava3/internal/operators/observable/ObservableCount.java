package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCount<T> extends AbstractObservableWithUpstream<T, Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CountObserver implements Observer<Object>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50522a;

        /* JADX INFO: renamed from: b */
        public Disposable f50523b;

        /* JADX INFO: renamed from: c */
        public long f50524c;

        public CountObserver(Observer observer) {
            this.f50522a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50523b, disposable)) {
                this.f50523b = disposable;
                this.f50522a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50523b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50523b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Long lValueOf = Long.valueOf(this.f50524c);
            Observer observer = this.f50522a;
            observer.onNext(lValueOf);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50522a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50524c++;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new CountObserver(observer));
    }
}
