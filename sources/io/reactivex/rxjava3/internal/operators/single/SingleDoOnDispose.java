package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDoOnDispose<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoOnDisposeObserver<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51020a;

        /* JADX INFO: renamed from: b */
        public Disposable f51021b;

        public DoOnDisposeObserver(SingleObserver singleObserver) {
            this.f51020a = singleObserver;
            lazySet(null);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f51021b, disposable)) {
                this.f51021b = disposable;
                this.f51020a.mo12366c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51021b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Action andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
                this.f51021b.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51020a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f51020a.onSuccess(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        new DoOnDisposeObserver(singleObserver);
        throw null;
    }
}
