package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableLift<R, T> extends AbstractObservableWithUpstream<T, R> {
    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        try {
            throw null;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
