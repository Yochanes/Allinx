package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/time/Duration;", "", "Companion", "rawValue", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmInline
@WasExperimental
@SourceDebugExtension
public final class Duration implements Comparable<Duration> {

    /* JADX INFO: renamed from: b */
    public static final long f55214b;

    /* JADX INFO: renamed from: c */
    public static final long f55215c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f55216d = 0;

    /* JADX INFO: renamed from: a */
    public final long f55217a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/time/Duration$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        int i = DurationJvmKt.f55218a;
        f55214b = DurationKt.m20477b(4611686018427387903L);
        f55215c = DurationKt.m20477b(-4611686018427387903L);
    }

    public /* synthetic */ Duration(long j) {
        this.f55217a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m20467a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return DurationKt.m20477b(RangesKt.m18657d(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.m20479d((j5 * j3) + (j2 - (j4 * j3)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m20468b(StringBuilder sb, int i, int i2, int i3, String str, boolean z2) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strM20404B = StringsKt.m20404B(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM20404B.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM20404B.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z2 || i6 >= 3) {
                sb.append((CharSequence) strM20404B, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM20404B, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m20469c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: d */
    public static final int m20470d(long j) {
        if (m20471e(j)) {
            return 0;
        }
        return (((int) j) & 1) == 1 ? (int) (((j >> 1) % ((long) 1000)) * ((long) 1000000)) : (int) ((j >> 1) % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m20471e(long j) {
        return j == f55214b || j == f55215c;
    }

    /* JADX INFO: renamed from: f */
    public static final long m20472f(long j, long j2) {
        if (m20471e(j)) {
            if (!m20471e(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m20471e(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m20467a(j >> 1, j2 >> 1) : m20467a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? DurationKt.m20477b(j3 / ((long) 1000000)) : DurationKt.m20479d(j3) : DurationKt.m20478c(j3);
    }

    /* JADX INFO: renamed from: h */
    public static final long m20473h(long j, DurationUnit unit) {
        Intrinsics.m18599g(unit, "unit");
        if (j == f55214b) {
            return Long.MAX_VALUE;
        }
        if (j == f55215c) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.m20484b(j >> 1, (((int) j) & 1) == 0 ? DurationUnit.f55219b : DurationUnit.f55221d, unit);
    }

    /* JADX INFO: renamed from: i */
    public static String m20474i(long j) {
        long j2;
        int iM20473h;
        if (j == 0) {
            return "0s";
        }
        if (j == f55214b) {
            return "Infinity";
        }
        if (j == f55215c) {
            return "-Infinity";
        }
        int i = 0;
        boolean z2 = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        long jM20475j = j < 0 ? m20475j(j) : j;
        long jM20473h = m20473h(jM20475j, DurationUnit.f55225j);
        int iM20473h2 = m20471e(jM20475j) ? 0 : (int) (m20473h(jM20475j, DurationUnit.f55224i) % ((long) 24));
        if (m20471e(jM20475j)) {
            j2 = 0;
            iM20473h = 0;
        } else {
            j2 = 0;
            iM20473h = (int) (m20473h(jM20475j, DurationUnit.f55223g) % ((long) 60));
        }
        int iM20473h3 = m20471e(jM20475j) ? 0 : (int) (m20473h(jM20475j, DurationUnit.f55222f) % ((long) 60));
        int iM20470d = m20470d(jM20475j);
        boolean z3 = jM20473h != j2;
        boolean z4 = iM20473h2 != 0;
        boolean z5 = iM20473h != 0;
        boolean z6 = (iM20473h3 == 0 && iM20470d == 0) ? false : true;
        if (z3) {
            sb.append(jM20473h);
            sb.append('d');
            i = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM20473h2);
            sb.append('h');
            i = i2;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM20473h);
            sb.append('m');
            i = i3;
        }
        if (z6) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM20473h3 != 0 || z3 || z4 || z5) {
                m20468b(sb, iM20473h3, iM20470d, 9, "s", false);
            } else if (iM20470d >= 1000000) {
                m20468b(sb, iM20470d / 1000000, iM20470d % 1000000, 6, "ms", false);
            } else if (iM20470d >= 1000) {
                m20468b(sb, iM20470d / 1000, iM20470d % 1000, 3, "us", false);
            } else {
                sb.append(iM20470d);
                sb.append("ns");
            }
            i = i4;
        }
        if (z2 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static final long m20475j(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = DurationJvmKt.f55218a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        return m20469c(this.f55217a, duration.f55217a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Duration) {
            return this.f55217a == ((Duration) obj).f55217a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55217a);
    }

    public final String toString() {
        return m20474i(this.f55217a);
    }
}
