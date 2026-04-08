package androidx.compose.p013ui.util;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-util_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MathHelpersKt {
    /* JADX INFO: renamed from: a */
    public static final float m6698a(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / ((long) 3))) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: b */
    public static final float m6699b(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    /* JADX INFO: renamed from: c */
    public static final int m6700c(int i, int i2, float f) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }
}
