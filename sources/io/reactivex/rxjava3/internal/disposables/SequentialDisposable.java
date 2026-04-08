package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return DisposableHelper.m17953b(get());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17952a(this);
    }
}
