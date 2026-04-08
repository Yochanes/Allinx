package androidx.constraintlayout.core.motion.key;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionKeyAttributes extends MotionKey {

    /* JADX INFO: renamed from: c */
    public int f21342c;

    /* JADX INFO: renamed from: d */
    public float f21343d;

    /* JADX INFO: renamed from: e */
    public float f21344e;

    /* JADX INFO: renamed from: f */
    public float f21345f;

    /* JADX INFO: renamed from: g */
    public float f21346g;

    /* JADX INFO: renamed from: h */
    public float f21347h;

    /* JADX INFO: renamed from: i */
    public float f21348i;

    /* JADX INFO: renamed from: j */
    public float f21349j;

    /* JADX INFO: renamed from: k */
    public float f21350k;

    /* JADX INFO: renamed from: l */
    public float f21351l;

    /* JADX INFO: renamed from: m */
    public float f21352m;

    /* JADX INFO: renamed from: n */
    public float f21353n;

    /* JADX INFO: renamed from: o */
    public float f21354o;

    /* JADX INFO: renamed from: p */
    public float f21355p;

    /* JADX INFO: renamed from: q */
    public float f21356q;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public final boolean mo6857a(int i, int i2) {
        if (i == 100) {
            this.f21340a = i2;
            return true;
        }
        if (i == 301) {
            this.f21342c = i2;
            return true;
        }
        if (i == 302 || mo6857a(i, i2)) {
            return true;
        }
        return super.mo6857a(i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public final boolean mo6858b(int i, String str) {
        if (i == 101 || i == 317) {
            return true;
        }
        return super.mo6858b(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final /* bridge */ /* synthetic */ Object clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public final boolean mo6860d(float f, int i) {
        if (i == 100) {
            this.f21350k = f;
            return true;
        }
        switch (i) {
            case 303:
                this.f21343d = f;
                return true;
            case 304:
                this.f21353n = f;
                return true;
            case 305:
                this.f21354o = f;
                return true;
            case 306:
                this.f21355p = f;
                return true;
            case 307:
                this.f21344e = f;
                return true;
            case 308:
                this.f21346g = f;
                return true;
            case 309:
                this.f21347h = f;
                return true;
            case 310:
                this.f21345f = f;
                return true;
            case 311:
                this.f21351l = f;
                return true;
            case 312:
                this.f21352m = f;
                return true;
            case 313:
                this.f21348i = f;
                return true;
            case 314:
                this.f21349j = f;
                return true;
            case 315:
                this.f21356q = f;
                return true;
            case 316:
                this.f21350k = f;
                return true;
            default:
                return false;
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
        if (!Float.isNaN(this.f21343d)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f21344e)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f21345f)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f21346g)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f21347h)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f21348i)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f21349j)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f21353n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f21354o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f21355p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f21350k)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f21351l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f21352m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f21356q)) {
            hashSet.add("progress");
        }
        if (this.f21341b.size() > 0) {
            Iterator it = this.f21341b.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: g */
    public final void mo6882g(HashMap map) {
        if (!Float.isNaN(this.f21343d)) {
            map.put("alpha", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21344e)) {
            map.put("elevation", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21345f)) {
            map.put("rotationZ", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21346g)) {
            map.put("rotationX", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21347h)) {
            map.put("rotationY", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21348i)) {
            map.put("pivotX", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21349j)) {
            map.put("pivotY", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21353n)) {
            map.put("translationX", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21354o)) {
            map.put("translationY", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21355p)) {
            map.put("translationZ", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21350k)) {
            map.put("pathRotate", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21351l)) {
            map.put("scaleX", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21352m)) {
            map.put("scaleY", Integer.valueOf(this.f21342c));
        }
        if (!Float.isNaN(this.f21356q)) {
            map.put("progress", Integer.valueOf(this.f21342c));
        }
        if (this.f21341b.size() > 0) {
            Iterator it = this.f21341b.keySet().iterator();
            while (it.hasNext()) {
                map.put(AbstractC0000a.m13j("CUSTOM,", (String) it.next()), Integer.valueOf(this.f21342c));
            }
        }
    }
}
