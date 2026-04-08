package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean z2, double d, RoundingMode roundingMode) {
        if (z2) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
    }

    public static void checkNoOverflow(boolean z2, String str, int i, int i2) {
        if (z2) {
            return;
        }
        StringBuilder sb = new StringBuilder("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        throw new ArithmeticException(AbstractC0000a.m11h(i2, ")", sb));
    }

    @CanIgnoreReturnValue
    public static int checkNonNegative(String str, int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " (" + i + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static int checkPositive(String str, int i) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " (" + i + ") must be > 0");
    }

    public static void checkRoundingUnnecessary(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    @CanIgnoreReturnValue
    public static long checkNonNegative(String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static long checkPositive(String str, long j) {
        if (j > 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be > 0");
    }

    @CanIgnoreReturnValue
    public static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        throw new IllegalArgumentException(str + " (" + bigInteger + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static BigInteger checkPositive(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        throw new IllegalArgumentException(str + " (" + bigInteger + ") must be > 0");
    }

    @CanIgnoreReturnValue
    public static double checkNonNegative(String str, double d) {
        if (d >= 0.0d) {
            return d;
        }
        throw new IllegalArgumentException(str + " (" + d + ") must be >= 0");
    }

    public static void checkNoOverflow(boolean z2, String str, long j, long j2) {
        if (z2) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }
}
