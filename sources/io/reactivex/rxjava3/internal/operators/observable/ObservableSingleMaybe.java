package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50826a;

        /* JADX INFO: renamed from: b */
        public Object f50827b;

        /* JADX INFO: renamed from: c */
        public boolean f50828c;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50826a, disposable)) {
                this.f50826a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50826a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50826a.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50828c) {
                return;
            }
            this.f50828c = true;
            this.f50827b = null;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50828c) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50828c = true;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50828c) {
                return;
            }
            if (this.f50827b == null) {
                this.f50827b = obj;
                return;
            }
            this.f50828c = true;
            this.f50826a.dispose();
            new IllegalArgumentException("Sequence contains more than one element!");
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        throw null;
    }
}
