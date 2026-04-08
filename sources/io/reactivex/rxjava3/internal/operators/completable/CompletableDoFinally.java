package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableDoFinally extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49522a;

        /* JADX INFO: renamed from: b */
        public Disposable f49523b;

        public DoFinallyObserver(CompletableObserver completableObserver) {
            this.f49522a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17985a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f49523b, disposable)) {
                this.f49523b = disposable;
                this.f49522a.mo12363c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49523b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49523b.dispose();
            m17985a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f49522a.onComplete();
            m17985a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f49522a.onError(th);
            m17985a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new DoFinallyObserver(completableObserver);
        throw null;
    }
}
