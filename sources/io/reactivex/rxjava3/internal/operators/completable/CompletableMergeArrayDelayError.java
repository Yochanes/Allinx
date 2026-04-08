package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableMergeArrayDelayError extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeInnerCompletableObserver implements CompletableObserver {
        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TryTerminateAndReportDisposable implements Disposable {
        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        throw null;
    }
}
