package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/material3/SliderRange;", "", "Companion", "packedValue", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class SliderRange {

    /* JADX INFO: renamed from: a */
    public static final long f14584a = SliderKt.m4043c(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f14585b = 0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public static final float m4047a(long j) {
        if (j != f14584a) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    /* JADX INFO: renamed from: b */
    public static final float m4048b(long j) {
        if (j != f14584a) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SliderRange)) {
            return false;
        }
        ((SliderRange) obj).getClass();
        return 0 == 0;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        float f = SliderKt.f14486a;
        if (0 == f14584a) {
            return "FloatRange.Unspecified";
        }
        return m4048b(0L) + ".." + m4047a(0L);
    }
}
