package io.reactivex.internal.disposables;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyDisposable implements QueueDisposable<Object> {

    /* JADX INFO: renamed from: a */
    public static final EmptyDisposable f47554a;

    /* JADX INFO: renamed from: b */
    public static final EmptyDisposable f47555b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EmptyDisposable[] f47556c;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        f47554a = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        f47555b = emptyDisposable2;
        f47556c = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    /* JADX INFO: renamed from: a */
    public static void m17621a(Observer observer) {
        observer.mo17593c(f47554a);
        observer.onComplete();
    }

    /* JADX INFO: renamed from: b */
    public static void m17622b(Throwable th, CompletableObserver completableObserver) {
        completableObserver.mo17580c(f47554a);
        completableObserver.onError(th);
    }

    /* JADX INFO: renamed from: c */
    public static void m17623c(Throwable th, MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(f47554a);
        maybeObserver.onError(th);
    }

    /* JADX INFO: renamed from: f */
    public static void m17624f(Throwable th, Observer observer) {
        observer.mo17593c(f47554a);
        observer.onError(th);
    }

    /* JADX INFO: renamed from: h */
    public static void m17625h(Throwable th, SingleObserver singleObserver) {
        singleObserver.mo17602c(f47554a);
        singleObserver.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) f47556c.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this == f47554a;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17626e(int i) {
        return 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }
}
