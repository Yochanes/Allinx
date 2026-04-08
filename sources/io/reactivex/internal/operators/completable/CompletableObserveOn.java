package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableObserveOn extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47620a;

        /* JADX INFO: renamed from: b */
        public Throwable f47621b;

        public ObserveOnCompletableObserver(CompletableObserver completableObserver) {
            this.f47620a = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f47620a.mo17580c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f47621b = th;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f47621b;
            CompletableObserver completableObserver = this.f47620a;
            if (th == null) {
                completableObserver.onComplete();
            } else {
                this.f47621b = null;
                completableObserver.onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new ObserveOnCompletableObserver(completableObserver);
        throw null;
    }
}
