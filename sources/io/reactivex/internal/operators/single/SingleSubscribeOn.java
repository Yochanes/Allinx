package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleSubscribeOn<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49090a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f49091b = new SequentialDisposable();

        public SubscribeOnObserver(SingleObserver singleObserver) {
            this.f49090a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
            SequentialDisposable sequentialDisposable = this.f49091b;
            sequentialDisposable.getClass();
            DisposableHelper.m17615a(sequentialDisposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49090a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49090a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new SubscribeOnObserver(singleObserver));
        throw null;
    }
}
