package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableUsing<R> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class UsingObserver<R> extends AtomicReference<Object> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f47627a;

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f47627a, disposable)) {
                this.f47627a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47627a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47627a.dispose();
            this.f47627a = DisposableHelper.f47552a;
            if (getAndSet(this) == this) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f47627a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f47627a = DisposableHelper.f47552a;
            throw null;
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17622b(th, completableObserver);
        }
    }
}
