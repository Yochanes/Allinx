package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleTimeout<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeoutMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51061a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f51062b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final TimeoutFallbackObserver f51063c = null;

        /* JADX INFO: compiled from: Proguard */
        public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            @Override // io.reactivex.rxjava3.core.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo12366c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public TimeoutMainObserver(SingleObserver singleObserver) {
            this.f51061a = singleObserver;
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
            DisposableHelper.m17952a(this.f51062b);
            TimeoutFallbackObserver timeoutFallbackObserver = this.f51063c;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.m17952a(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                RxJavaPlugins.m18275b(th);
            } else {
                DisposableHelper.m17952a(this.f51062b);
                this.f51061a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            DisposableHelper.m17952a(this.f51062b);
            this.f51061a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            this.f51061a.onError(new TimeoutException(ExceptionHelper.m18250e(0L, null)));
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new TimeoutMainObserver(singleObserver));
        throw null;
    }
}
