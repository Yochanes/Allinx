package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.TimeSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "LongTimeMark", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class LongTimeMark implements ComparableTimeMark {
        /* JADX INFO: renamed from: a */
        public final long m20466a(ComparableTimeMark other) {
            Intrinsics.m18599g(other, "other");
            if (other instanceof LongTimeMark) {
                throw null;
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // java.lang.Comparable
        public final int compareTo(ComparableTimeMark comparableTimeMark) {
            ComparableTimeMark other = comparableTimeMark;
            Intrinsics.m18599g(other, "other");
            m20466a(other);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LongTimeMark)) {
                return false;
            }
            ((LongTimeMark) obj).getClass();
            m20466a((ComparableTimeMark) obj);
            throw null;
        }

        public final int hashCode() {
            int i = Duration.f55216d;
            return Long.hashCode(0L) + (Long.hashCode(0L) * 37);
        }

        public final String toString() {
            throw null;
        }
    }
}
