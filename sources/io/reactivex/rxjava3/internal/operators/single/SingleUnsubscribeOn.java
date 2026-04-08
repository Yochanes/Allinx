package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleUnsubscribeOn<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51068a;

        /* JADX INFO: renamed from: b */
        public Disposable f51069b;

        public UnsubscribeOnSingleObserver(SingleObserver singleObserver) {
            this.f51068a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f51068a.mo12366c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet == disposableHelper) {
                return;
            }
            this.f51069b = andSet;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51068a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f51068a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f51069b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        new UnsubscribeOnSingleObserver(singleObserver);
        throw null;
    }
}
