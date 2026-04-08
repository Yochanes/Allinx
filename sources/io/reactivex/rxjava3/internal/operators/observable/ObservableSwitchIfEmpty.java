package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchIfEmptyObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50847a;

        /* JADX INFO: renamed from: b */
        public final ObservableJust f50848b;

        /* JADX INFO: renamed from: d */
        public boolean f50850d = true;

        /* JADX INFO: renamed from: c */
        public final SequentialDisposable f50849c = new SequentialDisposable();

        public SwitchIfEmptyObserver(Observer observer, ObservableJust observableJust) {
            this.f50847a = observer;
            this.f50848b = observableJust;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f50849c;
            sequentialDisposable.getClass();
            while (true) {
                Disposable disposable2 = sequentialDisposable.get();
                if (disposable2 == DisposableHelper.f49380a) {
                    if (disposable != null) {
                        disposable.dispose();
                        return;
                    }
                    return;
                } else {
                    while (!sequentialDisposable.compareAndSet(disposable2, disposable)) {
                        if (sequentialDisposable.get() != disposable2) {
                            break;
                        }
                    }
                    if (disposable2 != null) {
                        disposable2.dispose();
                        return;
                    }
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (!this.f50850d) {
                this.f50847a.onComplete();
            } else {
                this.f50850d = false;
                this.f50848b.mo17931a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50847a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50850d) {
                this.f50850d = false;
            }
            this.f50847a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        SwitchIfEmptyObserver switchIfEmptyObserver = new SwitchIfEmptyObserver(observer, null);
        observer.mo12365c(switchIfEmptyObserver.f50849c);
        this.f50392a.mo17931a(switchIfEmptyObserver);
    }
}
