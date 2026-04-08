package androidx.constraintlayout.core.motion.key;

import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionKeyPosition extends MotionKey {

    /* JADX INFO: renamed from: c */
    public int f21374c = -1;

    /* JADX INFO: renamed from: d */
    public String f21375d = null;

    /* JADX INFO: renamed from: e */
    public float f21376e = Float.NaN;

    /* JADX INFO: renamed from: f */
    public float f21377f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f21378g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f21379h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public int f21380i = 0;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public final boolean mo6857a(int i, int i2) {
        if (i == 100) {
            this.f21340a = i2;
            return true;
        }
        if (i == 508) {
            this.f21374c = i2;
            return true;
        }
        if (i != 510) {
            return super.mo6857a(i, i2);
        }
        this.f21380i = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public final boolean mo6858b(int i, String str) {
        if (i != 501) {
            return super.mo6858b(i, str);
        }
        this.f21375d = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final /* bridge */ /* synthetic */ Object clone() {
        return mo6880e();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public final boolean mo6860d(float f, int i) {
        switch (i) {
            case 503:
                this.f21376e = f;
                return true;
            case 504:
                this.f21377f = f;
                return true;
            case 505:
                this.f21376e = f;
                this.f21377f = f;
                return true;
            case 506:
                this.f21378g = f;
                return true;
            case 507:
                this.f21379h = f;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: e */
    public final MotionKey mo6880e() {
        MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
        motionKeyPosition.f21340a = this.f21340a;
        motionKeyPosition.f21375d = this.f21375d;
        motionKeyPosition.f21376e = this.f21376e;
        motionKeyPosition.f21377f = Float.NaN;
        motionKeyPosition.f21378g = this.f21378g;
        motionKeyPosition.f21379h = this.f21379h;
        return motionKeyPosition;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: f */
    public final void mo6881f(HashSet hashSet) {
    }
}
