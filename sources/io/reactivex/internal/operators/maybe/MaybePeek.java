package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48369a;

        /* JADX INFO: renamed from: b */
        public DisposableHelper f48370b;

        public MaybePeekObserver(MaybeObserver maybeObserver, MaybePeek maybePeek) {
            this.f48369a = maybeObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17763a(Throwable th) {
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                    Exceptions.m17612a(th2);
                    RxJavaPlugins.m17911b(th2);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48370b, disposable)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    disposable.dispose();
                    this.f48370b = DisposableHelper.f47552a;
                    EmptyDisposable.m17623c(th, this.f48369a);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            this.f48370b.getClass();
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
                this.f48370b.getClass();
                this.f48370b = DisposableHelper.f47552a;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f48370b == DisposableHelper.f47552a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                m17763a(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            if (this.f48370b == DisposableHelper.f47552a) {
                RxJavaPlugins.m17911b(th);
            } else {
                m17763a(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            if (this.f48370b == DisposableHelper.f47552a) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                m17763a(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        this.f48278a.mo17584a(new MaybePeekObserver(maybeObserver, this));
    }
}
