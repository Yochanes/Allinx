package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        Future<?> future = get();
        return future == null || future.isDone();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }
}
