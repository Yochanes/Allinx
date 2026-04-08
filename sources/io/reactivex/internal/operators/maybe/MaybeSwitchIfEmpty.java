package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSwitchIfEmpty<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48373a;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherMaybeObserver<T> implements MaybeObserver<T> {
            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17619f(null, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public SwitchIfEmptyMaybeObserver(MaybeObserver maybeObserver) {
            this.f48373a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f48373a.mo17586c(this);
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

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            Disposable disposable = get();
            if (disposable != DisposableHelper.f47552a && compareAndSet(disposable, null)) {
                throw null;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48373a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48373a.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new SwitchIfEmptyMaybeObserver(maybeObserver));
    }
}
