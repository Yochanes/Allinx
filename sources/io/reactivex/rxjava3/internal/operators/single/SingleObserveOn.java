package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleObserveOn<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51051a;

        /* JADX INFO: renamed from: b */
        public Object f51052b;

        /* JADX INFO: renamed from: c */
        public Throwable f51053c;

        public ObserveOnSingleObserver(SingleObserver singleObserver) {
            this.f51051a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo12366c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f51051a.mo12366c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f51053c = th;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f51052b = obj;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f51053c;
            SingleObserver singleObserver = this.f51051a;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.f51052b);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        new ObserveOnSingleObserver(singleObserver);
        throw null;
    }
}
