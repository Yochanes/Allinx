package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableCache extends Completable implements CompletableObserver {

    /* JADX INFO: compiled from: Proguard */
    public final class InnerCompletableCache extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49499a;

        public InnerCompletableCache(CompletableObserver completableObserver) {
            this.f49499a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.getClass();
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new InnerCompletableCache(completableObserver));
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

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo12363c(Disposable disposable) {
    }
}
