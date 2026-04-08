package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class CompletableCache extends Completable implements CompletableObserver {

    /* JADX INFO: compiled from: Proguard */
    public final class InnerCompletableCache extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47591a;

        public InnerCompletableCache(CompletableObserver completableObserver) {
            this.f47591a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.getClass();
                throw null;
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        completableObserver.mo17580c(new InnerCompletableCache(completableObserver));
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

    @Override // io.reactivex.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo17580c(Disposable disposable) {
    }
}
