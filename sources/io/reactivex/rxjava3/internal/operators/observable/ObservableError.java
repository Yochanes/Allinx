package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableError<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Supplier f50573a;

    public ObservableError(Supplier supplier) {
        this.f50573a = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        Object obj;
        try {
            obj = this.f50573a.get();
        } catch (Throwable th) {
            th = th;
            Exceptions.m17950a(th);
        }
        if (obj == null) {
            throw ExceptionHelper.m18247b("Supplier returned a null Throwable.");
        }
        Throwable th2 = ExceptionHelper.f51225a;
        th = (Throwable) obj;
        EmptyDisposable.m17960f(th, observer);
    }
}
