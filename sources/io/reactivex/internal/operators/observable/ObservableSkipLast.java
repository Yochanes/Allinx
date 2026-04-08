package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSkipLast<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48877a;

        /* JADX INFO: renamed from: b */
        public Disposable f48878b;

        public SkipLastObserver(Observer observer) {
            super(0);
            this.f48877a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48878b, disposable)) {
                this.f48878b = disposable;
                this.f48877a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48878b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48878b.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48877a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48877a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (size() == 0) {
                this.f48877a.onNext(poll());
            }
            offer(obj);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new SkipLastObserver(observer);
        throw null;
    }
}
