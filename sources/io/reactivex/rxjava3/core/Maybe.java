package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.exceptions.Exceptions;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    @Override // io.reactivex.rxjava3.core.MaybeSource
    /* JADX INFO: renamed from: a */
    public final void mo17924a(MaybeObserver maybeObserver) {
        Objects.requireNonNull(maybeObserver, "observer is null");
        try {
            mo12360b(maybeObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12360b(MaybeObserver maybeObserver);
}
