package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class SingleDoFinally<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoFinallyObserver<T> extends AtomicInteger implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49058a;

        /* JADX INFO: renamed from: b */
        public Disposable f49059b;

        public DoFinallyObserver(SingleObserver singleObserver) {
            this.f49058a = singleObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17843a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    RxJavaPlugins.m17911b(th);
                }
            }
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f49059b, disposable)) {
                this.f49059b = disposable;
                this.f49058a.mo17602c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f49059b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f49059b.dispose();
            m17843a();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49058a.onError(th);
            m17843a();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49058a.onSuccess(obj);
            m17843a();
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new DoFinallyObserver(singleObserver);
        throw null;
    }
}
