package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterializeSingleObserver<T> implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver, Disposable {

    /* JADX INFO: renamed from: a */
    public Disposable f50347a;

    @Override // io.reactivex.rxjava3.core.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo12366c(Disposable disposable) {
        if (DisposableHelper.m17956f(this.f50347a, disposable)) {
            this.f50347a = disposable;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f50347a.mo12353d();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f50347a.dispose();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        Notification.m17925a(th);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        throw null;
    }
}
