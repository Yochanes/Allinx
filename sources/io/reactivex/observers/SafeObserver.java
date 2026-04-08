package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SafeObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public Disposable f49291a;

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (DisposableHelper.m17620h(this.f49291a, disposable)) {
            this.f49291a = disposable;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                try {
                    disposable.dispose();
                    RxJavaPlugins.m17911b(th);
                } catch (Throwable th2) {
                    Exceptions.m17612a(th2);
                    RxJavaPlugins.m17911b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f49291a.mo17596d();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f49291a.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        RxJavaPlugins.m17911b(th);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
    }
}
