package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSwitchIfEmptySingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f48374a;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherSingleObserver<T> implements SingleObserver<T> {
            @Override // io.reactivex.SingleObserver
            /* JADX INFO: renamed from: c */
            public final void mo17602c(Disposable disposable) {
                DisposableHelper.m17619f(null, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public SwitchIfEmptyMaybeObserver(SingleObserver singleObserver) {
            this.f48374a = singleObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            if (DisposableHelper.m17619f(this, disposable)) {
                this.f48374a.mo17602c(this);
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

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            Disposable disposable = get();
            if (disposable != DisposableHelper.f47552a && compareAndSet(disposable, null)) {
                throw null;
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.f48374a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48374a.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        new SwitchIfEmptyMaybeObserver(singleObserver);
        throw null;
    }
}
