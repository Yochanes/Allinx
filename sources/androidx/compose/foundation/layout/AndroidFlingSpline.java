package androidx.compose.foundation.layout;

import com.engagelab.privates.common.observer.MTObservable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "FlingResult", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AndroidFlingSpline {

    /* JADX INFO: renamed from: a */
    public static final float[] f6251a = new float[MTObservable.WHAT_OBSERVER];

    /* JADX INFO: renamed from: b */
    public static final float[] f6252b = new float[MTObservable.WHAT_OBSERVER];

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class FlingResult {
        public final boolean equals(Object obj) {
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            ((FlingResult) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        public final String toString() {
            return "FlingResult(packedValue=0)";
        }
    }

    static {
        float fM1B;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float fM1B2;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                f6252b[100] = 1.0f;
                f6251a[100] = 1.0f;
                return;
            }
            float f12 = i / 100;
            float f13 = 1.0f;
            while (true) {
                fM1B = AbstractC0000a.m1B(f13, f9, 2.0f, f9);
                f = f11 - fM1B;
                f2 = fM1B * 3.0f * f;
                f3 = fM1B * fM1B * fM1B;
                float f14 = (((fM1B * 0.35000002f) + (f * 0.175f)) * f2) + f3;
                f4 = f11;
                f5 = f12;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                }
                if (f14 > f5) {
                    f13 = fM1B;
                } else {
                    f9 = fM1B;
                }
                f11 = f4;
                f12 = f5;
            }
            f6251a[i] = (((f * 0.5f) + fM1B) * f2) + f3;
            float f15 = f4;
            while (true) {
                fM1B2 = AbstractC0000a.m1B(f15, f10, 2.0f, f10);
                f6 = f4 - fM1B2;
                f7 = fM1B2 * 3.0f * f6;
                f8 = fM1B2 * fM1B2 * fM1B2;
                float f16 = (((f6 * 0.5f) + fM1B2) * f7) + f8;
                if (Math.abs(f16 - f5) >= 1.0E-5d) {
                    if (f16 > f5) {
                        f15 = fM1B2;
                    } else {
                        f10 = fM1B2;
                    }
                }
            }
            f6252b[i] = (((fM1B2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m2718a(float f) {
        float fM4a;
        float f2;
        float f3 = 100;
        int i = (int) (f3 * f);
        if (i < 100) {
            float f4 = i / f3;
            int i2 = i + 1;
            float f5 = i2 / f3;
            float[] fArr = f6251a;
            float f6 = fArr[i];
            f2 = (fArr[i2] - f6) / (f5 - f4);
            fM4a = AbstractC0000a.m4a(f, f4, f2, f6);
        } else {
            fM4a = 1.0f;
            f2 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(fM4a) << 32);
    }
}
