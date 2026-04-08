package io.reactivex.internal.operators.single;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlatMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49063a;

        public FlatMapCompletableObserver(CompletableObserver completableObserver) {
            this.f49063a = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* JADX INFO: renamed from: c */
        public final void mo17602c(Disposable disposable) {
            DisposableHelper.m17617c(this, disposable);
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

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f49063a.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f49063a.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        completableObserver.mo17580c(new FlatMapCompletableObserver(completableObserver));
        throw null;
    }
}
