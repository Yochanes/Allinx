package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMap<T, R> extends Single<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49062a;

        /* JADX INFO: compiled from: Proguard */
        public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {
            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17617c(null, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public SingleFlatMapCallback(SingleObserver singleObserver) {
            this.f49062a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f49062a.mo17602c(this);
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
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49062a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f49062a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new SingleFlatMapCallback(singleObserver);
        throw null;
    }
}
