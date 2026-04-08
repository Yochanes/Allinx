package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultObserver<T> implements Observer<T> {

    /* JADX INFO: renamed from: a */
    public Disposable f49289a;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        Disposable disposable2 = this.f49289a;
        Class<?> cls = getClass();
        ObjectHelper.m17628b(disposable, "next is null");
        if (disposable2 == null) {
            this.f49289a = disposable;
            return;
        }
        disposable.dispose();
        if (disposable2 != DisposableHelper.f47552a) {
            EndConsumerHelper.m17884a(cls);
        }
    }
}
