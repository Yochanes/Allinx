package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class CamColor {

    /* JADX INFO: renamed from: a */
    public final float f23143a;

    /* JADX INFO: renamed from: b */
    public final float f23144b;

    /* JADX INFO: renamed from: c */
    public final float f23145c;

    /* JADX INFO: renamed from: d */
    public final float f23146d;

    /* JADX INFO: renamed from: e */
    public final float f23147e;

    /* JADX INFO: renamed from: f */
    public final float f23148f;

    public CamColor(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f23143a = f;
        this.f23144b = f2;
        this.f23145c = f3;
        this.f23146d = f4;
        this.f23147e = f5;
        this.f23148f = f6;
    }

    /* JADX INFO: renamed from: a */
    public static CamColor m7527a(int i) {
        ViewingConditions viewingConditions = ViewingConditions.f23182k;
        float fM7531b = CamUtils.m7531b(Color.red(i));
        float fM7531b2 = CamUtils.m7531b(Color.green(i));
        float fM7531b3 = CamUtils.m7531b(Color.blue(i));
        float[][] fArr = CamUtils.f23152d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM7531b3) + (fArr2[1] * fM7531b2) + (fArr2[0] * fM7531b);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM7531b3) + (fArr3[1] * fM7531b2) + (fArr3[0] * fM7531b);
        float[] fArr4 = fArr[2];
        float f3 = (fM7531b3 * fArr4[2]) + (fM7531b2 * fArr4[1]) + (fM7531b * fArr4[0]);
        float[][] fArr5 = CamUtils.f23149a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = viewingConditions.f23189g;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float fAbs = Math.abs(f7);
        float f10 = viewingConditions.f23190h;
        float fPow = (float) Math.pow(((double) (fAbs * f10)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f8) * f10)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f9) * f10)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f11 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f12 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f13)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = fAtan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * viewingConditions.f23184b;
        float f19 = viewingConditions.f23183a;
        float f20 = viewingConditions.f23186d;
        float fPow4 = ((float) Math.pow(f18 / f19, viewingConditions.f23192j * f20)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f21 = f19 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f23188f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f16) < 20.14d ? f16 + 360.0f : f16)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.f23187e) * viewingConditions.f23185c) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f22 = viewingConditions.f23191i * fPow5;
        Math.sqrt((r3 * f20) / f21);
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new CamColor(f16, fPow5, fPow4, f23, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: b */
    public static CamColor m7528b(float f, float f2, float f3) {
        ViewingConditions viewingConditions = ViewingConditions.f23182k;
        float f4 = viewingConditions.f23186d;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = viewingConditions.f23183a + 4.0f;
        float f6 = viewingConditions.f23191i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * viewingConditions.f23186d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new CamColor(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7529c(ViewingConditions viewingConditions) {
        float fSqrt;
        float f = this.f23144b;
        double d = f;
        float f2 = this.f23145c;
        if (d != 0.0d) {
            double d2 = f2;
            fSqrt = d2 == 0.0d ? 0.0f : f / ((float) Math.sqrt(d2 / 100.0d));
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.f23188f), 0.73d), 1.1111111111111112d);
        double d3 = (this.f23143a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = viewingConditions.f23183a * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) viewingConditions.f23186d)) / ((double) viewingConditions.f23192j)));
        float f3 = fCos * 3846.1538f * viewingConditions.f23187e * viewingConditions.f23185c;
        float f4 = fPow2 / viewingConditions.f23184b;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f5 = (((0.305f + f4) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f3 * 23.0f)));
        float f6 = fCos2 * f5;
        float f7 = f5 * fSin;
        float f8 = f4 * 460.0f;
        float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
        float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
        float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))));
        float fSignum = Math.signum(f9);
        float f12 = 100.0f / viewingConditions.f23190h;
        float fPow3 = fSignum * f12 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f10) * f12 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f11) * f12 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float[] fArr = viewingConditions.f23189g;
        float f13 = fPow3 / fArr[0];
        float f14 = fSignum2 / fArr[1];
        float f15 = fSignum3 / fArr[2];
        float[][] fArr2 = CamUtils.f23150b;
        float[] fArr3 = fArr2[0];
        float f16 = (fArr3[2] * f15) + (fArr3[1] * f14) + (fArr3[0] * f13);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f14) + (fArr4[0] * f13);
        float[] fArr5 = fArr2[2];
        return ColorUtils.m7553b(f16, f17, (f15 * fArr5[2]) + (f14 * fArr5[1]) + (f13 * fArr5[0]));
    }
}
