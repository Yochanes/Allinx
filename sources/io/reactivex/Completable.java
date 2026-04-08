package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Completable implements CompletableSource {
    @Override // io.reactivex.CompletableSource
    /* JADX INFO: renamed from: a */
    public final void mo17578a(CompletableObserver completableObserver) {
        ObjectHelper.m17628b(completableObserver, "s is null");
        try {
            mo17579b(completableObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo17579b(CompletableObserver completableObserver);
}
