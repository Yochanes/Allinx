package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDebounceTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final Object f48629a;

        /* JADX INFO: renamed from: b */
        public final long f48630b;

        /* JADX INFO: renamed from: c */
        public final DebounceTimedObserver f48631c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f48632d = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedObserver debounceTimedObserver) {
            this.f48629a = obj;
            this.f48630b = j;
            this.f48631c = debounceTimedObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == DisposableHelper.f47552a;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f48632d.compareAndSet(false, true)) {
                if (this.f48630b == this.f48631c.f48635c) {
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceTimedObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48633a;

        /* JADX INFO: renamed from: b */
        public Disposable f48634b;

        /* JADX INFO: renamed from: c */
        public volatile long f48635c;

        /* JADX INFO: renamed from: d */
        public boolean f48636d;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48633a, disposable)) {
                this.f48633a = disposable;
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
            this.f48633a.dispose();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48636d) {
                return;
            }
            this.f48636d = true;
            Disposable disposable = this.f48634b;
            if (disposable != null) {
                DisposableHelper.m17615a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48636d) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            Disposable disposable = this.f48634b;
            if (disposable != null) {
                DisposableHelper.m17615a((DebounceEmitter) disposable);
            }
            this.f48636d = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48636d) {
                return;
            }
            long j = this.f48635c + 1;
            this.f48635c = j;
            Disposable disposable = this.f48634b;
            if (disposable != null) {
                DisposableHelper.m17615a((DebounceEmitter) disposable);
            }
            this.f48634b = new DebounceEmitter(obj, j, this);
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
