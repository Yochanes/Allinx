package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableGenerate<T, S> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class GeneratorDisposable<T, S> implements Emitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public volatile boolean f48708a;

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48708a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48708a = true;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17624f(th, observer);
        }
    }
}
