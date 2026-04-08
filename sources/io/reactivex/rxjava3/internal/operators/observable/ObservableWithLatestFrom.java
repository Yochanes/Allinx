package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableWithLatestFrom<T, U, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f50958a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50959b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50960c = new AtomicReference();

        public WithLatestFromObserver(SerializedObserver serializedObserver) {
            this.f50958a = serializedObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this.f50959b, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b((Disposable) this.f50959b.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f50959b);
            DisposableHelper.m17952a(this.f50960c);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            DisposableHelper.m17952a(this.f50960c);
            this.f50958a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f50960c);
            this.f50958a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (get() == null) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                dispose();
                this.f50958a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        serializedObserver.mo12365c(new WithLatestFromObserver(serializedObserver));
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public final class WithLatestFromOtherObserver implements Observer<U> {
        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
        }
    }
}
