package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableGenerate<T, S> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class GeneratorDisposable<T, S> implements Emitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public volatile boolean f50636a;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50636a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50636a = true;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptyDisposable.m17960f(th, observer);
        }
    }
}
