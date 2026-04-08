package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyDisposable implements QueueDisposable<Object> {

    /* JADX INFO: renamed from: a */
    public static final EmptyDisposable f49382a;

    /* JADX INFO: renamed from: b */
    public static final EmptyDisposable f49383b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EmptyDisposable[] f49384c;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        f49382a = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        f49383b = emptyDisposable2;
        f49384c = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    /* JADX INFO: renamed from: a */
    public static void m17957a(Observer observer) {
        observer.mo12365c(f49382a);
        observer.onComplete();
    }

    /* JADX INFO: renamed from: b */
    public static void m17958b(Throwable th, CompletableObserver completableObserver) {
        completableObserver.mo12363c(f49382a);
        completableObserver.onError(th);
    }

    /* JADX INFO: renamed from: c */
    public static void m17959c(Throwable th, MaybeObserver maybeObserver) {
        maybeObserver.mo12364c(f49382a);
        maybeObserver.onError(th);
    }

    /* JADX INFO: renamed from: f */
    public static void m17960f(Throwable th, Observer observer) {
        observer.mo12365c(f49382a);
        observer.onError(th);
    }

    /* JADX INFO: renamed from: h */
    public static void m17961h(Throwable th, SingleObserver singleObserver) {
        singleObserver.mo12366c(f49382a);
        singleObserver.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) f49384c.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this == f49382a;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: e */
    public final int mo17962e(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }
}
