package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeOnErrorNext<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50251a;

        /* JADX INFO: compiled from: Proguard */
        public static final class NextMaybeObserver<T> implements MaybeObserver<T> {
            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17955e(null, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public OnErrorNextMaybeObserver(MaybeObserver maybeObserver) {
            this.f50251a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f50251a.mo12364c(this);
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
            this.f50251a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                this.f50251a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50251a.onSuccess(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new OnErrorNextMaybeObserver(maybeObserver);
        throw null;
    }
}
