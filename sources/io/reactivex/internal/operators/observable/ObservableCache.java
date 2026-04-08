package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.LinkedArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48579a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f48580b;

        public ReplayDisposable(Observer observer) {
            this.f48579a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48580b;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48580b) {
                return;
            }
            this.f48580b = true;
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new ReplayDisposable(observer));
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheState<T> extends LinkedArrayList implements Observer<T> {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
        }
    }
}
