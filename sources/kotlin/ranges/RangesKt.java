package kotlin.ranges;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/ranges/RangesKt__RangesKt", "kotlin/ranges/RangesKt___RangesKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class RangesKt extends RangesKt___RangesKt {
    /* JADX INFO: renamed from: a */
    public static double m18654a(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(d3);
        sb.append(" is less than minimum ");
        throw new IllegalArgumentException(AbstractC0455a.m2239n(sb, d2, '.'));
    }

    /* JADX INFO: renamed from: b */
    public static float m18655b(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: c */
    public static int m18656c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: d */
    public static long m18657d(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(AbstractC0455a.m2240o(AbstractC0000a.m22s("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j3), j2, '.'));
    }

    /* JADX INFO: renamed from: e */
    public static Comparable m18658e(Comparable comparable, ClosedFloatingPointRange range) {
        Intrinsics.m18599g(range, "range");
        if (!range.isEmpty()) {
            return (!range.mo18650c(comparable, range.mo7700e()) || range.mo18650c(range.mo7700e(), comparable)) ? (!range.mo18650c(range.mo7701f(), comparable) || range.mo18650c(comparable, range.mo7701f())) ? comparable : range.mo7701f() : range.mo7700e();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* JADX INFO: renamed from: f */
    public static Comparable m18659f(Integer num, Integer num2, Integer num3) {
        if (num2 == null || num3 == null) {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            if (num2.compareTo(num3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + num3 + " is less than minimum " + num2 + '.');
            }
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    /* JADX INFO: renamed from: g */
    public static ClosedFloatingPointRange m18660g() {
        return new ClosedDoubleRange();
    }

    /* JADX INFO: renamed from: h */
    public static ClosedFloatingPointRange m18661h(float f, float f2) {
        return new ClosedFloatRange(f, f2);
    }

    /* JADX INFO: renamed from: i */
    public static IntProgression m18662i(IntRange intRange) {
        return new IntProgression(intRange.f51686b, intRange.f51685a, -intRange.f51687c);
    }

    /* JADX INFO: renamed from: j */
    public static IntProgression m18663j(IntRange intRange, int i) {
        Intrinsics.m18599g(intRange, "<this>");
        boolean z2 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z2) {
            if (intRange.f51687c <= 0) {
                i = -i;
            }
            return new IntProgression(intRange.f51685a, intRange.f51686b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    /* JADX INFO: renamed from: k */
    public static IntRange m18664k(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? IntRange.f51692d : new IntRange(i, i2 - 1, 1);
    }
}
