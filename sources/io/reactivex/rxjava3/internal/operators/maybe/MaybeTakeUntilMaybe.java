package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeTakeUntilMaybe<T, U> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50258a;

        /* JADX INFO: renamed from: b */
        public final TakeUntilOtherMaybeObserver f50259b = new TakeUntilOtherMaybeObserver(this);

        /* JADX INFO: compiled from: Proguard */
        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: a */
            public final TakeUntilMainMaybeObserver f50260a;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver takeUntilMainMaybeObserver) {
                this.f50260a = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f50260a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17952a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f50258a.onComplete();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f50260a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17952a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f50258a.onError(th);
                } else {
                    RxJavaPlugins.m18275b(th);
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.f50260a;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.m17952a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.f50258a.onComplete();
                }
            }
        }

        public TakeUntilMainMaybeObserver(MaybeObserver maybeObserver) {
            this.f50258a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
            DisposableHelper.m17952a(this.f50259b);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            DisposableHelper.m17952a(this.f50259b);
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f50258a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f50259b);
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f50258a.onError(th);
            } else {
                RxJavaPlugins.m18275b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            DisposableHelper.m17952a(this.f50259b);
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f50258a.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        maybeObserver.mo12364c(new TakeUntilMainMaybeObserver(maybeObserver));
        throw null;
    }
}
