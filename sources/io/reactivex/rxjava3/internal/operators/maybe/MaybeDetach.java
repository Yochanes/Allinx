package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDetach<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50205a;

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50205a, disposable)) {
                this.f50205a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50205a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50205a.dispose();
            this.f50205a = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50205a = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50205a = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50205a = DisposableHelper.f49380a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        throw null;
    }
}
