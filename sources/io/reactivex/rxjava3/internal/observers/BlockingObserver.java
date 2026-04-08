package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public static final Object f49478a = null;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        DisposableHelper.m17955e(this, disposable);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return get() == DisposableHelper.f49380a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (DisposableHelper.m17952a(this)) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        throw null;
    }
}
