package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableOnErrorNext<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorNextObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48786a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f48787b = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public boolean f48788c;

        /* JADX INFO: renamed from: d */
        public boolean f48789d;

        public OnErrorNextObserver(Observer observer) {
            this.f48786a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f48787b;
            sequentialDisposable.getClass();
            DisposableHelper.m17617c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48789d) {
                return;
            }
            this.f48789d = true;
            this.f48788c = true;
            this.f48786a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            boolean z2 = this.f48788c;
            Observer observer = this.f48786a;
            if (z2) {
                if (this.f48789d) {
                    RxJavaPlugins.m17911b(th);
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            this.f48788c = true;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48789d) {
                return;
            }
            this.f48786a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new OnErrorNextObserver(observer).f48787b);
        throw null;
    }
}
