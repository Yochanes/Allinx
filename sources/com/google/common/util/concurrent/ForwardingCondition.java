package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
abstract class ForwardingCondition implements Condition {
    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        delegate().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j) {
        return delegate().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        delegate().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) {
        return delegate().awaitUntil(date);
    }

    public abstract Condition delegate();

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        delegate().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        delegate().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j, TimeUnit timeUnit) {
        return delegate().await(j, timeUnit);
    }
}
