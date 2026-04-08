package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCreate<T> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50527a;

        public CreateEmitter(Observer observer) {
            this.f50527a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
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

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.mo12365c(createEmitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            if (createEmitter.mo12353d()) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            try {
                createEmitter.f50527a.onError(th);
            } finally {
                DisposableHelper.m17952a(createEmitter);
            }
        }
    }
}
