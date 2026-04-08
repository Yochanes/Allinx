package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDoOnDispose<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoOnDisposeObserver<T> extends AtomicReference<Action> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49060a;

        /* JADX INFO: renamed from: b */
        public Disposable f49061b;

        public DoOnDisposeObserver(SingleObserver singleObserver) {
            this.f49060a = singleObserver;
            lazySet(null);
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49061b, disposable)) {
                this.f49061b = disposable;
                this.f49060a.mo17602c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49061b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Action andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    RxJavaPlugins.m17911b(th);
                }
                this.f49061b.dispose();
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49060a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49060a.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new DoOnDisposeObserver(singleObserver);
        throw null;
    }
}
