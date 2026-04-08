package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class InstantPeriodicTask implements Callable<Void>, Disposable {

    /* JADX INFO: renamed from: b */
    public static final FutureTask f51109b = new FutureTask(Functions.f49388b, null);

    /* JADX INFO: renamed from: a */
    public Thread f51110a;

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f51110a = Thread.currentThread();
        try {
            throw null;
        } catch (Throwable th) {
            this.f51110a = null;
            RxJavaPlugins.m18275b(th);
            throw th;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        throw null;
    }
}
