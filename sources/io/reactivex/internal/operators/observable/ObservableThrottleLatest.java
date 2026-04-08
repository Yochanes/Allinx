package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class ObservableThrottleLatest<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public Disposable f48930a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48931b;

        /* JADX INFO: renamed from: c */
        public Throwable f48932c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f48933d;

        /* JADX INFO: renamed from: a */
        public final void m17831a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f48933d || !this.f48931b || this.f48932c != null) {
                throw null;
            }
            throw null;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48930a, disposable)) {
                this.f48930a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48933d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48933d = true;
            this.f48930a.dispose();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48931b = true;
            m17831a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48932c = th;
            this.f48931b = true;
            m17831a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m17831a();
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
