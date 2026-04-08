package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.state.WidgetFrame;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {

    /* JADX INFO: renamed from: b */
    public int f21303b;

    /* JADX INFO: renamed from: a */
    public float f21302a = 1.0f;

    /* JADX INFO: renamed from: c */
    public float f21304c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f21305d = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f21306f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f21307g = 1.0f;

    /* JADX INFO: renamed from: i */
    public float f21308i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f21309j = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f21310n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f21311o = 0.0f;

    /* JADX INFO: renamed from: p */
    public float f21312p = 0.0f;

    /* JADX INFO: renamed from: q */
    public float f21313q = 0.0f;

    /* JADX INFO: renamed from: r */
    public final LinkedHashMap f21314r = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public static boolean m6871b(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m6872a(HashMap map, int i) {
        for (String str : map.keySet()) {
            SplineSet splineSet = (SplineSet) map.get(str);
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
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b2 = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b2 = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b2 = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b2 = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b2 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b2 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b2 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b2 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b2 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b2 = Ascii.f42547VT;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b2 = Ascii.f42536FF;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    splineSet.mo6921c(Float.isNaN(this.f21305d) ? 0.0f : this.f21305d, i);
                    break;
                case 1:
                    splineSet.mo6921c(Float.isNaN(this.f21306f) ? 0.0f : this.f21306f, i);
                    break;
                case 2:
                    splineSet.mo6921c(Float.isNaN(this.f21304c) ? 0.0f : this.f21304c, i);
                    break;
                case 3:
                    splineSet.mo6921c(Float.isNaN(this.f21311o) ? 0.0f : this.f21311o, i);
                    break;
                case 4:
                    splineSet.mo6921c(Float.isNaN(this.f21312p) ? 0.0f : this.f21312p, i);
                    break;
                case 5:
                    splineSet.mo6921c(Float.isNaN(this.f21313q) ? 0.0f : this.f21313q, i);
                    break;
                case 6:
                    splineSet.mo6921c(Float.isNaN(Float.NaN) ? 0.0f : Float.NaN, i);
                    break;
                case 7:
                    splineSet.mo6921c(Float.isNaN(this.f21309j) ? 0.0f : this.f21309j, i);
                    break;
                case 8:
                    splineSet.mo6921c(Float.isNaN(this.f21310n) ? 0.0f : this.f21310n, i);
                    break;
                case 9:
                    splineSet.mo6921c(Float.isNaN(this.f21307g) ? 1.0f : this.f21307g, i);
                    break;
                case 10:
                    splineSet.mo6921c(Float.isNaN(this.f21308i) ? 1.0f : this.f21308i, i);
                    break;
                case 11:
                    splineSet.mo6921c(Float.isNaN(this.f21302a) ? 1.0f : this.f21302a, i);
                    break;
                case TYPE_BYTES_VALUE:
                    splineSet.mo6921c(Float.isNaN(Float.NaN) ? 0.0f : Float.NaN, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap linkedHashMap = this.f21314r;
                        if (linkedHashMap.containsKey(str2)) {
                            CustomVariable customVariable = (CustomVariable) linkedHashMap.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).f21472f.m6913a(i, customVariable);
                            } else {
                                Utils.m6937a("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + customVariable.m6853c() + splineSet);
                            }
                        }
                    } else {
                        Utils.m6937a("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6873c(MotionWidget motionWidget) {
        int i;
        WidgetFrame widgetFrame = motionWidget.f21332a;
        int i2 = widgetFrame.f21734b;
        int i3 = widgetFrame.f21736d;
        int i4 = widgetFrame.f21737e;
        int i5 = motionWidget.f21334c.f21339a;
        this.f21303b = i5;
        this.f21302a = i5 != 4 ? 0.0f : widgetFrame.f21748p;
        this.f21304c = widgetFrame.f21742j;
        this.f21305d = widgetFrame.f21740h;
        this.f21306f = widgetFrame.f21741i;
        this.f21307g = widgetFrame.f21746n;
        this.f21308i = widgetFrame.f21747o;
        this.f21309j = widgetFrame.f21738f;
        this.f21310n = widgetFrame.f21739g;
        this.f21311o = widgetFrame.f21743k;
        this.f21312p = widgetFrame.f21744l;
        this.f21313q = widgetFrame.f21745m;
        for (String str : widgetFrame.f21751s.keySet()) {
            CustomVariable customVariable = (CustomVariable) motionWidget.f21332a.f21751s.get(str);
            if (customVariable != null && (i = customVariable.f21266b) != 903 && i != 904 && i != 906) {
                this.f21314r.put(str, customVariable);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        motionConstrainedPoint.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
