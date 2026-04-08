package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DisposableObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f49290a = new AtomicReference();

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        EndConsumerHelper.m17885b(this.f49290a, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f49290a.get() == DisposableHelper.f47552a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(this.f49290a);
    }
}
