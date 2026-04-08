package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Oscillator {

    /* JADX INFO: renamed from: a */
    public float[] f21459a;

    /* JADX INFO: renamed from: b */
    public double[] f21460b;

    /* JADX INFO: renamed from: c */
    public double[] f21461c;

    /* JADX INFO: renamed from: d */
    public MonotonicCurveFit f21462d;

    /* JADX INFO: renamed from: e */
    public int f21463e;

    /* JADX INFO: renamed from: a */
    public final void m6916a(double d, float f) {
        int length = this.f21459a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f21460b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f21460b = Arrays.copyOf(this.f21460b, length);
        this.f21459a = Arrays.copyOf(this.f21459a, length);
        this.f21461c = new double[length];
        double[] dArr = this.f21460b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f21460b[iBinarySearch] = d;
        this.f21459a[iBinarySearch] = f;
    }

    /* JADX INFO: renamed from: b */
    public final double m6917b(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f21460b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f21459a;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.f21460b;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + ((d - d4) * (((double) f2) - (d5 * d4))) + this.f21461c[i];
    }

    /* JADX INFO: renamed from: c */
    public final double m6918c(double d, double d2) {
        double dAbs;
        double dM6917b = m6917b(d) + d2;
        switch (this.f21463e) {
            case 1:
                return Math.signum(0.5d - (dM6917b % 1.0d));
            case 2:
                dAbs = Math.abs((((dM6917b * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dM6917b * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dM6917b * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d2 + dM6917b) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dM6917b * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f21462d.mo6885b(dM6917b % 1.0d);
            default:
                return Math.sin(6.283185307179586d * dM6917b);
        }
        return 1.0d - dAbs;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f21460b) + " period=" + Arrays.toString(this.f21459a);
    }
}
