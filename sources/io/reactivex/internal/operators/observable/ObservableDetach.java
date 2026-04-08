package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDetach<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Observer f48641a;

        /* JADX INFO: renamed from: b */
        public Disposable f48642b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48642b, disposable)) {
                this.f48642b = disposable;
                this.f48641a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48642b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f48642b;
            EmptyComponent emptyComponent = EmptyComponent.f49273a;
            this.f48642b = emptyComponent;
            this.f48641a = emptyComponent;
            disposable.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer observer = this.f48641a;
            EmptyComponent emptyComponent = EmptyComponent.f49273a;
            this.f48642b = emptyComponent;
            this.f48641a = emptyComponent;
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Observer observer = this.f48641a;
            EmptyComponent emptyComponent = EmptyComponent.f49273a;
            this.f48642b = emptyComponent;
            this.f48641a = emptyComponent;
            observer.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48641a.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
