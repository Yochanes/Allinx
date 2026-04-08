package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelayWithSingle<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherObserver<T, U> extends AtomicReference<Disposable> implements SingleObserver<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49054a;

        public OtherObserver(SingleObserver singleObserver) {
            this.f49054a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f49054a.mo17602c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49054a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new OtherObserver(singleObserver);
        throw null;
    }
}
