package androidx.compose.p013ui.geometry;

import androidx.compose.p013ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-geometry_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class OffsetKt {
    /* JADX INFO: renamed from: a */
    public static final long m5061a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final long m5062b(float f, long j, long j2) {
        float fM6699b = MathHelpersKt.m6699b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fM6699b2 = MathHelpersKt.m6699b(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (((long) Float.floatToRawIntBits(fM6699b)) << 32) | (((long) Float.floatToRawIntBits(fM6699b2)) & 4294967295L);
    }
}
