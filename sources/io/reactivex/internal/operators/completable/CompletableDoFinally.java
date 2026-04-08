package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class CompletableDoFinally extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47611a;

        /* JADX INFO: renamed from: b */
        public Disposable f47612b;

        public DoFinallyObserver(CompletableObserver completableObserver) {
            this.f47611a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17645a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    RxJavaPlugins.m17911b(th);
                }
            }
        }

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f47612b, disposable)) {
                this.f47612b = disposable;
                this.f47611a.mo17580c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47612b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47612b.dispose();
            m17645a();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f47611a.onComplete();
            m17645a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f47611a.onError(th);
            m17645a();
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new DoFinallyObserver(completableObserver);
        throw null;
    }
}
