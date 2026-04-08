package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50870a;

        /* JADX INFO: renamed from: b */
        public Disposable f50871b;

        /* JADX INFO: renamed from: c */
        public Object f50872c;

        public TakeLastOneObserver(Observer observer) {
            this.f50870a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50871b, disposable)) {
                this.f50871b = disposable;
                this.f50870a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50871b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50872c = null;
            this.f50871b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Object obj = this.f50872c;
            Observer observer = this.f50870a;
            if (obj != null) {
                this.f50872c = null;
                observer.onNext(obj);
            }
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50872c = null;
            this.f50870a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50872c = obj;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new TakeLastOneObserver(observer));
    }
}
