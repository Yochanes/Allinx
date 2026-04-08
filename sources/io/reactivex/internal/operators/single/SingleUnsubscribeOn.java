package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49103a;

        /* JADX INFO: renamed from: b */
        public Disposable f49104b;

        public UnsubscribeOnSingleObserver(SingleObserver singleObserver) {
            this.f49103a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f49103a.mo17602c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet == disposableHelper) {
                return;
            }
            this.f49104b = andSet;
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49103a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49103a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f49104b.dispose();
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new UnsubscribeOnSingleObserver(singleObserver);
        throw null;
    }
}
