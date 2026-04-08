package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamSingleSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFromSingle<T> extends Maybe<T> implements HasUpstreamSingleSource<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FromSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48344a;

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48344a, disposable)) {
                this.f48344a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48344a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48344a.dispose();
            this.f48344a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f48344a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f48344a = DisposableHelper.f47552a;
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
