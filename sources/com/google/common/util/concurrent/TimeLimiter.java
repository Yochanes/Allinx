package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@DoNotMock("Use FakeTimeLimiter")
@J2ktIncompatible
public interface TimeLimiter {
    @CanIgnoreReturnValue
    @ParametricNullness
    <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit);

    @CanIgnoreReturnValue
    @ParametricNullness
    <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit);

    <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit);

    void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit);

    void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit);
}
