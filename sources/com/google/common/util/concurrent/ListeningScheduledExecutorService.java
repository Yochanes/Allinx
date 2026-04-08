package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public interface ListeningScheduledExecutorService extends ScheduledExecutorService, ListeningExecutorService {
    @Override // java.util.concurrent.ScheduledExecutorService
    ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ default ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return schedule(callable, j, timeUnit);
    }
}
