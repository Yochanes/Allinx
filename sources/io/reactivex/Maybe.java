package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    @Override // io.reactivex.MaybeSource
    /* JADX INFO: renamed from: a */
    public final void mo17584a(MaybeObserver maybeObserver) {
        ObjectHelper.m17628b(maybeObserver, "observer is null");
        try {
            mo17585b(maybeObserver);
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
    public abstract void mo17585b(MaybeObserver maybeObserver);
}
