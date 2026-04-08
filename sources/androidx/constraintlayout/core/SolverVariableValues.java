package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {

    /* JADX INFO: renamed from: a */
    public int f21194a;

    /* JADX INFO: renamed from: b */
    public int[] f21195b;

    /* JADX INFO: renamed from: c */
    public int[] f21196c;

    /* JADX INFO: renamed from: d */
    public float[] f21197d;

    /* JADX INFO: renamed from: e */
    public int[] f21198e;

    /* JADX INFO: renamed from: f */
    public int[] f21199f;

    /* JADX INFO: renamed from: g */
    public int f21200g;

    /* JADX INFO: renamed from: h */
    public int f21201h;

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: a */
    public final int mo6798a() {
        return this.f21200g;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: b */
    public final boolean mo6799b(SolverVariable solverVariable) {
        m6847m(solverVariable);
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: c */
    public final float mo6800c(ArrayRow arrayRow, boolean z2) {
        mo6807j(arrayRow.f21135a);
        mo6806i(arrayRow.f21135a, z2);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.f21138d;
        int i = solverVariableValues.f21200g;
        int i2 = 0;
        while (i > 0) {
            if (solverVariableValues.f21196c[i2] != -1) {
                float f = solverVariableValues.f21197d[i2];
                throw null;
            }
            i2++;
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.f21200g;
        for (int i2 = 0; i2 < i; i2++) {
            if (mo6802e(i2) != null) {
                throw null;
            }
        }
        for (int i3 = 0; i3 < this.f21194a; i3++) {
            this.f21196c[i3] = -1;
            this.f21195b[i3] = -1;
        }
        this.f21200g = 0;
        this.f21201h = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: d */
    public final void mo6801d(SolverVariable solverVariable, float f) {
        if (f > -0.001f && f < 0.001f) {
            mo6806i(solverVariable, true);
            return;
        }
        int i = 0;
        if (this.f21200g == 0) {
            m6846l(0, solverVariable, f);
            throw null;
        }
        m6847m(solverVariable);
        int i2 = this.f21200g + 1;
        int i3 = this.f21194a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f21196c = Arrays.copyOf(this.f21196c, i4);
            this.f21197d = Arrays.copyOf(this.f21197d, i4);
            this.f21198e = Arrays.copyOf(this.f21198e, i4);
            this.f21199f = Arrays.copyOf(this.f21199f, i4);
            this.f21195b = Arrays.copyOf(this.f21195b, i4);
            for (int i5 = this.f21194a; i5 < i4; i5++) {
                this.f21196c[i5] = -1;
                this.f21195b[i5] = -1;
            }
            this.f21194a = i4;
        }
        int i6 = this.f21200g;
        int i7 = this.f21201h;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.f21196c[i7];
            int i11 = solverVariable.f21178b;
            if (i10 == i11) {
                this.f21197d[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.f21199f[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f21194a) {
                i = -1;
                break;
            } else if (this.f21196c[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m6846l(i, solverVariable, f);
        if (i8 != -1) {
            this.f21198e[i] = i8;
            int[] iArr = this.f21199f;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f21198e[i] = -1;
            if (this.f21200g > 0) {
                this.f21199f[i] = this.f21201h;
                this.f21201h = i;
            } else {
                this.f21199f[i] = -1;
            }
        }
        int i12 = this.f21199f[i];
        if (i12 == -1) {
            throw null;
        }
        this.f21198e[i12] = i;
        throw null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: e */
    public final SolverVariable mo6802e(int i) {
        int i2 = this.f21200g;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f21201h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                throw null;
            }
            i3 = this.f21199f[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: f */
    public final void mo6803f(SolverVariable solverVariable, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            m6847m(solverVariable);
            mo6801d(solverVariable, f);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: g */
    public final void mo6804g() {
        int i = this.f21200g;
        int i2 = this.f21201h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f21197d;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f21199f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: h */
    public final float mo6805h(int i) {
        int i2 = this.f21200g;
        int i3 = this.f21201h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f21197d[i3];
            }
            i3 = this.f21199f[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: i */
    public final float mo6806i(SolverVariable solverVariable, boolean z2) {
        m6847m(solverVariable);
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: j */
    public final float mo6807j(SolverVariable solverVariable) {
        m6847m(solverVariable);
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: k */
    public final void mo6808k(float f) {
        int i = this.f21200g;
        int i2 = this.f21201h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f21197d;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f21199f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6846l(int i, SolverVariable solverVariable, float f) {
        this.f21196c[i] = solverVariable.f21178b;
        this.f21197d[i] = f;
        this.f21198e[i] = -1;
        this.f21199f[i] = -1;
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final int m6847m(SolverVariable solverVariable) {
        if (this.f21200g == 0 || solverVariable == null) {
            return -1;
        }
        throw null;
    }

    public final String toString() {
        String str = hashCode() + " { ";
        int i = this.f21200g;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableMo6802e = mo6802e(i2);
            if (solverVariableMo6802e != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(solverVariableMo6802e);
                sb.append(" = ");
                sb.append(mo6805h(i2));
                sb.append(" ");
                m6847m(solverVariableMo6802e);
                int i3 = this.f21198e[-1];
                throw null;
            }
        }
        return AbstractC0000a.m2C(str, " }");
    }
}
