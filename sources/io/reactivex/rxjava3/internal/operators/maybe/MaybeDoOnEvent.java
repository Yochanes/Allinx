package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDoOnEvent<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoOnEventMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50209a;

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50209a, disposable)) {
                this.f50209a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50209a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50209a.dispose();
            this.f50209a = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f50209a = DisposableHelper.f49380a;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        throw null;
    }
}
