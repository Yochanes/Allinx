package androidx.compose.p013ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/geometry/Size;", "", "Companion", "packedValue", "", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class Size {

    /* JADX INFO: renamed from: a */
    public final long f17538a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "ui-geometry_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ Size(long j) {
        this.f17538a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5080a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final float m5081b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public static final float m5082c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX INFO: renamed from: d */
    public static final float m5083d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m5084e(long j) {
        long j2 = (~((((-9223372034707292160L) & j) >>> 31) * ((long) (-1)))) & j;
        return (((j2 & 4294967295L) & (j2 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    /* JADX INFO: renamed from: f */
    public static String m5085f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.m5048a(Float.intBitsToFloat((int) (j >> 32))) + ", " + GeometryUtilsKt.m5048a(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Size) {
            return this.f17538a == ((Size) obj).f17538a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17538a);
    }

    public final String toString() {
        return m5085f(this.f17538a);
    }
}
