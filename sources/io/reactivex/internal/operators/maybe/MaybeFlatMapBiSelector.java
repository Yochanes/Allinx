package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends AbstractMaybeWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapBiMainObserver<T, U, R> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final InnerObserver f48324a;

        /* JADX INFO: compiled from: Proguard */
        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: a */
            public final MaybeObserver f48325a;

            /* JADX INFO: renamed from: b */
            public Object f48326b;

            public InnerObserver(MaybeObserver maybeObserver) {
                this.f48325a = maybeObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* JADX INFO: renamed from: c */
            public final void mo17586c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.f48325a.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                this.f48325a.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                this.f48326b = null;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    this.f48325a.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(MaybeObserver maybeObserver) {
            this.f48324a = new InnerObserver(maybeObserver);
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            InnerObserver innerObserver = this.f48324a;
            if (DisposableHelper.m17619f(innerObserver, disposable)) {
                innerObserver.f48325a.mo17586c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(this.f48324a.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f48324a);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48324a.f48325a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48324a.f48325a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48324a.f48325a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new FlatMapBiMainObserver(maybeObserver));
    }
}
