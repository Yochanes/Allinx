package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapBiSelector<T, U, R> extends Single<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapBiMainObserver<T, U, R> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final InnerObserver f51024a;

        /* JADX INFO: compiled from: Proguard */
        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements SingleObserver<U> {

            /* JADX INFO: renamed from: a */
            public final SingleObserver f51025a;

            /* JADX INFO: renamed from: b */
            public Object f51026b;

            public InnerObserver(SingleObserver singleObserver) {
                this.f51025a = singleObserver;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                this.f51025a.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f51026b = null;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    this.f51025a.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(SingleObserver singleObserver) {
            this.f51024a = new InnerObserver(singleObserver);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            InnerObserver innerObserver = this.f51024a;
            if (DisposableHelper.m17955e(innerObserver, disposable)) {
                innerObserver.f51025a.mo12366c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(this.f51024a.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f51024a);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51024a.f51025a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f51024a.f51025a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        new FlatMapBiMainObserver(singleObserver);
        throw null;
    }
}
