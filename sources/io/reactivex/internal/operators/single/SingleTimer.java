package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleTimer extends Single<Long> {

    /* JADX INFO: compiled from: Proguard */
    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49098a;

        public TimerDisposable(SingleObserver singleObserver) {
            this.f49098a = singleObserver;
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

        @Override // java.lang.Runnable
        public final void run() {
            this.f49098a.onSuccess(0L);
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new TimerDisposable(singleObserver));
        throw null;
    }
}
