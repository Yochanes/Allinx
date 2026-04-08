package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class LastObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50679a;

        /* JADX INFO: renamed from: b */
        public Object f50680b;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50679a, disposable)) {
                this.f50679a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50679a == DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50679a.dispose();
            this.f50679a = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50679a = DisposableHelper.f49380a;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50679a = DisposableHelper.f49380a;
            this.f50680b = null;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50680b = obj;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        throw null;
    }
}
