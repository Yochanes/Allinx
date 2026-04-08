package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultObserver<T> implements Observer<T> {

    /* JADX INFO: renamed from: a */
    public Disposable f51237a;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        Disposable disposable2 = this.f51237a;
        Class<?> cls = getClass();
        Objects.requireNonNull(disposable, "next is null");
        if (disposable2 == null) {
            this.f51237a = disposable;
            return;
        }
        disposable.dispose();
        if (disposable2 != DisposableHelper.f49380a) {
            EndConsumerHelper.m18243a(cls);
        }
    }
}
