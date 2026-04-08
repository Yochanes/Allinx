package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableThrottleFirstTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceTimedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public Disposable f48927a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48928b;

        /* JADX INFO: renamed from: c */
        public boolean f48929c;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48927a, disposable)) {
                this.f48927a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48927a.dispose();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48929c) {
                return;
            }
            this.f48929c = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48929c) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48929c = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48928b || this.f48929c) {
                return;
            }
            this.f48928b = true;
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f48928b = false;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
