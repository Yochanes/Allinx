package kotlin.time;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DurationKt {
    /* JADX INFO: renamed from: a */
    public static final long m20476a(String str) {
        DurationUnit durationUnit;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = Duration.f55216d;
        char cCharAt2 = str.charAt(0);
        int i2 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z2 = (i2 > 0) && StringsKt.m20417O(str, '-');
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException();
        }
        int i3 = i2 + 1;
        if (i3 == length) {
            throw new IllegalArgumentException();
        }
        DurationUnit durationUnit2 = null;
        long jM20472f = 0;
        boolean z3 = false;
        while (i3 < length) {
            if (str.charAt(i3) != 'T') {
                int i4 = i3;
                while (i4 < str.length() && (('0' <= (cCharAt = str.charAt(i4)) && cCharAt < ':') || StringsKt.m20435k("+-.", cCharAt))) {
                    i4++;
                }
                String strSubstring = str.substring(i3, i4);
                Intrinsics.m18598f(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i3;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                if (z3) {
                    if (cCharAt3 == 'H') {
                        durationUnit = DurationUnit.f55224i;
                    } else if (cCharAt3 == 'M') {
                        durationUnit = DurationUnit.f55223g;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        durationUnit = DurationUnit.f55222f;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    durationUnit = DurationUnit.f55225j;
                }
                if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iM20445u = StringsKt.m20445u(strSubstring, '.', 0, 6);
                if (durationUnit != DurationUnit.f55222f || iM20445u <= 0) {
                    jM20472f = Duration.m20472f(jM20472f, m20482g(m20480e(strSubstring), durationUnit));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iM20445u);
                    Intrinsics.m18598f(strSubstring2, "substring(...)");
                    long jM20472f2 = Duration.m20472f(jM20472f, m20482g(m20480e(strSubstring2), durationUnit));
                    String strSubstring3 = strSubstring.substring(iM20445u);
                    Intrinsics.m18598f(strSubstring3, "substring(...)");
                    double d = Double.parseDouble(strSubstring3);
                    double dM20483a = DurationUnitKt__DurationUnitJvmKt.m20483a(d, durationUnit, DurationUnit.f55219b);
                    if (Double.isNaN(dM20483a)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jM18641c = MathKt.m18641c(dM20483a);
                    jM20472f = Duration.m20472f(jM20472f2, (-4611686018426999999L > jM18641c || jM18641c >= 4611686018427000000L) ? m20478c(MathKt.m18641c(DurationUnitKt__DurationUnitJvmKt.m20483a(d, durationUnit, DurationUnit.f55221d))) : m20479d(jM18641c));
                }
                durationUnit2 = durationUnit;
                i3 = i5;
            } else {
                if (z3 || (i3 = i3 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z3 = true;
            }
        }
        return z2 ? Duration.m20475j(jM20472f) : jM20472f;
    }

    /* JADX INFO: renamed from: b */
    public static final long m20477b(long j) {
        long j2 = (j << 1) + 1;
        int i = Duration.f55216d;
        int i2 = DurationJvmKt.f55218a;
        return j2;
    }

    /* JADX INFO: renamed from: c */
    public static final long m20478c(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? m20477b(RangesKt.m18657d(j, -4611686018427387903L, 4611686018427387903L)) : m20479d(j * ((long) 1000000));
    }

    /* JADX INFO: renamed from: d */
    public static final long m20479d(long j) {
        long j2 = j << 1;
        int i = Duration.f55216d;
        int i2 = DurationJvmKt.f55218a;
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final long m20480e(String str) {
        int length = str.length();
        int i = (length <= 0 || !StringsKt.m20435k("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            IntRange intRange = new IntRange(i, StringsKt.m20444t(str), 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                IntProgressionIterator intProgressionIteratorM18652g = intRange.m18652g();
                while (intProgressionIteratorM18652g.f51690c) {
                    char cCharAt = str.charAt(intProgressionIteratorM18652g.mo2140c());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return StringsKt.m20416N(str, Marker.ANY_NON_NULL_MARKER, false) ? Long.parseLong(StringsKt.m20438n(1, str)) : Long.parseLong(str);
    }

    /* JADX INFO: renamed from: f */
    public static final long m20481f(int i, DurationUnit unit) {
        Intrinsics.m18599g(unit, "unit");
        return unit.compareTo(DurationUnit.f55222f) <= 0 ? m20479d(DurationUnitKt__DurationUnitJvmKt.m20485c(i, unit, DurationUnit.f55219b)) : m20482g(i, unit);
    }

    /* JADX INFO: renamed from: g */
    public static final long m20482g(long j, DurationUnit unit) {
        Intrinsics.m18599g(unit, "unit");
        DurationUnit durationUnit = DurationUnit.f55219b;
        long jM20485c = DurationUnitKt__DurationUnitJvmKt.m20485c(4611686018426999999L, durationUnit, unit);
        return ((-jM20485c) > j || j > jM20485c) ? m20477b(RangesKt.m18657d(DurationUnitKt__DurationUnitJvmKt.m20484b(j, unit, DurationUnit.f55221d), -4611686018427387903L, 4611686018427387903L)) : m20479d(DurationUnitKt__DurationUnitJvmKt.m20485c(j, unit, durationUnit));
    }
}
