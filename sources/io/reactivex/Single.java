package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Single<T> implements SingleSource<T> {
    @Override // io.reactivex.SingleSource
    /* JADX INFO: renamed from: a */
    public final void mo17600a(SingleObserver singleObserver) {
        ObjectHelper.m17628b(singleObserver, "subscriber is null");
        try {
            mo17601b(singleObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo17601b(SingleObserver singleObserver);
}
