package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class SingleDetach<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f49055a;

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49055a, disposable)) {
                this.f49055a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49055a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f49055a.dispose();
            this.f49055a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49055a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49055a = DisposableHelper.f47552a;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
