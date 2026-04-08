package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends AbstractMaybeWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapBiMainObserver<T, U, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final InnerObserver f50218a;

        /* JADX INFO: compiled from: Proguard */
        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: a */
            public final MaybeObserver f50219a;

            /* JADX INFO: renamed from: b */
            public Object f50220b;

            public InnerObserver(MaybeObserver maybeObserver) {
                this.f50219a = maybeObserver;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo12364c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                this.f50219a.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                this.f50219a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver
            public final void onSuccess(Object obj) {
                this.f50220b = null;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    this.f50219a.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(MaybeObserver maybeObserver) {
            this.f50218a = new InnerObserver(maybeObserver);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            InnerObserver innerObserver = this.f50218a;
            if (DisposableHelper.m17955e(innerObserver, disposable)) {
                innerObserver.f50219a.mo12364c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(this.f50218a.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f50218a);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50218a.f50219a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50218a.f50219a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50218a.f50219a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new FlatMapBiMainObserver(maybeObserver);
        throw null;
    }
}
