package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleSubscribeOn<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51055a;

        /* JADX INFO: renamed from: b */
        public final SequentialDisposable f51056b = new SequentialDisposable();

        public SubscribeOnObserver(SingleObserver singleObserver) {
            this.f51055a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
            SequentialDisposable sequentialDisposable = this.f51056b;
            sequentialDisposable.getClass();
            DisposableHelper.m17952a(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51055a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f51055a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new SubscribeOnObserver(singleObserver));
        throw null;
    }
}
