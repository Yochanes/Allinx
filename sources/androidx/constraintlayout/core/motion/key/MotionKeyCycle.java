package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionKeyCycle extends MotionKey {

    /* JADX INFO: renamed from: c */
    public int f21357c;

    /* JADX INFO: renamed from: d */
    public String f21358d;

    /* JADX INFO: renamed from: e */
    public float f21359e;

    /* JADX INFO: renamed from: f */
    public float f21360f;

    /* JADX INFO: renamed from: g */
    public float f21361g;

    /* JADX INFO: renamed from: h */
    public float f21362h;

    /* JADX INFO: renamed from: i */
    public float f21363i;

    /* JADX INFO: renamed from: j */
    public float f21364j;

    /* JADX INFO: renamed from: k */
    public float f21365k;

    /* JADX INFO: renamed from: l */
    public float f21366l;

    /* JADX INFO: renamed from: m */
    public float f21367m;

    /* JADX INFO: renamed from: n */
    public float f21368n;

    /* JADX INFO: renamed from: o */
    public float f21369o;

    /* JADX INFO: renamed from: p */
    public float f21370p;

    /* JADX INFO: renamed from: q */
    public float f21371q;

    /* JADX INFO: renamed from: r */
    public float f21372r;

    /* JADX INFO: renamed from: s */
    public float f21373s;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public final boolean mo6857a(int i, int i2) {
        if (i != 401) {
            if (i != 421) {
                if (mo6860d(i2, i)) {
                    return true;
                }
                return super.mo6857a(i, i2);
            }
            this.f21357c = i2;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public final boolean mo6858b(int i, String str) {
        if (i != 420) {
            if (i != 422) {
                return super.mo6858b(i, str);
            }
            this.f21358d = str;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final /* bridge */ /* synthetic */ Object clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public final boolean mo6860d(float f, int i) {
        if (i == 315) {
            this.f21362h = f;
            return true;
        }
        if (i == 403) {
            this.f21363i = f;
            return true;
        }
        if (i == 416) {
            this.f21366l = f;
            return true;
        }
        switch (i) {
            case 304:
                this.f21371q = f;
                return true;
            case 305:
                this.f21372r = f;
                return true;
            case 306:
                this.f21373s = f;
                return true;
            case 307:
                this.f21364j = f;
                return true;
            case 308:
                this.f21367m = f;
                return true;
            case 309:
                this.f21368n = f;
                return true;
            case 310:
                this.f21365k = f;
                return true;
            case 311:
                this.f21369o = f;
                return true;
            case 312:
                this.f21370p = f;
                return true;
            default:
                switch (i) {
                    case 423:
                        this.f21359e = f;
                        return true;
                    case 424:
                        this.f21360f = f;
                        return true;
                    case 425:
                        this.f21361g = f;
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: e */
    public final MotionKey mo6880e() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: f */
    public final void mo6881f(HashSet hashSet) {
        if (!Float.isNaN(this.f21363i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f21364j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f21365k)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f21367m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f21368n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f21369o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f21370p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f21366l)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f21371q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f21372r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f21373s)) {
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
    public final void m6883h(HashMap map) {
        KeyCycleOscillator keyCycleOscillator;
        float f;
        KeyCycleOscillator keyCycleOscillator2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                CustomVariable customVariable = (CustomVariable) this.f21341b.get(str.substring(7));
                if (customVariable != null && customVariable.f21266b == 901 && (keyCycleOscillator = (KeyCycleOscillator) map.get(str)) != null) {
                    keyCycleOscillator.m6910f(this.f21340a, this.f21357c, this.f21358d, -1, this.f21359e, this.f21360f, this.f21361g / 360.0f, customVariable.m6853c(), customVariable);
                }
            } else {
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
                    case -1019779949:
                        if (str.equals("offset")) {
                            b2 = 6;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b2 = 7;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b2 = 8;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b2 = 9;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b2 = 10;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b2 = Ascii.f42547VT;
                        }
                        break;
                    case 106629499:
                        if (str.equals("phase")) {
                            b2 = Ascii.f42536FF;
                        }
                        break;
                    case 803192288:
                        if (str.equals("pathRotate")) {
                            b2 = Ascii.f42534CR;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        f = this.f21367m;
                        break;
                    case 1:
                        f = this.f21368n;
                        break;
                    case 2:
                        f = this.f21365k;
                        break;
                    case 3:
                        f = this.f21371q;
                        break;
                    case 4:
                        f = this.f21372r;
                        break;
                    case 5:
                        f = this.f21373s;
                        break;
                    case 6:
                        f = this.f21360f;
                        break;
                    case 7:
                        f = this.f21362h;
                        break;
                    case 8:
                        f = this.f21369o;
                        break;
                    case 9:
                        f = this.f21370p;
                        break;
                    case 10:
                        f = this.f21364j;
                        break;
                    case 11:
                        f = this.f21363i;
                        break;
                    case TYPE_BYTES_VALUE:
                        f = this.f21361g;
                        break;
                    case 13:
                        f = this.f21366l;
                        break;
                    default:
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (keyCycleOscillator2 = (KeyCycleOscillator) map.get(str)) != null) {
                    keyCycleOscillator2.m6909e(this.f21340a, this.f21357c, this.f21358d, -1, this.f21359e, this.f21360f, this.f21361g / 360.0f, f2);
                }
            }
        }
    }
}
