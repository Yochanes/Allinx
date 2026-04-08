package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletablePeek extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public final class CompletableObserverImplementation implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public DisposableHelper f49538a;

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                disposable.dispose();
                this.f49538a = DisposableHelper.f49380a;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            this.f49538a.getClass();
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
                this.f49538a.getClass();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f49538a == DisposableHelper.f49380a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (this.f49538a == DisposableHelper.f49380a) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        throw null;
    }
}
