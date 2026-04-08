package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeDoOnLifecycle<T> extends AbstractMaybeWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybeLifecycleObserver<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50210a;

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50210a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
                this.f50210a.dispose();
                this.f50210a = DisposableHelper.f49380a;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            Disposable disposable = this.f50210a;
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                return;
            }
            this.f50210a = disposableHelper;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            Disposable disposable = this.f50210a;
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50210a = disposableHelper;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = this.f50210a;
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper) {
                return;
            }
            this.f50210a = disposableHelper;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        throw null;
    }
}
