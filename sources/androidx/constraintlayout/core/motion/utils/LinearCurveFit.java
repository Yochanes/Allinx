package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LinearCurveFit extends CurveFit {

    /* JADX INFO: renamed from: a */
    public double[] f21452a;

    /* JADX INFO: renamed from: b */
    public double[][] f21453b;

    /* JADX INFO: renamed from: c */
    public double[] f21454c;

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: b */
    public final double mo6885b(double d) {
        double d2;
        double d3;
        double dMo6888e;
        double[] dArr = this.f21452a;
        int length = dArr.length;
        double d4 = dArr[0];
        double[][] dArr2 = this.f21453b;
        if (d <= d4) {
            d2 = dArr2[0][0];
            d3 = d - d4;
            dMo6888e = mo6888e(d4);
        } else {
            int i = length - 1;
            double d5 = dArr[i];
            if (d < d5) {
                int i2 = 0;
                while (i2 < i) {
                    double d6 = dArr[i2];
                    if (d == d6) {
                        return dArr2[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr[i3];
                    if (d < d7) {
                        double d8 = (d - d6) / (d7 - d6);
                        return (dArr2[i3][0] * d8) + ((1.0d - d8) * dArr2[i2][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
            d2 = dArr2[i][0];
            d3 = d - d5;
            dMo6888e = mo6888e(d5);
        }
        return (dMo6888e * d3) + d2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: c */
    public final void mo6886c(double d, double[] dArr) {
        double[] dArr2 = this.f21452a;
        int length = dArr2.length;
        double[][] dArr3 = this.f21453b;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        double[] dArr4 = this.f21454c;
        if (d <= d2) {
            mo6889f(d2, dArr4);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr2[0]) * dArr4[i2]) + dArr3[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            mo6889f(d3, dArr4);
            while (i < length2) {
                dArr[i] = ((d - dArr2[i3]) * dArr4[i]) + dArr3[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr3[i6][i] * d6) + ((1.0d - d6) * dArr3[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: d */
    public final void mo6887d(double d, float[] fArr) {
        double[] dArr = this.f21452a;
        int length = dArr.length;
        double[][] dArr2 = this.f21453b;
        int i = 0;
        int length2 = dArr2[0].length;
        double d2 = dArr[0];
        double[] dArr3 = this.f21454c;
        if (d <= d2) {
            mo6889f(d2, dArr3);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr[0]) * dArr3[i2]) + dArr2[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr[i3];
        if (d >= d3) {
            mo6889f(d3, dArr3);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr[i3]) * dArr3[i]) + dArr2[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr2[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr[i6];
            if (d < d4) {
                double d5 = dArr[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr2[i6][i] * d6) + ((1.0d - d6) * dArr2[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double mo6888e(double d) {
        double[] dArr = this.f21452a;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d < d2) {
            d = d2;
        } else {
            d2 = dArr[length - 1];
            if (d >= d2) {
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d <= d3) {
                double d4 = d3 - dArr[i];
                double[][] dArr2 = this.f21453b;
                return (dArr2[i2][0] - dArr2[i][0]) / d4;
            }
            i = i2;
        }
        return 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6889f(double d, double[] dArr) {
        double[] dArr2 = this.f21452a;
        int length = dArr2.length;
        double[][] dArr3 = this.f21453b;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            d = d2;
        } else {
            d2 = dArr2[length - 1];
            if (d >= d2) {
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d <= d3) {
                double d4 = d3 - dArr2[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = (dArr3[i2][i3] - dArr3[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: g */
    public final double[] mo6890g() {
        return this.f21452a;
    }
}
