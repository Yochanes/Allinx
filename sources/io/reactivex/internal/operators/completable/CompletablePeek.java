package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletablePeek extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public final class CompletableObserverImplementation implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public DisposableHelper f47622a;

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                disposable.dispose();
                this.f47622a = DisposableHelper.f47552a;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            this.f47622a.getClass();
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
                this.f47622a.getClass();
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f47622a == DisposableHelper.f47552a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                throw null;
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f47622a == DisposableHelper.f47552a) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        throw null;
    }
}
