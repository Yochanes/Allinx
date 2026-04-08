package androidx.constraintlayout.core;

import androidx.compose.animation.AbstractC0455a;
import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {

    /* JADX INFO: renamed from: f */
    public SolverVariable[] f21171f;

    /* JADX INFO: renamed from: g */
    public SolverVariable[] f21172g;

    /* JADX INFO: renamed from: h */
    public int f21173h;

    /* JADX INFO: renamed from: i */
    public GoalVariableAccessor f21174i;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.PriorityGoalRow$1 */
    /* JADX INFO: compiled from: Proguard */
    class C13831 implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f21178b - solverVariable2.f21178b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class GoalVariableAccessor {

        /* JADX INFO: renamed from: a */
        public SolverVariable f21175a;

        public GoalVariableAccessor() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.f21175a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbM2244s = AbstractC0455a.m2244s(string);
                    sbM2244s.append(this.f21175a.f21184j[i]);
                    sbM2244s.append(" ");
                    string = sbM2244s.toString();
                }
            }
            StringBuilder sbM21r = AbstractC0000a.m21r(string, "] ");
            sbM21r.append(this.f21175a);
            return sbM21r.toString();
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    /* JADX INFO: renamed from: a */
    public final SolverVariable mo6809a(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f21173h; i2++) {
            SolverVariable[] solverVariableArr = this.f21171f;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.f21178b]) {
                GoalVariableAccessor goalVariableAccessor = this.f21174i;
                goalVariableAccessor.f21175a = solverVariable;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = goalVariableAccessor.f21175a.f21184j[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = solverVariable2.f21184j[i3];
                            float f3 = goalVariableAccessor.f21175a.f21184j[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f21171f[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    /* JADX INFO: renamed from: e */
    public final boolean mo6813e() {
        return this.f21173h == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    /* JADX INFO: renamed from: i */
    public final void mo6817i(LinearSystem linearSystem, ArrayRow arrayRow, boolean z2) {
        SolverVariable solverVariable = arrayRow.f21135a;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.f21138d;
        int iMo6798a = arrayRowVariables.mo6798a();
        for (int i = 0; i < iMo6798a; i++) {
            SolverVariable solverVariableMo6802e = arrayRowVariables.mo6802e(i);
            float fMo6805h = arrayRowVariables.mo6805h(i);
            GoalVariableAccessor goalVariableAccessor = this.f21174i;
            goalVariableAccessor.f21175a = solverVariableMo6802e;
            boolean z3 = solverVariableMo6802e.f21177a;
            float[] fArr = solverVariable.f21184j;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = goalVariableAccessor.f21175a.f21184j;
                    float f = (fArr[i2] * fMo6805h) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        goalVariableAccessor.f21175a.f21184j[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    PriorityGoalRow.this.m6840k(goalVariableAccessor.f21175a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo6805h;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        goalVariableAccessor.f21175a.f21184j[i3] = f3;
                    } else {
                        goalVariableAccessor.f21175a.f21184j[i3] = 0.0f;
                    }
                }
                m6839j(solverVariableMo6802e);
            }
            this.f21136b = (arrayRow.f21136b * fMo6805h) + this.f21136b;
        }
        m6840k(solverVariable);
    }

    /* JADX INFO: renamed from: j */
    public final void m6839j(SolverVariable solverVariable) {
        int i;
        int i2 = this.f21173h + 1;
        SolverVariable[] solverVariableArr = this.f21171f;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f21171f = solverVariableArr2;
            this.f21172g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f21171f;
        int i3 = this.f21173h;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f21173h = i4;
        if (i4 > 1 && solverVariableArr3[i3].f21178b > solverVariable.f21178b) {
            int i5 = 0;
            while (true) {
                i = this.f21173h;
                if (i5 >= i) {
                    break;
                }
                this.f21172g[i5] = this.f21171f[i5];
                i5++;
            }
            Arrays.sort(this.f21172g, 0, i, new C13831());
            for (int i6 = 0; i6 < this.f21173h; i6++) {
                this.f21171f[i6] = this.f21172g[i6];
            }
        }
        solverVariable.f21177a = true;
        solverVariable.m6841a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m6840k(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f21173h) {
            if (this.f21171f[i] == solverVariable) {
                while (true) {
                    int i2 = this.f21173h;
                    if (i >= i2 - 1) {
                        this.f21173h = i2 - 1;
                        solverVariable.f21177a = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f21171f;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public final String toString() {
        String str = " goal -> (" + this.f21136b + ") : ";
        for (int i = 0; i < this.f21173h; i++) {
            SolverVariable solverVariable = this.f21171f[i];
            GoalVariableAccessor goalVariableAccessor = this.f21174i;
            goalVariableAccessor.f21175a = solverVariable;
            str = str + goalVariableAccessor + " ";
        }
        return str;
    }
}
