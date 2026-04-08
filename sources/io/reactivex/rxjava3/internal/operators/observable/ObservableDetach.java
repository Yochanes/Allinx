package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDetach<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Observer f50547a;

        /* JADX INFO: renamed from: b */
        public Disposable f50548b;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50548b, disposable)) {
                this.f50548b = disposable;
                this.f50547a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50548b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f50548b;
            EmptyComponent emptyComponent = EmptyComponent.f51222a;
            this.f50548b = emptyComponent;
            this.f50547a = emptyComponent;
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Observer observer = this.f50547a;
            EmptyComponent emptyComponent = EmptyComponent.f51222a;
            this.f50548b = emptyComponent;
            this.f50547a = emptyComponent;
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            Observer observer = this.f50547a;
            EmptyComponent emptyComponent = EmptyComponent.f51222a;
            this.f50548b = emptyComponent;
            this.f50547a = emptyComponent;
            observer.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50547a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        DetachObserver detachObserver = new DetachObserver();
        detachObserver.f50547a = observer;
        this.f50392a.mo17931a(detachObserver);
    }
}
