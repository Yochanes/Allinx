package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDetach<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DetachMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public MaybeObserver f48308a;

        /* JADX INFO: renamed from: b */
        public Disposable f48309b;

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48309b, disposable)) {
                this.f48309b = disposable;
                this.f48308a.mo17586c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48309b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48308a = null;
            this.f48309b.dispose();
            this.f48309b = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48309b = DisposableHelper.f47552a;
            MaybeObserver maybeObserver = this.f48308a;
            if (maybeObserver != null) {
                this.f48308a = null;
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48309b = DisposableHelper.f47552a;
            MaybeObserver maybeObserver = this.f48308a;
            if (maybeObserver != null) {
                this.f48308a = null;
                maybeObserver.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48309b = DisposableHelper.f47552a;
            MaybeObserver maybeObserver = this.f48308a;
            if (maybeObserver != null) {
                this.f48308a = null;
                maybeObserver.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        DetachMaybeObserver detachMaybeObserver = new DetachMaybeObserver();
        detachMaybeObserver.f48308a = maybeObserver;
        this.f48278a.mo17584a(detachMaybeObserver);
    }
}
