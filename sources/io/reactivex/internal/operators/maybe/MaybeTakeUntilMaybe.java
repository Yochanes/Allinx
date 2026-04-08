package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeTakeUntilMaybe<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48375a;

        /* JADX INFO: renamed from: b */
        public final TakeUntilOtherMaybeObserver f48376b = new TakeUntilOtherMaybeObserver(this);

        /* JADX INFO: compiled from: Proguard */
        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: a */
            public final TakeUntilMainMaybeObserver f48377a;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver takeUntilMainMaybeObserver) {
                this.f48377a = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f48377a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17615a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f48375a.onComplete();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f48377a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17615a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f48375a.onError(th);
                } else {
                    RxJavaPlugins.m17911b(th);
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f48377a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17615a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f48375a.onComplete();
                }
            }
        }

        public TakeUntilMainMaybeObserver(MaybeObserver maybeObserver) {
            this.f48375a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
            DisposableHelper.m17615a(this.f48376b);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.m17615a(this.f48376b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48375a.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f48376b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48375a.onError(th);
            } else {
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            DisposableHelper.m17615a(this.f48376b);
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f48375a.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(new TakeUntilMainMaybeObserver(maybeObserver));
        throw null;
    }
}
