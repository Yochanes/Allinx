package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class MotionKey implements TypedValues {

    /* JADX INFO: renamed from: a */
    public int f21340a = -1;

    /* JADX INFO: renamed from: b */
    public HashMap f21341b;

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public boolean mo6857a(int i, int i2) {
        if (i != 100) {
            return false;
        }
        this.f21340a = i2;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public boolean mo6858b(int i, String str) {
        return i == 101;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: c */
    public boolean mo6859c(int i, boolean z2) {
        return false;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return mo6880e();
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public boolean mo6860d(float f, int i) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract MotionKey mo6880e();

    /* JADX INFO: renamed from: f */
    public abstract void mo6881f(HashSet hashSet);

    /* JADX INFO: renamed from: g */
    public void mo6882g(HashMap map) {
    }
}
