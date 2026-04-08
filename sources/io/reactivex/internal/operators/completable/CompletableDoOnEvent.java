package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableDoOnEvent extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public final class DoOnEvent implements CompletableObserver {
        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                throw null;
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17612a(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        throw null;
    }
}
