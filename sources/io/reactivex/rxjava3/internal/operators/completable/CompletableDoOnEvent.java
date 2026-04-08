package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableDoOnEvent extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public final class DoOnEvent implements CompletableObserver {
        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m17950a(th2);
                new CompositeException(th, th2);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        throw null;
    }
}
