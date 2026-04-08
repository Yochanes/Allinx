package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableDisposeOn extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletableObserverImplementation implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public Disposable f47609a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f47610b;

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f47609a, disposable)) {
                this.f47609a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47610b;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47610b = true;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (!this.f47610b) {
                throw null;
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            if (!this.f47610b) {
                throw null;
            }
            RxJavaPlugins.m17911b(th);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f47609a.dispose();
            this.f47609a = DisposableHelper.f47552a;
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        throw null;
    }
}
