package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class CamUtils {

    /* JADX INFO: renamed from: a */
    public static final float[][] f23149a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f23150b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f23151c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f23152d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: a */
    public static int m7530a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z2 = f4 > 0.008856452f;
        float f5 = z2 ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f23151c;
        return ColorUtils.m7553b(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: b */
    public static float m7531b(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: c */
    public static float m7532c() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
