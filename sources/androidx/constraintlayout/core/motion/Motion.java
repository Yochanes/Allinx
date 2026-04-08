package androidx.constraintlayout.core.motion;

import androidx.compose.animation.AbstractC0455a;
import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Motion implements TypedValues {

    /* JADX INFO: renamed from: D */
    public Motion f21274D;

    /* JADX INFO: renamed from: a */
    public final MotionWidget f21275a;

    /* JADX INFO: renamed from: g */
    public CurveFit[] f21281g;

    /* JADX INFO: renamed from: h */
    public ArcCurveFit f21282h;

    /* JADX INFO: renamed from: l */
    public int[] f21286l;

    /* JADX INFO: renamed from: m */
    public double[] f21287m;

    /* JADX INFO: renamed from: n */
    public double[] f21288n;

    /* JADX INFO: renamed from: o */
    public String[] f21289o;

    /* JADX INFO: renamed from: p */
    public int[] f21290p;

    /* JADX INFO: renamed from: u */
    public HashMap f21295u;

    /* JADX INFO: renamed from: v */
    public HashMap f21296v;

    /* JADX INFO: renamed from: w */
    public HashMap f21297w;

    /* JADX INFO: renamed from: x */
    public MotionKeyTrigger[] f21298x;

    /* JADX INFO: renamed from: b */
    public int f21276b = 0;

    /* JADX INFO: renamed from: c */
    public final MotionPaths f21277c = new MotionPaths();

    /* JADX INFO: renamed from: d */
    public final MotionPaths f21278d = new MotionPaths();

    /* JADX INFO: renamed from: e */
    public final MotionConstrainedPoint f21279e = new MotionConstrainedPoint();

    /* JADX INFO: renamed from: f */
    public final MotionConstrainedPoint f21280f = new MotionConstrainedPoint();

    /* JADX INFO: renamed from: i */
    public float f21283i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f21284j = 0.0f;

    /* JADX INFO: renamed from: k */
    public float f21285k = 1.0f;

    /* JADX INFO: renamed from: q */
    public final float[] f21291q = new float[4];

    /* JADX INFO: renamed from: r */
    public final ArrayList f21292r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final float[] f21293s = new float[1];

    /* JADX INFO: renamed from: t */
    public final ArrayList f21294t = new ArrayList();

    /* JADX INFO: renamed from: y */
    public int f21299y = -1;

    /* JADX INFO: renamed from: z */
    public final int f21300z = -1;

    /* JADX INFO: renamed from: A */
    public int f21271A = -1;

    /* JADX INFO: renamed from: B */
    public float f21272B = Float.NaN;

    /* JADX INFO: renamed from: C */
    public DifferentialInterpolator f21273C = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.Motion$1 */
    /* JADX INFO: compiled from: Proguard */
    class C13841 implements DifferentialInterpolator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Easing f21301a;

        public C13841(Easing easing) {
            this.f21301a = easing;
        }
    }

    public Motion(MotionWidget motionWidget) {
        this.f21275a = motionWidget;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public final boolean mo6857a(int i, int i2) {
        if (i == 509) {
            this.f21299y = i2;
            return true;
        }
        if (i != 610) {
            return i == 704;
        }
        this.f21271A = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public final boolean mo6858b(int i, String str) {
        if (705 == i || 611 == i) {
            this.f21273C = new C13841(Easing.m6899c(str));
            return true;
        }
        if (605 != i) {
            return false;
        }
        this.f21277c.f21325o = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: c */
    public final boolean mo6859c(int i, boolean z2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public final boolean mo6860d(float f, int i) {
        if (602 == i) {
            this.f21272B = f;
            return true;
        }
        if (600 != i) {
            return false;
        }
        this.f21283i = f;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final int m6861e(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo6890g = this.f21281g[0].mo6890g();
        ArrayList arrayList = this.f21292r;
        if (iArr != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((MotionPaths) it.next()).f21329s;
                i++;
            }
        }
        if (iArr2 != null) {
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (((MotionPaths) it2.next()).f21318c * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < dArrMo6890g.length; i4++) {
            this.f21281g[0].mo6886c(dArrMo6890g[i4], this.f21287m);
            this.f21277c.m6877c(dArrMo6890g[i4], this.f21286l, this.f21287m, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m6862f(int i, float[] fArr) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap map = this.f21296v;
        SplineSet splineSet = map == null ? null : (SplineSet) map.get("translationX");
        HashMap map2 = this.f21296v;
        SplineSet splineSet2 = map2 == null ? null : (SplineSet) map2.get("translationY");
        HashMap map3 = this.f21297w;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : (KeyCycleOscillator) map3.get("translationX");
        HashMap map4 = this.f21297w;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? (KeyCycleOscillator) map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float fMin = i3 * f2;
            float f3 = this.f21285k;
            float f4 = 0.0f;
            if (f3 != f) {
                float f5 = this.f21284j;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            double dMo6900a = fMin;
            Easing easing = this.f21277c.f21316a;
            float f6 = Float.NaN;
            for (MotionPaths motionPaths : this.f21292r) {
                Easing easing2 = motionPaths.f21316a;
                if (easing2 != null) {
                    float f7 = motionPaths.f21317b;
                    if (f7 < fMin) {
                        f4 = f7;
                        easing = easing2;
                    } else if (Float.isNaN(f6)) {
                        f6 = motionPaths.f21317b;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                dMo6900a = (((float) easing.mo6900a((fMin - f4) / r16)) * (f6 - f4)) + f4;
            }
            this.f21281g[0].mo6886c(dMo6900a, this.f21287m);
            ArcCurveFit arcCurveFit = this.f21282h;
            if (arcCurveFit != null) {
                double[] dArr = this.f21287m;
                if (dArr.length > 0) {
                    arcCurveFit.mo6886c(dMo6900a, dArr);
                }
            }
            int i4 = i3 * 2;
            this.f21277c.m6877c(dMo6900a, this.f21286l, this.f21287m, fArr, i4);
            if (keyCycleOscillator != null) {
                fArr[i4] = keyCycleOscillator.m6906a(fMin) + fArr[i4];
            } else if (splineSet != null) {
                fArr[i4] = splineSet.m6920a(fMin) + fArr[i4];
            }
            if (keyCycleOscillator2 != null) {
                int i5 = i4 + 1;
                fArr[i5] = keyCycleOscillator2.m6906a(fMin) + fArr[i5];
            } else if (splineSet2 != null) {
                int i6 = i4 + 1;
                fArr[i6] = splineSet2.m6920a(fMin) + fArr[i6];
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m6863g(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f21285k;
            if (f3 != 1.0d) {
                float f4 = this.f21284j;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.f21277c.f21316a;
        float f5 = Float.NaN;
        for (MotionPaths motionPaths : this.f21292r) {
            Easing easing2 = motionPaths.f21316a;
            if (easing2 != null) {
                float f6 = motionPaths.f21317b;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.f21317b;
                }
            }
        }
        if (easing != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) easing.mo6900a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.mo6901b(d);
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: h */
    public final void m6864h(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f21281g[0].mo6886c(d, dArr);
        this.f21281g[0].mo6889f(d, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f21286l;
        MotionPaths motionPaths = this.f21277c;
        float f3 = motionPaths.f21319d;
        float f4 = motionPaths.f21320f;
        float f5 = motionPaths.f21321g;
        float f6 = motionPaths.f21322i;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f10;
                f2 = f11;
            } else if (i2 == 2) {
                f4 = f10;
                f9 = f11;
            } else if (i2 == 3) {
                f5 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f6 = f10;
                f8 = f11;
            }
        }
        float f12 = (f7 / 2.0f) + f2;
        float fSin = (f8 / 2.0f) + f9;
        Motion motion = motionPaths.f21327q;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.m6864h(d, fArr3, fArr4);
            float f13 = fArr3[0];
            float f14 = fArr3[1];
            float f15 = fArr4[0];
            float f16 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float fSin2 = (float) (((Math.sin(d3) * d2) + ((double) f13)) - ((double) (f5 / 2.0f)));
            float fCos = (float) ((((double) f14) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
            double d4 = f2;
            f = 2.0f;
            double d5 = f9;
            float fCos2 = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + ((double) f15));
            fSin = (float) ((Math.sin(d3) * d5) + (((double) f16) - (Math.cos(d3) * d4)));
            f4 = fCos;
            f3 = fSin2;
            f12 = fCos2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + 0.0f;
        fArr[1] = (f6 / f) + f4 + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = fSin;
    }

    /* JADX INFO: renamed from: i */
    public final void m6865i(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f21293s;
        float fM6863g = m6863g(f, fArr2);
        CurveFit[] curveFitArr = this.f21281g;
        int i = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.f21278d;
            float f4 = motionPaths.f21319d;
            MotionPaths motionPaths2 = this.f21277c;
            float f5 = f4 - motionPaths2.f21319d;
            float f6 = motionPaths.f21320f - motionPaths2.f21320f;
            float f7 = motionPaths.f21321g - motionPaths2.f21321g;
            float f8 = (motionPaths.f21322i - motionPaths2.f21322i) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            return;
        }
        double d = fM6863g;
        curveFitArr[0].mo6889f(d, this.f21288n);
        this.f21281g[0].mo6886c(d, this.f21287m);
        float f9 = fArr2[0];
        while (true) {
            dArr = this.f21288n;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        ArcCurveFit arcCurveFit = this.f21282h;
        if (arcCurveFit == null) {
            int[] iArr = this.f21286l;
            this.f21277c.getClass();
            MotionPaths.m6875d(f2, f3, fArr, iArr, dArr);
            return;
        }
        double[] dArr2 = this.f21287m;
        if (dArr2.length > 0) {
            arcCurveFit.mo6886c(d, dArr2);
            this.f21282h.mo6889f(d, this.f21288n);
            int[] iArr2 = this.f21286l;
            double[] dArr3 = this.f21288n;
            this.f21277c.getClass();
            MotionPaths.m6875d(f2, f3, fArr, iArr2, dArr3);
        }
    }

    /* JADX INFO: renamed from: j */
    public final float m6866j() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dMo6900a = f2;
            Easing easing = this.f21277c.f21316a;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (MotionPaths motionPaths : this.f21292r) {
                Easing easing2 = motionPaths.f21316a;
                if (easing2 != null) {
                    float f5 = motionPaths.f21317b;
                    if (f5 < f2) {
                        easing = easing2;
                        f4 = f5;
                    } else if (Float.isNaN(f3)) {
                        f3 = motionPaths.f21317b;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                dMo6900a = (((float) easing.mo6900a((f2 - f4) / r17)) * (f3 - f4)) + f4;
            }
            double d3 = dMo6900a;
            this.f21281g[0].mo6886c(d3, this.f21287m);
            int i2 = i;
            this.f21277c.m6877c(d3, this.f21286l, this.f21287m, fArr, 0);
            if (i2 > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return fHypot;
    }

    /* JADX INFO: renamed from: k */
    public final void m6867k(MotionWidget motionWidget, float f) {
        char c2;
        float f2;
        float f3;
        float f4;
        MotionPaths motionPaths;
        float f5;
        MotionPaths motionPaths2;
        float fM6863g = m6863g(f, null);
        int i = this.f21271A;
        if (i != -1) {
            float f6 = 1.0f / i;
            float fFloor = ((float) Math.floor(fM6863g / f6)) * f6;
            float f7 = (fM6863g % f6) / f6;
            if (!Float.isNaN(this.f21272B)) {
                f7 = (f7 + this.f21272B) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.f21273C;
            fM6863g = ((differentialInterpolator != null ? (float) ((C13841) differentialInterpolator).f21301a.mo6900a(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + fFloor;
        }
        HashMap map = this.f21296v;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((SplineSet) it.next()).mo6922d(motionWidget, fM6863g);
            }
        }
        CurveFit[] curveFitArr = this.f21281g;
        MotionPaths motionPaths3 = this.f21277c;
        if (curveFitArr != null) {
            double d = fM6863g;
            curveFitArr[0].mo6886c(d, this.f21287m);
            this.f21281g[0].mo6889f(d, this.f21288n);
            ArcCurveFit arcCurveFit = this.f21282h;
            if (arcCurveFit != null) {
                double[] dArr = this.f21287m;
                if (dArr.length > 0) {
                    arcCurveFit.mo6886c(d, dArr);
                    this.f21282h.mo6889f(d, this.f21288n);
                }
            }
            int[] iArr = this.f21286l;
            double[] dArr2 = this.f21287m;
            double[] dArr3 = this.f21288n;
            float f8 = motionPaths3.f21319d;
            float f9 = motionPaths3.f21320f;
            float f10 = motionPaths3.f21321g;
            c2 = 0;
            float f11 = motionPaths3.f21322i;
            if (iArr.length != 0 && motionPaths3.f21330t.length <= iArr[iArr.length - 1]) {
                int i2 = iArr[iArr.length - 1] + 1;
                motionPaths3.f21330t = new double[i2];
                motionPaths3.f21331u = new double[i2];
            }
            Arrays.fill(motionPaths3.f21330t, Double.NaN);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                double[] dArr4 = motionPaths3.f21330t;
                int i4 = iArr[i3];
                dArr4[i4] = dArr2[i3];
                motionPaths3.f21331u[i4] = dArr3[i3];
            }
            float f12 = Float.NaN;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            int i5 = 0;
            float f16 = f10;
            float f17 = 0.0f;
            while (true) {
                double[] dArr5 = motionPaths3.f21330t;
                f3 = f16;
                if (i5 >= dArr5.length) {
                    break;
                }
                if (Double.isNaN(dArr5[i5])) {
                    motionPaths2 = motionPaths3;
                    f5 = f11;
                } else {
                    f5 = f11;
                    f16 = (float) (Double.isNaN(motionPaths3.f21330t[i5]) ? 0.0d : motionPaths3.f21330t[i5] + 0.0d);
                    motionPaths2 = motionPaths3;
                    float f18 = (float) motionPaths3.f21331u[i5];
                    if (i5 == 1) {
                        f13 = f18;
                        f8 = f16;
                    } else if (i5 == 2) {
                        f14 = f18;
                        f9 = f16;
                    } else if (i5 == 3) {
                        f17 = f18;
                        f11 = f5;
                        i5++;
                        motionPaths3 = motionPaths2;
                    } else if (i5 == 4) {
                        f15 = f18;
                        f11 = f16;
                        f16 = f3;
                        i5++;
                        motionPaths3 = motionPaths2;
                    } else if (i5 == 5) {
                        f12 = f16;
                    }
                }
                f16 = f3;
                f11 = f5;
                i5++;
                motionPaths3 = motionPaths2;
            }
            MotionPaths motionPaths4 = motionPaths3;
            float f19 = f11;
            Motion motion = motionPaths4.f21327q;
            if (motion != null) {
                float[] fArr = new float[2];
                float[] fArr2 = new float[2];
                motion.m6864h(d, fArr, fArr2);
                float f20 = fArr[0];
                float f21 = fArr[1];
                float f22 = fArr2[0];
                float f23 = fArr2[1];
                f4 = fM6863g;
                motionPaths = motionPaths4;
                double d2 = f8;
                double d3 = f9;
                float fSin = (float) (((Math.sin(d3) * d2) + ((double) f20)) - ((double) (f3 / 2.0f)));
                float fCos = (float) ((((double) f21) - (Math.cos(d3) * d2)) - ((double) (f19 / 2.0f)));
                double d4 = f13;
                double dSin = Math.sin(d3) * d4;
                double dCos = Math.cos(d3) * d2;
                double d5 = f14;
                float f24 = (float) ((dCos * d5) + dSin + ((double) f22));
                float fSin2 = (float) ((Math.sin(d3) * d2 * d5) + (((double) f23) - (Math.cos(d3) * d4)));
                if (dArr3.length >= 2) {
                    dArr3[0] = f24;
                    dArr3[1] = fSin2;
                }
                if (!Float.isNaN(f12)) {
                    motionWidget.f21332a.f21742j = (float) (Math.toDegrees(Math.atan2(fSin2, f24)) + ((double) f12));
                }
                f8 = fSin;
                f9 = fCos;
            } else {
                f4 = fM6863g;
                motionPaths = motionPaths4;
                if (!Float.isNaN(f12)) {
                    motionWidget.f21332a.f21742j = ((float) (Math.toDegrees(Math.atan2((f15 / 2.0f) + f14, (f17 / 2.0f) + f13)) + ((double) f12))) + 0.0f;
                }
            }
            float f25 = f8 + 0.5f;
            int i6 = (int) f25;
            float f26 = f9 + 0.5f;
            int i7 = (int) f26;
            int i8 = (int) (f25 + f3);
            int i9 = (int) (f26 + f19);
            if (motionWidget.f21332a == null) {
                motionWidget.f21332a = new WidgetFrame((ConstraintWidget) null);
            }
            WidgetFrame widgetFrame = motionWidget.f21332a;
            widgetFrame.f21735c = i7;
            widgetFrame.f21734b = i6;
            widgetFrame.f21736d = i8;
            widgetFrame.f21737e = i9;
            if (this.f21300z != -1) {
                Object obj = null;
                obj.getClass();
            }
            int i10 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.f21281g;
                if (i10 >= curveFitArr2.length) {
                    break;
                }
                CurveFit curveFit = curveFitArr2[i10];
                float[] fArr3 = this.f21291q;
                curveFit.mo6887d(d, fArr3);
                ((CustomVariable) motionPaths.f21328r.get(this.f21289o[i10 - 1])).m6856f(motionWidget, fArr3);
                i10++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.f21279e;
            motionConstrainedPoint.getClass();
            if (f4 <= 0.0f) {
                motionWidget.f21334c.f21339a = motionConstrainedPoint.f21303b;
            } else {
                MotionConstrainedPoint motionConstrainedPoint2 = this.f21280f;
                if (f4 >= 1.0f) {
                    motionWidget.f21334c.f21339a = motionConstrainedPoint2.f21303b;
                } else if (motionConstrainedPoint2.f21303b != motionConstrainedPoint.f21303b) {
                    motionWidget.f21334c.f21339a = 4;
                }
            }
            if (this.f21298x != null) {
                int i11 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.f21298x;
                    if (i11 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i11].getClass();
                    i11++;
                }
            }
            f2 = f4;
        } else {
            c2 = 0;
            float f27 = motionPaths3.f21319d;
            MotionPaths motionPaths5 = this.f21278d;
            f2 = fM6863g;
            float fM4a = AbstractC0000a.m4a(motionPaths5.f21319d, f27, f2, f27);
            float f28 = motionPaths3.f21320f;
            float fM4a2 = AbstractC0000a.m4a(motionPaths5.f21320f, f28, f2, f28);
            float f29 = motionPaths3.f21321g;
            float fM4a3 = AbstractC0000a.m4a(motionPaths5.f21321g, f29, f2, f29);
            float f30 = motionPaths3.f21322i;
            float fM4a4 = AbstractC0000a.m4a(motionPaths5.f21322i, f30, f2, f30);
            float f31 = fM4a + 0.5f;
            int i12 = (int) f31;
            float f32 = fM4a2 + 0.5f;
            int i13 = (int) f32;
            int i14 = (int) (f31 + fM4a3);
            int i15 = (int) (f32 + fM4a4);
            if (motionWidget.f21332a == null) {
                motionWidget.f21332a = new WidgetFrame((ConstraintWidget) null);
            }
            WidgetFrame widgetFrame2 = motionWidget.f21332a;
            widgetFrame2.f21735c = i13;
            widgetFrame2.f21734b = i12;
            widgetFrame2.f21736d = i14;
            widgetFrame2.f21737e = i15;
        }
        HashMap map2 = this.f21297w;
        if (map2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : map2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr6 = this.f21288n;
                    motionWidget.f21332a.f21742j = ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).m6906a(f2) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[c2])));
                } else {
                    keyCycleOscillator.mo6911g(motionWidget, f2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6868l(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.f21278d;
        motionPaths.f21317b = 1.0f;
        motionPaths.f21318c = 1.0f;
        WidgetFrame widgetFrame = this.f21275a.f21332a;
        int i = widgetFrame.f21734b;
        float f = i;
        int i2 = widgetFrame.f21735c;
        float f2 = widgetFrame.f21736d - i;
        float f3 = widgetFrame.f21737e - i2;
        motionPaths.f21319d = f;
        motionPaths.f21320f = i2;
        motionPaths.f21321g = f2;
        motionPaths.f21322i = f3;
        WidgetFrame widgetFrame2 = motionWidget.f21332a;
        int i3 = widgetFrame2.f21734b;
        float f4 = i3;
        int i4 = widgetFrame2.f21735c;
        float f5 = widgetFrame2.f21736d - i3;
        float f6 = widgetFrame2.f21737e - i4;
        motionPaths.f21319d = f4;
        motionPaths.f21320f = i4;
        motionPaths.f21321g = f5;
        motionPaths.f21322i = f6;
        motionPaths.m6876a(motionWidget);
        this.f21280f.m6873c(motionWidget);
    }

    /* JADX INFO: renamed from: m */
    public final void m6869m(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.f21277c;
        motionPaths.f21317b = 0.0f;
        motionPaths.f21318c = 0.0f;
        WidgetFrame widgetFrame = motionWidget.f21332a;
        int i = widgetFrame.f21734b;
        float f = i;
        int i2 = widgetFrame.f21735c;
        float f2 = widgetFrame.f21736d - i;
        float f3 = widgetFrame.f21737e - i2;
        motionPaths.f21319d = f;
        motionPaths.f21320f = i2;
        motionPaths.f21321g = f2;
        motionPaths.f21322i = f3;
        motionPaths.m6876a(motionWidget);
        this.f21279e.m6873c(motionWidget);
        TypedBundle typedBundle = motionWidget.f21332a.f21752t;
        if (typedBundle != null) {
            typedBundle.m6934d(this);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0741 A[PHI: r3 r6 r30 r36 r41 r43
      0x0741: PHI (r3v132 java.lang.Object) = 
      (r3v69 java.lang.Object)
      (r3v71 java.lang.Object)
      (r3v73 java.lang.Object)
      (r3v76 java.lang.Object)
      (r3v79 java.lang.Object)
      (r3v84 java.lang.Object)
      (r3v133 java.lang.Object)
     binds: [B:317:0x0835, B:313:0x0824, B:309:0x0811, B:300:0x07e9, B:292:0x07c1, B:305:0x07fc, B:260:0x073b] A[DONT_GENERATE, DONT_INLINE]
      0x0741: PHI (r6v99 java.lang.String) = 
      (r6v75 java.lang.String)
      (r6v76 java.lang.String)
      (r6v77 java.lang.String)
      (r6v79 java.lang.String)
      (r6v81 java.lang.String)
      (r6v85 java.lang.String)
      (r6v100 java.lang.String)
     binds: [B:317:0x0835, B:313:0x0824, B:309:0x0811, B:300:0x07e9, B:292:0x07c1, B:305:0x07fc, B:260:0x073b] A[DONT_GENERATE, DONT_INLINE]
      0x0741: PHI (r30v12 java.lang.String) = 
      (r30v5 java.lang.String)
      (r30v5 java.lang.String)
      (r30v5 java.lang.String)
      (r30v5 java.lang.String)
      (r30v5 java.lang.String)
      (r30v10 java.lang.String)
      (r30v5 java.lang.String)
     binds: [B:317:0x0835, B:313:0x0824, B:309:0x0811, B:300:0x07e9, B:292:0x07c1, B:305:0x07fc, B:260:0x073b] A[DONT_GENERATE, DONT_INLINE]
      0x0741: PHI (r36v16 java.lang.Object) = 
      (r36v1 java.lang.Object)
      (r36v2 java.lang.Object)
      (r36v3 java.lang.Object)
      (r36v5 java.lang.Object)
      (r36v7 java.lang.Object)
      (r36v11 java.lang.Object)
      (r36v17 java.lang.Object)
     binds: [B:317:0x0835, B:313:0x0824, B:309:0x0811, B:300:0x07e9, B:292:0x07c1, B:305:0x07fc, B:260:0x073b] A[DONT_GENERATE, DONT_INLINE]
      0x0741: PHI (r41v10 java.lang.String) = 
      (r41v3 java.lang.String)
      (r41v3 java.lang.String)
      (r41v3 java.lang.String)
      (r41v3 java.lang.String)
      (r41v3 java.lang.String)
      (r41v8 java.lang.String)
      (r41v3 java.lang.String)
     binds: [B:317:0x0835, B:313:0x0824, B:309:0x0811, B:300:0x07e9, B:292:0x07c1, B:305:0x07fc, B:260:0x073b] A[DONT_GENERATE, DONT_INLINE]
      0x0741: PHI (r43v10 java.lang.String) = 
      (r43v3 java.lang.String)
      (r43v3 java.lang.String)
      (r43v3 java.lang.String)
      (r43v3 java.lang.String)
      (r43v3 java.lang.String)
      (r43v8 java.lang.String)
      (r43v3 java.lang.String)
     binds: [B:317:0x0835, B:313:0x0824, B:309:0x0811, B:300:0x07e9, B:292:0x07c1, B:305:0x07fc, B:260:0x073b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r5v62, types: [androidx.constraintlayout.core.motion.utils.SplineSet] */
    /* JADX WARN: Type inference failed for: r5v63, types: [androidx.constraintlayout.core.motion.utils.SplineSet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v66, types: [androidx.constraintlayout.core.motion.utils.SplineSet, androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6870n(int i, int i2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        HashSet<String> hashSet;
        ArrayList arrayList2;
        HashSet<String> hashSet2;
        int i3;
        String str;
        CustomVariable customVariable;
        SplineSet splineSetM6919b;
        CustomVariable customVariable2;
        Integer num;
        Object obj6;
        Object obj7;
        String str2;
        byte b2;
        byte b3;
        HashSet hashSet3;
        ArrayList arrayList3;
        HashSet hashSet4;
        Iterator it;
        ?? M6919b;
        CustomVariable customVariable3;
        String str3;
        MotionPaths motionPaths;
        Object obj8;
        Object obj9;
        String str4;
        String str5;
        String str6;
        String str7;
        MotionPaths motionPaths2;
        HashSet hashSet5;
        HashSet hashSet6;
        HashMap map;
        float f;
        float fMin;
        float fM4a;
        String str8 = "scaleX";
        String str9 = "pivotY";
        String str10 = "pivotX";
        String str11 = "progress";
        String str12 = "rotationZ";
        String str13 = "translationZ";
        new HashSet();
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashMap map2 = new HashMap();
        Motion motion = this.f21274D;
        MotionPaths motionPaths3 = this.f21278d;
        MotionPaths motionPaths4 = this.f21277c;
        if (motion == null) {
            obj = "scaleY";
        } else {
            obj = "scaleY";
            motionPaths4.m6878e(motion, motion.f21277c);
            Motion motion2 = this.f21274D;
            motionPaths3.m6878e(motion2, motion2.f21278d);
        }
        int i4 = this.f21299y;
        MotionPaths motionPaths5 = motionPaths3;
        if (i4 != -1 && motionPaths4.f21324n == -1) {
            motionPaths4.f21324n = i4;
        }
        MotionConstrainedPoint motionConstrainedPoint = this.f21279e;
        float f2 = motionConstrainedPoint.f21302a;
        MotionConstrainedPoint motionConstrainedPoint2 = this.f21280f;
        MotionPaths motionPaths6 = motionPaths4;
        if (MotionConstrainedPoint.m6871b(f2, motionConstrainedPoint2.f21302a)) {
            hashSet8.add("alpha");
        }
        if (MotionConstrainedPoint.m6871b(0.0f, 0.0f)) {
            hashSet8.add("translationZ");
        }
        int i5 = motionConstrainedPoint.f21303b;
        int i6 = motionConstrainedPoint2.f21303b;
        if (i5 != i6 && (i5 == 4 || i6 == 4)) {
            hashSet8.add("alpha");
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21304c, motionConstrainedPoint2.f21304c)) {
            hashSet8.add("rotationZ");
        }
        if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
            hashSet8.add("pathRotate");
        }
        if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
            hashSet8.add("progress");
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21305d, motionConstrainedPoint2.f21305d)) {
            hashSet8.add("rotationX");
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21306f, motionConstrainedPoint2.f21306f)) {
            hashSet8.add("rotationY");
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21309j, motionConstrainedPoint2.f21309j)) {
            hashSet8.add("pivotX");
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21310n, motionConstrainedPoint2.f21310n)) {
            hashSet8.add("pivotY");
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21307g, motionConstrainedPoint2.f21307g)) {
            hashSet8.add("scaleX");
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21308i, motionConstrainedPoint2.f21308i)) {
            obj2 = obj;
            hashSet8.add(obj2);
        } else {
            obj2 = obj;
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21311o, motionConstrainedPoint2.f21311o)) {
            obj3 = "translationX";
            hashSet8.add(obj3);
        } else {
            obj3 = "translationX";
        }
        Object obj10 = "rotationX";
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21312p, motionConstrainedPoint2.f21312p)) {
            obj4 = "translationY";
            hashSet8.add(obj4);
        } else {
            obj4 = "translationY";
        }
        if (MotionConstrainedPoint.m6871b(motionConstrainedPoint.f21313q, motionConstrainedPoint2.f21313q)) {
            hashSet8.add("translationZ");
        }
        if (MotionConstrainedPoint.m6871b(0.0f, 0.0f)) {
            obj5 = "elevation";
            hashSet8.add(obj5);
        } else {
            obj5 = "elevation";
        }
        ArrayList<MotionKey> arrayList4 = this.f21294t;
        ArrayList<MotionPaths> arrayList5 = this.f21292r;
        if (arrayList4 != null) {
            ArrayList arrayList6 = null;
            for (MotionKey motionKey : arrayList4) {
                String str14 = str12;
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    MotionPaths motionPaths7 = new MotionPaths();
                    obj8 = obj3;
                    motionPaths7.f21323j = Float.NaN;
                    motionPaths7.f21324n = -1;
                    motionPaths7.f21325o = null;
                    obj9 = obj4;
                    motionPaths7.f21326p = Float.NaN;
                    motionPaths7.f21327q = null;
                    motionPaths7.f21328r = new HashMap();
                    motionPaths7.f21329s = 0;
                    motionPaths7.f21330t = new double[18];
                    motionPaths7.f21331u = new double[18];
                    motionPaths2 = motionPaths6;
                    if (motionPaths2.f21325o != null) {
                        float f3 = motionKeyPosition.f21340a / 100.0f;
                        motionPaths7.f21317b = f3;
                        str7 = str13;
                        motionPaths7.f21329s = motionKeyPosition.f21380i;
                        float f4 = Float.isNaN(motionKeyPosition.f21376e) ? f3 : motionKeyPosition.f21376e;
                        str6 = str11;
                        if (Float.isNaN(motionKeyPosition.f21377f)) {
                            MotionPaths motionPaths8 = motionPaths5;
                            str3 = str10;
                            motionPaths = motionPaths8;
                            f = f3;
                        } else {
                            f = motionKeyPosition.f21377f;
                            MotionPaths motionPaths9 = motionPaths5;
                            str3 = str10;
                            motionPaths = motionPaths9;
                        }
                        str5 = str9;
                        float f5 = motionPaths.f21321g - motionPaths2.f21321g;
                        float f6 = motionPaths.f21322i;
                        float f7 = motionPaths2.f21322i;
                        motionPaths7.f21318c = motionPaths7.f21317b;
                        motionPaths7.f21321g = (int) ((f5 * f4) + r7);
                        motionPaths7.f21322i = (int) (((f6 - f7) * f) + f7);
                        int i7 = motionKeyPosition.f21380i;
                        str4 = str8;
                        if (i7 == 1) {
                            float f8 = Float.isNaN(motionKeyPosition.f21378g) ? f3 : motionKeyPosition.f21378g;
                            float f9 = motionPaths.f21319d;
                            float f10 = motionPaths2.f21319d;
                            motionPaths7.f21319d = AbstractC0000a.m4a(f9, f10, f8, f10);
                            if (!Float.isNaN(motionKeyPosition.f21379h)) {
                                f3 = motionKeyPosition.f21379h;
                            }
                            float f11 = motionPaths.f21320f;
                            float f12 = motionPaths2.f21320f;
                            motionPaths7.f21320f = AbstractC0000a.m4a(f11, f12, f3, f12);
                        } else if (i7 != 2) {
                            float f13 = Float.isNaN(motionKeyPosition.f21378g) ? f3 : motionKeyPosition.f21378g;
                            float f14 = motionPaths.f21319d;
                            float f15 = motionPaths2.f21319d;
                            motionPaths7.f21319d = AbstractC0000a.m4a(f14, f15, f13, f15);
                            if (!Float.isNaN(motionKeyPosition.f21379h)) {
                                f3 = motionKeyPosition.f21379h;
                            }
                            float f16 = motionPaths.f21320f;
                            float f17 = motionPaths2.f21320f;
                            motionPaths7.f21320f = AbstractC0000a.m4a(f16, f17, f3, f17);
                        } else {
                            if (Float.isNaN(motionKeyPosition.f21378g)) {
                                float f18 = motionPaths.f21319d;
                                float f19 = motionPaths2.f21319d;
                                fMin = AbstractC0000a.m4a(f18, f19, f3, f19);
                            } else {
                                fMin = motionKeyPosition.f21378g * Math.min(f, f4);
                            }
                            motionPaths7.f21319d = fMin;
                            if (Float.isNaN(motionKeyPosition.f21379h)) {
                                float f20 = motionPaths.f21320f;
                                float f21 = motionPaths2.f21320f;
                                fM4a = AbstractC0000a.m4a(f20, f21, f3, f21);
                            } else {
                                fM4a = motionKeyPosition.f21379h;
                            }
                            motionPaths7.f21320f = fM4a;
                        }
                        motionPaths7.f21325o = motionPaths2.f21325o;
                        motionPaths7.f21316a = Easing.m6899c(motionKeyPosition.f21375d);
                        motionPaths7.f21324n = -1;
                    } else {
                        MotionPaths motionPaths10 = motionPaths5;
                        str3 = str10;
                        motionPaths = motionPaths10;
                        str4 = str8;
                        str5 = str9;
                        str6 = str11;
                        str7 = str13;
                        int i8 = motionKeyPosition.f21380i;
                        if (i8 == 1) {
                            float f22 = motionKeyPosition.f21340a / 100.0f;
                            motionPaths7.f21317b = f22;
                            float f23 = Float.isNaN(motionKeyPosition.f21376e) ? f22 : motionKeyPosition.f21376e;
                            float f24 = Float.isNaN(motionKeyPosition.f21377f) ? f22 : motionKeyPosition.f21377f;
                            float f25 = motionPaths.f21321g - motionPaths2.f21321g;
                            float f26 = f22;
                            float f27 = motionPaths.f21322i - motionPaths2.f21322i;
                            motionPaths7.f21318c = motionPaths7.f21317b;
                            if (!Float.isNaN(motionKeyPosition.f21378g)) {
                                f26 = motionKeyPosition.f21378g;
                            }
                            float f28 = (motionPaths2.f21321g / 2.0f) + motionPaths2.f21319d;
                            float f29 = motionPaths2.f21320f;
                            float f30 = motionPaths2.f21322i;
                            float f31 = ((motionPaths.f21321g / 2.0f) + motionPaths.f21319d) - f28;
                            float f32 = ((motionPaths.f21322i / 2.0f) + motionPaths.f21320f) - ((f30 / 2.0f) + f29);
                            float f33 = f31 * f26;
                            float f34 = (f25 * f23) / 2.0f;
                            motionPaths7.f21319d = (int) ((r4 + f33) - f34);
                            float f35 = f26 * f32;
                            float f36 = (f27 * f24) / 2.0f;
                            motionPaths7.f21320f = (int) ((f29 + f35) - f36);
                            motionPaths7.f21321g = (int) (r4 + r11);
                            motionPaths7.f21322i = (int) (f30 + r14);
                            float f37 = Float.isNaN(motionKeyPosition.f21379h) ? 0.0f : motionKeyPosition.f21379h;
                            float f38 = (-f32) * f37;
                            float f39 = f31 * f37;
                            motionPaths7.f21329s = 1;
                            float f40 = (int) ((motionPaths2.f21319d + f33) - f34);
                            float f41 = (int) ((motionPaths2.f21320f + f35) - f36);
                            motionPaths7.f21319d = f40 + f38;
                            motionPaths7.f21320f = f41 + f39;
                            motionPaths7.f21325o = motionPaths7.f21325o;
                            motionPaths7.f21316a = Easing.m6899c(motionKeyPosition.f21375d);
                            motionPaths7.f21324n = -1;
                        } else if (i8 != 2) {
                            float f42 = motionKeyPosition.f21340a / 100.0f;
                            motionPaths7.f21317b = f42;
                            float f43 = Float.isNaN(motionKeyPosition.f21376e) ? f42 : motionKeyPosition.f21376e;
                            float f44 = Float.isNaN(motionKeyPosition.f21377f) ? f42 : motionKeyPosition.f21377f;
                            float f45 = motionPaths.f21321g;
                            float f46 = motionPaths2.f21321g;
                            float f47 = f45 - f46;
                            float f48 = motionPaths.f21322i;
                            float f49 = motionPaths2.f21322i;
                            float f50 = f48 - f49;
                            motionPaths7.f21318c = motionPaths7.f21317b;
                            float f51 = (f46 / 2.0f) + motionPaths2.f21319d;
                            float f52 = motionPaths2.f21320f;
                            float f53 = ((f45 / 2.0f) + motionPaths.f21319d) - f51;
                            float f54 = ((f48 / 2.0f) + motionPaths.f21320f) - ((f49 / 2.0f) + f52);
                            float f55 = (f47 * f43) / 2.0f;
                            motionPaths7.f21319d = (int) (((f53 * f42) + r4) - f55);
                            float f56 = (f50 * f44) / 2.0f;
                            motionPaths7.f21320f = (int) (((f54 * f42) + f52) - f56);
                            motionPaths7.f21321g = (int) (f46 + r31);
                            motionPaths7.f21322i = (int) (f49 + r48);
                            float f57 = Float.isNaN(motionKeyPosition.f21378g) ? f42 : motionKeyPosition.f21378g;
                            float f58 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f59 = f57;
                            float f60 = Float.isNaN(motionKeyPosition.f21379h) ? f42 : motionKeyPosition.f21379h;
                            float f61 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f62 = f60;
                            motionPaths7.f21329s = 0;
                            motionPaths7.f21319d = (int) (((f61 * f54) + ((f59 * f53) + motionPaths2.f21319d)) - f55);
                            motionPaths7.f21320f = (int) (((f54 * f62) + ((f53 * f58) + motionPaths2.f21320f)) - f56);
                            motionPaths7.f21316a = Easing.m6899c(motionKeyPosition.f21375d);
                            motionPaths7.f21324n = -1;
                        } else {
                            float f63 = motionKeyPosition.f21340a / 100.0f;
                            motionPaths7.f21317b = f63;
                            float f64 = Float.isNaN(motionKeyPosition.f21376e) ? f63 : motionKeyPosition.f21376e;
                            float f65 = Float.isNaN(motionKeyPosition.f21377f) ? f63 : motionKeyPosition.f21377f;
                            float f66 = motionPaths.f21321g;
                            float f67 = motionPaths2.f21321g;
                            float f68 = f66 - f67;
                            float f69 = motionPaths.f21322i;
                            float f70 = motionPaths2.f21322i;
                            float f71 = f69 - f70;
                            motionPaths7.f21318c = motionPaths7.f21317b;
                            float f72 = (f67 / 2.0f) + motionPaths2.f21319d;
                            float f73 = motionPaths2.f21320f;
                            float f74 = (f66 / 2.0f) + motionPaths.f21319d;
                            float f75 = ((f69 / 2.0f) + motionPaths.f21320f) - ((f70 / 2.0f) + f73);
                            float f76 = f68 * f64;
                            motionPaths7.f21319d = (int) ((((f74 - f72) * f63) + r4) - (f76 / 2.0f));
                            float f77 = f71 * f65;
                            motionPaths7.f21320f = (int) (((f75 * f63) + f73) - (f77 / 2.0f));
                            motionPaths7.f21321g = (int) (f67 + f76);
                            motionPaths7.f21322i = (int) (f70 + f77);
                            motionPaths7.f21329s = 2;
                            if (!Float.isNaN(motionKeyPosition.f21378g)) {
                                motionPaths7.f21319d = (int) (motionKeyPosition.f21378g * (i - ((int) motionPaths7.f21321g)));
                            }
                            if (!Float.isNaN(motionKeyPosition.f21379h)) {
                                motionPaths7.f21320f = (int) (motionKeyPosition.f21379h * (i2 - ((int) motionPaths7.f21322i)));
                            }
                            motionPaths7.f21325o = motionPaths7.f21325o;
                            motionPaths7.f21316a = Easing.m6899c(motionKeyPosition.f21375d);
                            motionPaths7.f21324n = -1;
                        }
                    }
                    MotionPaths motionPaths11 = null;
                    for (MotionPaths motionPaths12 : arrayList5) {
                        if (motionPaths7.f21318c == motionPaths12.f21318c) {
                            motionPaths11 = motionPaths12;
                        }
                    }
                    if (motionPaths11 != null) {
                        arrayList5.remove(motionPaths11);
                    }
                    if (Collections.binarySearch(arrayList5, motionPaths7) == 0) {
                        Utils.m6937a("MotionController", " KeyPath position \"" + motionPaths7.f21318c + "\" outside of range");
                    }
                    arrayList5.add((-r4) - 1, motionPaths7);
                    int i9 = motionKeyPosition.f21374c;
                    if (i9 != -1) {
                        this.f21276b = i9;
                    }
                    hashSet6 = hashSet7;
                    hashSet5 = hashSet9;
                } else {
                    MotionPaths motionPaths13 = motionPaths5;
                    str3 = str10;
                    motionPaths = motionPaths13;
                    obj8 = obj3;
                    obj9 = obj4;
                    str4 = str8;
                    str5 = str9;
                    str6 = str11;
                    str7 = str13;
                    motionPaths2 = motionPaths6;
                    if (motionKey instanceof MotionKeyCycle) {
                        hashSet5 = hashSet9;
                        motionKey.mo6881f(hashSet5);
                        hashSet6 = hashSet7;
                    } else {
                        hashSet5 = hashSet9;
                        if (motionKey instanceof MotionKeyTimeCycle) {
                            hashSet6 = hashSet7;
                            motionKey.mo6881f(hashSet6);
                        } else {
                            hashSet6 = hashSet7;
                            if (motionKey instanceof MotionKeyTrigger) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                ArrayList arrayList7 = arrayList6;
                                arrayList7.add((MotionKeyTrigger) motionKey);
                                arrayList6 = arrayList7;
                            } else {
                                map = map2;
                                motionKey.mo6882g(map);
                                motionKey.mo6881f(hashSet8);
                                String str15 = str3;
                                motionPaths5 = motionPaths;
                                str10 = str15;
                                motionPaths6 = motionPaths2;
                                hashSet9 = hashSet5;
                                hashSet7 = hashSet6;
                                map2 = map;
                                str12 = str14;
                                obj4 = obj9;
                                obj3 = obj8;
                                str13 = str7;
                                str11 = str6;
                                str9 = str5;
                                str8 = str4;
                            }
                        }
                    }
                }
                map = map2;
                String str152 = str3;
                motionPaths5 = motionPaths;
                str10 = str152;
                motionPaths6 = motionPaths2;
                hashSet9 = hashSet5;
                hashSet7 = hashSet6;
                map2 = map;
                str12 = str14;
                obj4 = obj9;
                obj3 = obj8;
                str13 = str7;
                str11 = str6;
                str9 = str5;
                str8 = str4;
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        MotionPaths motionPaths14 = motionPaths5;
        String str16 = str10;
        Object obj11 = obj3;
        Object obj12 = obj4;
        String str17 = str8;
        String str18 = str9;
        String str19 = str11;
        String str20 = str12;
        String str21 = str13;
        HashSet hashSet10 = hashSet7;
        HashSet hashSet11 = hashSet9;
        HashMap map3 = map2;
        MotionPaths motionPaths15 = motionPaths6;
        float fM6866j = Float.NaN;
        if (arrayList != null) {
            this.f21298x = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        if (hashSet8.isEmpty()) {
            hashSet = hashSet11;
            arrayList2 = arrayList5;
            hashSet2 = hashSet10;
        } else {
            this.f21296v = new HashMap();
            Iterator it2 = hashSet8.iterator();
            while (it2.hasNext()) {
                String str22 = (String) it2.next();
                if (str22.startsWith("CUSTOM,")) {
                    hashSet3 = hashSet11;
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    arrayList3 = arrayList5;
                    String str23 = str22.split(",")[1];
                    for (MotionKey motionKey2 : arrayList4) {
                        HashSet hashSet12 = hashSet10;
                        Iterator it3 = it2;
                        HashMap map4 = motionKey2.f21341b;
                        if (map4 != null && (customVariable3 = (CustomVariable) map4.get(str23)) != null) {
                            customVar.m6913a(motionKey2.f21340a, customVariable3);
                        }
                        it2 = it3;
                        hashSet10 = hashSet12;
                    }
                    hashSet4 = hashSet10;
                    it = it2;
                    M6919b = new SplineSet.CustomSpline();
                    String str24 = str22.split(",")[1];
                    M6919b.f21472f = customVar;
                } else {
                    hashSet3 = hashSet11;
                    arrayList3 = arrayList5;
                    hashSet4 = hashSet10;
                    it = it2;
                    M6919b = SplineSet.m6919b(str22);
                }
                M6919b.f21470e = str22;
                this.f21296v.put(str22, M6919b);
                it2 = it;
                hashSet11 = hashSet3;
                arrayList5 = arrayList3;
                hashSet10 = hashSet4;
            }
            hashSet = hashSet11;
            arrayList2 = arrayList5;
            hashSet2 = hashSet10;
            if (arrayList4 != null) {
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    MotionKey motionKey3 = (MotionKey) it4.next();
                    if (motionKey3 instanceof MotionKeyAttributes) {
                        HashMap map5 = this.f21296v;
                        MotionKeyAttributes motionKeyAttributes = (MotionKeyAttributes) motionKey3;
                        motionKeyAttributes.getClass();
                        for (String str25 : map5.keySet()) {
                            Iterator it5 = it4;
                            SplineSet splineSet = (SplineSet) map5.get(str25);
                            if (splineSet == null) {
                                it4 = it5;
                            } else {
                                HashMap map6 = map5;
                                if (str25.startsWith("CUSTOM")) {
                                    CustomVariable customVariable4 = (CustomVariable) motionKeyAttributes.f21341b.get(str25.substring(7));
                                    if (customVariable4 != null) {
                                        ((SplineSet.CustomSpline) splineSet).f21472f.m6913a(motionKeyAttributes.f21340a, customVariable4);
                                    }
                                    it4 = it5;
                                    map5 = map6;
                                } else {
                                    switch (str25.hashCode()) {
                                        case -1249320806:
                                            obj6 = obj2;
                                            obj7 = obj10;
                                            str2 = str17;
                                            b2 = str25.equals(obj7) ? (byte) 0 : (byte) -1;
                                            break;
                                        case -1249320805:
                                            obj6 = obj2;
                                            str2 = str17;
                                            obj7 = obj10;
                                            if (str25.equals("rotationY")) {
                                                b2 = 1;
                                                break;
                                            }
                                            break;
                                        case -1249320804:
                                            obj6 = obj2;
                                            str2 = str17;
                                            obj7 = obj10;
                                            if (str25.equals(str20)) {
                                                b2 = 2;
                                                break;
                                            }
                                            break;
                                        case -1225497657:
                                            obj6 = obj2;
                                            str2 = str17;
                                            if (str25.equals(obj11)) {
                                                b2 = 3;
                                                obj7 = obj10;
                                            }
                                            obj7 = obj10;
                                            break;
                                        case -1225497656:
                                            obj6 = obj2;
                                            str2 = str17;
                                            obj7 = obj10;
                                            if (str25.equals(obj12)) {
                                                b2 = 4;
                                                break;
                                            }
                                            break;
                                        case -1225497655:
                                            obj6 = obj2;
                                            String str26 = str21;
                                            str2 = str17;
                                            if (str25.equals(str26)) {
                                                b2 = 5;
                                                str21 = str26;
                                                obj7 = obj10;
                                            } else {
                                                str21 = str26;
                                                obj7 = obj10;
                                            }
                                            break;
                                        case -1001078227:
                                            obj6 = obj2;
                                            str2 = str17;
                                            obj7 = obj10;
                                            if (str25.equals(str19)) {
                                                b2 = 6;
                                                break;
                                            }
                                            break;
                                        case -987906986:
                                            obj6 = obj2;
                                            String str27 = str16;
                                            str2 = str17;
                                            if (str25.equals(str27)) {
                                                str16 = str27;
                                                obj7 = obj10;
                                                b2 = 7;
                                            } else {
                                                str16 = str27;
                                                obj7 = obj10;
                                            }
                                            break;
                                        case -987906985:
                                            obj6 = obj2;
                                            String str28 = str18;
                                            str2 = str17;
                                            if (str25.equals(str28)) {
                                                b2 = 8;
                                                str18 = str28;
                                                obj7 = obj10;
                                            } else {
                                                str18 = str28;
                                                obj7 = obj10;
                                            }
                                            break;
                                        case -908189618:
                                            str2 = str17;
                                            if (str25.equals(str2)) {
                                                b2 = 9;
                                                obj6 = obj2;
                                                obj7 = obj10;
                                            } else {
                                                obj6 = obj2;
                                                obj7 = obj10;
                                            }
                                            break;
                                        case -908189617:
                                            if (str25.equals(obj2)) {
                                                b3 = 10;
                                                obj6 = obj2;
                                                b2 = b3;
                                                obj7 = obj10;
                                                str2 = str17;
                                            }
                                            obj6 = obj2;
                                            obj7 = obj10;
                                            str2 = str17;
                                            break;
                                        case -4379043:
                                            if (str25.equals(obj5)) {
                                                b3 = Ascii.f42547VT;
                                                obj6 = obj2;
                                                b2 = b3;
                                                obj7 = obj10;
                                                str2 = str17;
                                            }
                                            obj6 = obj2;
                                            obj7 = obj10;
                                            str2 = str17;
                                            break;
                                        case 92909918:
                                            if (str25.equals("alpha")) {
                                                b3 = Ascii.f42536FF;
                                                obj6 = obj2;
                                                b2 = b3;
                                                obj7 = obj10;
                                                str2 = str17;
                                            }
                                            obj6 = obj2;
                                            obj7 = obj10;
                                            str2 = str17;
                                            break;
                                        case 803192288:
                                            if (str25.equals("pathRotate")) {
                                                b3 = Ascii.f42534CR;
                                                obj6 = obj2;
                                                b2 = b3;
                                                obj7 = obj10;
                                                str2 = str17;
                                            }
                                            obj6 = obj2;
                                            obj7 = obj10;
                                            str2 = str17;
                                            break;
                                        default:
                                            obj6 = obj2;
                                            obj7 = obj10;
                                            str2 = str17;
                                            break;
                                    }
                                    switch (b2) {
                                        case 0:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21346g)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21346g, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 1:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21347h)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21347h, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 2:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21345f)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21345f, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 3:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21353n)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21353n, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 4:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21354o)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21354o, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 5:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21355p)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21355p, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 6:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21356q)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21356q, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 7:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21346g)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21348i, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 8:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21347h)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21349j, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 9:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21351l)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21351l, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 10:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21352m)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21352m, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 11:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21344e)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21344e, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case TYPE_BYTES_VALUE:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21343d)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21343d, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        case 13:
                                            obj10 = obj7;
                                            if (!Float.isNaN(motionKeyAttributes.f21350k)) {
                                                splineSet.mo6921c(motionKeyAttributes.f21350k, motionKeyAttributes.f21340a);
                                            }
                                            break;
                                        default:
                                            obj10 = obj7;
                                            System.err.println("not supported by KeyAttributes ".concat(str25));
                                            break;
                                    }
                                    it4 = it5;
                                    str17 = str2;
                                    map5 = map6;
                                    obj2 = obj6;
                                }
                            }
                        }
                    }
                    it4 = it4;
                    str17 = str17;
                    obj2 = obj2;
                }
            }
            motionConstrainedPoint.m6872a(this.f21296v, 0);
            motionConstrainedPoint2.m6872a(this.f21296v, 100);
            for (String str29 : this.f21296v.keySet()) {
                int iIntValue = (!map3.containsKey(str29) || (num = (Integer) map3.get(str29)) == null) ? 0 : num.intValue();
                SplineSet splineSet2 = (SplineSet) this.f21296v.get(str29);
                if (splineSet2 != null) {
                    splineSet2.mo6923e(iIntValue);
                }
            }
        }
        if (!hashSet2.isEmpty()) {
            if (this.f21295u == null) {
                this.f21295u = new HashMap();
            }
            for (String str30 : hashSet2) {
                if (!this.f21295u.containsKey(str30)) {
                    if (str30.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str31 = str30.split(",")[1];
                        for (MotionKey motionKey4 : arrayList4) {
                            HashMap map7 = motionKey4.f21341b;
                            if (map7 != null && (customVariable2 = (CustomVariable) map7.get(str31)) != null) {
                                customVar2.m6913a(motionKey4.f21340a, customVariable2);
                            }
                        }
                        SplineSet.CustomSpline customSpline = new SplineSet.CustomSpline();
                        String str32 = str30.split(",")[1];
                        customSpline.f21472f = customVar2;
                        splineSetM6919b = customSpline;
                    } else {
                        splineSetM6919b = SplineSet.m6919b(str30);
                    }
                    splineSetM6919b.f21470e = str30;
                }
            }
            if (arrayList4 != null) {
                for (MotionKey motionKey5 : arrayList4) {
                    if (motionKey5 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey5).m6884h(this.f21295u);
                    }
                }
            }
            for (String str33 : this.f21295u.keySet()) {
                ((TimeCycleSplineSet) this.f21295u.get(str33)).mo6930c(map3.containsKey(str33) ? ((Integer) map3.get(str33)).intValue() : 0);
            }
        }
        int size = arrayList2.size();
        int i10 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i10];
        motionPathsArr[0] = motionPaths15;
        motionPathsArr[size + 1] = motionPaths14;
        if (arrayList2.size() > 0 && this.f21276b == -1) {
            this.f21276b = 0;
        }
        Iterator it6 = arrayList2.iterator();
        int i11 = 1;
        while (it6.hasNext()) {
            motionPathsArr[i11] = (MotionPaths) it6.next();
            i11++;
        }
        HashSet hashSet13 = new HashSet();
        for (String str34 : motionPaths14.f21328r.keySet()) {
            if (motionPaths15.f21328r.containsKey(str34)) {
                if (!hashSet8.contains("CUSTOM," + str34)) {
                    hashSet13.add(str34);
                }
            }
        }
        String[] strArr = (String[]) hashSet13.toArray(new String[0]);
        this.f21289o = strArr;
        this.f21290p = new int[strArr.length];
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f21289o;
            if (i12 < strArr2.length) {
                String str35 = strArr2[i12];
                this.f21290p[i12] = 0;
                int i13 = 0;
                while (true) {
                    if (i13 < i10) {
                        if (!motionPathsArr[i13].f21328r.containsKey(str35) || (customVariable = (CustomVariable) motionPathsArr[i13].f21328r.get(str35)) == null) {
                            i13++;
                        } else {
                            int[] iArr = this.f21290p;
                            iArr[i12] = customVariable.m6855e() + iArr[i12];
                        }
                    }
                }
                i12++;
            } else {
                boolean z2 = motionPathsArr[0].f21324n != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i14 = 1; i14 < i10; i14++) {
                    MotionPaths motionPaths16 = motionPathsArr[i14];
                    MotionPaths motionPaths17 = motionPathsArr[i14 - 1];
                    boolean zM6874b = MotionPaths.m6874b(motionPaths16.f21319d, motionPaths17.f21319d);
                    boolean zM6874b2 = MotionPaths.m6874b(motionPaths16.f21320f, motionPaths17.f21320f);
                    zArr[0] = zArr[0] | MotionPaths.m6874b(motionPaths16.f21318c, motionPaths17.f21318c);
                    zArr[1] = zArr[1] | (zM6874b || zM6874b2 || z2);
                    zArr[2] = (zM6874b || zM6874b2 || z2) | zArr[2];
                    zArr[3] = zArr[3] | MotionPaths.m6874b(motionPaths16.f21321g, motionPaths17.f21321g);
                    zArr[4] = MotionPaths.m6874b(motionPaths16.f21322i, motionPaths17.f21322i) | zArr[4];
                }
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        i15++;
                    }
                }
                this.f21286l = new int[i15];
                int iMax = Math.max(2, i15);
                this.f21287m = new double[iMax];
                this.f21288n = new double[iMax];
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        this.f21286l[i17] = i18;
                        i17++;
                    }
                }
                int[] iArr2 = {i10, this.f21286l.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i10];
                int i19 = 0;
                while (i19 < i10) {
                    MotionPaths motionPaths18 = motionPathsArr[i19];
                    double[] dArr3 = dArr[i19];
                    int[] iArr3 = this.f21286l;
                    MotionPaths[] motionPathsArr2 = motionPathsArr;
                    float[] fArr = {motionPaths18.f21318c, motionPaths18.f21319d, motionPaths18.f21320f, motionPaths18.f21321g, motionPaths18.f21322i, motionPaths18.f21323j};
                    int i20 = 0;
                    for (int i21 : iArr3) {
                        if (i21 < 6) {
                            dArr3[i20] = fArr[r11];
                            i20++;
                        }
                    }
                    dArr2[i19] = motionPathsArr2[i19].f21317b;
                    i19++;
                    motionPathsArr = motionPathsArr2;
                }
                MotionPaths[] motionPathsArr3 = motionPathsArr;
                int i22 = 0;
                while (true) {
                    int[] iArr4 = this.f21286l;
                    if (i22 < iArr4.length) {
                        if (iArr4[i22] < 6) {
                            String strM19p = AbstractC0000a.m19p(new StringBuilder(), MotionPaths.f21315v[this.f21286l[i22]], " [");
                            for (int i23 = 0; i23 < i10; i23++) {
                                StringBuilder sbM2244s = AbstractC0455a.m2244s(strM19p);
                                sbM2244s.append(dArr[i23][i22]);
                                strM19p = sbM2244s.toString();
                            }
                        }
                        i22++;
                    } else {
                        this.f21281g = new CurveFit[this.f21289o.length + 1];
                        int i24 = 0;
                        while (true) {
                            String[] strArr3 = this.f21289o;
                            if (i24 >= strArr3.length) {
                                this.f21281g[0] = CurveFit.m6898a(this.f21276b, dArr2, dArr);
                                if (motionPathsArr3[0].f21324n != -1) {
                                    int[] iArr5 = new int[i10];
                                    double[] dArr4 = new double[i10];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i10, 2);
                                    for (int i25 = 0; i25 < i10; i25++) {
                                        iArr5[i25] = motionPathsArr3[i25].f21324n;
                                        dArr4[i25] = r6.f21317b;
                                        double[] dArr6 = dArr5[i25];
                                        dArr6[0] = r6.f21319d;
                                        dArr6[1] = r6.f21320f;
                                    }
                                    this.f21282h = new ArcCurveFit(iArr5, dArr4, dArr5);
                                }
                                this.f21297w = new HashMap();
                                if (arrayList4 != null) {
                                    for (String str36 : hashSet) {
                                        KeyCycleOscillator keyCycleOscillatorM6905c = KeyCycleOscillator.m6905c(str36);
                                        if (keyCycleOscillatorM6905c.f21431e == 1 && Float.isNaN(fM6866j)) {
                                            fM6866j = m6866j();
                                        }
                                        keyCycleOscillatorM6905c.f21428b = str36;
                                        this.f21297w.put(str36, keyCycleOscillatorM6905c);
                                    }
                                    for (MotionKey motionKey6 : arrayList4) {
                                        if (motionKey6 instanceof MotionKeyCycle) {
                                            ((MotionKeyCycle) motionKey6).m6883h(this.f21297w);
                                        }
                                    }
                                    Iterator it7 = this.f21297w.values().iterator();
                                    while (it7.hasNext()) {
                                        ((KeyCycleOscillator) it7.next()).m6912h();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str37 = strArr3[i24];
                            int i26 = 0;
                            int i27 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i26 < i10) {
                                if (motionPathsArr3[i26].f21328r.containsKey(str37)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i10];
                                        CustomVariable customVariable5 = (CustomVariable) motionPathsArr3[i26].f21328r.get(str37);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i10, customVariable5 == null ? 0 : customVariable5.m6855e());
                                    }
                                    MotionPaths motionPaths19 = motionPathsArr3[i26];
                                    dArr7[i27] = motionPaths19.f21317b;
                                    double[] dArr9 = dArr8[i27];
                                    CustomVariable customVariable6 = (CustomVariable) motionPaths19.f21328r.get(str37);
                                    if (customVariable6 != null) {
                                        if (customVariable6.m6855e() == 1) {
                                            dArr9[0] = customVariable6.m6853c();
                                        } else {
                                            int iM6855e = customVariable6.m6855e();
                                            customVariable6.m6854d(new float[iM6855e]);
                                            int i28 = 0;
                                            int i29 = 0;
                                            while (i28 < iM6855e) {
                                                dArr9[i29] = r14[i28];
                                                i28++;
                                                str37 = str37;
                                                i29++;
                                                i24 = i24;
                                            }
                                        }
                                    }
                                    i3 = i24;
                                    str = str37;
                                    i27++;
                                } else {
                                    i3 = i24;
                                    str = str37;
                                }
                                i26++;
                                str37 = str;
                                i24 = i3;
                            }
                            int i30 = i24;
                            double[] dArrCopyOf = Arrays.copyOf(dArr7, i27);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i27);
                            int i31 = i30 + 1;
                            this.f21281g[i31] = CurveFit.m6898a(this.f21276b, dArrCopyOf, dArr10);
                            i24 = i31;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        MotionPaths motionPaths = this.f21277c;
        sb.append(motionPaths.f21319d);
        sb.append(" y: ");
        sb.append(motionPaths.f21320f);
        sb.append(" end: x: ");
        MotionPaths motionPaths2 = this.f21278d;
        sb.append(motionPaths2.f21319d);
        sb.append(" y: ");
        sb.append(motionPaths2.f21320f);
        return sb.toString();
    }
}
