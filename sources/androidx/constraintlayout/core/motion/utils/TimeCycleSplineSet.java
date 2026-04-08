package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class TimeCycleSplineSet {

    /* JADX INFO: renamed from: a */
    public CurveFit f21505a;

    /* JADX INFO: renamed from: b */
    public int f21506b;

    /* JADX INFO: renamed from: c */
    public int[] f21507c;

    /* JADX INFO: renamed from: d */
    public float[][] f21508d;

    /* JADX INFO: renamed from: e */
    public int f21509e;

    /* JADX INFO: renamed from: f */
    public String f21510f;

    /* JADX INFO: renamed from: g */
    public float[] f21511g;

    /* JADX INFO: renamed from: h */
    public boolean f21512h;

    /* JADX INFO: renamed from: i */
    public long f21513i;

    /* JADX INFO: renamed from: j */
    public float f21514j;

    /* JADX INFO: compiled from: Proguard */
    public static class CustomSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        /* JADX INFO: renamed from: b */
        public final void mo6929b(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        /* JADX INFO: renamed from: c */
        public final void mo6930c(int i) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CustomVarSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        /* JADX INFO: renamed from: b */
        public final void mo6929b(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        /* JADX INFO: renamed from: c */
        public final void mo6930c(int i) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Sort {
    }

    /* JADX INFO: renamed from: a */
    public final float m6928a(float f) {
        float fAbs;
        switch (this.f21506b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: b */
    public void mo6929b(float f, float f2, float f3, int i, int i2) {
        int i3 = this.f21509e;
        this.f21507c[i3] = i;
        float[] fArr = this.f21508d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f21506b = Math.max(this.f21506b, i2);
        this.f21509e++;
    }

    /* JADX INFO: renamed from: c */
    public void mo6930c(int i) {
        float[][] fArr;
        int i2 = this.f21509e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f21510f);
            return;
        }
        int[] iArr = this.f21507c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (true) {
            fArr = this.f21508d;
            if (i3 <= 0) {
                break;
            }
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 0;
        for (int i16 = 1; i16 < iArr.length; i16++) {
            if (iArr[i16] != iArr[i16 - 1]) {
                i15++;
            }
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f21509e; i18++) {
            if (i18 <= 0 || iArr[i18] != iArr[i18 - 1]) {
                dArr[i17] = ((double) iArr[i18]) * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[] fArr4 = fArr[i18];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i17++;
            }
        }
        this.f21505a = CurveFit.m6898a(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f21510f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f21509e; i++) {
            StringBuilder sbM21r = AbstractC0000a.m21r(string, "[");
            sbM21r.append(this.f21507c[i]);
            sbM21r.append(" , ");
            sbM21r.append(decimalFormat.format(this.f21508d[i]));
            sbM21r.append("] ");
            string = sbM21r.toString();
        }
        return string;
    }
}
