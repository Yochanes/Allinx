package io.reactivex.rxjava3.internal.util;

import androidx.compose.animation.AbstractC0455a;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BackpressureHelper {
    /* JADX INFO: renamed from: a */
    public static long m18237a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m18239c(j2, j)));
        return j2;
    }

    /* JADX INFO: renamed from: b */
    public static long m18238b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m18239c(j2, j)));
        return j2;
    }

    /* JADX INFO: renamed from: c */
    public static long m18239c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: d */
    public static long m18240d(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j3 / j == j2) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: e */
    public static long m18241e(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                RxJavaPlugins.m18275b(new IllegalStateException(AbstractC0455a.m2238m(j3, "More produced than requested: ")));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* JADX INFO: renamed from: f */
    public static long m18242f(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                RxJavaPlugins.m18275b(new IllegalStateException(AbstractC0455a.m2238m(j3, "More produced than requested: ")));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
