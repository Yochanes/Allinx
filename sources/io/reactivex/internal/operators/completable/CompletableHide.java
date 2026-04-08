package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableHide extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class HideCompletableObserver implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f47614a;

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f47614a, disposable)) {
                this.f47614a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47614a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47614a.dispose();
            this.f47614a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            throw null;
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        throw null;
    }
}
