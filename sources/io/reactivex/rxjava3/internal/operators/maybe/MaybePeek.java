package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public DisposableHelper f50253a;

        /* JADX INFO: renamed from: a */
        public final void m18110a(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                new CompositeException(th, th2);
                this.f50253a = DisposableHelper.f49380a;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50253a, disposable)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    disposable.dispose();
                    this.f50253a = DisposableHelper.f49380a;
                    throw null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            this.f50253a.getClass();
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
                this.f50253a.getClass();
                this.f50253a = DisposableHelper.f49380a;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            if (this.f50253a == DisposableHelper.f49380a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                m18110a(th);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            if (this.f50253a == DisposableHelper.f49380a) {
                RxJavaPlugins.m18275b(th);
            } else {
                m18110a(th);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            if (this.f50253a == DisposableHelper.f49380a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                m18110a(th);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        throw null;
    }
}
