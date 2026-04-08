package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Completable implements CompletableSource {
    @Override // io.reactivex.rxjava3.core.CompletableSource
    /* JADX INFO: renamed from: a */
    public final void mo12368a(CompletableObserver completableObserver) {
        Objects.requireNonNull(completableObserver, "observer is null");
        try {
            mo12357b(completableObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12357b(CompletableObserver completableObserver);
}
