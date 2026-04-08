package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableSubscribeOn extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeOnObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49541a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f49542b = new SequentialDisposable();

        public SubscribeOnObserver(CompletableObserver completableObserver) {
            this.f49541a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
            SequentialDisposable sequentialDisposable = this.f49542b;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f49541a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f49541a.onError(th);
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new SubscribeOnObserver(completableObserver));
        throw null;
    }
}
