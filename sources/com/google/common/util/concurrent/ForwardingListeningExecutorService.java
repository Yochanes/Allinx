package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService implements ListeningExecutorService {
    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    public abstract ListeningExecutorService delegate();

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
        return delegate();
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return submit(runnable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ ExecutorService delegate() {
        return delegate();
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, @ParametricNullness Object obj) {
        return submit(runnable, obj);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Callable<T> callable) {
        return delegate().submit((Callable) callable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public ListenableFuture<?> submit(Runnable runnable) {
        return delegate().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Runnable runnable, @ParametricNullness T t) {
        return delegate().submit(runnable, (Object) t);
    }
}
