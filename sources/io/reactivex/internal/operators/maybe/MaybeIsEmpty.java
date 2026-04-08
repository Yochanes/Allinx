package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeIsEmpty<T> extends AbstractMaybeWithUpstream<T, Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48350a;

        /* JADX INFO: renamed from: b */
        public Disposable f48351b;

        public IsEmptyMaybeObserver(MaybeObserver maybeObserver) {
            this.f48350a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48351b, disposable)) {
                this.f48351b = disposable;
                this.f48350a.mo17586c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48351b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48351b.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48350a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48350a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48350a.onSuccess(Boolean.FALSE);
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new IsEmptyMaybeObserver(maybeObserver));
    }
}
