package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {
    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        Thread.currentThread();
        disposable.getClass();
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m17615a(null);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // io.reactivex.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onComplete() {
        Thread.currentThread();
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        Thread.currentThread();
        if (th != null) {
            throw null;
        }
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        Thread.currentThread();
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
        Thread.currentThread();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyObserver implements Observer<Object> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ EmptyObserver[] f49297a = {new EmptyObserver("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        EmptyObserver EF5;

        public static EmptyObserver valueOf(String str) {
            return (EmptyObserver) Enum.valueOf(EmptyObserver.class, str);
        }

        public static EmptyObserver[] values() {
            return (EmptyObserver[]) f49297a.clone();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
        }
    }
}
