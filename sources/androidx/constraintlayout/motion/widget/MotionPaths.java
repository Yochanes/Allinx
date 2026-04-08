package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {

    /* JADX INFO: renamed from: w */
    public static final String[] f22422w = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a */
    public Easing f22423a;

    /* JADX INFO: renamed from: c */
    public float f22425c;

    /* JADX INFO: renamed from: d */
    public float f22426d;

    /* JADX INFO: renamed from: f */
    public float f22427f;

    /* JADX INFO: renamed from: g */
    public float f22428g;

    /* JADX INFO: renamed from: i */
    public float f22429i;

    /* JADX INFO: renamed from: j */
    public float f22430j;

    /* JADX INFO: renamed from: b */
    public int f22424b = 0;

    /* JADX INFO: renamed from: n */
    public float f22431n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public int f22432o = -1;

    /* JADX INFO: renamed from: p */
    public int f22433p = -1;

    /* JADX INFO: renamed from: q */
    public float f22434q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public MotionController f22435r = null;

    /* JADX INFO: renamed from: s */
    public LinkedHashMap f22436s = new LinkedHashMap();

    /* JADX INFO: renamed from: t */
    public int f22437t = 0;

    /* JADX INFO: renamed from: u */
    public double[] f22438u = new double[18];

    /* JADX INFO: renamed from: v */
    public double[] f22439v = new double[18];

    /* JADX INFO: renamed from: b */
    public static boolean m7277b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: e */
    public static void m7278e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m7279a(ConstraintSet.Constraint constraint) {
        int iOrdinal;
        this.f22423a = Easing.m6899c(constraint.f22732d.f22822d);
        ConstraintSet.Motion motion = constraint.f22732d;
        this.f22432o = motion.f22823e;
        this.f22433p = motion.f22820b;
        this.f22431n = motion.f22826h;
        this.f22424b = motion.f22824f;
        this.f22434q = constraint.f22733e.f22752C;
        for (String str : constraint.f22735g.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraint.f22735g.get(str);
            if (constraintAttribute != null && (iOrdinal = constraintAttribute.f22600c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f22436s.put(str, constraintAttribute);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7280c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f22427f;
        float fCos = this.f22428g;
        float f = this.f22429i;
        float f2 = this.f22430j;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        MotionController motionController = this.f22435r;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.m7236b(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (Math.cos(d4) * d3)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + 0.0f;
        fArr[i + 1] = (f2 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.f22426d, motionPaths.f22426d);
    }

    /* JADX INFO: renamed from: d */
    public final void m7281d(float f, float f2, float f3, float f4) {
        this.f22427f = f;
        this.f22428g = f2;
        this.f22429i = f3;
        this.f22430j = f4;
    }

    /* JADX INFO: renamed from: f */
    public final void m7282f(MotionController motionController, MotionPaths motionPaths) {
        double d = (((this.f22429i / 2.0f) + this.f22427f) - motionPaths.f22427f) - (motionPaths.f22429i / 2.0f);
        double d2 = (((this.f22430j / 2.0f) + this.f22428g) - motionPaths.f22428g) - (motionPaths.f22430j / 2.0f);
        this.f22435r = motionController;
        this.f22427f = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f22434q)) {
            this.f22428g = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f22428g = (float) Math.toRadians(this.f22434q);
        }
    }
}
