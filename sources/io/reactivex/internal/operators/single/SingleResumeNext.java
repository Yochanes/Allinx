package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleResumeNext<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49089a;

        public ResumeMainSingleObserver(SingleObserver singleObserver) {
            this.f49089a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f49089a.mo17602c(this);
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
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                this.f49089a.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f49089a.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new ResumeMainSingleObserver(singleObserver);
        throw null;
    }
}
