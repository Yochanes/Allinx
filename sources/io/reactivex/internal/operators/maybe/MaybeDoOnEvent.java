package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDoOnEvent<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoOnEventMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48314a;

        /* JADX INFO: renamed from: b */
        public Disposable f48315b;

        public DoOnEventMaybeObserver(MaybeObserver maybeObserver) {
            this.f48314a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48315b, disposable)) {
                this.f48315b = disposable;
                this.f48314a.mo17586c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48315b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48315b.dispose();
            this.f48315b = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48315b = DisposableHelper.f47552a;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48314a.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48315b = DisposableHelper.f47552a;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                this.f48314a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48315b = DisposableHelper.f47552a;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48314a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new DoOnEventMaybeObserver(maybeObserver));
    }
}
