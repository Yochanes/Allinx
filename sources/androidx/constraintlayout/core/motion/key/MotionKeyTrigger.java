package androidx.constraintlayout.core.motion.key;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionKeyTrigger extends MotionKey {
    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public final boolean mo6857a(int i, int i2) {
        if (i == 307 || i == 308 || i == 311) {
            return true;
        }
        switch (i) {
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return super.mo6857a(i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public final boolean mo6858b(int i, String str) {
        if (i == 309 || i == 310 || i == 312) {
            return true;
        }
        return super.mo6858b(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: c */
    public final boolean mo6859c(int i, boolean z2) {
        return i == 304;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public final /* bridge */ /* synthetic */ Object clone() {
        return mo6880e();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public final boolean mo6860d(float f, int i) {
        return i == 305;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: e */
    public final MotionKey mo6880e() {
        MotionKeyTrigger motionKeyTrigger = new MotionKeyTrigger();
        motionKeyTrigger.f21341b = new HashMap();
        motionKeyTrigger.f21340a = this.f21340a;
        return motionKeyTrigger;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: f */
    public final void mo6881f(HashSet hashSet) {
    }
}
