package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCreate<T> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48622a;

        public CreateEmitter(Observer observer) {
            this.f48622a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return CreateEmitter.class.getSimpleName() + "{" + super.toString() + "}";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SerializedEmitter<T> extends AtomicInteger implements ObservableEmitter<T> {
        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.mo17593c(createEmitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            if (createEmitter.mo17596d()) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            try {
                createEmitter.f48622a.onError(th);
            } finally {
                DisposableHelper.m17615a(createEmitter);
            }
        }
    }
}
