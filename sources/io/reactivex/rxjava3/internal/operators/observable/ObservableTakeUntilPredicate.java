package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTakeUntilPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Predicate f50882b;

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilPredicateObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50883a;

        /* JADX INFO: renamed from: b */
        public final Predicate f50884b;

        /* JADX INFO: renamed from: c */
        public Disposable f50885c;

        /* JADX INFO: renamed from: d */
        public boolean f50886d;

        public TakeUntilPredicateObserver(Observer observer, Predicate predicate) {
            this.f50883a = observer;
            this.f50884b = predicate;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50885c, disposable)) {
                this.f50885c = disposable;
                this.f50883a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50885c.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50885c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50886d) {
                return;
            }
            this.f50886d = true;
            this.f50883a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50886d) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50886d = true;
                this.f50883a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50886d) {
                return;
            }
            Observer observer = this.f50883a;
            observer.onNext(obj);
            try {
                if (this.f50884b.test(obj)) {
                    this.f50886d = true;
                    this.f50885c.dispose();
                    observer.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50885c.dispose();
                onError(th);
            }
        }
    }

    public ObservableTakeUntilPredicate(ObservableSkip observableSkip, Predicate predicate) {
        super(observableSkip);
        this.f50882b = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new TakeUntilPredicateObserver(observer, this.f50882b));
    }
}
