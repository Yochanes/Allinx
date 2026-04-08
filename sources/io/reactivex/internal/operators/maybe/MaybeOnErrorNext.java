package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeOnErrorNext<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48366a;

        /* JADX INFO: compiled from: Proguard */
        public static final class NextMaybeObserver<T> implements MaybeObserver<T> {
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

        public OnErrorNextMaybeObserver(MaybeObserver maybeObserver) {
            this.f48366a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f48366a.mo17586c(this);
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
            this.f48366a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            boolean z2 = th instanceof Exception;
            MaybeObserver maybeObserver = this.f48366a;
            if (!z2) {
                maybeObserver.onError(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                maybeObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48366a.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new OnErrorNextMaybeObserver(maybeObserver));
    }
}
