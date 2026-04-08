package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    /* JADX INFO: renamed from: a */
    public abstract void mo17603a(Object obj);

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get() == null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo17603a(andSet);
    }
}
