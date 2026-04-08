package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.compose.animation.AbstractC0455a;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.primitives.Ints;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionController {

    /* JADX INFO: renamed from: A */
    public KeyTrigger[] f22280A;

    /* JADX INFO: renamed from: b */
    public final View f22289b;

    /* JADX INFO: renamed from: c */
    public final int f22290c;

    /* JADX INFO: renamed from: j */
    public CurveFit[] f22297j;

    /* JADX INFO: renamed from: k */
    public ArcCurveFit f22298k;

    /* JADX INFO: renamed from: o */
    public int[] f22302o;

    /* JADX INFO: renamed from: p */
    public double[] f22303p;

    /* JADX INFO: renamed from: q */
    public double[] f22304q;

    /* JADX INFO: renamed from: r */
    public String[] f22305r;

    /* JADX INFO: renamed from: s */
    public int[] f22306s;

    /* JADX INFO: renamed from: x */
    public HashMap f22311x;

    /* JADX INFO: renamed from: y */
    public HashMap f22312y;

    /* JADX INFO: renamed from: z */
    public HashMap f22313z;

    /* JADX INFO: renamed from: a */
    public final Rect f22288a = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f22291d = false;

    /* JADX INFO: renamed from: e */
    public int f22292e = -1;

    /* JADX INFO: renamed from: f */
    public final MotionPaths f22293f = new MotionPaths();

    /* JADX INFO: renamed from: g */
    public final MotionPaths f22294g = new MotionPaths();

    /* JADX INFO: renamed from: h */
    public final MotionConstrainedPoint f22295h = new MotionConstrainedPoint();

    /* JADX INFO: renamed from: i */
    public final MotionConstrainedPoint f22296i = new MotionConstrainedPoint();

    /* JADX INFO: renamed from: l */
    public float f22299l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f22300m = 0.0f;

    /* JADX INFO: renamed from: n */
    public float f22301n = 1.0f;

    /* JADX INFO: renamed from: t */
    public final float[] f22307t = new float[4];

    /* JADX INFO: renamed from: u */
    public final ArrayList f22308u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final float[] f22309v = new float[1];

    /* JADX INFO: renamed from: w */
    public final ArrayList f22310w = new ArrayList();

    /* JADX INFO: renamed from: B */
    public int f22281B = -1;

    /* JADX INFO: renamed from: C */
    public int f22282C = -1;

    /* JADX INFO: renamed from: D */
    public View f22283D = null;

    /* JADX INFO: renamed from: E */
    public int f22284E = -1;

    /* JADX INFO: renamed from: F */
    public float f22285F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public Interpolator f22286G = null;

    /* JADX INFO: renamed from: H */
    public boolean f22287H = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionController$1 */
    /* JADX INFO: compiled from: Proguard */
    class InterpolatorC13971 implements Interpolator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Easing f22314a;

        public InterpolatorC13971(Easing easing) {
            this.f22314a = easing;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.f22314a.mo6900a(f);
        }
    }

    public MotionController(View view) {
        this.f22289b = view;
        this.f22290c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getClass();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7234i(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    /* JADX INFO: renamed from: a */
    public final float m7235a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f22301n;
            if (f3 != 1.0d) {
                float f4 = this.f22300m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.f22293f.f22423a;
        float f5 = Float.NaN;
        for (MotionPaths motionPaths : this.f22308u) {
            Easing easing2 = motionPaths.f22423a;
            if (easing2 != null) {
                float f6 = motionPaths.f22425c;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.f22425c;
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

    /* JADX INFO: renamed from: b */
    public final void m7236b(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f22297j[0].mo6886c(d, dArr);
        this.f22297j[0].mo6889f(d, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f22302o;
        MotionPaths motionPaths = this.f22293f;
        float f3 = motionPaths.f22427f;
        float f4 = motionPaths.f22428g;
        float f5 = motionPaths.f22429i;
        float f6 = motionPaths.f22430j;
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
        MotionController motionController = motionPaths.f22435r;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.m7236b(d, fArr3, fArr4);
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

    /* JADX INFO: renamed from: c */
    public final void m7237c() {
        float f = this.f22294g.f22427f;
    }

    /* JADX INFO: renamed from: d */
    public final float m7238d() {
        return this.f22294g.f22428g;
    }

    /* JADX INFO: renamed from: e */
    public final void m7239e() {
        float f = this.f22293f.f22427f;
    }

    /* JADX INFO: renamed from: f */
    public final float m7240f() {
        return this.f22293f.f22428g;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7241g(float f, long j, View view, KeyCache keyCache) {
        boolean zMo7208f;
        View view2;
        boolean z2;
        float f2;
        ViewTimeCycle.PathRotate pathRotate;
        float f3;
        boolean z3;
        float f4;
        float f5;
        float f6;
        boolean z4;
        View view3 = view;
        ViewTimeCycle.PathRotate pathRotate2 = null;
        float fM7235a = m7235a(f, null);
        int i = this.f22284E;
        if (i != -1) {
            float f7 = 1.0f / i;
            float fFloor = ((float) Math.floor(fM7235a / f7)) * f7;
            float f8 = (fM7235a % f7) / f7;
            if (!Float.isNaN(this.f22285F)) {
                f8 = (f8 + this.f22285F) % 1.0f;
            }
            Interpolator interpolator = this.f22286G;
            fM7235a = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + fFloor;
        }
        HashMap map = this.f22312y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ViewSpline) it.next()).mo7205g(fM7235a, view3);
            }
        }
        HashMap map2 = this.f22311x;
        if (map2 != null) {
            ViewTimeCycle.PathRotate pathRotate3 = null;
            zMo7208f = false;
            for (ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate3 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    zMo7208f |= viewTimeCycle.mo7208f(fM7235a, j, view3, keyCache);
                    view3 = view;
                }
            }
            pathRotate2 = pathRotate3;
        } else {
            zMo7208f = false;
        }
        CurveFit[] curveFitArr = this.f22297j;
        MotionPaths motionPaths = this.f22293f;
        if (curveFitArr != null) {
            double d = fM7235a;
            curveFitArr[0].mo6886c(d, this.f22303p);
            this.f22297j[0].mo6889f(d, this.f22304q);
            ArcCurveFit arcCurveFit = this.f22298k;
            if (arcCurveFit != null) {
                double[] dArr = this.f22303p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    arcCurveFit.mo6886c(d, dArr);
                    this.f22298k.mo6889f(d, this.f22304q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.f22287H) {
                view2 = view;
                pathRotate = pathRotate2;
                f3 = 1.0f;
                z3 = zMo7208f;
                f4 = 2.0f;
            } else {
                int[] iArr = this.f22302o;
                double[] dArr2 = this.f22303p;
                f4 = 2.0f;
                double[] dArr3 = this.f22304q;
                f3 = 1.0f;
                boolean z5 = this.f22291d;
                float fSin = motionPaths.f22427f;
                float fCos = motionPaths.f22428g;
                float f9 = motionPaths.f22429i;
                int i2 = 1;
                float f10 = motionPaths.f22430j;
                pathRotate = pathRotate2;
                if (iArr.length != 0) {
                    f5 = f9;
                    if (motionPaths.f22438u.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        motionPaths.f22438u = new double[i3];
                        motionPaths.f22439v = new double[i3];
                    }
                } else {
                    f5 = f9;
                }
                Arrays.fill(motionPaths.f22438u, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = motionPaths.f22438u;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    motionPaths.f22439v[i5] = dArr3[i4];
                }
                float f11 = Float.NaN;
                float f12 = f2;
                float f13 = f12;
                float f14 = f13;
                int i6 = 0;
                float f15 = f5;
                float f16 = f14;
                while (true) {
                    double[] dArr5 = motionPaths.f22438u;
                    f6 = f10;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z4 = zMo7208f;
                    } else {
                        float f17 = (float) (Double.isNaN(motionPaths.f22438u[i6]) ? 0.0d : motionPaths.f22438u[i6] + 0.0d);
                        z4 = zMo7208f;
                        float f18 = (float) motionPaths.f22439v[i6];
                        if (i6 == i2) {
                            fSin = f17;
                            f12 = f18;
                        } else if (i6 == 2) {
                            fCos = f17;
                            f13 = f18;
                        } else if (i6 == 3) {
                            f15 = f17;
                            f16 = f18;
                        } else if (i6 == 4) {
                            f10 = f17;
                            f14 = f18;
                            i6++;
                            zMo7208f = z4;
                            i2 = 1;
                        } else if (i6 == 5) {
                            f11 = f17;
                        }
                    }
                    f10 = f6;
                    i6++;
                    zMo7208f = z4;
                    i2 = 1;
                }
                z3 = zMo7208f;
                MotionController motionController = motionPaths.f22435r;
                if (motionController != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    motionController.m7236b(d, fArr, fArr2);
                    float f19 = fArr[0];
                    float f20 = fArr[1];
                    float f21 = fArr2[0];
                    float f22 = fArr2[1];
                    double d2 = fSin;
                    double d3 = fCos;
                    fSin = (float) (((Math.sin(d3) * d2) + ((double) f19)) - ((double) (f15 / 2.0f)));
                    fCos = (float) ((((double) f20) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
                    double d4 = f12;
                    double d5 = f13;
                    float fCos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + ((double) f21));
                    float fSin2 = (float) ((Math.sin(d3) * d2 * d5) + (((double) f22) - (Math.cos(d3) * d4)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f11)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f11)));
                    }
                } else {
                    view2 = view;
                    if (!Float.isNaN(f11)) {
                        view2.setRotation(f11 + ((float) Math.toDegrees(Math.atan2((f14 / 2.0f) + f13, (f16 / 2.0f) + f12))) + f2);
                    }
                }
                if (view2 instanceof FloatLayout) {
                    ((FloatLayout) view2).mo7213a(fSin, fCos, fSin + f15, fCos + f6);
                } else {
                    float f23 = fSin + 0.5f;
                    int i7 = (int) f23;
                    float f24 = fCos + 0.5f;
                    int i8 = (int) f24;
                    int i9 = (int) (f23 + f15);
                    int i10 = (int) (f24 + f6);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z5) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i11, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i12, Ints.MAX_POWER_OF_TWO));
                    }
                    view2.layout(i7, i8, i9, i10);
                }
                this.f22291d = false;
            }
            if (this.f22282C != -1) {
                if (this.f22283D == null) {
                    this.f22283D = ((View) view2.getParent()).findViewById(this.f22282C);
                }
                if (this.f22283D != null) {
                    float bottom = (this.f22283D.getBottom() + r1.getTop()) / f4;
                    float right = (this.f22283D.getRight() + this.f22283D.getLeft()) / f4;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap map3 = this.f22312y;
            if (map3 != null) {
                for (SplineSet splineSet : map3.values()) {
                    if (splineSet instanceof ViewSpline.PathRotate) {
                        double[] dArr6 = this.f22304q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((ViewSpline.PathRotate) splineSet).m6920a(fM7235a) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr7 = this.f22304q;
                double d6 = dArr7[0];
                double d7 = dArr7[1];
                ViewTimeCycle.PathRotate pathRotate4 = pathRotate;
                view2.setRotation(pathRotate4.m7207d(fM7235a, j, view2, keyCache) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
                z2 = z3 | pathRotate4.f21512h;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.f22297j;
                if (i13 >= curveFitArr2.length) {
                    break;
                }
                CurveFit curveFit = curveFitArr2[i13];
                float[] fArr3 = this.f22307t;
                curveFit.mo6887d(d, fArr3);
                CustomSupport.m7200b((ConstraintAttribute) motionPaths.f22436s.get(this.f22305r[i13 - 1]), view2, fArr3);
                i13++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.f22295h;
            if (motionConstrainedPoint.f22264b == 0) {
                if (fM7235a <= f2) {
                    view2.setVisibility(motionConstrainedPoint.f22265c);
                } else {
                    MotionConstrainedPoint motionConstrainedPoint2 = this.f22296i;
                    if (fM7235a >= f3) {
                        view2.setVisibility(motionConstrainedPoint2.f22265c);
                    } else if (motionConstrainedPoint2.f22265c != motionConstrainedPoint.f22265c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.f22280A != null) {
                int i14 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.f22280A;
                    if (i14 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i14].m7228h(fM7235a, view2);
                    i14++;
                }
            }
        } else {
            view2 = view;
            boolean z6 = zMo7208f;
            float f25 = motionPaths.f22427f;
            MotionPaths motionPaths2 = this.f22294g;
            float fM4a = AbstractC0000a.m4a(motionPaths2.f22427f, f25, fM7235a, f25);
            float f26 = motionPaths.f22428g;
            float fM4a2 = AbstractC0000a.m4a(motionPaths2.f22428g, f26, fM7235a, f26);
            float f27 = motionPaths.f22429i;
            float f28 = motionPaths2.f22429i;
            float fM4a3 = AbstractC0000a.m4a(f28, f27, fM7235a, f27);
            float f29 = motionPaths.f22430j;
            float f30 = motionPaths2.f22430j;
            float f31 = fM4a + 0.5f;
            int i15 = (int) f31;
            float f32 = fM4a2 + 0.5f;
            int i16 = (int) f32;
            int i17 = (int) (f31 + fM4a3);
            int iM4a = (int) (f32 + AbstractC0000a.m4a(f30, f29, fM7235a, f29));
            int i18 = i17 - i15;
            int i19 = iM4a - i16;
            if (f28 != f27 || f30 != f29 || this.f22291d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i19, Ints.MAX_POWER_OF_TWO));
                this.f22291d = false;
            }
            view2.layout(i15, i16, i17, iM4a);
            z2 = z6;
        }
        HashMap map4 = this.f22313z;
        if (map4 != null) {
            for (ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr8 = this.f22304q;
                    view2.setRotation(((ViewOscillator.PathRotateSet) viewOscillator).m6906a(fM7235a) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    viewOscillator.mo7203j(fM7235a, view2);
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    public final void m7242h(MotionPaths motionPaths) {
        motionPaths.m7281d((int) this.f22289b.getX(), (int) this.f22289b.getY(), this.f22289b.getWidth(), this.f22289b.getHeight());
    }

    /* JADX INFO: renamed from: j */
    public final void m7243j(long j, int i, int i2) {
        ArrayList<Key> arrayList;
        ArrayList arrayList2;
        ArrayList<MotionPaths> arrayList3;
        String[] strArr;
        Iterator it;
        MotionPaths motionPaths;
        MotionPaths motionPaths2;
        char c2;
        int i3;
        double[] dArr;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleM7206e;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        Iterator it2;
        ArrayList arrayList4;
        SplineSet splineSetM7204f;
        ConstraintAttribute constraintAttribute3;
        ArrayList arrayList5;
        MotionConstrainedPoint motionConstrainedPoint;
        float f;
        float fMin;
        float fM4a;
        float f2 = Float.NaN;
        ArrayList arrayList6 = this.f22308u;
        int i4 = 0;
        new HashSet();
        HashSet<String> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashMap map = new HashMap();
        int i5 = this.f22281B;
        MotionPaths motionPaths3 = this.f22293f;
        int i6 = -1;
        if (i5 != -1) {
            motionPaths3.f22432o = i5;
        }
        MotionConstrainedPoint motionConstrainedPoint2 = this.f22295h;
        float f3 = motionConstrainedPoint2.f22267f;
        MotionConstrainedPoint motionConstrainedPoint3 = this.f22296i;
        if (MotionConstrainedPoint.m7230c(f3, motionConstrainedPoint3.f22267f)) {
            hashSet2.add("alpha");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22268g, motionConstrainedPoint3.f22268g)) {
            hashSet2.add("elevation");
        }
        int i7 = motionConstrainedPoint2.f22265c;
        int i8 = motionConstrainedPoint3.f22265c;
        if (i7 != i8 && motionConstrainedPoint2.f22264b == 0 && (i7 == 0 || i8 == 0)) {
            hashSet2.add("alpha");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22269i, motionConstrainedPoint3.f22269i)) {
            hashSet2.add("rotation");
        }
        if (!Float.isNaN(motionConstrainedPoint2.f22278u) || !Float.isNaN(motionConstrainedPoint3.f22278u)) {
            hashSet2.add("transitionPathRotate");
        }
        if (!Float.isNaN(motionConstrainedPoint2.f22279v) || !Float.isNaN(motionConstrainedPoint3.f22279v)) {
            hashSet2.add("progress");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22270j, motionConstrainedPoint3.f22270j)) {
            hashSet2.add("rotationX");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22263a, motionConstrainedPoint3.f22263a)) {
            hashSet2.add("rotationY");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22273p, motionConstrainedPoint3.f22273p)) {
            hashSet2.add("transformPivotX");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22274q, motionConstrainedPoint3.f22274q)) {
            hashSet2.add("transformPivotY");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22271n, motionConstrainedPoint3.f22271n)) {
            hashSet2.add("scaleX");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22272o, motionConstrainedPoint3.f22272o)) {
            hashSet2.add("scaleY");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22275r, motionConstrainedPoint3.f22275r)) {
            hashSet2.add("translationX");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22276s, motionConstrainedPoint3.f22276s)) {
            hashSet2.add("translationY");
        }
        if (MotionConstrainedPoint.m7230c(motionConstrainedPoint2.f22277t, motionConstrainedPoint3.f22277t)) {
            hashSet2.add("translationZ");
        }
        ArrayList<Key> arrayList7 = this.f22310w;
        MotionPaths motionPaths4 = this.f22294g;
        if (arrayList7 != null) {
            ArrayList arrayList8 = null;
            for (Key key : arrayList7) {
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    MotionPaths motionPaths5 = new MotionPaths();
                    motionPaths5.f22424b = i4;
                    motionPaths5.f22431n = f2;
                    motionPaths5.f22432o = i6;
                    motionPaths5.f22433p = i6;
                    motionPaths5.f22434q = f2;
                    f = f2;
                    motionPaths5.f22435r = null;
                    motionPaths5.f22436s = new LinkedHashMap();
                    motionPaths5.f22437t = i4;
                    motionPaths5.f22438u = new double[18];
                    motionPaths5.f22439v = new double[18];
                    if (motionPaths3.f22433p != i6) {
                        float f4 = keyPosition.f22173a / 100.0f;
                        motionPaths5.f22425c = f4;
                        motionPaths5.f22424b = keyPosition.f22217h;
                        motionPaths5.f22437t = keyPosition.f22222m;
                        float f5 = Float.isNaN(keyPosition.f22218i) ? f4 : keyPosition.f22218i;
                        float f6 = Float.isNaN(keyPosition.f22219j) ? f4 : keyPosition.f22219j;
                        arrayList5 = arrayList7;
                        float f7 = motionPaths4.f22429i - motionPaths3.f22429i;
                        float f8 = motionPaths4.f22430j;
                        float f9 = motionPaths3.f22430j;
                        motionPaths5.f22426d = motionPaths5.f22425c;
                        motionPaths5.f22429i = (int) ((f7 * f5) + r1);
                        motionPaths5.f22430j = (int) (((f8 - f9) * f6) + f9);
                        motionConstrainedPoint = motionConstrainedPoint3;
                        if (keyPosition.f22222m != 2) {
                            float f10 = Float.isNaN(keyPosition.f22220k) ? f4 : keyPosition.f22220k;
                            float f11 = motionPaths4.f22427f;
                            float f12 = motionPaths3.f22427f;
                            motionPaths5.f22427f = AbstractC0000a.m4a(f11, f12, f10, f12);
                            if (!Float.isNaN(keyPosition.f22221l)) {
                                f4 = keyPosition.f22221l;
                            }
                            float f13 = motionPaths4.f22428g;
                            float f14 = motionPaths3.f22428g;
                            motionPaths5.f22428g = AbstractC0000a.m4a(f13, f14, f4, f14);
                        } else {
                            if (Float.isNaN(keyPosition.f22220k)) {
                                float f15 = motionPaths4.f22427f;
                                float f16 = motionPaths3.f22427f;
                                fMin = AbstractC0000a.m4a(f15, f16, f4, f16);
                            } else {
                                fMin = keyPosition.f22220k * Math.min(f6, f5);
                            }
                            motionPaths5.f22427f = fMin;
                            if (Float.isNaN(keyPosition.f22221l)) {
                                float f17 = motionPaths4.f22428g;
                                float f18 = motionPaths3.f22428g;
                                fM4a = AbstractC0000a.m4a(f17, f18, f4, f18);
                            } else {
                                fM4a = keyPosition.f22221l;
                            }
                            motionPaths5.f22428g = fM4a;
                        }
                        motionPaths5.f22433p = motionPaths3.f22433p;
                        motionPaths5.f22423a = Easing.m6899c(keyPosition.f22215f);
                        motionPaths5.f22432o = keyPosition.f22216g;
                    } else {
                        arrayList5 = arrayList7;
                        motionConstrainedPoint = motionConstrainedPoint3;
                        int i9 = keyPosition.f22222m;
                        if (i9 == 1) {
                            float f19 = keyPosition.f22173a / 100.0f;
                            motionPaths5.f22425c = f19;
                            motionPaths5.f22424b = keyPosition.f22217h;
                            float f20 = Float.isNaN(keyPosition.f22218i) ? f19 : keyPosition.f22218i;
                            float f21 = Float.isNaN(keyPosition.f22219j) ? f19 : keyPosition.f22219j;
                            float f22 = motionPaths4.f22429i - motionPaths3.f22429i;
                            float f23 = f19;
                            float f24 = motionPaths4.f22430j - motionPaths3.f22430j;
                            motionPaths5.f22426d = motionPaths5.f22425c;
                            if (!Float.isNaN(keyPosition.f22220k)) {
                                f23 = keyPosition.f22220k;
                            }
                            float f25 = (motionPaths3.f22429i / 2.0f) + motionPaths3.f22427f;
                            float f26 = motionPaths3.f22428g;
                            float f27 = motionPaths3.f22430j;
                            float f28 = ((motionPaths4.f22429i / 2.0f) + motionPaths4.f22427f) - f25;
                            float f29 = ((motionPaths4.f22430j / 2.0f) + motionPaths4.f22428g) - ((f27 / 2.0f) + f26);
                            float f30 = f28 * f23;
                            float f31 = (f22 * f20) / 2.0f;
                            motionPaths5.f22427f = (int) ((r1 + f30) - f31);
                            float f32 = f23 * f29;
                            float f33 = (f24 * f21) / 2.0f;
                            motionPaths5.f22428g = (int) ((f26 + f32) - f33);
                            motionPaths5.f22429i = (int) (r1 + r6);
                            motionPaths5.f22430j = (int) (f27 + r8);
                            float f34 = Float.isNaN(keyPosition.f22221l) ? 0.0f : keyPosition.f22221l;
                            float f35 = (-f29) * f34;
                            float f36 = f28 * f34;
                            motionPaths5.f22437t = 1;
                            float f37 = (int) ((motionPaths3.f22427f + f30) - f31);
                            float f38 = (int) ((motionPaths3.f22428g + f32) - f33);
                            motionPaths5.f22427f = f37 + f35;
                            motionPaths5.f22428g = f38 + f36;
                            motionPaths5.f22433p = motionPaths5.f22433p;
                            motionPaths5.f22423a = Easing.m6899c(keyPosition.f22215f);
                            motionPaths5.f22432o = keyPosition.f22216g;
                        } else if (i9 == 2) {
                            float f39 = keyPosition.f22173a / 100.0f;
                            motionPaths5.f22425c = f39;
                            motionPaths5.f22424b = keyPosition.f22217h;
                            float f40 = Float.isNaN(keyPosition.f22218i) ? f39 : keyPosition.f22218i;
                            float f41 = Float.isNaN(keyPosition.f22219j) ? f39 : keyPosition.f22219j;
                            float f42 = motionPaths4.f22429i;
                            float f43 = motionPaths3.f22429i;
                            float f44 = f42 - f43;
                            float f45 = motionPaths4.f22430j;
                            float f46 = motionPaths3.f22430j;
                            float f47 = f45 - f46;
                            motionPaths5.f22426d = motionPaths5.f22425c;
                            float f48 = (f43 / 2.0f) + motionPaths3.f22427f;
                            float f49 = motionPaths3.f22428g;
                            float f50 = (f42 / 2.0f) + motionPaths4.f22427f;
                            float f51 = ((f45 / 2.0f) + motionPaths4.f22428g) - ((f46 / 2.0f) + f49);
                            float f52 = f44 * f40;
                            motionPaths5.f22427f = (int) ((((f50 - f48) * f39) + r1) - (f52 / 2.0f));
                            float f53 = f47 * f41;
                            motionPaths5.f22428g = (int) (((f51 * f39) + f49) - (f53 / 2.0f));
                            motionPaths5.f22429i = (int) (f43 + f52);
                            motionPaths5.f22430j = (int) (f46 + f53);
                            motionPaths5.f22437t = 2;
                            if (!Float.isNaN(keyPosition.f22220k)) {
                                motionPaths5.f22427f = (int) (keyPosition.f22220k * (i - ((int) motionPaths5.f22429i)));
                            }
                            if (!Float.isNaN(keyPosition.f22221l)) {
                                motionPaths5.f22428g = (int) (keyPosition.f22221l * (i2 - ((int) motionPaths5.f22430j)));
                            }
                            motionPaths5.f22433p = motionPaths5.f22433p;
                            motionPaths5.f22423a = Easing.m6899c(keyPosition.f22215f);
                            motionPaths5.f22432o = keyPosition.f22216g;
                        } else if (i9 != 3) {
                            float f54 = keyPosition.f22173a / 100.0f;
                            motionPaths5.f22425c = f54;
                            motionPaths5.f22424b = keyPosition.f22217h;
                            float f55 = Float.isNaN(keyPosition.f22218i) ? f54 : keyPosition.f22218i;
                            float f56 = Float.isNaN(keyPosition.f22219j) ? f54 : keyPosition.f22219j;
                            float f57 = motionPaths4.f22429i;
                            float f58 = motionPaths3.f22429i;
                            float f59 = f57 - f58;
                            float f60 = motionPaths4.f22430j;
                            float f61 = motionPaths3.f22430j;
                            float f62 = f60 - f61;
                            motionPaths5.f22426d = motionPaths5.f22425c;
                            float f63 = (f58 / 2.0f) + motionPaths3.f22427f;
                            float f64 = motionPaths3.f22428g;
                            float f65 = ((f57 / 2.0f) + motionPaths4.f22427f) - f63;
                            float f66 = ((f60 / 2.0f) + motionPaths4.f22428g) - ((f61 / 2.0f) + f64);
                            float f67 = (f59 * f55) / 2.0f;
                            motionPaths5.f22427f = (int) (((f65 * f54) + r1) - f67);
                            float f68 = (f62 * f56) / 2.0f;
                            motionPaths5.f22428g = (int) (((f66 * f54) + f64) - f68);
                            motionPaths5.f22429i = (int) (f58 + r31);
                            motionPaths5.f22430j = (int) (f61 + r34);
                            float f69 = Float.isNaN(keyPosition.f22220k) ? f54 : keyPosition.f22220k;
                            float f70 = Float.isNaN(f) ? 0.0f : f;
                            float f71 = f69;
                            float f72 = Float.isNaN(keyPosition.f22221l) ? f54 : keyPosition.f22221l;
                            float f73 = Float.isNaN(f) ? 0.0f : f;
                            float f74 = f72;
                            motionPaths5.f22437t = 0;
                            motionPaths5.f22427f = (int) (((f73 * f66) + ((f71 * f65) + motionPaths3.f22427f)) - f67);
                            motionPaths5.f22428g = (int) (((f66 * f74) + ((f65 * f70) + motionPaths3.f22428g)) - f68);
                            motionPaths5.f22423a = Easing.m6899c(keyPosition.f22215f);
                            motionPaths5.f22432o = keyPosition.f22216g;
                        } else {
                            float f75 = keyPosition.f22173a / 100.0f;
                            motionPaths5.f22425c = f75;
                            motionPaths5.f22424b = keyPosition.f22217h;
                            float f76 = Float.isNaN(keyPosition.f22218i) ? f75 : keyPosition.f22218i;
                            float f77 = Float.isNaN(keyPosition.f22219j) ? f75 : keyPosition.f22219j;
                            float f78 = motionPaths4.f22429i;
                            float f79 = motionPaths3.f22429i;
                            float f80 = f78 - f79;
                            float f81 = motionPaths4.f22430j;
                            float f82 = motionPaths3.f22430j;
                            float f83 = f81 - f82;
                            motionPaths5.f22426d = motionPaths5.f22425c;
                            float f84 = (f79 / 2.0f) + motionPaths3.f22427f;
                            float f85 = (f82 / 2.0f) + motionPaths3.f22428g;
                            float f86 = (f78 / 2.0f) + motionPaths4.f22427f;
                            float f87 = (f81 / 2.0f) + motionPaths4.f22428g;
                            if (f84 > f86) {
                                f84 = f86;
                                f86 = f84;
                            }
                            if (f85 <= f87) {
                                f85 = f87;
                                f87 = f85;
                            }
                            float f88 = f86 - f84;
                            float f89 = f85 - f87;
                            float f90 = (f80 * f76) / 2.0f;
                            motionPaths5.f22427f = (int) (((f88 * f75) + r1) - f90);
                            float f91 = (f83 * f77) / 2.0f;
                            motionPaths5.f22428g = (int) (((f89 * f75) + r1) - f91);
                            motionPaths5.f22429i = (int) (f79 + r31);
                            motionPaths5.f22430j = (int) (f82 + r34);
                            float f92 = Float.isNaN(keyPosition.f22220k) ? f75 : keyPosition.f22220k;
                            float f93 = Float.isNaN(f) ? 0.0f : f;
                            float f94 = f92;
                            float f95 = Float.isNaN(keyPosition.f22221l) ? f75 : keyPosition.f22221l;
                            float f96 = Float.isNaN(f) ? 0.0f : f;
                            float f97 = f95;
                            motionPaths5.f22437t = 0;
                            motionPaths5.f22427f = (int) (((f96 * f89) + ((f94 * f88) + motionPaths3.f22427f)) - f90);
                            motionPaths5.f22428g = (int) (((f89 * f97) + ((f88 * f93) + motionPaths3.f22428g)) - f91);
                            motionPaths5.f22423a = Easing.m6899c(keyPosition.f22215f);
                            motionPaths5.f22432o = keyPosition.f22216g;
                        }
                    }
                    if (Collections.binarySearch(arrayList6, motionPaths5) == 0) {
                        Log.e("MotionController", " KeyPath position \"" + motionPaths5.f22426d + "\" outside of range");
                    }
                    arrayList6.add((-r1) - 1, motionPaths5);
                    int i10 = keyPosition.f22224e;
                    if (i10 != -1) {
                        this.f22292e = i10;
                    }
                } else {
                    arrayList5 = arrayList7;
                    motionConstrainedPoint = motionConstrainedPoint3;
                    f = f2;
                    if (key instanceof KeyCycle) {
                        key.mo7218d(hashSet3);
                    } else if (key instanceof KeyTimeCycle) {
                        key.mo7218d(hashSet);
                    } else if (key instanceof KeyTrigger) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        ArrayList arrayList9 = arrayList8;
                        arrayList9.add((KeyTrigger) key);
                        arrayList8 = arrayList9;
                    } else {
                        key.mo7220f(map);
                        key.mo7218d(hashSet2);
                    }
                }
                f2 = f;
                arrayList7 = arrayList5;
                motionConstrainedPoint3 = motionConstrainedPoint;
                i6 = -1;
                i4 = 0;
            }
            arrayList = arrayList7;
            arrayList2 = arrayList8;
        } else {
            arrayList = arrayList7;
            arrayList2 = null;
        }
        MotionConstrainedPoint motionConstrainedPoint4 = motionConstrainedPoint3;
        float f98 = f2;
        if (arrayList2 != null) {
            this.f22280A = (KeyTrigger[]) arrayList2.toArray(new KeyTrigger[0]);
        }
        if (hashSet2.isEmpty()) {
            arrayList3 = arrayList6;
        } else {
            this.f22312y = new HashMap();
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (Key key2 : arrayList) {
                        Iterator it4 = it3;
                        ArrayList arrayList10 = arrayList6;
                        HashMap map2 = key2.f22176d;
                        if (map2 != null && (constraintAttribute3 = (ConstraintAttribute) map2.get(str2)) != null) {
                            sparseArray.append(key2.f22173a, constraintAttribute3);
                        }
                        it3 = it4;
                        arrayList6 = arrayList10;
                    }
                    it2 = it3;
                    arrayList4 = arrayList6;
                    ViewSpline.CustomSet customSet = new ViewSpline.CustomSet();
                    String str3 = str.split(",")[1];
                    customSet.f22165f = sparseArray;
                    splineSetM7204f = customSet;
                } else {
                    it2 = it3;
                    arrayList4 = arrayList6;
                    splineSetM7204f = ViewSpline.m7204f(str);
                }
                if (splineSetM7204f != null) {
                    splineSetM7204f.f21470e = str;
                    this.f22312y.put(str, splineSetM7204f);
                }
                it3 = it2;
                arrayList6 = arrayList4;
            }
            arrayList3 = arrayList6;
            if (arrayList != null) {
                for (Key key3 : arrayList) {
                    if (key3 instanceof KeyAttributes) {
                        key3.mo7215a(this.f22312y);
                    }
                }
            }
            motionConstrainedPoint2.m7231a(this.f22312y, 0);
            motionConstrainedPoint4.m7231a(this.f22312y, 100);
            for (String str4 : this.f22312y.keySet()) {
                int iIntValue = (!map.containsKey(str4) || (num = (Integer) map.get(str4)) == null) ? 0 : num.intValue();
                SplineSet splineSet = (SplineSet) this.f22312y.get(str4);
                if (splineSet != null) {
                    splineSet.mo6923e(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f22311x == null) {
                this.f22311x = new HashMap();
            }
            for (String str5 : hashSet) {
                if (!this.f22311x.containsKey(str5)) {
                    if (str5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str6 = str5.split(",")[1];
                        for (Key key4 : arrayList) {
                            HashMap map3 = key4.f22176d;
                            if (map3 != null && (constraintAttribute2 = (ConstraintAttribute) map3.get(str6)) != null) {
                                sparseArray2.append(key4.f22173a, constraintAttribute2);
                            }
                        }
                        ViewTimeCycle.CustomSet customSet2 = new ViewTimeCycle.CustomSet();
                        customSet2.f22170m = new SparseArray();
                        customSet2.f22168k = str5.split(",")[1];
                        customSet2.f22169l = sparseArray2;
                        viewTimeCycleM7206e = customSet2;
                    } else {
                        viewTimeCycleM7206e = ViewTimeCycle.m7206e(j, str5);
                    }
                    if (viewTimeCycleM7206e != null) {
                        viewTimeCycleM7206e.f21510f = str5;
                        this.f22311x.put(str5, viewTimeCycleM7206e);
                    }
                }
            }
            if (arrayList != null) {
                for (Key key5 : arrayList) {
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).m7226h(this.f22311x);
                    }
                }
            }
            for (String str7 : this.f22311x.keySet()) {
                ((ViewTimeCycle) this.f22311x.get(str7)).mo6930c(map.containsKey(str7) ? ((Integer) map.get(str7)).intValue() : 0);
            }
        }
        int size = arrayList3.size();
        int i11 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i11];
        motionPathsArr[0] = motionPaths3;
        motionPathsArr[size + 1] = motionPaths4;
        if (arrayList3.size() > 0 && this.f22292e == -1) {
            this.f22292e = 0;
        }
        Iterator it5 = arrayList3.iterator();
        int i12 = 1;
        while (it5.hasNext()) {
            motionPathsArr[i12] = (MotionPaths) it5.next();
            i12++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str8 : motionPaths4.f22436s.keySet()) {
            if (motionPaths3.f22436s.containsKey(str8)) {
                if (!hashSet2.contains("CUSTOM," + str8)) {
                    hashSet4.add(str8);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f22305r = strArr2;
        this.f22306s = new int[strArr2.length];
        int i13 = 0;
        while (true) {
            strArr = this.f22305r;
            if (i13 >= strArr.length) {
                break;
            }
            String str9 = strArr[i13];
            this.f22306s[i13] = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= i11) {
                    break;
                }
                if (motionPathsArr[i14].f22436s.containsKey(str9) && (constraintAttribute = (ConstraintAttribute) motionPathsArr[i14].f22436s.get(str9)) != null) {
                    int[] iArr = this.f22306s;
                    iArr[i13] = constraintAttribute.m7320c() + iArr[i13];
                    break;
                }
                i14++;
            }
            i13++;
        }
        boolean z2 = motionPathsArr[0].f22432o != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i15 = 1; i15 < i11; i15++) {
            MotionPaths motionPaths6 = motionPathsArr[i15];
            MotionPaths motionPaths7 = motionPathsArr[i15 - 1];
            boolean zM7277b = MotionPaths.m7277b(motionPaths6.f22427f, motionPaths7.f22427f);
            boolean zM7277b2 = MotionPaths.m7277b(motionPaths6.f22428g, motionPaths7.f22428g);
            zArr[0] = zArr[0] | MotionPaths.m7277b(motionPaths6.f22426d, motionPaths7.f22426d);
            boolean z3 = zM7277b | zM7277b2 | z2;
            zArr[1] = zArr[1] | z3;
            zArr[2] = z3 | zArr[2];
            zArr[3] = zArr[3] | MotionPaths.m7277b(motionPaths6.f22429i, motionPaths7.f22429i);
            zArr[4] = MotionPaths.m7277b(motionPaths6.f22430j, motionPaths7.f22430j) | zArr[4];
        }
        int i16 = 0;
        for (int i17 = 1; i17 < length; i17++) {
            if (zArr[i17]) {
                i16++;
            }
        }
        this.f22302o = new int[i16];
        int iMax = Math.max(2, i16);
        this.f22303p = new double[iMax];
        this.f22304q = new double[iMax];
        int i18 = 0;
        for (int i19 = 1; i19 < length; i19++) {
            if (zArr[i19]) {
                this.f22302o[i18] = i19;
                i18++;
            }
        }
        int[] iArr2 = {i11, this.f22302o.length};
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr3 = new double[i11];
        int i20 = 0;
        while (i20 < i11) {
            MotionPaths motionPaths8 = motionPathsArr[i20];
            double[] dArr4 = dArr2[i20];
            int[] iArr3 = this.f22302o;
            MotionPaths[] motionPathsArr2 = motionPathsArr;
            int i21 = i20;
            float[] fArr = {motionPaths8.f22426d, motionPaths8.f22427f, motionPaths8.f22428g, motionPaths8.f22429i, motionPaths8.f22430j, motionPaths8.f22431n};
            int i22 = 0;
            for (int i23 : iArr3) {
                if (i23 < 6) {
                    dArr4[i22] = fArr[r11];
                    i22++;
                }
            }
            dArr3[i21] = motionPathsArr2[i21].f22425c;
            i20 = i21 + 1;
            motionPathsArr = motionPathsArr2;
        }
        MotionPaths[] motionPathsArr3 = motionPathsArr;
        int i24 = 0;
        while (true) {
            int[] iArr4 = this.f22302o;
            if (i24 >= iArr4.length) {
                break;
            }
            if (iArr4[i24] < 6) {
                String strM19p = AbstractC0000a.m19p(new StringBuilder(), MotionPaths.f22422w[this.f22302o[i24]], " [");
                for (int i25 = 0; i25 < i11; i25++) {
                    StringBuilder sbM2244s = AbstractC0455a.m2244s(strM19p);
                    sbM2244s.append(dArr2[i25][i24]);
                    strM19p = sbM2244s.toString();
                }
            }
            i24++;
        }
        this.f22297j = new CurveFit[this.f22305r.length + 1];
        int i26 = 0;
        while (true) {
            String[] strArr3 = this.f22305r;
            if (i26 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i26];
            int i27 = 0;
            int i28 = 0;
            double[] dArr5 = null;
            double[][] dArr6 = null;
            while (i27 < i11) {
                if (motionPathsArr3[i27].f22436s.containsKey(str10)) {
                    if (dArr6 == null) {
                        dArr5 = new double[i11];
                        ConstraintAttribute constraintAttribute4 = (ConstraintAttribute) motionPathsArr3[i27].f22436s.get(str10);
                        dArr6 = (double[][]) Array.newInstance((Class<?>) cls, i11, constraintAttribute4 == null ? 0 : constraintAttribute4.m7320c());
                    }
                    MotionPaths motionPaths9 = motionPathsArr3[i27];
                    dArr5[i28] = motionPaths9.f22425c;
                    double[] dArr7 = dArr6[i28];
                    ConstraintAttribute constraintAttribute5 = (ConstraintAttribute) motionPaths9.f22436s.get(str10);
                    if (constraintAttribute5 == null) {
                        i3 = i26;
                        dArr = dArr3;
                    } else {
                        i3 = i26;
                        if (constraintAttribute5.m7320c() == 1) {
                            dArr = dArr3;
                            dArr7[0] = constraintAttribute5.m7318a();
                        } else {
                            dArr = dArr3;
                            int iM7320c = constraintAttribute5.m7320c();
                            float[] fArr2 = new float[iM7320c];
                            constraintAttribute5.m7319b(fArr2);
                            int i29 = 0;
                            int i30 = 0;
                            while (i29 < iM7320c) {
                                dArr7[i30] = fArr2[i29];
                                i29++;
                                iM7320c = iM7320c;
                                i30++;
                                fArr2 = fArr2;
                            }
                        }
                    }
                    i28++;
                } else {
                    i3 = i26;
                    dArr = dArr3;
                }
                i27++;
                dArr3 = dArr;
                i26 = i3;
            }
            int i31 = i26 + 1;
            this.f22297j[i31] = CurveFit.m6898a(this.f22292e, Arrays.copyOf(dArr5, i28), (double[][]) Arrays.copyOf(dArr6, i28));
            i26 = i31;
            dArr3 = dArr3;
        }
        this.f22297j[0] = CurveFit.m6898a(this.f22292e, dArr3, dArr2);
        if (motionPathsArr3[0].f22432o != -1) {
            int[] iArr5 = new int[i11];
            double[] dArr8 = new double[i11];
            double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) cls, i11, 2);
            for (int i32 = 0; i32 < i11; i32++) {
                iArr5[i32] = motionPathsArr3[i32].f22432o;
                dArr8[i32] = r6.f22425c;
                double[] dArr10 = dArr9[i32];
                dArr10[0] = r6.f22427f;
                dArr10[1] = r6.f22428g;
            }
            this.f22298k = new ArcCurveFit(iArr5, dArr8, dArr9);
        }
        this.f22313z = new HashMap();
        if (arrayList != null) {
            Iterator it6 = hashSet3.iterator();
            float f99 = f98;
            while (it6.hasNext()) {
                String str11 = (String) it6.next();
                ViewOscillator viewOscillatorM7202i = ViewOscillator.m7202i(str11);
                if (viewOscillatorM7202i != null) {
                    if (viewOscillatorM7202i.f21431e == 1 && Float.isNaN(f99)) {
                        float[] fArr3 = new float[2];
                        float f100 = 1.0f / 99;
                        double d = 0.0d;
                        float fHypot = 0.0f;
                        double d2 = 0.0d;
                        int i33 = 0;
                        while (i33 < 100) {
                            float f101 = i33 * f100;
                            double d3 = d;
                            double dMo6900a = f101;
                            Easing easing = motionPaths3.f22423a;
                            float f102 = f98;
                            float f103 = 0.0f;
                            for (MotionPaths motionPaths10 : arrayList3) {
                                Iterator it7 = it6;
                                Easing easing2 = motionPaths10.f22423a;
                                if (easing2 != null) {
                                    float f104 = motionPaths10.f22425c;
                                    if (f104 < f101) {
                                        f103 = f104;
                                        easing = easing2;
                                    } else if (Float.isNaN(f102)) {
                                        f102 = motionPaths10.f22425c;
                                    }
                                }
                                it6 = it7;
                            }
                            Iterator it8 = it6;
                            if (easing != null) {
                                if (Float.isNaN(f102)) {
                                    f102 = 1.0f;
                                }
                                dMo6900a = (((float) easing.mo6900a((f101 - f103) / r17)) * (f102 - f103)) + f103;
                            }
                            this.f22297j[0].mo6886c(dMo6900a, this.f22303p);
                            float[] fArr4 = fArr3;
                            this.f22293f.m7280c(dMo6900a, this.f22302o, this.f22303p, fArr4, 0);
                            if (i33 > 0) {
                                c2 = 0;
                                motionPaths2 = motionPaths3;
                                fHypot += (float) Math.hypot(d3 - ((double) fArr4[1]), d2 - ((double) fArr4[0]));
                            } else {
                                motionPaths2 = motionPaths3;
                                c2 = 0;
                            }
                            d2 = fArr4[c2];
                            d = fArr4[1];
                            i33++;
                            it6 = it8;
                            motionPaths3 = motionPaths2;
                            fArr3 = fArr4;
                        }
                        it = it6;
                        motionPaths = motionPaths3;
                        f99 = fHypot;
                    } else {
                        it = it6;
                        motionPaths = motionPaths3;
                    }
                    viewOscillatorM7202i.f21428b = str11;
                    this.f22313z.put(str11, viewOscillatorM7202i);
                    it6 = it;
                    motionPaths3 = motionPaths;
                }
            }
            for (Key key6 : arrayList) {
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).m7222h(this.f22313z);
                }
            }
            Iterator it9 = this.f22313z.values().iterator();
            while (it9.hasNext()) {
                ((ViewOscillator) it9.next()).m6912h();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        MotionPaths motionPaths = this.f22293f;
        sb.append(motionPaths.f22427f);
        sb.append(" y: ");
        sb.append(motionPaths.f22428g);
        sb.append(" end: x: ");
        MotionPaths motionPaths2 = this.f22294g;
        sb.append(motionPaths2.f22427f);
        sb.append(" y: ");
        sb.append(motionPaths2.f22428g);
        return sb.toString();
    }
}
