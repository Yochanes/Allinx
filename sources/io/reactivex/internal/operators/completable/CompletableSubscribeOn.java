package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableSubscribeOn extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeOnObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47623a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f47624b = new SequentialDisposable();

        public SubscribeOnObserver(CompletableObserver completableObserver) {
            this.f47623a = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
            SequentialDisposable sequentialDisposable = this.f47624b;
            sequentialDisposable.getClass();
            DisposableHelper.m17615a(sequentialDisposable);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f47623a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f47623a.onError(th);
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        completableObserver.mo17580c(new SubscribeOnObserver(completableObserver));
        throw null;
    }
}
