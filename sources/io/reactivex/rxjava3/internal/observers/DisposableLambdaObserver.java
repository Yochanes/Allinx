package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final Observer f49482a;

    /* JADX INFO: renamed from: b */
    public Disposable f49483b;

    public DisposableLambdaObserver(Observer observer) {
        this.f49482a = observer;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            disposable.dispose();
            this.f49483b = DisposableHelper.f49380a;
            EmptyDisposable.m17960f(th, this.f49482a);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f49483b.mo12353d();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Disposable disposable = this.f49483b;
        DisposableHelper disposableHelper = DisposableHelper.f49380a;
        if (disposable == disposableHelper) {
            return;
        }
        this.f49483b = disposableHelper;
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        Disposable disposable = this.f49483b;
        DisposableHelper disposableHelper = DisposableHelper.f49380a;
        if (disposable != disposableHelper) {
            this.f49483b = disposableHelper;
            this.f49482a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        Disposable disposable = this.f49483b;
        DisposableHelper disposableHelper = DisposableHelper.f49380a;
        if (disposable == disposableHelper) {
            RxJavaPlugins.m18275b(th);
        } else {
            this.f49483b = disposableHelper;
            this.f49482a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        this.f49482a.onNext(obj);
    }
}
