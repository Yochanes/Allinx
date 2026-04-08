package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/Velocity;", "", "Companion", "packedValue", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class Velocity {

    /* JADX INFO: renamed from: a */
    public final long f20578a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/Velocity$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ Velocity(long j) {
        this.f20578a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m6684a(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final float m6685b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m6686c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final long m6687d(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m6688e(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: f */
    public static final long m6689f(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: g */
    public static String m6690g(long j) {
        return "(" + m6685b(j) + ", " + m6686c(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Velocity) {
            return this.f20578a == ((Velocity) obj).f20578a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20578a);
    }

    public final String toString() {
        return m6690g(this.f20578a);
    }
}
