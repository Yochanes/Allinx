package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlatMapNotification<T, R> extends AbstractMaybeWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48337a;

        /* JADX INFO: renamed from: b */
        public Disposable f48338b;

        /* JADX INFO: compiled from: Proguard */
        public final class InnerObserver implements MaybeObserver<R> {
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

        public FlatMapMaybeObserver(MaybeObserver maybeObserver) {
            this.f48337a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48338b, disposable)) {
                this.f48338b = disposable;
                this.f48337a.mo17586c(this);
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
            this.f48338b.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            try {
                throw null;
            } catch (Exception e) {
                Exceptions.m17612a(e);
                this.f48337a.onError(e);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Exception e) {
                Exceptions.m17612a(e);
                this.f48337a.onError(new CompositeException(th, e));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Exception e) {
                Exceptions.m17612a(e);
                this.f48337a.onError(e);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new FlatMapMaybeObserver(maybeObserver));
    }
}
