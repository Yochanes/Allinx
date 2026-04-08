package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50247a;

        /* JADX INFO: renamed from: b */
        public Object f50248b;

        /* JADX INFO: renamed from: c */
        public Throwable f50249c;

        public ObserveOnMaybeObserver(MaybeObserver maybeObserver) {
            this.f50247a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f50247a.mo12364c(this);
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
            this.f50249c = th;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50248b = obj;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f50249c;
            MaybeObserver maybeObserver = this.f50247a;
            if (th != null) {
                this.f50249c = null;
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.f50248b;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                this.f50248b = null;
                maybeObserver.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new ObserveOnMaybeObserver(maybeObserver);
        throw null;
    }
}
