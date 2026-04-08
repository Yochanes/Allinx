package androidx.transition;

import android.graphics.Path;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ArcMotion extends PathMotion {
    static {
        Math.tan(Math.toRadians(35.0d));
    }

    @Override // androidx.transition.PathMotion
    public final Path getPath(float f, float f2, float f3, float f4) {
        float fM4a;
        float fM4a2;
        Path path = new Path();
        path.moveTo(f, f2);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = (f6 * f6) + (f5 * f5);
        float f8 = (f + f3) / 2.0f;
        float f9 = (f2 + f4) / 2.0f;
        float f10 = 0.25f * f7;
        boolean z2 = f2 > f4;
        if (Math.abs(f5) < Math.abs(f6)) {
            float fAbs = Math.abs(f7 / (f6 * 2.0f));
            if (z2) {
                fM4a2 = fAbs + f4;
                fM4a = f3;
            } else {
                fM4a2 = fAbs + f2;
                fM4a = f;
            }
        } else {
            float f11 = f7 / (f5 * 2.0f);
            if (z2) {
                fM4a2 = f2;
                fM4a = f11 + f;
            } else {
                fM4a = f3 - f11;
                fM4a2 = f4;
            }
        }
        float f12 = f10 * 0.0f * 0.0f;
        float f13 = f8 - fM4a;
        float f14 = f9 - fM4a2;
        float f15 = (f14 * f14) + (f13 * f13);
        float f16 = f10 * 0.0f * 0.0f;
        if (f15 >= f12) {
            f12 = f15 > f16 ? f16 : 0.0f;
        }
        if (f12 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f12 / f15);
            fM4a = AbstractC0000a.m4a(fM4a, f8, fSqrt, f8);
            fM4a2 = AbstractC0000a.m4a(fM4a2, f9, fSqrt, f9);
        }
        path.cubicTo((f + fM4a) / 2.0f, (f2 + fM4a2) / 2.0f, (fM4a + f3) / 2.0f, (fM4a2 + f4) / 2.0f, f3, f4);
        return path;
    }
}
