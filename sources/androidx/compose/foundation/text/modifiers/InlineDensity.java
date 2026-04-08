package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity;", "", "Companion", "packedValue", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class InlineDensity {

    /* JADX INFO: renamed from: a */
    public static final long f9419a = m3505a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f9420b = 0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/modifiers/InlineDensity$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public static long m3505a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static String m3506b(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InlineDensity)) {
            return false;
        }
        ((InlineDensity) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return m3506b(0L);
    }
}
