package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchIfEmptyObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48888a;

        /* JADX INFO: renamed from: b */
        public final ObservableJust f48889b;

        /* JADX INFO: renamed from: d */
        public boolean f48891d = true;

        /* JADX INFO: renamed from: c */
        public final SequentialDisposable f48890c = new SequentialDisposable();

        public SwitchIfEmptyObserver(Observer observer, ObservableJust observableJust) {
            this.f48888a = observer;
            this.f48889b = observableJust;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f48890c;
            sequentialDisposable.getClass();
            DisposableHelper.m17618e(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (!this.f48891d) {
                this.f48888a.onComplete();
            } else {
                this.f48891d = false;
                this.f48889b.mo17591a(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48888a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48891d) {
                this.f48891d = false;
            }
            this.f48888a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new SwitchIfEmptyObserver(observer, null).f48890c);
        throw null;
    }
}
