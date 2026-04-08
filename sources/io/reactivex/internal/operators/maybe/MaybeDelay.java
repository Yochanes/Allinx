package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDelay<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48295a;

        /* JADX INFO: renamed from: b */
        public Object f48296b;

        /* JADX INFO: renamed from: c */
        public Throwable f48297c;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.f48295a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f48295a.mo17586c(this);
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
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48297c = th;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48296b = obj;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f48297c;
            MaybeObserver maybeObserver = this.f48295a;
            if (th != null) {
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.f48296b;
            if (obj != null) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new DelayMaybeObserver(maybeObserver));
    }
}
