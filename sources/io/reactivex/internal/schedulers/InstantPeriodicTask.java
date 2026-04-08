package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class InstantPeriodicTask implements Callable<Void>, Disposable {

    /* JADX INFO: renamed from: b */
    public static final FutureTask f49158b = new FutureTask(Functions.f47560b, null);

    /* JADX INFO: renamed from: a */
    public Thread f49159a;

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f49159a = Thread.currentThread();
        try {
            throw null;
        } catch (Throwable th) {
            this.f49159a = null;
            RxJavaPlugins.m17911b(th);
            return null;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        throw null;
    }
}
