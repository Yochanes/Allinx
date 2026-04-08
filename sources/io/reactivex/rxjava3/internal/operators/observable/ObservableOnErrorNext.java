package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableOnErrorNext<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorNextObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50730a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f50731b = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public boolean f50732c;

        /* JADX INFO: renamed from: d */
        public boolean f50733d;

        public OnErrorNextObserver(Observer observer) {
            this.f50730a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f50731b;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50733d) {
                return;
            }
            this.f50733d = true;
            this.f50732c = true;
            this.f50730a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            boolean z2 = this.f50732c;
            Observer observer = this.f50730a;
            if (z2) {
                if (this.f50733d) {
                    RxJavaPlugins.m18275b(th);
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            this.f50732c = true;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50733d) {
                return;
            }
            this.f50730a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        OnErrorNextObserver onErrorNextObserver = new OnErrorNextObserver(observer);
        observer.mo12365c(onErrorNextObserver.f50731b);
        this.f50392a.mo17931a(onErrorNextObserver);
    }
}
