package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableObserveOn extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49535a;

        /* JADX INFO: renamed from: b */
        public Throwable f49536b;

        public ObserveOnCompletableObserver(CompletableObserver completableObserver) {
            this.f49535a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f49535a.mo12363c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f49536b = th;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f49536b;
            CompletableObserver completableObserver = this.f49535a;
            if (th == null) {
                completableObserver.onComplete();
            } else {
                this.f49536b = null;
                completableObserver.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new ObserveOnCompletableObserver(completableObserver);
        throw null;
    }
}
