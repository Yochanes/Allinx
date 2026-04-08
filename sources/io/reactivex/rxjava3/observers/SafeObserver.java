package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Disposable f51240a;

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17956f(this.f51240a, disposable)) {
            this.f51240a = disposable;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                try {
                    disposable.dispose();
                    RxJavaPlugins.m18275b(th);
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                    RxJavaPlugins.m18275b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f51240a.mo12353d();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f51240a.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        RxJavaPlugins.m18275b(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
    }
}
