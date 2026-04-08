package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelayWithObservable<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51008a;

        /* JADX INFO: renamed from: b */
        public boolean f51009b;

        public OtherSubscriber(SingleObserver singleObserver) {
            this.f51008a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17955e(this, disposable)) {
                this.f51008a.mo12366c(this);
            }
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
            if (this.f51009b) {
                return;
            }
            this.f51009b = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f51009b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f51009b = true;
                this.f51008a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            get().dispose();
            onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        new OtherSubscriber(singleObserver);
        throw null;
    }
}
