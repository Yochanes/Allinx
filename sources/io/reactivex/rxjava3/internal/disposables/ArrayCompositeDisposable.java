package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    /* JADX INFO: renamed from: a */
    public final boolean m17951a(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = get(i);
            if (disposable2 == DisposableHelper.f49380a) {
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

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return get(0) == DisposableHelper.f49380a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Disposable andSet;
        Disposable disposable = get(0);
        DisposableHelper disposableHelper = DisposableHelper.f49380a;
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
