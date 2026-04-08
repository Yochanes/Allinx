package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class CurveFit {

    /* JADX INFO: compiled from: Proguard */
    public static class Constant extends CurveFit {

        /* JADX INFO: renamed from: a */
        public double f21417a;

        /* JADX INFO: renamed from: b */
        public double[] f21418b;

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        /* JADX INFO: renamed from: b */
        public final double mo6885b(double d) {
            return this.f21418b[0];
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        /* JADX INFO: renamed from: c */
        public final void mo6886c(double d, double[] dArr) {
            double[] dArr2 = this.f21418b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        /* JADX INFO: renamed from: d */
        public final void mo6887d(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f21418b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        /* JADX INFO: renamed from: e */
        public final double mo6888e(double d) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        /* JADX INFO: renamed from: f */
        public final void mo6889f(double d, double[] dArr) {
            for (int i = 0; i < this.f21418b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        /* JADX INFO: renamed from: g */
        public final double[] mo6890g() {
            return new double[]{this.f21417a};
        }
    }

    /* JADX INFO: renamed from: a */
    public static CurveFit m6898a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new MonotonicCurveFit(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            Constant constant = new Constant();
            constant.f21417a = d;
            constant.f21418b = dArr3;
            return constant;
        }
        LinearCurveFit linearCurveFit = new LinearCurveFit();
        int length = dArr2[0].length;
        linearCurveFit.f21454c = new double[length];
        linearCurveFit.f21452a = dArr;
        linearCurveFit.f21453b = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return linearCurveFit;
    }

    /* JADX INFO: renamed from: b */
    public abstract double mo6885b(double d);

    /* JADX INFO: renamed from: c */
    public abstract void mo6886c(double d, double[] dArr);

    /* JADX INFO: renamed from: d */
    public abstract void mo6887d(double d, float[] fArr);

    /* JADX INFO: renamed from: e */
    public abstract double mo6888e(double d);

    /* JADX INFO: renamed from: f */
    public abstract void mo6889f(double d, double[] dArr);

    /* JADX INFO: renamed from: g */
    public abstract double[] mo6890g();
}
