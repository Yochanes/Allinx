package com.google.common.util.concurrent;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
public final class Callables {
    private Callables() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15079a(Supplier supplier, Runnable runnable) {
        lambda$threadRenaming$3(supplier, runnable);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(Callable<T> callable, ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new C4582j(listeningExecutorService, callable);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ListenableFuture m15080b(ListeningExecutorService listeningExecutorService, Callable callable) {
        return lambda$asAsyncCallable$1(listeningExecutorService, callable);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m15081c(Supplier supplier, Callable callable) {
        return lambda$threadRenaming$2(supplier, callable);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m15082d(Object obj) {
        return lambda$returning$0(obj);
    }

    private static /* synthetic */ ListenableFuture lambda$asAsyncCallable$1(ListeningExecutorService listeningExecutorService, Callable callable) {
        return listeningExecutorService.submit(callable);
    }

    private static /* synthetic */ Object lambda$threadRenaming$2(Supplier supplier, Callable callable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) supplier.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    private static /* synthetic */ void lambda$threadRenaming$3(Supplier supplier, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) supplier.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    public static <T> Callable<T> returning(@ParametricNullness T t) {
        return new CallableC4583k(t);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <T> Callable<T> threadRenaming(Callable<T> callable, Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new CallableC4581i(supplier, callable);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static boolean trySetName(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Runnable threadRenaming(Runnable runnable, Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new RunnableC4580h(1, supplier, runnable);
    }

    private static /* synthetic */ Object lambda$returning$0(Object obj) {
        return obj;
    }
}
