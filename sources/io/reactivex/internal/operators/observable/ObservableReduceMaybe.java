package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableReduceMaybe<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReduceObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public boolean f48799a;

        /* JADX INFO: renamed from: b */
        public Object f48800b;

        /* JADX INFO: renamed from: c */
        public Disposable f48801c;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48801c, disposable)) {
                this.f48801c = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48801c.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48801c.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48799a) {
                return;
            }
            this.f48799a = true;
            this.f48800b = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48799a) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48799a = true;
                this.f48800b = null;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48799a) {
                return;
            }
            if (this.f48800b == null) {
                this.f48800b = obj;
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48801c.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
