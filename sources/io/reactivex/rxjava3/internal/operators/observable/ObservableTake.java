package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public boolean f50864a;

        /* JADX INFO: renamed from: b */
        public Disposable f50865b;

        /* JADX INFO: renamed from: c */
        public long f50866c;

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50865b, disposable)) {
                this.f50865b = disposable;
                if (this.f50866c != 0) {
                    throw null;
                }
                this.f50864a = true;
                disposable.dispose();
                EmptyDisposable.m17957a(null);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50865b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50865b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50864a) {
                return;
            }
            this.f50864a = true;
            this.f50865b.dispose();
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50864a) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50864a = true;
                this.f50865b.dispose();
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50864a) {
                return;
            }
            long j = this.f50866c;
            this.f50866c = j - 1;
            if (j > 0) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
