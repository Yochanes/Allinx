package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableWithLatestFrom<T, U, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f49000a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f49001b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f49002c = new AtomicReference();

        public WithLatestFromObserver(SerializedObserver serializedObserver) {
            this.f49000a = serializedObserver;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this.f49001b, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b((Disposable) this.f49001b.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f49001b);
            DisposableHelper.m17615a(this.f49002c);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.m17615a(this.f49002c);
            this.f49000a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f49002c);
            this.f49000a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (get() == null) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                dispose();
                this.f49000a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        serializedObserver.mo17593c(new WithLatestFromObserver(serializedObserver));
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public final class WithLastFrom implements Observer<U> {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }
    }
}
