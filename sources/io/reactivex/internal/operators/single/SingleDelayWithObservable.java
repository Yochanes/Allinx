package io.reactivex.internal.operators.single;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleDelayWithObservable<T, U> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49049a;

        /* JADX INFO: renamed from: b */
        public boolean f49050b;

        public OtherSubscriber(SingleObserver singleObserver) {
            this.f49049a = singleObserver;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17618e(this, disposable)) {
                this.f49049a.mo17602c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f49050b) {
                return;
            }
            this.f49050b = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f49050b) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f49050b = true;
                this.f49049a.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            get().dispose();
            onComplete();
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new OtherSubscriber(singleObserver);
        throw null;
    }
}
