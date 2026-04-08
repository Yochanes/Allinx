package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return DisposableHelper.m17616b(get());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(this);
    }
}
