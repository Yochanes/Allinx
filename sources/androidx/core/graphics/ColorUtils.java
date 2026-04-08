package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.RequiresApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ColorUtils {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f23198a = new ThreadLocal();

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: renamed from: a */
    public static int m7552a(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                iRound3 = Math.round(f4 * 255.0f);
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            case 3:
                iRound3 = Math.round(f4 * 255.0f);
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 4:
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            default:
                iRound2 = 0;
                iRound = 0;
                break;
        }
        return Color.rgb(m7559h(iRound3), m7559h(iRound), m7559h(iRound2));
    }

    /* JADX INFO: renamed from: b */
    public static int m7553b(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(m7559h((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), m7559h((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), m7559h((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    /* JADX INFO: renamed from: c */
    public static int m7554c(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: d */
    public static double m7555d(int i) {
        ThreadLocal threadLocal = f23198a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d;
    }

    /* JADX INFO: renamed from: e */
    public static void m7556e(int i, float[] fArr) {
        float fM1B;
        float fAbs;
        float fRed = Color.red(i) / 255.0f;
        float fGreen = Color.green(i) / 255.0f;
        float fBlue = Color.blue(i) / 255.0f;
        float fMax = Math.max(fRed, Math.max(fGreen, fBlue));
        float fMin = Math.min(fRed, Math.min(fGreen, fBlue));
        float f = fMax - fMin;
        float f2 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            fM1B = 0.0f;
            fAbs = 0.0f;
        } else {
            fM1B = fMax == fRed ? ((fGreen - fBlue) / f) % 6.0f : fMax == fGreen ? AbstractC0000a.m1B(fBlue, fRed, f, 2.0f) : AbstractC0000a.m1B(fRed, fGreen, f, 4.0f);
            fAbs = f / (1.0f - Math.abs((2.0f * f2) - 1.0f));
        }
        float f3 = (fM1B * 60.0f) % 360.0f;
        if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        fArr[0] = f3 < 0.0f ? 0.0f : Math.min(f3, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f2 >= 0.0f ? Math.min(f2, 1.0f) : 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public static int m7557f(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, m7558g(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), m7558g(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), m7558g(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    /* JADX INFO: renamed from: g */
    public static int m7558g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m7559h(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    /* JADX INFO: renamed from: i */
    public static int m7560i(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
