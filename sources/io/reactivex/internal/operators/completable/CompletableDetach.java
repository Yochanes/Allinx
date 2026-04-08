package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class CompletableDetach extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachCompletableObserver implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f47608a;

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f47608a, disposable)) {
                this.f47608a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47608a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47608a.dispose();
            this.f47608a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f47608a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f47608a = DisposableHelper.f47552a;
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        throw null;
    }
}
