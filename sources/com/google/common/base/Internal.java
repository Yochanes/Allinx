package com.google.common.base;

import com.airbnb.lottie.utils.AbstractC2433a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.time.Duration;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class Internal {
    private Internal() {
    }

    @IgnoreJRERequirement
    public static long toNanosSaturated(Duration duration) {
        try {
            return AbstractC2433a.m12758a(duration);
        } catch (ArithmeticException unused) {
            return AbstractC2433a.m12754A(duration) ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }
}
