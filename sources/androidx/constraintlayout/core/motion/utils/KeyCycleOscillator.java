package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class KeyCycleOscillator {

    /* JADX INFO: renamed from: a */
    public CycleOscillator f21427a;

    /* JADX INFO: renamed from: b */
    public String f21428b;

    /* JADX INFO: renamed from: c */
    public int f21429c = 0;

    /* JADX INFO: renamed from: d */
    public String f21430d = null;

    /* JADX INFO: renamed from: e */
    public int f21431e = 0;

    /* JADX INFO: renamed from: f */
    public final ArrayList f21432f = new ArrayList();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$1 */
    /* JADX INFO: compiled from: Proguard */
    class C13851 implements Comparator<WavePoint> {
        @Override // java.util.Comparator
        public final int compare(WavePoint wavePoint, WavePoint wavePoint2) {
            return Integer.compare(wavePoint.f21444a, wavePoint2.f21444a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CoreSpline extends KeyCycleOscillator {

        /* JADX INFO: renamed from: g */
        public int f21433g;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        /* JADX INFO: renamed from: g */
        public final void mo6911g(MotionWidget motionWidget, float f) {
            motionWidget.mo6860d(m6906a(f), this.f21433g);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CycleOscillator {

        /* JADX INFO: renamed from: a */
        public Oscillator f21434a;

        /* JADX INFO: renamed from: b */
        public float[] f21435b;

        /* JADX INFO: renamed from: c */
        public double[] f21436c;

        /* JADX INFO: renamed from: d */
        public float[] f21437d;

        /* JADX INFO: renamed from: e */
        public float[] f21438e;

        /* JADX INFO: renamed from: f */
        public float[] f21439f;

        /* JADX INFO: renamed from: g */
        public CurveFit f21440g;

        /* JADX INFO: renamed from: h */
        public double[] f21441h;

        /* JADX INFO: renamed from: i */
        public double[] f21442i;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PathRotateSet extends KeyCycleOscillator {

        /* JADX INFO: renamed from: g */
        public int f21443g;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        /* JADX INFO: renamed from: g */
        public final void mo6911g(MotionWidget motionWidget, float f) {
            motionWidget.mo6860d(m6906a(f), this.f21443g);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class WavePoint {

        /* JADX INFO: renamed from: a */
        public final int f21444a;

        /* JADX INFO: renamed from: b */
        public final float f21445b;

        /* JADX INFO: renamed from: c */
        public final float f21446c;

        /* JADX INFO: renamed from: d */
        public final float f21447d;

        /* JADX INFO: renamed from: e */
        public final float f21448e;

        public WavePoint(float f, float f2, float f3, float f4, int i) {
            this.f21444a = i;
            this.f21445b = f4;
            this.f21446c = f2;
            this.f21447d = f;
            this.f21448e = f3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static KeyCycleOscillator m6905c(String str) {
        if (str.equals("pathRotate")) {
            PathRotateSet pathRotateSet = new PathRotateSet();
            pathRotateSet.f21443g = TypedValues.CycleType.m6936a(str);
            return pathRotateSet;
        }
        CoreSpline coreSpline = new CoreSpline();
        coreSpline.f21433g = TypedValues.CycleType.m6936a(str);
        return coreSpline;
    }

    /* JADX INFO: renamed from: a */
    public final float m6906a(float f) {
        CycleOscillator cycleOscillator = this.f21427a;
        CurveFit curveFit = cycleOscillator.f21440g;
        if (curveFit != null) {
            curveFit.mo6886c(f, cycleOscillator.f21441h);
        } else {
            double[] dArr = cycleOscillator.f21441h;
            dArr[0] = cycleOscillator.f21438e[0];
            dArr[1] = cycleOscillator.f21439f[0];
            dArr[2] = cycleOscillator.f21435b[0];
        }
        double[] dArr2 = cycleOscillator.f21441h;
        return (float) ((cycleOscillator.f21434a.m6918c(f, dArr2[1]) * cycleOscillator.f21441h[2]) + dArr2[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public final float m6907b(float f) {
        char c2;
        char c3;
        double d;
        double dMo6888e;
        double d2;
        double dSignum;
        CycleOscillator cycleOscillator = this.f21427a;
        CurveFit curveFit = cycleOscillator.f21440g;
        if (curveFit != null) {
            double d3 = f;
            curveFit.mo6889f(d3, cycleOscillator.f21442i);
            cycleOscillator.f21440g.mo6886c(d3, cycleOscillator.f21441h);
        } else {
            double[] dArr = cycleOscillator.f21442i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d4 = f;
        double d5 = cycleOscillator.f21441h[1];
        Oscillator oscillator = cycleOscillator.f21434a;
        double dM6918c = oscillator.m6918c(d4, d5);
        double d6 = cycleOscillator.f21441h[1];
        double d7 = cycleOscillator.f21442i[1];
        double dM6917b = oscillator.m6917b(d4) + d6;
        if (d4 <= 0.0d) {
            c2 = 2;
            c3 = 0;
            d = 0.0d;
        } else if (d4 >= 1.0d) {
            c2 = 2;
            c3 = 0;
            d = 1.0d;
        } else {
            int iBinarySearch = Arrays.binarySearch(oscillator.f21460b, d4);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            float[] fArr = oscillator.f21459a;
            float f2 = fArr[iBinarySearch];
            int i = iBinarySearch - 1;
            float f3 = fArr[i];
            c2 = 2;
            float f4 = f2 - f3;
            c3 = 0;
            double d8 = f4;
            double[] dArr2 = oscillator.f21460b;
            double d9 = dArr2[iBinarySearch];
            double d10 = dArr2[i];
            double d11 = d8 / (d9 - d10);
            d = (((double) f3) - (d11 * d10)) + (d4 * d11);
        }
        double dSin = d + d7;
        double d12 = 2.0d;
        switch (oscillator.f21463e) {
            case 1:
                dMo6888e = 0.0d;
                break;
            case 2:
                d2 = dSin * 4.0d;
                dSignum = Math.signum((((dM6917b * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dMo6888e = dSignum * d2;
                break;
            case 3:
                dMo6888e = dSin * d12;
                break;
            case 4:
                dSin = -dSin;
                dMo6888e = dSin * d12;
                break;
            case 5:
                d12 = (-6.283185307179586d) * dSin;
                dSin = Math.sin(6.283185307179586d * dM6917b);
                dMo6888e = dSin * d12;
                break;
            case 6:
                dMo6888e = ((((dM6917b * 4.0d) + 2.0d) % 4.0d) - 2.0d) * dSin * 4.0d;
                break;
            case 7:
                dMo6888e = oscillator.f21462d.mo6888e(dM6917b % 1.0d);
                break;
            default:
                d2 = dSin * 6.283185307179586d;
                dSignum = Math.cos(6.283185307179586d * dM6917b);
                dMo6888e = dSignum * d2;
                break;
        }
        double[] dArr3 = cycleOscillator.f21442i;
        return (float) ((dMo6888e * cycleOscillator.f21441h[c2]) + (dM6918c * dArr3[c2]) + dArr3[c3]);
    }

    /* JADX INFO: renamed from: e */
    public final void m6909e(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.f21432f.add(new WavePoint(f, f2, f3, f4, i));
        if (i3 != -1) {
            this.f21431e = i3;
        }
        this.f21429c = i2;
        this.f21430d = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m6910f(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.f21432f.add(new WavePoint(f, f2, f3, f4, i));
        if (i3 != -1) {
            this.f21431e = i3;
        }
        this.f21429c = i2;
        mo6908d(obj);
        this.f21430d = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m6912h() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        ArrayList<WavePoint> arrayList = this.f21432f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C13851());
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.f21429c;
        String str = this.f21430d;
        CycleOscillator cycleOscillator = new CycleOscillator();
        Oscillator oscillator = new Oscillator();
        oscillator.f21459a = new float[0];
        oscillator.f21460b = new double[0];
        cycleOscillator.f21434a = oscillator;
        oscillator.f21463e = i6;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int iIndexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i7 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i7++;
            }
            dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i7 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i8 = 0;
            while (i8 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i8];
                int i9 = i8 + length2;
                dArr4[i9][0] = d3;
                double d4 = d2;
                double d5 = ((double) i8) * d4;
                dArr5[i9] = d5;
                if (i8 > 0) {
                    int i10 = (length2 * 2) + i8;
                    dArr4[i10][0] = d3 + 1.0d;
                    dArr5[i10] = d5 + 1.0d;
                    int i11 = i8 - 1;
                    dArr4[i11][0] = (d3 - 1.0d) - d4;
                    dArr5[i11] = (d5 - 1.0d) - d4;
                }
                i8++;
                d2 = d4;
            }
            oscillator.f21462d = new MonotonicCurveFit(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        cycleOscillator.f21435b = new float[size];
        cycleOscillator.f21436c = new double[size];
        cycleOscillator.f21437d = new float[size];
        cycleOscillator.f21438e = new float[size];
        cycleOscillator.f21439f = new float[size];
        float[] fArr = new float[size];
        this.f21427a = cycleOscillator;
        int i12 = i4;
        for (WavePoint wavePoint : arrayList) {
            float f = wavePoint.f21447d;
            dArr[i12] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = wavePoint.f21445b;
            dArr6[i4] = f2;
            float f3 = wavePoint.f21446c;
            dArr6[i2] = f3;
            float f4 = wavePoint.f21448e;
            dArr6[i] = f4;
            CycleOscillator cycleOscillator2 = this.f21427a;
            cycleOscillator2.f21436c[i12] = ((double) wavePoint.f21444a) / 100.0d;
            cycleOscillator2.f21437d[i12] = f;
            cycleOscillator2.f21438e[i12] = f3;
            cycleOscillator2.f21439f[i12] = f4;
            cycleOscillator2.f21435b[i12] = f2;
            i12++;
        }
        CycleOscillator cycleOscillator3 = this.f21427a;
        double[] dArr7 = cycleOscillator3.f21436c;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr2 = cycleOscillator3.f21435b;
        cycleOscillator3.f21441h = new double[fArr2.length + i13];
        cycleOscillator3.f21442i = new double[fArr2.length + i13];
        double d6 = dArr7[i4];
        double d7 = 0.0d;
        float[] fArr3 = cycleOscillator3.f21437d;
        Oscillator oscillator2 = cycleOscillator3.f21434a;
        if (d6 > 0.0d) {
            oscillator2.m6916a(0.0d, fArr3[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            oscillator2.m6916a(d, fArr3[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr9 = dArr8[i14];
            dArr9[i4] = cycleOscillator3.f21438e[i14];
            dArr9[i2] = cycleOscillator3.f21439f[i14];
            dArr9[2] = fArr2[i14];
            oscillator2.m6916a(dArr7[i14], fArr3[i14]);
        }
        double d8 = 0.0d;
        int i15 = i4;
        while (true) {
            float[] fArr4 = oscillator2.f21459a;
            if (i15 >= fArr4.length) {
                break;
            }
            d8 += (double) fArr4[i15];
            i15++;
        }
        double d9 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr5 = oscillator2.f21459a;
            if (i16 >= fArr5.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr5[i17] + fArr5[i16]) / 2.0f;
            double d10 = d7;
            double[] dArr10 = oscillator2.f21460b;
            d9 = ((dArr10[i16] - dArr10[i17]) * ((double) f5)) + d9;
            i16++;
            d7 = d10;
        }
        double d11 = d7;
        int i18 = i4;
        while (true) {
            float[] fArr6 = oscillator2.f21459a;
            if (i18 >= fArr6.length) {
                break;
            }
            fArr6[i18] = fArr6[i18] * ((float) (d8 / d9));
            i18++;
        }
        oscillator2.f21461c[i4] = d11;
        int i19 = i2;
        while (true) {
            float[] fArr7 = oscillator2.f21459a;
            if (i19 >= fArr7.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr7[i20] + fArr7[i19]) / 2.0f;
            double[] dArr11 = oscillator2.f21460b;
            double d12 = dArr11[i19] - dArr11[i20];
            double[] dArr12 = oscillator2.f21461c;
            double d13 = dArr12[i20];
            int i21 = i19;
            dArr12[i21] = (d12 * ((double) f6)) + d13;
            i19 = i21 + 1;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            cycleOscillator3.f21440g = CurveFit.m6898a(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            cycleOscillator3.f21440g = null;
        }
        CurveFit.m6898a(i5, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f21428b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (WavePoint wavePoint : this.f21432f) {
            StringBuilder sbM21r = AbstractC0000a.m21r(string, "[");
            sbM21r.append(wavePoint.f21444a);
            sbM21r.append(" , ");
            sbM21r.append(decimalFormat.format(wavePoint.f21445b));
            sbM21r.append("] ");
            string = sbM21r.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: d */
    public void mo6908d(Object obj) {
    }

    /* JADX INFO: renamed from: g */
    public void mo6911g(MotionWidget motionWidget, float f) {
    }
}
