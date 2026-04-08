package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleTimeout<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49095a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f49096b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final TimeoutFallbackObserver f49097c = null;

        /* JADX INFO: compiled from: Proguard */
        public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
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

        public TimeoutMainObserver(SingleObserver singleObserver) {
            this.f49095a = singleObserver;
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
            DisposableHelper.m17615a(this.f49096b);
            TimeoutFallbackObserver timeoutFallbackObserver = this.f49097c;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.m17615a(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                RxJavaPlugins.m17911b(th);
            } else {
                DisposableHelper.m17615a(this.f49096b);
                this.f49095a.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            DisposableHelper.m17615a(this.f49096b);
            this.f49095a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            this.f49095a.onError(new TimeoutException());
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new TimeoutMainObserver(singleObserver));
        throw null;
    }
}
