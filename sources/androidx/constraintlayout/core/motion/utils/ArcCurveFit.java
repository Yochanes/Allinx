package androidx.constraintlayout.core.motion.utils;

import com.engagelab.privates.common.observer.MTObservable;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ArcCurveFit extends CurveFit {

    /* JADX INFO: renamed from: a */
    public final double[] f21396a;

    /* JADX INFO: renamed from: b */
    public final Arc[] f21397b;

    /* JADX INFO: compiled from: Proguard */
    public static class Arc {

        /* JADX INFO: renamed from: s */
        public static final double[] f21398s = new double[91];

        /* JADX INFO: renamed from: a */
        public double[] f21399a;

        /* JADX INFO: renamed from: b */
        public double f21400b;

        /* JADX INFO: renamed from: c */
        public double f21401c;

        /* JADX INFO: renamed from: d */
        public double f21402d;

        /* JADX INFO: renamed from: e */
        public double f21403e;

        /* JADX INFO: renamed from: f */
        public double f21404f;

        /* JADX INFO: renamed from: g */
        public double f21405g;

        /* JADX INFO: renamed from: h */
        public double f21406h;

        /* JADX INFO: renamed from: i */
        public double f21407i;

        /* JADX INFO: renamed from: j */
        public double f21408j;

        /* JADX INFO: renamed from: k */
        public double f21409k;

        /* JADX INFO: renamed from: l */
        public double f21410l;

        /* JADX INFO: renamed from: m */
        public double f21411m;

        /* JADX INFO: renamed from: n */
        public double f21412n;

        /* JADX INFO: renamed from: o */
        public double f21413o;

        /* JADX INFO: renamed from: p */
        public double f21414p;

        /* JADX INFO: renamed from: q */
        public boolean f21415q;

        /* JADX INFO: renamed from: r */
        public boolean f21416r;

        /* JADX INFO: renamed from: a */
        public final double m6891a() {
            double d = this.f21408j * this.f21414p;
            double dHypot = this.f21412n / Math.hypot(d, (-this.f21409k) * this.f21413o);
            return this.f21415q ? (-d) * dHypot : d * dHypot;
        }

        /* JADX INFO: renamed from: b */
        public final double m6892b() {
            double d = this.f21408j * this.f21414p;
            double d2 = (-this.f21409k) * this.f21413o;
            double dHypot = this.f21412n / Math.hypot(d, d2);
            return this.f21415q ? (-d2) * dHypot : d2 * dHypot;
        }

        /* JADX INFO: renamed from: c */
        public final double m6893c(double d) {
            double d2 = (d - this.f21401c) * this.f21407i;
            double d3 = this.f21404f;
            double d4 = this.f21403e;
            return ((d3 - d4) * d2) + d4;
        }

        /* JADX INFO: renamed from: d */
        public final double m6894d(double d) {
            double d2 = (d - this.f21401c) * this.f21407i;
            double d3 = this.f21406h;
            double d4 = this.f21405g;
            return ((d3 - d4) * d2) + d4;
        }

        /* JADX INFO: renamed from: e */
        public final double m6895e() {
            return (this.f21408j * this.f21413o) + this.f21410l;
        }

        /* JADX INFO: renamed from: f */
        public final double m6896f() {
            return (this.f21409k * this.f21414p) + this.f21411m;
        }

        /* JADX INFO: renamed from: g */
        public final void m6897g(double d) {
            double d2 = (this.f21415q ? this.f21402d - d : d - this.f21401c) * this.f21407i;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.f21399a;
                    double length = d2 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.f21413o = Math.sin(d5);
            this.f21414p = Math.cos(d5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.core.motion.utils.ArcCurveFit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        double d;
        double d2;
        boolean z2;
        int i;
        int i2;
        double[] dArr3;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.f21396a = dArr4;
        int i3 = 1;
        obj.f21397b = new Arc[dArr4.length - 1];
        char c2 = 0;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        ArcCurveFit arcCurveFit = obj;
        while (true) {
            Arc[] arcArr = arcCurveFit.f21397b;
            if (i4 >= arcArr.length) {
                return;
            }
            int i7 = iArr[i4];
            if (i7 == 0) {
                i6 = 3;
            } else if (i7 == i3) {
                i5 = i3;
                i6 = i5;
            } else {
                if (i7 != 2) {
                    if (i7 == 3) {
                        if (i5 == i3) {
                        }
                        i6 = i5;
                    } else if (i7 == 4) {
                        i6 = 4;
                    } else if (i7 == 5) {
                        i6 = 5;
                    }
                }
                i5 = 2;
                i6 = i5;
            }
            double d3 = dArr4[i4];
            int i8 = i4 + 1;
            double d4 = dArr4[i8];
            double[] dArr5 = dArr2[i4];
            double d5 = dArr5[c2];
            int i9 = i3;
            int i10 = i4;
            double d6 = dArr5[i9];
            double[] dArr6 = dArr2[i8];
            boolean z3 = c2;
            double d7 = dArr6[z3 ? 1 : 0];
            double d8 = dArr6[i9];
            Arc arc = new Arc();
            arc.f21416r = z3;
            int i11 = i5;
            double d9 = d7 - d5;
            double d10 = d8 - d6;
            boolean z4 = i9;
            if (i6 != z4) {
                if (i6 == 4) {
                    arc.f21415q = d10 > 0.0d;
                } else if (i6 != 5) {
                    arc.f21415q = false;
                } else {
                    arc.f21415q = d10 < 0.0d;
                }
                d = d9;
                d2 = d3;
                z2 = true;
            } else {
                arc.f21415q = z4;
                d = d9;
                d2 = d3;
                z2 = z4;
            }
            arc.f21401c = d2;
            arc.f21402d = d4;
            double d11 = d4 - d2;
            double d12 = 1.0d / d11;
            arc.f21407i = d12;
            if (3 == i6) {
                arc.f21416r = z2;
            }
            if (arc.f21416r || Math.abs(d) < 0.001d || Math.abs(d10) < 0.001d) {
                i = i6;
                i2 = 1;
                arc.f21416r = true;
                arc.f21403e = d5;
                arc.f21404f = d7;
                arc.f21405g = d6;
                arc.f21406h = d8;
                double d13 = d;
                double dHypot = Math.hypot(d10, d13);
                arc.f21400b = dHypot;
                arc.f21412n = dHypot * d12;
                arc.f21410l = d13 / d11;
                arc.f21411m = d10 / d11;
            } else {
                arc.f21399a = new double[MTObservable.WHAT_OBSERVER];
                boolean z5 = arc.f21415q;
                arc.f21408j = ((double) (z5 ? -1 : 1)) * d;
                arc.f21409k = d10 * ((double) (z5 ? 1 : -1));
                arc.f21410l = z5 ? d7 : d5;
                arc.f21411m = z5 ? d6 : d8;
                double d14 = d6 - d8;
                double dHypot2 = 0.0d;
                double d15 = 0.0d;
                double d16 = 0.0d;
                int i12 = 0;
                while (true) {
                    dArr3 = Arc.f21398s;
                    if (i12 >= 91) {
                        break;
                    }
                    int i13 = i6;
                    double radians = Math.toRadians((((double) i12) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d;
                    double dCos = Math.cos(radians) * d14;
                    if (i12 > 0) {
                        dHypot2 += Math.hypot(dSin - d15, dCos - d16);
                        dArr3[i12] = dHypot2;
                    }
                    i12++;
                    d16 = dCos;
                    d15 = dSin;
                    i6 = i13;
                }
                i = i6;
                arc.f21400b = dHypot2;
                for (int i14 = 0; i14 < 91; i14++) {
                    dArr3[i14] = dArr3[i14] / dHypot2;
                }
                int i15 = 0;
                while (true) {
                    double[] dArr7 = arc.f21399a;
                    if (i15 >= dArr7.length) {
                        break;
                    }
                    double length = ((double) i15) / ((double) (dArr7.length - 1));
                    int iBinarySearch = Arrays.binarySearch(dArr3, length);
                    if (iBinarySearch >= 0) {
                        dArr7[i15] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr7[i15] = 0.0d;
                    } else {
                        int i16 = -iBinarySearch;
                        int i17 = i16 - 2;
                        double d17 = dArr3[i17];
                        dArr7[i15] = (((length - d17) / (dArr3[i16 - 1] - d17)) + ((double) i17)) / ((double) 90);
                    }
                    i15++;
                }
                arc.f21412n = arc.f21400b * arc.f21407i;
                i2 = 1;
            }
            arcArr[i10] = arc;
            arcCurveFit = this;
            dArr4 = dArr;
            i3 = i2;
            i4 = i8;
            i5 = i11;
            i6 = i;
            c2 = 0;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: b */
    public final double mo6885b(double d) {
        Arc[] arcArr = this.f21397b;
        Arc arc = arcArr[0];
        double d2 = arc.f21401c;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.f21416r) {
                return (d3 * arcArr[0].f21410l) + arc.m6893c(d2);
            }
            arc.m6897g(d2);
            return (d3 * arcArr[0].m6891a()) + arcArr[0].m6895e();
        }
        if (d > arcArr[arcArr.length - 1].f21402d) {
            double d4 = arcArr[arcArr.length - 1].f21402d;
            double d5 = d - d4;
            int length = arcArr.length - 1;
            return (d5 * arcArr[length].f21410l) + arcArr[length].m6893c(d4);
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc2 = arcArr[i];
            if (d <= arc2.f21402d) {
                if (arc2.f21416r) {
                    return arc2.m6893c(d);
                }
                arc2.m6897g(d);
                return arcArr[i].m6895e();
            }
        }
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: c */
    public final void mo6886c(double d, double[] dArr) {
        Arc[] arcArr = this.f21397b;
        Arc arc = arcArr[0];
        double d2 = arc.f21401c;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.f21416r) {
                double dM6893c = arc.m6893c(d2);
                Arc arc2 = arcArr[0];
                dArr[0] = (arc2.f21410l * d3) + dM6893c;
                dArr[1] = (d3 * arcArr[0].f21411m) + arc2.m6894d(d2);
                return;
            }
            arc.m6897g(d2);
            dArr[0] = (arcArr[0].m6891a() * d3) + arcArr[0].m6895e();
            dArr[1] = (d3 * arcArr[0].m6892b()) + arcArr[0].m6896f();
            return;
        }
        if (d <= arcArr[arcArr.length - 1].f21402d) {
            for (int i = 0; i < arcArr.length; i++) {
                Arc arc3 = arcArr[i];
                if (d <= arc3.f21402d) {
                    if (arc3.f21416r) {
                        dArr[0] = arc3.m6893c(d);
                        dArr[1] = arcArr[i].m6894d(d);
                        return;
                    } else {
                        arc3.m6897g(d);
                        dArr[0] = arcArr[i].m6895e();
                        dArr[1] = arcArr[i].m6896f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = arcArr[arcArr.length - 1].f21402d;
        double d5 = d - d4;
        int length = arcArr.length - 1;
        Arc arc4 = arcArr[length];
        if (arc4.f21416r) {
            double dM6893c2 = arc4.m6893c(d4);
            Arc arc5 = arcArr[length];
            dArr[0] = (arc5.f21410l * d5) + dM6893c2;
            dArr[1] = (d5 * arcArr[length].f21411m) + arc5.m6894d(d4);
            return;
        }
        arc4.m6897g(d);
        dArr[0] = (arcArr[length].m6891a() * d5) + arcArr[length].m6895e();
        dArr[1] = (d5 * arcArr[length].m6892b()) + arcArr[length].m6896f();
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: d */
    public final void mo6887d(double d, float[] fArr) {
        Arc[] arcArr = this.f21397b;
        Arc arc = arcArr[0];
        double d2 = arc.f21401c;
        if (d < d2) {
            double d3 = d - d2;
            if (arc.f21416r) {
                double dM6893c = arc.m6893c(d2);
                Arc arc2 = arcArr[0];
                fArr[0] = (float) ((arc2.f21410l * d3) + dM6893c);
                fArr[1] = (float) ((d3 * arcArr[0].f21411m) + arc2.m6894d(d2));
                return;
            }
            arc.m6897g(d2);
            fArr[0] = (float) ((arcArr[0].m6891a() * d3) + arcArr[0].m6895e());
            fArr[1] = (float) ((d3 * arcArr[0].m6892b()) + arcArr[0].m6896f());
            return;
        }
        if (d <= arcArr[arcArr.length - 1].f21402d) {
            for (int i = 0; i < arcArr.length; i++) {
                Arc arc3 = arcArr[i];
                if (d <= arc3.f21402d) {
                    if (arc3.f21416r) {
                        fArr[0] = (float) arc3.m6893c(d);
                        fArr[1] = (float) arcArr[i].m6894d(d);
                        return;
                    } else {
                        arc3.m6897g(d);
                        fArr[0] = (float) arcArr[i].m6895e();
                        fArr[1] = (float) arcArr[i].m6896f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = arcArr[arcArr.length - 1].f21402d;
        double d5 = d - d4;
        int length = arcArr.length - 1;
        Arc arc4 = arcArr[length];
        if (!arc4.f21416r) {
            arc4.m6897g(d);
            fArr[0] = (float) arcArr[length].m6895e();
            fArr[1] = (float) arcArr[length].m6896f();
        } else {
            double dM6893c2 = arc4.m6893c(d4);
            Arc arc5 = arcArr[length];
            fArr[0] = (float) ((arc5.f21410l * d5) + dM6893c2);
            fArr[1] = (float) ((d5 * arcArr[length].f21411m) + arc5.m6894d(d4));
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: e */
    public final double mo6888e(double d) {
        Arc[] arcArr = this.f21397b;
        double d2 = arcArr[0].f21401c;
        if (d < d2) {
            d = d2;
        }
        if (d > arcArr[arcArr.length - 1].f21402d) {
            d = arcArr[arcArr.length - 1].f21402d;
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc = arcArr[i];
            if (d <= arc.f21402d) {
                if (arc.f21416r) {
                    return arc.f21410l;
                }
                arc.m6897g(d);
                return arcArr[i].m6891a();
            }
        }
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: f */
    public final void mo6889f(double d, double[] dArr) {
        Arc[] arcArr = this.f21397b;
        double d2 = arcArr[0].f21401c;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].f21402d) {
            d = arcArr[arcArr.length - 1].f21402d;
        }
        for (int i = 0; i < arcArr.length; i++) {
            Arc arc = arcArr[i];
            if (d <= arc.f21402d) {
                if (arc.f21416r) {
                    dArr[0] = arc.f21410l;
                    dArr[1] = arc.f21411m;
                    return;
                } else {
                    arc.m6897g(d);
                    dArr[0] = arcArr[i].m6891a();
                    dArr[1] = arcArr[i].m6892b();
                    return;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /* JADX INFO: renamed from: g */
    public final double[] mo6890g() {
        return this.f21396a;
    }
}
