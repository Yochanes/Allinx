package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDebounceTimed<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final Object f50534a;

        /* JADX INFO: renamed from: b */
        public final long f50535b;

        /* JADX INFO: renamed from: c */
        public final DebounceTimedObserver f50536c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f50537d = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedObserver debounceTimedObserver) {
            this.f50534a = obj;
            this.f50535b = j;
            this.f50536c = debounceTimedObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f50537d.compareAndSet(false, true)) {
                if (this.f50535b == this.f50536c.f50540c) {
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceTimedObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f50538a;

        /* JADX INFO: renamed from: b */
        public Disposable f50539b;

        /* JADX INFO: renamed from: c */
        public volatile long f50540c;

        /* JADX INFO: renamed from: d */
        public boolean f50541d;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50538a, disposable)) {
                this.f50538a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50538a.dispose();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50541d) {
                return;
            }
            this.f50541d = true;
            Disposable disposable = this.f50539b;
            if (disposable != null) {
                DisposableHelper.m17952a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50541d) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            Disposable disposable = this.f50539b;
            if (disposable != null) {
                DisposableHelper.m17952a((DebounceEmitter) disposable);
            }
            this.f50541d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50541d) {
                return;
            }
            long j = this.f50540c + 1;
            this.f50540c = j;
            Disposable disposable = this.f50539b;
            if (disposable != null) {
                DisposableHelper.m17952a((DebounceEmitter) disposable);
            }
            this.f50539b = new DebounceEmitter(obj, j, this);
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
