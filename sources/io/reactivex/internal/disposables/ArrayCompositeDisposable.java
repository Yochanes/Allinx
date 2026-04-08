package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    /* JADX INFO: renamed from: a */
    public final boolean m17614a(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = get(i);
            if (disposable2 == DisposableHelper.f47552a) {
                disposable.dispose();
                return false;
            }
        } while (!compareAndSet(i, disposable2, disposable));
        if (disposable2 == null) {
            return true;
        }
        disposable2.dispose();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return get(0) == DisposableHelper.f47552a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Disposable andSet;
        Disposable disposable = get(0);
        DisposableHelper disposableHelper = DisposableHelper.f47552a;
        if (disposable != disposableHelper) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != disposableHelper && (andSet = getAndSet(i, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
