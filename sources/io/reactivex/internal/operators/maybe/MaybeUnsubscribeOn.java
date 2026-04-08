package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeUnsubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48395a;

        /* JADX INFO: renamed from: b */
        public Disposable f48396b;

        public UnsubscribeOnMaybeObserver(MaybeObserver maybeObserver) {
            this.f48395a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f48395a.mo17586c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            Disposable andSet = getAndSet(disposableHelper);
            if (andSet == disposableHelper) {
                return;
            }
            this.f48396b = andSet;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48395a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48395a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48395a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48396b.dispose();
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new UnsubscribeOnMaybeObserver(maybeObserver));
    }
}
