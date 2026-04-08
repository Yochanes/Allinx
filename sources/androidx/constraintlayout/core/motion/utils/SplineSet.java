package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class SplineSet {

    /* JADX INFO: renamed from: a */
    public CurveFit f21466a;

    /* JADX INFO: renamed from: b */
    public int[] f21467b = new int[10];

    /* JADX INFO: renamed from: c */
    public float[] f21468c = new float[10];

    /* JADX INFO: renamed from: d */
    public int f21469d;

    /* JADX INFO: renamed from: e */
    public String f21470e;

    /* JADX INFO: compiled from: Proguard */
    public static class CoreSpline extends SplineSet {

        /* JADX INFO: renamed from: f */
        public String f21471f;

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: d */
        public final void mo6922d(MotionWidget motionWidget, float f) {
            byte b2;
            int i = -1;
            String str = this.f21471f;
            motionWidget.getClass();
            int iM6935a = TypedValues.AttributesType.m6935a(str);
            if (iM6935a == -1) {
                switch (str.hashCode()) {
                    case -2033446275:
                        b2 = !str.equals("AnimateCircleAngleTo") ? (byte) -1 : (byte) 0;
                        break;
                    case -1532277420:
                        b2 = !str.equals("QuantizeMotionPhase") ? (byte) -1 : (byte) 1;
                        break;
                    case -1529145600:
                        b2 = !str.equals("QuantizeMotionSteps") ? (byte) -1 : (byte) 2;
                        break;
                    case -1498310144:
                        b2 = !str.equals("PathRotate") ? (byte) -1 : (byte) 3;
                        break;
                    case -1030753096:
                        b2 = !str.equals("QuantizeInterpolator") ? (byte) -1 : (byte) 4;
                        break;
                    case -762370135:
                        b2 = !str.equals("DrawPath") ? (byte) -1 : (byte) 5;
                        break;
                    case -232872051:
                        b2 = !str.equals("Stagger") ? (byte) -1 : (byte) 6;
                        break;
                    case 1138491429:
                        b2 = !str.equals("PolarRelativeTo") ? (byte) -1 : (byte) 7;
                        break;
                    case 1539234834:
                        b2 = !str.equals("QuantizeInterpolatorType") ? (byte) -1 : (byte) 8;
                        break;
                    case 1583722451:
                        b2 = !str.equals("QuantizeInterpolatorID") ? (byte) -1 : (byte) 9;
                        break;
                    case 1639368448:
                        b2 = !str.equals("TransitionEasing") ? (byte) -1 : (byte) 10;
                        break;
                    case 1900899336:
                        b2 = !str.equals("AnimateRelativeTo") ? (byte) -1 : Ascii.f42547VT;
                        break;
                    case 2109694967:
                        b2 = !str.equals("PathMotionArc") ? (byte) -1 : Ascii.f42536FF;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        i = 606;
                        break;
                    case 1:
                        i = 602;
                        break;
                    case 2:
                        i = 610;
                        break;
                    case 3:
                        i = 601;
                        break;
                    case 4:
                        i = 604;
                        break;
                    case 5:
                        i = 608;
                        break;
                    case 6:
                        i = 600;
                        break;
                    case 7:
                        i = 609;
                        break;
                    case 8:
                        i = 611;
                        break;
                    case 9:
                        i = 612;
                        break;
                    case 10:
                        i = 603;
                        break;
                    case 11:
                        i = 605;
                        break;
                    case TYPE_BYTES_VALUE:
                        i = 607;
                        break;
                }
            } else {
                i = iM6935a;
            }
            motionWidget.mo6860d(m6920a(f), i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CustomSet extends SplineSet {
        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: c */
        public final void mo6921c(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: e */
        public final void mo6923e(int i) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CustomSpline extends SplineSet {

        /* JADX INFO: renamed from: f */
        public KeyFrameArray.CustomVar f21472f;

        /* JADX INFO: renamed from: g */
        public float[] f21473g;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: c */
        public final void mo6921c(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: d */
        public final void mo6922d(MotionWidget motionWidget, float f) {
            this.f21466a.mo6887d(f, this.f21473g);
            KeyFrameArray.CustomVar customVar = this.f21472f;
            customVar.f21450b[customVar.f21449a[0]].m6856f(motionWidget, this.f21473g);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: e */
        public final void mo6923e(int i) {
            KeyFrameArray.CustomVar customVar = this.f21472f;
            int i2 = customVar.f21451c;
            int iM6855e = customVar.f21450b[customVar.f21449a[0]].m6855e();
            double[] dArr = new double[i2];
            this.f21473g = new float[iM6855e];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, iM6855e);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = customVar.f21449a[i3];
                CustomVariable customVariable = customVar.f21450b[i4];
                dArr[i3] = ((double) i4) * 0.01d;
                customVariable.m6854d(this.f21473g);
                int i5 = 0;
                while (true) {
                    if (i5 < this.f21473g.length) {
                        dArr2[i3][i5] = r7[i5];
                        i5++;
                    }
                }
            }
            this.f21466a = CurveFit.m6898a(i, dArr, dArr2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Sort {
    }

    /* JADX INFO: renamed from: b */
    public static SplineSet m6919b(String str) {
        CoreSpline coreSpline = new CoreSpline();
        coreSpline.f21471f = str;
        return coreSpline;
    }

    /* JADX INFO: renamed from: a */
    public final float m6920a(float f) {
        return (float) this.f21466a.mo6885b(f);
    }

    /* JADX INFO: renamed from: c */
    public void mo6921c(float f, int i) {
        int[] iArr = this.f21467b;
        if (iArr.length < this.f21469d + 1) {
            this.f21467b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f21468c;
            this.f21468c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f21467b;
        int i2 = this.f21469d;
        iArr2[i2] = i;
        this.f21468c[i2] = f;
        this.f21469d = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public void mo6922d(MotionWidget motionWidget, float f) {
        motionWidget.mo6860d(m6920a(f), TypedValues.AttributesType.m6935a(this.f21470e));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6923e(int i) {
        int i2 = this.f21469d;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f21467b;
        float[] fArr = this.f21468c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
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
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
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
        int i15 = 1;
        for (int i16 = 1; i16 < this.f21469d; i16++) {
            int[] iArr3 = this.f21467b;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f21469d; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f21467b;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f21467b[i18]) * 0.01d;
                    dArr2[i17][0] = this.f21468c[i18];
                    i17++;
                }
            }
        }
        this.f21466a = CurveFit.m6898a(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f21470e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f21469d; i++) {
            StringBuilder sbM21r = AbstractC0000a.m21r(string, "[");
            sbM21r.append(this.f21467b[i]);
            sbM21r.append(" , ");
            sbM21r.append(decimalFormat.format(this.f21468c[i]));
            sbM21r.append("] ");
            string = sbM21r.toString();
        }
        return string;
    }
}
