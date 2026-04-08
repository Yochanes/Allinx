package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleHide<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class HideSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f51048a;

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f51048a, disposable)) {
                this.f51048a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51048a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f51048a.dispose();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        throw null;
    }
}
