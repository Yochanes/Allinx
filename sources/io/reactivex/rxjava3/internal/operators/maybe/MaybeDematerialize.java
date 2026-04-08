package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDematerialize<T, R> extends AbstractMaybeWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DematerializeObserver<T, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50204a;

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50204a, disposable)) {
                this.f50204a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50204a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50204a.dispose();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        throw null;
    }
}
