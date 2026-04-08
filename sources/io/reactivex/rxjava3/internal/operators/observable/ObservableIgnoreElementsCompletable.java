package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableIgnoreElementsCompletable<T> extends Completable implements FuseToObservable<T> {

    /* JADX INFO: renamed from: a */
    public final ObservableTakeUntilPredicate f50660a;

    public ObservableIgnoreElementsCompletable(ObservableTakeUntilPredicate observableTakeUntilPredicate) {
        this.f50660a = observableTakeUntilPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        this.f50660a.mo17931a(new IgnoreObservable(completableObserver));
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IgnoreObservable<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f50661a;

        /* JADX INFO: renamed from: b */
        public Disposable f50662b;

        public IgnoreObservable(CompletableObserver completableObserver) {
            this.f50661a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            this.f50662b = disposable;
            this.f50661a.mo12363c(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50662b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50662b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50661a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50661a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
        }
    }
}
