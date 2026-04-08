package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableConcatArray extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47604a;

        /* JADX INFO: renamed from: b */
        public int f47605b;

        /* JADX INFO: renamed from: c */
        public final SequentialDisposable f47606c = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver) {
            this.f47604a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17644a() {
            SequentialDisposable sequentialDisposable = this.f47606c;
            if (sequentialDisposable.mo17596d() || getAndIncrement() != 0 || sequentialDisposable.mo17596d()) {
                return;
            }
            this.f47605b++;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f47606c;
            sequentialDisposable.getClass();
            DisposableHelper.m17617c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            m17644a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f47604a.onError(th);
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver);
        completableObserver.mo17580c(concatInnerObserver.f47606c);
        concatInnerObserver.m17644a();
    }
}
