package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50516a;

        /* JADX INFO: renamed from: b */
        public boolean f50517b;

        public ConcatWithObserver(Observer observer) {
            this.f50516a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (!DisposableHelper.m17955e(this, disposable) || this.f50517b) {
                return;
            }
            this.f50516a.mo12365c(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50517b) {
                this.f50516a.onComplete();
            } else {
                this.f50517b = true;
                DisposableHelper.m17954c(this, null);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50516a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50516a.onNext(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new ConcatWithObserver(observer));
    }
}
