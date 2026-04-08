package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a */
    public final Consumer f49488a;

    /* JADX INFO: renamed from: b */
    public final Consumer f49489b;

    /* JADX INFO: renamed from: c */
    public final Action f49490c;

    /* JADX INFO: renamed from: d */
    public final Consumer f49491d;

    public LambdaObserver(Consumer consumer, Consumer consumer2) {
        Action action = Functions.f49389c;
        Consumer consumer3 = Functions.f49390d;
        this.f49488a = consumer;
        this.f49489b = consumer2;
        this.f49490c = action;
        this.f49491d = consumer3;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (DisposableHelper.m17955e(this, disposable)) {
            try {
                this.f49491d.accept(this);
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                disposable.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return get() == DisposableHelper.f49380a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17952a(this);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (mo12353d()) {
            return;
        }
        lazySet(DisposableHelper.f49380a);
        try {
            this.f49490c.getClass();
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (mo12353d()) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        lazySet(DisposableHelper.f49380a);
        try {
            this.f49489b.accept(th);
        } catch (Throwable th2) {
            Exceptions.m17950a(th2);
            RxJavaPlugins.m18275b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (mo12353d()) {
            return;
        }
        try {
            this.f49488a.accept(obj);
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            get().dispose();
            onError(th);
        }
    }
}
