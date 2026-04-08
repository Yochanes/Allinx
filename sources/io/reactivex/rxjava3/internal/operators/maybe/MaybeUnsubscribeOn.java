package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeUnsubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50279a;

        /* JADX INFO: renamed from: b */
        public Disposable f50280b;

        public UnsubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.f50279a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f50279a.mo12364c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet == disposableHelper) {
                return;
            }
            this.f50280b = andSet;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50279a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50279a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50279a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f50280b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new UnsubscribeOnMaybeObserver(maybeObserver);
        throw null;
    }
}
