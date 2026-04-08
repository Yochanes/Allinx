package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeIsEmptySingle<T> extends Single<Boolean> implements HasUpstreamMaybeSource<T>, FuseToMaybe<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48352a;

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48352a, disposable)) {
                this.f48352a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48352a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48352a.dispose();
            this.f48352a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48352a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48352a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48352a = DisposableHelper.f47552a;
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        throw null;
    }
}
