package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableThrottleLatest<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public Disposable f50892a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f50893b;

        /* JADX INFO: renamed from: c */
        public Throwable f50894c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f50895d;

        /* JADX INFO: renamed from: a */
        public final void m18186a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f50895d || !this.f50893b || this.f50894c != null) {
                throw null;
            }
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50892a, disposable)) {
                this.f50892a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50895d;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50895d = true;
            this.f50892a.dispose();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50893b = true;
            m18186a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50894c = th;
            this.f50893b = true;
            m18186a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m18186a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
