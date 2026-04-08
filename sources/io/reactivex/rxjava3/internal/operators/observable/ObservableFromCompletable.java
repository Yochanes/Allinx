package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromCompletable<T> extends Observable<T> implements HasUpstreamCompletableSource {

    /* JADX INFO: compiled from: Proguard */
    public static final class FromCompletableObserver<T> extends AbstractEmptyQueueFuseable<T> implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public Disposable f50627a;

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50627a, disposable)) {
                this.f50627a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50627a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50627a.dispose();
            this.f50627a = DisposableHelper.f49380a;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f50627a = DisposableHelper.f49380a;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f50627a = DisposableHelper.f49380a;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
