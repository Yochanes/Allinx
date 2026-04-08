package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFlattenIterable<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlattenIterableObserver<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50619a;

        /* JADX INFO: renamed from: b */
        public Disposable f50620b;

        public FlattenIterableObserver(Observer observer) {
            this.f50619a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50620b, disposable)) {
                this.f50620b = disposable;
                this.f50619a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50620b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50620b.dispose();
            this.f50620b = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Disposable disposable = this.f50620b;
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                return;
            }
            this.f50620b = disposableHelper;
            this.f50619a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            Disposable disposable = this.f50620b;
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50620b = disposableHelper;
                this.f50619a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50620b == DisposableHelper.f49380a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50620b.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new FlattenIterableObserver(observer));
    }
}
