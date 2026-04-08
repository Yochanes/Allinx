package androidx.compose.p013ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "Companion", "packedValue", "", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class CornerRadius {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5045a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m5046b(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.m5048a(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.m5048a(Float.intBitsToFloat(i)) + ", " + GeometryUtilsKt.m5048a(Float.intBitsToFloat(i2)) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CornerRadius)) {
            return false;
        }
        ((CornerRadius) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return m5046b(0L);
    }
}
