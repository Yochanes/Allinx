package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableTimeout extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public final class DisposeTask implements Runnable {

        /* JADX INFO: compiled from: Proguard */
        public final class DisposeObserver implements CompletableObserver {
            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                throw null;
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

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeOutObserver implements CompletableObserver {
        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            throw null;
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
        completableObserver.mo17580c(new CompositeDisposable());
        new AtomicBoolean();
        throw null;
    }
}
