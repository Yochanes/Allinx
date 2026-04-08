package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "Companion", "packedValue", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class TextUnit {

    /* JADX INFO: renamed from: b */
    public static final TextUnitType[] f20574b = {new TextUnitType(0), new TextUnitType(4294967296L), new TextUnitType(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f20575c = TextUnitKt.m6681d(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f20576a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ TextUnit(long j) {
        this.f20576a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m6673a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final long m6674b(long j) {
        return f20574b[(int) ((j & 1095216660480L) >>> 32)].f20577a;
    }

    /* JADX INFO: renamed from: c */
    public static final float m6675c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m6676d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    /* JADX INFO: renamed from: e */
    public static String m6677e(long j) {
        long jM6674b = m6674b(j);
        if (TextUnitType.m6682a(jM6674b, 0L)) {
            return "Unspecified";
        }
        if (TextUnitType.m6682a(jM6674b, 4294967296L)) {
            return m6675c(j) + ".sp";
        }
        if (!TextUnitType.m6682a(jM6674b, 8589934592L)) {
            return "Invalid";
        }
        return m6675c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnit) {
            return this.f20576a == ((TextUnit) obj).f20576a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20576a);
    }

    public final String toString() {
        return m6677e(this.f20576a);
    }
}
