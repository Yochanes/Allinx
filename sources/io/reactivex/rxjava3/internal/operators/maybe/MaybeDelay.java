package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDelay<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50192a;

        /* JADX INFO: renamed from: b */
        public Object f50193b;

        /* JADX INFO: renamed from: c */
        public Throwable f50194c;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.f50192a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f50192a.mo12364c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50194c = th;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50193b = obj;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f50194c;
            MaybeObserver maybeObserver = this.f50192a;
            if (th != null) {
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.f50193b;
            if (obj != null) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new DelayMaybeObserver(maybeObserver);
        throw null;
    }
}
