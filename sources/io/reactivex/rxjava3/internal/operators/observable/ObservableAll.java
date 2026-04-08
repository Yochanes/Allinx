package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableAll<T> extends AbstractObservableWithUpstream<T, Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class AllObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50411a;

        /* JADX INFO: renamed from: b */
        public Disposable f50412b;

        /* JADX INFO: renamed from: c */
        public boolean f50413c;

        public AllObserver(Observer observer) {
            this.f50411a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50412b, disposable)) {
                this.f50412b = disposable;
                this.f50411a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50412b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50412b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50413c) {
                return;
            }
            this.f50413c = true;
            Boolean bool = Boolean.TRUE;
            Observer observer = this.f50411a;
            observer.onNext(bool);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50413c) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50413c = true;
                this.f50411a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50413c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50412b.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new AllObserver(observer));
    }
}
