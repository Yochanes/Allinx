package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDoFinally<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyObserver<T> extends AtomicInteger implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f50207a;

        /* JADX INFO: renamed from: b */
        public Disposable f50208b;

        public DoFinallyObserver(MaybeObserver maybeObserver) {
            this.f50207a = maybeObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m18108a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50208b, disposable)) {
                this.f50208b = disposable;
                this.f50207a.mo12364c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50208b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50208b.dispose();
            m18108a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50207a.onComplete();
            m18108a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50207a.onError(th);
            m18108a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50207a.onSuccess(obj);
            m18108a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new DoFinallyObserver(maybeObserver);
        throw null;
    }
}
