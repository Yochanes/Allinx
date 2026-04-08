package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {

    /* JADX INFO: renamed from: c */
    public int f22265c;

    /* JADX INFO: renamed from: a */
    public float f22263a = 0.0f;

    /* JADX INFO: renamed from: b */
    public int f22264b = 0;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f22266d = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public float f22267f = 1.0f;

    /* JADX INFO: renamed from: g */
    public float f22268g = 0.0f;

    /* JADX INFO: renamed from: i */
    public float f22269i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float f22270j = 0.0f;

    /* JADX INFO: renamed from: n */
    public float f22271n = 1.0f;

    /* JADX INFO: renamed from: o */
    public float f22272o = 1.0f;

    /* JADX INFO: renamed from: p */
    public float f22273p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f22274q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public float f22275r = 0.0f;

    /* JADX INFO: renamed from: s */
    public float f22276s = 0.0f;

    /* JADX INFO: renamed from: t */
    public float f22277t = 0.0f;

    /* JADX INFO: renamed from: u */
    public float f22278u = Float.NaN;

    /* JADX INFO: renamed from: v */
    public float f22279v = Float.NaN;

    /* JADX INFO: renamed from: c */
    public static boolean m7230c(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m7231a(HashMap map, int i) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = (ViewSpline) map.get(str);
            if (viewSpline != null) {
                str.getClass();
                byte b2 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b2 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b2 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b2 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b2 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b2 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b2 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b2 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b2 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b2 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b2 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b2 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b2 = Ascii.f42547VT;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b2 = Ascii.f42536FF;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b2 = Ascii.f42534CR;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        viewSpline.mo6921c(Float.isNaN(this.f22270j) ? 0.0f : this.f22270j, i);
                        break;
                    case 1:
                        viewSpline.mo6921c(Float.isNaN(this.f22263a) ? 0.0f : this.f22263a, i);
                        break;
                    case 2:
                        viewSpline.mo6921c(Float.isNaN(this.f22275r) ? 0.0f : this.f22275r, i);
                        break;
                    case 3:
                        viewSpline.mo6921c(Float.isNaN(this.f22276s) ? 0.0f : this.f22276s, i);
                        break;
                    case 4:
                        viewSpline.mo6921c(Float.isNaN(this.f22277t) ? 0.0f : this.f22277t, i);
                        break;
                    case 5:
                        viewSpline.mo6921c(Float.isNaN(this.f22279v) ? 0.0f : this.f22279v, i);
                        break;
                    case 6:
                        viewSpline.mo6921c(Float.isNaN(this.f22271n) ? 1.0f : this.f22271n, i);
                        break;
                    case 7:
                        viewSpline.mo6921c(Float.isNaN(this.f22272o) ? 1.0f : this.f22272o, i);
                        break;
                    case 8:
                        viewSpline.mo6921c(Float.isNaN(this.f22273p) ? 0.0f : this.f22273p, i);
                        break;
                    case 9:
                        viewSpline.mo6921c(Float.isNaN(this.f22274q) ? 0.0f : this.f22274q, i);
                        break;
                    case 10:
                        viewSpline.mo6921c(Float.isNaN(this.f22269i) ? 0.0f : this.f22269i, i);
                        break;
                    case 11:
                        viewSpline.mo6921c(Float.isNaN(this.f22268g) ? 0.0f : this.f22268g, i);
                        break;
                    case TYPE_BYTES_VALUE:
                        viewSpline.mo6921c(Float.isNaN(this.f22278u) ? 0.0f : this.f22278u, i);
                        break;
                    case 13:
                        viewSpline.mo6921c(Float.isNaN(this.f22267f) ? 1.0f : this.f22267f, i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.f22266d;
                            if (linkedHashMap.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = (ConstraintAttribute) linkedHashMap.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).f22165f.append(i, constraintAttribute);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.m7318a() + viewSpline);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7232b(View view) {
        this.f22265c = view.getVisibility();
        this.f22267f = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f22268g = view.getElevation();
        this.f22269i = view.getRotation();
        this.f22270j = view.getRotationX();
        this.f22263a = view.getRotationY();
        this.f22271n = view.getScaleX();
        this.f22272o = view.getScaleY();
        this.f22273p = view.getPivotX();
        this.f22274q = view.getPivotY();
        this.f22275r = view.getTranslationX();
        this.f22276s = view.getTranslationY();
        this.f22277t = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        motionConstrainedPoint.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m7233d(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        rect.width();
        rect.height();
        ConstraintSet.Constraint constraintM7352i = constraintSet.m7352i(i2);
        ConstraintSet.PropertySet propertySet = constraintM7352i.f22731c;
        int i3 = propertySet.f22834c;
        this.f22264b = i3;
        int i4 = propertySet.f22833b;
        this.f22265c = i4;
        this.f22267f = (i4 == 0 || i3 != 0) ? propertySet.f22835d : 0.0f;
        ConstraintSet.Transform transform = constraintM7352i.f22734f;
        boolean z2 = transform.f22850m;
        this.f22268g = transform.f22851n;
        this.f22269i = transform.f22839b;
        this.f22270j = transform.f22840c;
        this.f22263a = transform.f22841d;
        this.f22271n = transform.f22842e;
        this.f22272o = transform.f22843f;
        this.f22273p = transform.f22844g;
        this.f22274q = transform.f22845h;
        this.f22275r = transform.f22847j;
        this.f22276s = transform.f22848k;
        this.f22277t = transform.f22849l;
        ConstraintSet.Motion motion = constraintM7352i.f22732d;
        Easing.m6899c(motion.f22822d);
        this.f22278u = motion.f22826h;
        this.f22279v = constraintM7352i.f22731c.f22836e;
        for (String str : constraintM7352i.f22735g.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraintM7352i.f22735g.get(str);
            int iOrdinal = constraintAttribute.f22600c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f22266d.put(str, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f22269i + 90.0f;
            this.f22269i = f;
            if (f > 180.0f) {
                this.f22269i = f - 360.0f;
                return;
            }
            return;
        }
        this.f22269i -= 90.0f;
    }
}
