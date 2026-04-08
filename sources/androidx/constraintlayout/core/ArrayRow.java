package androidx.constraintlayout.core;

import androidx.compose.animation.AbstractC0455a;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ArrayRow implements LinearSystem.Row {

    /* JADX INFO: renamed from: d */
    public final ArrayRowVariables f21138d;

    /* JADX INFO: renamed from: a */
    public SolverVariable f21135a = null;

    /* JADX INFO: renamed from: b */
    public float f21136b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f21137c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f21139e = false;

    /* JADX INFO: compiled from: Proguard */
    public interface ArrayRowVariables {
        /* JADX INFO: renamed from: a */
        int mo6798a();

        /* JADX INFO: renamed from: b */
        boolean mo6799b(SolverVariable solverVariable);

        /* JADX INFO: renamed from: c */
        float mo6800c(ArrayRow arrayRow, boolean z2);

        void clear();

        /* JADX INFO: renamed from: d */
        void mo6801d(SolverVariable solverVariable, float f);

        /* JADX INFO: renamed from: e */
        SolverVariable mo6802e(int i);

        /* JADX INFO: renamed from: f */
        void mo6803f(SolverVariable solverVariable, float f, boolean z2);

        /* JADX INFO: renamed from: g */
        void mo6804g();

        /* JADX INFO: renamed from: h */
        float mo6805h(int i);

        /* JADX INFO: renamed from: i */
        float mo6806i(SolverVariable solverVariable, boolean z2);

        /* JADX INFO: renamed from: j */
        float mo6807j(SolverVariable solverVariable);

        /* JADX INFO: renamed from: k */
        void mo6808k(float f);
    }

    public ArrayRow(Cache cache) {
        this.f21138d = new ArrayLinkedVariables(this, cache);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    /* JADX INFO: renamed from: a */
    public SolverVariable mo6809a(boolean[] zArr) {
        return m6814f(zArr, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m6810b(LinearSystem linearSystem, int i) {
        this.f21138d.mo6801d(linearSystem.m6828j(i), 1.0f);
        this.f21138d.mo6801d(linearSystem.m6828j(i), -1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final void m6811c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f21136b = i;
        }
        if (z2) {
            this.f21138d.mo6801d(solverVariable, 1.0f);
            this.f21138d.mo6801d(solverVariable2, -1.0f);
            this.f21138d.mo6801d(solverVariable3, -1.0f);
        } else {
            this.f21138d.mo6801d(solverVariable, -1.0f);
            this.f21138d.mo6801d(solverVariable2, 1.0f);
            this.f21138d.mo6801d(solverVariable3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6812d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f21136b = i;
        }
        if (z2) {
            this.f21138d.mo6801d(solverVariable, 1.0f);
            this.f21138d.mo6801d(solverVariable2, -1.0f);
            this.f21138d.mo6801d(solverVariable3, 1.0f);
        } else {
            this.f21138d.mo6801d(solverVariable, -1.0f);
            this.f21138d.mo6801d(solverVariable2, 1.0f);
            this.f21138d.mo6801d(solverVariable3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean mo6813e() {
        return this.f21135a == null && this.f21136b == 0.0f && this.f21138d.mo6798a() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final SolverVariable m6814f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iMo6798a = this.f21138d.mo6798a();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo6798a; i++) {
            float fMo6805h = this.f21138d.mo6805h(i);
            if (fMo6805h < 0.0f) {
                SolverVariable solverVariableMo6802e = this.f21138d.mo6802e(i);
                if ((zArr == null || !zArr[solverVariableMo6802e.f21178b]) && solverVariableMo6802e != solverVariable && (((type = solverVariableMo6802e.f21185n) == SolverVariable.Type.f21190b || type == SolverVariable.Type.f21191c) && fMo6805h < f)) {
                    f = fMo6805h;
                    solverVariable2 = solverVariableMo6802e;
                }
            }
        }
        return solverVariable2;
    }

    /* JADX INFO: renamed from: g */
    public final void m6815g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f21135a;
        if (solverVariable2 != null) {
            this.f21138d.mo6801d(solverVariable2, -1.0f);
            this.f21135a.f21179c = -1;
            this.f21135a = null;
        }
        float fMo6806i = this.f21138d.mo6806i(solverVariable, true) * (-1.0f);
        this.f21135a = solverVariable;
        if (fMo6806i == 1.0f) {
            return;
        }
        this.f21136b /= fMo6806i;
        this.f21138d.mo6808k(fMo6806i);
    }

    /* JADX INFO: renamed from: h */
    public final void m6816h(LinearSystem linearSystem, SolverVariable solverVariable, boolean z2) {
        if (solverVariable == null || !solverVariable.f21182g) {
            return;
        }
        float fMo6807j = this.f21138d.mo6807j(solverVariable);
        this.f21136b = (solverVariable.f21181f * fMo6807j) + this.f21136b;
        this.f21138d.mo6806i(solverVariable, z2);
        if (z2) {
            solverVariable.m6842b(this);
        }
        if (this.f21138d.mo6798a() == 0) {
            this.f21139e = true;
            linearSystem.f21146b = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo6817i(LinearSystem linearSystem, ArrayRow arrayRow, boolean z2) {
        float fMo6800c = this.f21138d.mo6800c(arrayRow, z2);
        this.f21136b = (arrayRow.f21136b * fMo6800c) + this.f21136b;
        if (z2) {
            arrayRow.f21135a.m6842b(this);
        }
        if (this.f21135a == null || this.f21138d.mo6798a() != 0) {
            return;
        }
        this.f21139e = true;
        linearSystem.f21146b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String strM2C = AbstractC0000a.m2C(this.f21135a == null ? "0" : "" + this.f21135a, " = ");
        if (this.f21136b != 0.0f) {
            StringBuilder sbM2244s = AbstractC0455a.m2244s(strM2C);
            sbM2244s.append(this.f21136b);
            strM2C = sbM2244s.toString();
            z2 = true;
        } else {
            z2 = false;
        }
        int iMo6798a = this.f21138d.mo6798a();
        for (int i = 0; i < iMo6798a; i++) {
            SolverVariable solverVariableMo6802e = this.f21138d.mo6802e(i);
            if (solverVariableMo6802e != null) {
                float fMo6805h = this.f21138d.mo6805h(i);
                if (fMo6805h != 0.0f) {
                    String string = solverVariableMo6802e.toString();
                    if (!z2) {
                        if (fMo6805h < 0.0f) {
                            strM2C = AbstractC0000a.m2C(strM2C, "- ");
                            fMo6805h *= -1.0f;
                        }
                        strM2C = fMo6805h == 1.0f ? AbstractC0000a.m2C(strM2C, string) : strM2C + fMo6805h + " " + string;
                        z2 = true;
                    } else if (fMo6805h > 0.0f) {
                        strM2C = AbstractC0000a.m2C(strM2C, " + ");
                        if (fMo6805h == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        strM2C = AbstractC0000a.m2C(strM2C, " - ");
                        fMo6805h *= -1.0f;
                        if (fMo6805h == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0000a.m2C(strM2C, IdManager.DEFAULT_VERSION_NAME) : strM2C;
    }
}
