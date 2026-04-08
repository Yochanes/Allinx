package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
final class OverflowAvoidingLockSupport {
    static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    private OverflowAvoidingLockSupport() {
    }

    public static void parkNanos(@CheckForNull Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, MAX_NANOSECONDS_THRESHOLD));
    }
}
