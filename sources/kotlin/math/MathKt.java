package kotlin.math;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/math/MathKt__MathHKt", "kotlin/math/MathKt__MathJVMKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class MathKt extends MathKt__MathJVMKt {
    /* JADX INFO: renamed from: a */
    public static int m18639a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    /* JADX INFO: renamed from: b */
    public static int m18640b(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: c */
    public static long m18641c(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }
}
