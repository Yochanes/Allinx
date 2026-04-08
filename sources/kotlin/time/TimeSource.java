package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/time/TimeSource;", "", "WithComparableMarks", "Monotonic", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public interface TimeSource {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/time/TimeSource$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "ValueTimeMark", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Monotonic implements WithComparableMarks {

        /* JADX INFO: compiled from: Proguard */
        @SinceKotlin
        @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        @JvmInline
        @WasExperimental
        public static final class ValueTimeMark implements ComparableTimeMark {
            /* JADX INFO: renamed from: a */
            public static final long m20486a(long j, long j2) {
                int i = MonotonicTimeSource.f55230b;
                DurationUnit unit = DurationUnit.f55219b;
                Intrinsics.m18599g(unit, "unit");
                if (((j2 - 1) | 1) == Long.MAX_VALUE) {
                    if (j != j2) {
                        return Duration.m20475j(j2 < 0 ? Duration.f55215c : Duration.f55214b);
                    }
                    int i2 = Duration.f55216d;
                    return 0L;
                }
                if (((j - 1) | 1) == Long.MAX_VALUE) {
                    return j < 0 ? Duration.f55215c : Duration.f55214b;
                }
                long j3 = j - j2;
                if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
                    return DurationKt.m20482g(j3, unit);
                }
                DurationUnit durationUnit = DurationUnit.f55221d;
                if (unit.compareTo(durationUnit) >= 0) {
                    return Duration.m20475j(j3 < 0 ? Duration.f55215c : Duration.f55214b);
                }
                long jM20484b = DurationUnitKt__DurationUnitJvmKt.m20484b(1L, durationUnit, unit);
                long j4 = (j / jM20484b) - (j2 / jM20484b);
                long j5 = (j % jM20484b) - (j2 % jM20484b);
                int i3 = Duration.f55216d;
                return Duration.m20472f(DurationKt.m20482g(j4, durationUnit), DurationKt.m20482g(j5, unit));
            }

            @Override // java.lang.Comparable
            public final int compareTo(ComparableTimeMark comparableTimeMark) {
                ComparableTimeMark other = comparableTimeMark;
                Intrinsics.m18599g(other, "other");
                Intrinsics.m18599g(other, "other");
                if (!(other instanceof ValueTimeMark)) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: ValueTimeMark(reading=0) and " + other);
                }
                int i = MonotonicTimeSource.f55230b;
                DurationUnit unit = DurationUnit.f55219b;
                Intrinsics.m18599g(unit, "unit");
                return Duration.m20469c(DurationKt.m20482g(0L, unit), 0L);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ValueTimeMark)) {
                    return false;
                }
                ((ValueTimeMark) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Long.hashCode(0L);
            }

            public final String toString() {
                return "ValueTimeMark(reading=0)";
            }
        }

        public final String toString() {
            int i = MonotonicTimeSource.f55230b;
            return "TimeSource(System.nanoTime())";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SinceKotlin
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @WasExperimental
    public interface WithComparableMarks extends TimeSource {
    }
}
