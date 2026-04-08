package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleUsing<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class UsingSingleObserver<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f49105a;

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49105a, disposable)) {
                this.f49105a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49105a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f49105a.dispose();
            this.f49105a = DisposableHelper.f47552a;
            if (getAndSet(this) == this) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                RxJavaPlugins.m17911b(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49105a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49105a = DisposableHelper.f47552a;
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17625h(th, singleObserver);
        }
    }
}
