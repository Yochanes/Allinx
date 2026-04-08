package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableToObservable<T> extends Observable<T> {
    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverCompletableObserver extends BasicQueueDisposable<Void> implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public Disposable f47626a;

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f47626a, disposable)) {
                this.f47626a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f47626a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f47626a.dispose();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }
    }
}
