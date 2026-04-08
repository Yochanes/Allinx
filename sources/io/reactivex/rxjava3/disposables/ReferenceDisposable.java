package io.reactivex.rxjava3.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    /* JADX INFO: renamed from: a */
    public abstract void mo17941a(Object obj);

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return get() == null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo17941a(andSet);
    }
}
