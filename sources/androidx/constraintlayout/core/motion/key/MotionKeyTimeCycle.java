package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionKeyTimeCycle extends MotionKey {

    /* JADX INFO: renamed from: c */
    public float f21381c;

    /* JADX INFO: renamed from: d */
    public float f21382d;

    /* JADX INFO: renamed from: e */
    public float f21383e;

    /* JADX INFO: renamed from: f */
    public float f21384f;

    /* JADX INFO: renamed from: g */
    public float f21385g;

    /* JADX INFO: renamed from: h */
    public float f21386h;

    /* JADX INFO: renamed from: i */
    public float f21387i;

    /* JADX INFO: renamed from: j */
    public float f21388j;

    /* JADX INFO: renamed from: k */
    public float f21389k;

    /* JADX INFO: renamed from: l */
    public float f21390l;

    /* JADX INFO: renamed from: m */
    public float f21391m;

    /* JADX INFO: renamed from: n */
    public float f21392n;

    /* JADX INFO: renamed from: o */
    public int f21393o;

    /* JADX INFO: renamed from: p */
    public float f21394p;

    /* JADX INFO: renamed from: q */
    public float f21395q;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public final boolean mo6857a(int i, int i2) {
        if (i == 100) {
            this.f21340a = i2;
            return true;
        }
        if (i != 421) {
            return super.mo6857a(i, i2);
        }
        this.f21393o = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public final boolean mo6858b(int i, String str) {
        if (i == 420) {
            return true;
        }
        if (i != 421) {
            return super.mo6858b(i, str);
        }
        this.f21393o = 7;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: c */
    public final boolean mo6859c(int i, boolean z2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final /* bridge */ /* synthetic */ Object clone() {
        return mo6880e();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public final boolean mo6860d(float f, int i) {
        if (i == 315) {
            this.f21392n = Float.valueOf(f).floatValue();
            return true;
        }
        if (i == 401) {
            Integer.parseInt(Float.valueOf(f).toString());
            return true;
        }
        if (i == 403) {
            this.f21381c = f;
            return true;
        }
        if (i == 416) {
            this.f21386h = Float.valueOf(f).floatValue();
            return true;
        }
        if (i == 423) {
            this.f21394p = Float.valueOf(f).floatValue();
            return true;
        }
        if (i == 424) {
            this.f21395q = Float.valueOf(f).floatValue();
            return true;
        }
        switch (i) {
            case 304:
                this.f21389k = Float.valueOf(f).floatValue();
                return true;
            case 305:
                this.f21390l = Float.valueOf(f).floatValue();
                return true;
            case 306:
                this.f21391m = Float.valueOf(f).floatValue();
                return true;
            case 307:
                this.f21382d = Float.valueOf(f).floatValue();
                return true;
            case 308:
                this.f21384f = Float.valueOf(f).floatValue();
                return true;
            case 309:
                this.f21385g = Float.valueOf(f).floatValue();
                return true;
            case 310:
                this.f21383e = Float.valueOf(f).floatValue();
                return true;
            case 311:
                this.f21387i = Float.valueOf(f).floatValue();
                return true;
            case 312:
                this.f21388j = Float.valueOf(f).floatValue();
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: e */
    public final MotionKey mo6880e() {
        MotionKeyTimeCycle motionKeyTimeCycle = new MotionKeyTimeCycle();
        motionKeyTimeCycle.f21381c = Float.NaN;
        motionKeyTimeCycle.f21382d = Float.NaN;
        motionKeyTimeCycle.f21383e = Float.NaN;
        motionKeyTimeCycle.f21384f = Float.NaN;
        motionKeyTimeCycle.f21385g = Float.NaN;
        motionKeyTimeCycle.f21386h = Float.NaN;
        motionKeyTimeCycle.f21387i = Float.NaN;
        motionKeyTimeCycle.f21388j = Float.NaN;
        motionKeyTimeCycle.f21389k = Float.NaN;
        motionKeyTimeCycle.f21390l = Float.NaN;
        motionKeyTimeCycle.f21391m = Float.NaN;
        motionKeyTimeCycle.f21392n = Float.NaN;
        motionKeyTimeCycle.f21393o = 0;
        motionKeyTimeCycle.f21394p = Float.NaN;
        motionKeyTimeCycle.f21395q = 0.0f;
        motionKeyTimeCycle.f21341b = new HashMap();
        motionKeyTimeCycle.f21340a = this.f21340a;
        motionKeyTimeCycle.f21393o = this.f21393o;
        motionKeyTimeCycle.f21394p = this.f21394p;
        motionKeyTimeCycle.f21395q = this.f21395q;
        motionKeyTimeCycle.f21392n = this.f21392n;
        motionKeyTimeCycle.f21381c = this.f21381c;
        motionKeyTimeCycle.f21382d = this.f21382d;
        motionKeyTimeCycle.f21383e = this.f21383e;
        motionKeyTimeCycle.f21386h = this.f21386h;
        motionKeyTimeCycle.f21384f = this.f21384f;
        motionKeyTimeCycle.f21385g = this.f21385g;
        motionKeyTimeCycle.f21387i = this.f21387i;
        motionKeyTimeCycle.f21388j = this.f21388j;
        motionKeyTimeCycle.f21389k = this.f21389k;
        motionKeyTimeCycle.f21390l = this.f21390l;
        motionKeyTimeCycle.f21391m = this.f21391m;
        return motionKeyTimeCycle;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: f */
    public final void mo6881f(HashSet hashSet) {
        if (!Float.isNaN(this.f21381c)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f21382d)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f21383e)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f21384f)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f21385g)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f21387i)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f21388j)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f21386h)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f21389k)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f21390l)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f21391m)) {
            hashSet.add("translationZ");
        }
        if (this.f21341b.size() > 0) {
            Iterator it = this.f21341b.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public final void m6884h(HashMap map) {
        for (String str : map.keySet()) {
            TimeCycleSplineSet timeCycleSplineSet = (TimeCycleSplineSet) map.get(str);
            if (timeCycleSplineSet != null) {
                if (!str.startsWith("CUSTOM")) {
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
                        case -908189618:
                            if (str.equals("scaleX")) {
                                b2 = 7;
                            }
                            break;
                        case -908189617:
                            if (str.equals("scaleY")) {
                                b2 = 8;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                b2 = 9;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                b2 = 10;
                            }
                            break;
                        case 803192288:
                            if (str.equals("pathRotate")) {
                                b2 = Ascii.f42547VT;
                            }
                            break;
                    }
                    switch (b2) {
                        case 0:
                            if (!Float.isNaN(this.f21384f)) {
                                timeCycleSplineSet.mo6929b(this.f21384f, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f21385g)) {
                                timeCycleSplineSet.mo6929b(this.f21385g, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f21383e)) {
                                timeCycleSplineSet.mo6929b(this.f21383e, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f21389k)) {
                                timeCycleSplineSet.mo6929b(this.f21389k, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f21390l)) {
                                timeCycleSplineSet.mo6929b(this.f21390l, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f21391m)) {
                                timeCycleSplineSet.mo6929b(this.f21391m, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f21392n)) {
                                timeCycleSplineSet.mo6929b(this.f21392n, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f21387i)) {
                                timeCycleSplineSet.mo6929b(this.f21387i, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f21388j)) {
                                timeCycleSplineSet.mo6929b(this.f21388j, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f21391m)) {
                                timeCycleSplineSet.mo6929b(this.f21391m, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f21381c)) {
                                timeCycleSplineSet.mo6929b(this.f21381c, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f21386h)) {
                                timeCycleSplineSet.mo6929b(this.f21386h, this.f21394p, this.f21395q, this.f21340a, this.f21393o);
                            }
                            break;
                        default:
                            Utils.m6937a("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    if (((CustomVariable) this.f21341b.get(str.substring(7))) != null) {
                        throw null;
                    }
                }
            }
        }
    }
}
