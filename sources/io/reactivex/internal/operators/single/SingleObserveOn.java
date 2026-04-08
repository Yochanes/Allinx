package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleObserveOn<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49086a;

        /* JADX INFO: renamed from: b */
        public Object f49087b;

        /* JADX INFO: renamed from: c */
        public Throwable f49088c;

        public ObserveOnSingleObserver(SingleObserver singleObserver) {
            this.f49086a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f49086a.mo17602c(this);
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
            this.f49088c = th;
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49087b = obj;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f49088c;
            SingleObserver singleObserver = this.f49086a;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.f49087b);
            }
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new ObserveOnSingleObserver(singleObserver);
        throw null;
    }
}
