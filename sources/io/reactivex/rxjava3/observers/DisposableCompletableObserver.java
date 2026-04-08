package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DisposableCompletableObserver implements CompletableObserver, Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f51238a = new AtomicReference();

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo12363c(Disposable disposable) {
        EndConsumerHelper.m18244b(this.f51238a, disposable, getClass());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f51238a.get() == DisposableHelper.f49380a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17952a(this.f51238a);
    }
}
