package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleTimer extends Single<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51064a;

        public TimerDisposable(SingleObserver singleObserver) {
            this.f51064a = singleObserver;
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

        @Override // java.lang.Runnable
        public final void run() {
            this.f51064a.onSuccess(0L);
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new TimerDisposable(singleObserver));
        throw null;
    }
}
