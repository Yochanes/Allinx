package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CancellableDisposable extends AtomicReference<Cancellable> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get() == null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Cancellable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            Exceptions.m17612a(e);
            RxJavaPlugins.m17911b(e);
        }
    }
}
