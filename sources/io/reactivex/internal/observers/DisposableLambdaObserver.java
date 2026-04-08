package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Disposable f47578a;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            disposable.dispose();
            this.f47578a = DisposableHelper.f47552a;
            EmptyDisposable.m17624f(th, null);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f47578a.mo17596d();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
            this.f47578a.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f47578a != DisposableHelper.f47552a) {
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f47578a != DisposableHelper.f47552a) {
            throw null;
        }
        RxJavaPlugins.m17911b(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        throw null;
    }
}
