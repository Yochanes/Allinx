package androidx.constraintlayout.core.motion.utils;

import com.engagelab.privates.push.platform.google.BuildConfig;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Easing {

    /* JADX INFO: renamed from: b */
    public static final Easing f21419b = new Easing();

    /* JADX INFO: renamed from: c */
    public static final String[] f21420c = {BuildConfig.BUILD_TYPE, "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a */
    public String f21421a = "identity";

    /* JADX INFO: compiled from: Proguard */
    public static class CubicEasing extends Easing {

        /* JADX INFO: renamed from: d */
        public final double f21422d;

        /* JADX INFO: renamed from: e */
        public final double f21423e;

        /* JADX INFO: renamed from: f */
        public final double f21424f;

        /* JADX INFO: renamed from: g */
        public final double f21425g;

        public CubicEasing(String str) {
            this.f21421a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f21422d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.f21423e = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f21424f = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.f21425g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        /* JADX INFO: renamed from: a */
        public final double mo6900a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = m6902d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dM6902d = m6902d(d4);
            double d5 = d3 + d2;
            double dM6902d2 = m6902d(d5);
            double dM6903e = m6903e(d4);
            return (((d - dM6902d) * (m6903e(d5) - dM6903e)) / (dM6902d2 - dM6902d)) + dM6903e;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        /* JADX INFO: renamed from: b */
        public final double mo6901b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = m6902d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (m6903e(d5) - m6903e(d4)) / (m6902d(d5) - m6902d(d4));
        }

        /* JADX INFO: renamed from: d */
        public final double m6902d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f21424f * d5) + (this.f21422d * d4) + (d * d * d);
        }

        /* JADX INFO: renamed from: e */
        public final double m6903e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f21425g * d5) + (this.f21423e * d4) + (d * d * d);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Easing m6899c(String str) {
        char c2 = 0;
        char c3 = 2;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            StepCurve stepCurve = new StepCurve();
            stepCurve.f21421a = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i = 0;
            while (iIndexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            int i2 = 0;
            while (i2 < dArrCopyOf.length) {
                double d2 = dArrCopyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][c2] = d2;
                char c4 = c2;
                char c5 = c3;
                double d3 = ((double) i2) * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][c4] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][c4] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
                i2++;
                c2 = c4;
                c3 = c5;
            }
            MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
            System.out.println(" 0 " + monotonicCurveFit.mo6885b(0.0d));
            System.out.println(" 1 " + monotonicCurveFit.mo6885b(1.0d));
            stepCurve.f21483d = monotonicCurveFit;
            return stepCurve;
        }
        if (str.startsWith("Schlick")) {
            Schlick schlick = new Schlick();
            schlick.f21421a = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            schlick.f21464d = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            schlick.f21465e = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return schlick;
        }
        switch (str) {
            case "accelerate":
                return new CubicEasing("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new CubicEasing("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new CubicEasing("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new CubicEasing("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new CubicEasing("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new CubicEasing("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f21420c));
                return f21419b;
        }
    }

    /* JADX INFO: renamed from: b */
    public double mo6901b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.f21421a;
    }

    /* JADX INFO: renamed from: a */
    public double mo6900a(double d) {
        return d;
    }
}
