package androidx.compose.p013ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-geometry_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RoundRectKt {
    /* JADX INFO: renamed from: a */
    public static final RoundRect m5077a(Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.f17526a, rect.f17527b, rect.f17528c, rect.f17529d, j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: b */
    public static final RoundRect m5078b(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new RoundRect(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m5079c(RoundRect roundRect) {
        long j = roundRect.f17534e;
        return (j >>> 32) == (4294967295L & j) && j == roundRect.f17535f && j == roundRect.f17536g && j == roundRect.f17537h;
    }
}
