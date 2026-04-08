package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48869a;

        /* JADX INFO: renamed from: b */
        public Object f48870b;

        /* JADX INFO: renamed from: c */
        public boolean f48871c;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48869a, disposable)) {
                this.f48869a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48869a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48869a.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48871c) {
                return;
            }
            this.f48871c = true;
            this.f48870b = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48871c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48871c = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48871c) {
                return;
            }
            if (this.f48870b == null) {
                this.f48870b = obj;
                return;
            }
            this.f48871c = true;
            this.f48869a.dispose();
            new IllegalArgumentException("Sequence contains more than one element!");
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
