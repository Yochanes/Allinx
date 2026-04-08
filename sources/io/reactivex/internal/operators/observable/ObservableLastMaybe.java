package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class LastObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48746a;

        /* JADX INFO: renamed from: b */
        public Object f48747b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48746a, disposable)) {
                this.f48746a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48746a == DisposableHelper.f47552a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48746a.dispose();
            this.f48746a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48746a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48746a = DisposableHelper.f47552a;
            this.f48747b = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48747b = obj;
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
