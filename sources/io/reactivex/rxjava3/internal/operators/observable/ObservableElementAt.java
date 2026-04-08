package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50564a;

        /* JADX INFO: renamed from: b */
        public Disposable f50565b;

        /* JADX INFO: renamed from: c */
        public long f50566c;

        /* JADX INFO: renamed from: d */
        public boolean f50567d;

        public ElementAtObserver(Observer observer) {
            this.f50564a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50565b, disposable)) {
                this.f50565b = disposable;
                this.f50564a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50565b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50565b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50567d) {
                return;
            }
            this.f50567d = true;
            this.f50564a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50567d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50567d = true;
                this.f50564a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50567d) {
                return;
            }
            long j = this.f50566c;
            if (j != 0) {
                this.f50566c = j + 1;
                return;
            }
            this.f50567d = true;
            this.f50565b.dispose();
            Observer observer = this.f50564a;
            observer.onNext(obj);
            observer.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new ElementAtObserver(observer));
    }
}
