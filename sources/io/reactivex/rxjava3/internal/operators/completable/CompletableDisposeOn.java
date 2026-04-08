package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableDisposeOn extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class DisposeOnObserver implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public Disposable f49520a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49521b;

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f49520a, disposable)) {
                this.f49520a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49521b;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49521b = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (!this.f49521b) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (!this.f49521b) {
                throw null;
            }
            RxJavaPlugins.m18275b(th);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f49520a.dispose();
            this.f49520a = DisposableHelper.f49380a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        throw null;
    }
}
