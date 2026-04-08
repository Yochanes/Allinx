package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;
import androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {

    /* JADX INFO: renamed from: q */
    public static boolean f21143q = false;

    /* JADX INFO: renamed from: r */
    public static Metrics f21144r;

    /* JADX INFO: renamed from: d */
    public final PriorityGoalRow f21148d;

    /* JADX INFO: renamed from: m */
    public final Cache f21157m;

    /* JADX INFO: renamed from: p */
    public ArrayRow f21160p;

    /* JADX INFO: renamed from: a */
    public int f21145a = 1000;

    /* JADX INFO: renamed from: b */
    public boolean f21146b = false;

    /* JADX INFO: renamed from: c */
    public int f21147c = 0;

    /* JADX INFO: renamed from: e */
    public int f21149e = 32;

    /* JADX INFO: renamed from: f */
    public int f21150f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f21152h = false;

    /* JADX INFO: renamed from: i */
    public boolean[] f21153i = new boolean[32];

    /* JADX INFO: renamed from: j */
    public int f21154j = 1;

    /* JADX INFO: renamed from: k */
    public int f21155k = 0;

    /* JADX INFO: renamed from: l */
    public int f21156l = 32;

    /* JADX INFO: renamed from: n */
    public SolverVariable[] f21158n = new SolverVariable[1000];

    /* JADX INFO: renamed from: o */
    public int f21159o = 0;

    /* JADX INFO: renamed from: g */
    public ArrayRow[] f21151g = new ArrayRow[32];

    /* JADX INFO: compiled from: Proguard */
    public interface Row {
        /* JADX INFO: renamed from: a */
        SolverVariable mo6809a(boolean[] zArr);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ValuesRow extends ArrayRow {
    }

    public LinearSystem() {
        m6836s();
        Cache cache = new Cache();
        new Pools.SimplePool();
        cache.f21140a = new Pools.SimplePool();
        cache.f21141b = new Pools.SimplePool();
        cache.f21142c = new SolverVariable[32];
        this.f21157m = cache;
        PriorityGoalRow priorityGoalRow = new PriorityGoalRow(cache);
        priorityGoalRow.f21171f = new SolverVariable[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        priorityGoalRow.f21172g = new SolverVariable[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        priorityGoalRow.f21173h = 0;
        priorityGoalRow.f21174i = priorityGoalRow.new GoalVariableAccessor();
        this.f21148d = priorityGoalRow;
        this.f21160p = new ArrayRow(cache);
    }

    /* JADX INFO: renamed from: n */
    public static int m6818n(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f21865i;
        if (solverVariable != null) {
            return (int) (solverVariable.f21181f + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final SolverVariable m6819a(SolverVariable.Type type) {
        Pools.SimplePool simplePool = this.f21157m.f21141b;
        int i = simplePool.f21170b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = simplePool.f21169a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            simplePool.f21170b = i2;
            obj = obj2;
        }
        SolverVariable solverVariable = (SolverVariable) obj;
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.f21185n = type;
        } else {
            solverVariable.m6843c();
            solverVariable.f21185n = type;
        }
        int i3 = this.f21159o;
        int i4 = this.f21145a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f21145a = i5;
            this.f21158n = (SolverVariable[]) Arrays.copyOf(this.f21158n, i5);
        }
        SolverVariable[] solverVariableArr = this.f21158n;
        int i6 = this.f21159o;
        this.f21159o = i6 + 1;
        solverVariableArr[i6] = solverVariable;
        return solverVariable;
    }

    /* JADX INFO: renamed from: b */
    public final void m6820b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        ArrayRow arrayRowM6830l = m6830l();
        if (solverVariable2 == solverVariable3) {
            arrayRowM6830l.f21138d.mo6801d(solverVariable, 1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable4, 1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            arrayRowM6830l.f21138d.mo6801d(solverVariable, 1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable2, -1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable3, -1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                arrayRowM6830l.f21136b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            arrayRowM6830l.f21138d.mo6801d(solverVariable, -1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable2, 1.0f);
            arrayRowM6830l.f21136b = i;
        } else if (f >= 1.0f) {
            arrayRowM6830l.f21138d.mo6801d(solverVariable4, -1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable3, 1.0f);
            arrayRowM6830l.f21136b = -i2;
        } else {
            float f2 = 1.0f - f;
            arrayRowM6830l.f21138d.mo6801d(solverVariable, f2 * 1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable2, f2 * (-1.0f));
            arrayRowM6830l.f21138d.mo6801d(solverVariable3, (-1.0f) * f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                arrayRowM6830l.f21136b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            arrayRowM6830l.m6810b(this, i3);
        }
        m6821c(arrayRowM6830l);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6821c(ArrayRow arrayRow) {
        boolean z2;
        SolverVariable.Type type;
        boolean z3;
        SolverVariable solverVariable;
        SolverVariable solverVariableM6814f;
        ArrayList arrayList;
        boolean z4 = true;
        if (this.f21155k + 1 >= this.f21156l || this.f21154j + 1 >= this.f21150f) {
            m6832o();
        }
        if (arrayRow.f21139e) {
            z2 = false;
        } else {
            if (this.f21151g.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iMo6798a = arrayRow.f21138d.mo6798a();
                    int i = 0;
                    while (true) {
                        arrayList = arrayRow.f21137c;
                        if (i >= iMo6798a) {
                            break;
                        }
                        SolverVariable solverVariableMo6802e = arrayRow.f21138d.mo6802e(i);
                        if (solverVariableMo6802e.f21179c != -1 || solverVariableMo6802e.f21182g) {
                            arrayList.add(solverVariableMo6802e);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            SolverVariable solverVariable2 = (SolverVariable) arrayList.get(i2);
                            if (solverVariable2.f21182g) {
                                arrayRow.m6816h(this, solverVariable2, true);
                            } else {
                                arrayRow.mo6817i(this, this.f21151g[solverVariable2.f21179c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (arrayRow.f21135a != null && arrayRow.f21138d.mo6798a() == 0) {
                    arrayRow.f21139e = true;
                    this.f21146b = true;
                }
            }
            if (arrayRow.mo6813e()) {
                return;
            }
            float f = arrayRow.f21136b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                arrayRow.f21136b = f * (-1.0f);
                arrayRow.f21138d.mo6804g();
            }
            int iMo6798a2 = arrayRow.f21138d.mo6798a();
            float f3 = 0.0f;
            float f4 = 0.0f;
            SolverVariable solverVariable3 = null;
            SolverVariable solverVariable4 = null;
            int i3 = 0;
            boolean z6 = false;
            boolean z7 = false;
            while (true) {
                type = SolverVariable.Type.f21189a;
                if (i3 >= iMo6798a2) {
                    break;
                }
                float fMo6805h = arrayRow.f21138d.mo6805h(i3);
                float f5 = f2;
                SolverVariable solverVariableMo6802e2 = arrayRow.f21138d.mo6802e(i3);
                if (solverVariableMo6802e2.f21185n == type) {
                    if (solverVariable3 == null) {
                        z6 = solverVariableMo6802e2.f21188q <= 1;
                    } else if (f3 > fMo6805h) {
                        if (solverVariableMo6802e2.f21188q <= 1) {
                        }
                    } else if (z6 || solverVariableMo6802e2.f21188q > 1) {
                    }
                    f3 = fMo6805h;
                    solverVariable3 = solverVariableMo6802e2;
                } else if (solverVariable3 == null && fMo6805h < f5) {
                    if (solverVariable4 == null) {
                        z7 = solverVariableMo6802e2.f21188q <= 1;
                    } else if (f4 > fMo6805h) {
                        if (solverVariableMo6802e2.f21188q <= 1) {
                        }
                    } else if (z7 || solverVariableMo6802e2.f21188q > 1) {
                    }
                    f4 = fMo6805h;
                    solverVariable4 = solverVariableMo6802e2;
                }
                i3++;
                f2 = f5;
            }
            float f6 = f2;
            if (solverVariable3 == null) {
                solverVariable3 = solverVariable4;
            }
            if (solverVariable3 == null) {
                z3 = true;
            } else {
                arrayRow.m6815g(solverVariable3);
                z3 = false;
            }
            if (arrayRow.f21138d.mo6798a() == 0) {
                arrayRow.f21139e = true;
            }
            if (z3) {
                if (this.f21154j + 1 >= this.f21150f) {
                    m6832o();
                }
                SolverVariable solverVariableM6819a = m6819a(SolverVariable.Type.f21190b);
                int i4 = this.f21147c + 1;
                this.f21147c = i4;
                this.f21154j++;
                solverVariableM6819a.f21178b = i4;
                Cache cache = this.f21157m;
                cache.f21142c[i4] = solverVariableM6819a;
                arrayRow.f21135a = solverVariableM6819a;
                int i5 = this.f21155k;
                m6826h(arrayRow);
                if (this.f21155k == i5 + 1) {
                    ArrayRow arrayRow2 = this.f21160p;
                    arrayRow2.getClass();
                    arrayRow2.f21135a = null;
                    arrayRow2.f21138d.clear();
                    for (int i6 = 0; i6 < arrayRow.f21138d.mo6798a(); i6++) {
                        arrayRow2.f21138d.mo6803f(arrayRow.f21138d.mo6802e(i6), arrayRow.f21138d.mo6805h(i6), true);
                    }
                    m6835r(this.f21160p);
                    if (solverVariableM6819a.f21179c == -1) {
                        if (arrayRow.f21135a == solverVariableM6819a && (solverVariableM6814f = arrayRow.m6814f(null, solverVariableM6819a)) != null) {
                            arrayRow.m6815g(solverVariableM6814f);
                        }
                        if (!arrayRow.f21139e) {
                            arrayRow.f21135a.m6845e(this, arrayRow);
                        }
                        cache.f21140a.m6838a(arrayRow);
                        this.f21155k--;
                    }
                }
                solverVariable = arrayRow.f21135a;
                if (solverVariable != null) {
                }
            } else {
                z4 = false;
                solverVariable = arrayRow.f21135a;
                if (solverVariable != null) {
                    return;
                }
                if (solverVariable.f21185n != type && arrayRow.f21136b < f6) {
                    return;
                } else {
                    z2 = z4;
                }
            }
        }
        if (z2) {
            return;
        }
        m6826h(arrayRow);
    }

    /* JADX INFO: renamed from: d */
    public final void m6822d(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f21179c;
        if (i2 == -1) {
            solverVariable.m6844d(this, i);
            for (int i3 = 0; i3 < this.f21147c + 1; i3++) {
                SolverVariable solverVariable2 = this.f21157m.f21142c[i3];
            }
            return;
        }
        if (i2 == -1) {
            ArrayRow arrayRowM6830l = m6830l();
            arrayRowM6830l.f21135a = solverVariable;
            float f = i;
            solverVariable.f21181f = f;
            arrayRowM6830l.f21136b = f;
            arrayRowM6830l.f21139e = true;
            m6821c(arrayRowM6830l);
            return;
        }
        ArrayRow arrayRow = this.f21151g[i2];
        if (arrayRow.f21139e) {
            arrayRow.f21136b = i;
            return;
        }
        if (arrayRow.f21138d.mo6798a() == 0) {
            arrayRow.f21139e = true;
            arrayRow.f21136b = i;
            return;
        }
        ArrayRow arrayRowM6830l2 = m6830l();
        if (i < 0) {
            arrayRowM6830l2.f21136b = i * (-1);
            arrayRowM6830l2.f21138d.mo6801d(solverVariable, 1.0f);
        } else {
            arrayRowM6830l2.f21136b = i;
            arrayRowM6830l2.f21138d.mo6801d(solverVariable, -1.0f);
        }
        m6821c(arrayRowM6830l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m6823e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.f21182g && solverVariable.f21179c == -1) {
            solverVariable.m6844d(this, solverVariable2.f21181f + i);
            return;
        }
        ArrayRow arrayRowM6830l = m6830l();
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            arrayRowM6830l.f21136b = i;
        }
        if (z2) {
            arrayRowM6830l.f21138d.mo6801d(solverVariable, 1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable2, -1.0f);
        } else {
            arrayRowM6830l.f21138d.mo6801d(solverVariable, -1.0f);
            arrayRowM6830l.f21138d.mo6801d(solverVariable2, 1.0f);
        }
        if (i2 != 8) {
            arrayRowM6830l.m6810b(this, i2);
        }
        m6821c(arrayRowM6830l);
    }

    /* JADX INFO: renamed from: f */
    public final void m6824f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowM6830l = m6830l();
        SolverVariable solverVariableM6831m = m6831m();
        solverVariableM6831m.f21180d = 0;
        arrayRowM6830l.m6811c(solverVariable, solverVariable2, solverVariableM6831m, i);
        if (i2 != 8) {
            arrayRowM6830l.f21138d.mo6801d(m6828j(i2), (int) (arrayRowM6830l.f21138d.mo6807j(solverVariableM6831m) * (-1.0f)));
        }
        m6821c(arrayRowM6830l);
    }

    /* JADX INFO: renamed from: g */
    public final void m6825g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowM6830l = m6830l();
        SolverVariable solverVariableM6831m = m6831m();
        solverVariableM6831m.f21180d = 0;
        arrayRowM6830l.m6812d(solverVariable, solverVariable2, solverVariableM6831m, i);
        if (i2 != 8) {
            arrayRowM6830l.f21138d.mo6801d(m6828j(i2), (int) (arrayRowM6830l.f21138d.mo6807j(solverVariableM6831m) * (-1.0f)));
        }
        m6821c(arrayRowM6830l);
    }

    /* JADX INFO: renamed from: h */
    public final void m6826h(ArrayRow arrayRow) {
        int i;
        if (arrayRow.f21139e) {
            arrayRow.f21135a.m6844d(this, arrayRow.f21136b);
        } else {
            ArrayRow[] arrayRowArr = this.f21151g;
            int i2 = this.f21155k;
            arrayRowArr[i2] = arrayRow;
            SolverVariable solverVariable = arrayRow.f21135a;
            solverVariable.f21179c = i2;
            this.f21155k = i2 + 1;
            solverVariable.m6845e(this, arrayRow);
        }
        if (this.f21146b) {
            int i3 = 0;
            while (i3 < this.f21155k) {
                if (this.f21151g[i3] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.f21151g[i3];
                if (arrayRow2 != null && arrayRow2.f21139e) {
                    arrayRow2.f21135a.m6844d(this, arrayRow2.f21136b);
                    this.f21157m.f21140a.m6838a(arrayRow2);
                    this.f21151g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f21155k;
                        if (i4 >= i) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.f21151g;
                        int i6 = i4 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i4];
                        arrayRowArr2[i6] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.f21135a;
                        if (solverVariable2.f21179c == i4) {
                            solverVariable2.f21179c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f21151g[i5] = null;
                    }
                    this.f21155k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f21146b = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6827i() {
        for (int i = 0; i < this.f21155k; i++) {
            ArrayRow arrayRow = this.f21151g[i];
            arrayRow.f21135a.f21181f = arrayRow.f21136b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final SolverVariable m6828j(int i) {
        if (this.f21154j + 1 >= this.f21150f) {
            m6832o();
        }
        SolverVariable solverVariableM6819a = m6819a(SolverVariable.Type.f21191c);
        int i2 = this.f21147c + 1;
        this.f21147c = i2;
        this.f21154j++;
        solverVariableM6819a.f21178b = i2;
        solverVariableM6819a.f21180d = i;
        this.f21157m.f21142c[i2] = solverVariableM6819a;
        PriorityGoalRow priorityGoalRow = this.f21148d;
        priorityGoalRow.f21174i.f21175a = solverVariableM6819a;
        float[] fArr = solverVariableM6819a.f21184j;
        Arrays.fill(fArr, 0.0f);
        fArr[solverVariableM6819a.f21180d] = 1.0f;
        priorityGoalRow.m6839j(solverVariableM6819a);
        return solverVariableM6819a;
    }

    /* JADX INFO: renamed from: k */
    public final SolverVariable m6829k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f21154j + 1 >= this.f21150f) {
            m6832o();
        }
        if (!(obj instanceof ConstraintAnchor)) {
            return null;
        }
        ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
        SolverVariable solverVariable = constraintAnchor.f21865i;
        if (solverVariable == null) {
            constraintAnchor.m7059k();
            solverVariable = constraintAnchor.f21865i;
        }
        int i = solverVariable.f21178b;
        Cache cache = this.f21157m;
        if (i != -1 && i <= this.f21147c && cache.f21142c[i] != null) {
            return solverVariable;
        }
        if (i != -1) {
            solverVariable.m6843c();
        }
        int i2 = this.f21147c + 1;
        this.f21147c = i2;
        this.f21154j++;
        solverVariable.f21178b = i2;
        solverVariable.f21185n = SolverVariable.Type.f21189a;
        cache.f21142c[i2] = solverVariable;
        return solverVariable;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayRow m6830l() {
        Object obj;
        Cache cache = this.f21157m;
        Pools.SimplePool simplePool = cache.f21140a;
        int i = simplePool.f21170b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = simplePool.f21169a;
            obj = objArr[i2];
            objArr[i2] = null;
            simplePool.f21170b = i2;
        } else {
            obj = null;
        }
        ArrayRow arrayRow = (ArrayRow) obj;
        if (arrayRow == null) {
            return new ArrayRow(cache);
        }
        arrayRow.f21135a = null;
        arrayRow.f21138d.clear();
        arrayRow.f21136b = 0.0f;
        arrayRow.f21139e = false;
        return arrayRow;
    }

    /* JADX INFO: renamed from: m */
    public final SolverVariable m6831m() {
        if (this.f21154j + 1 >= this.f21150f) {
            m6832o();
        }
        SolverVariable solverVariableM6819a = m6819a(SolverVariable.Type.f21190b);
        int i = this.f21147c + 1;
        this.f21147c = i;
        this.f21154j++;
        solverVariableM6819a.f21178b = i;
        this.f21157m.f21142c[i] = solverVariableM6819a;
        return solverVariableM6819a;
    }

    /* JADX INFO: renamed from: o */
    public final void m6832o() {
        int i = this.f21149e * 2;
        this.f21149e = i;
        this.f21151g = (ArrayRow[]) Arrays.copyOf(this.f21151g, i);
        Cache cache = this.f21157m;
        cache.f21142c = (SolverVariable[]) Arrays.copyOf(cache.f21142c, this.f21149e);
        int i2 = this.f21149e;
        this.f21153i = new boolean[i2];
        this.f21150f = i2;
        this.f21156l = i2;
        Metrics metrics = f21144r;
        if (metrics != null) {
            metrics.f21162b = Math.max(metrics.f21162b, i2);
            long j = f21144r.f21162b;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m6833p() {
        PriorityGoalRow priorityGoalRow = this.f21148d;
        if (priorityGoalRow.mo6813e()) {
            m6827i();
            return;
        }
        if (!this.f21152h) {
            m6834q(priorityGoalRow);
            return;
        }
        Metrics metrics = f21144r;
        if (metrics != null) {
            metrics.f21163c++;
        }
        for (int i = 0; i < this.f21155k; i++) {
            if (!this.f21151g[i].f21139e) {
                m6834q(priorityGoalRow);
                return;
            }
        }
        m6827i();
    }

    /* JADX INFO: renamed from: q */
    public final void m6834q(PriorityGoalRow priorityGoalRow) {
        Metrics metrics = f21144r;
        if (metrics != null) {
            metrics.f21166f = Math.max(metrics.f21166f, this.f21154j);
            Metrics metrics2 = f21144r;
            metrics2.f21167g = Math.max(metrics2.f21167g, this.f21155k);
        }
        int i = 0;
        while (true) {
            if (i >= this.f21155k) {
                break;
            }
            ArrayRow arrayRow = this.f21151g[i];
            SolverVariable.Type type = arrayRow.f21135a.f21185n;
            SolverVariable.Type type2 = SolverVariable.Type.f21189a;
            if (type != type2) {
                float f = 0.0f;
                if (arrayRow.f21136b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.f21155k) {
                            ArrayRow arrayRow2 = this.f21151g[i3];
                            if (arrayRow2.f21135a.f21185n != type2 && !arrayRow2.f21139e && arrayRow2.f21136b < f) {
                                int iMo6798a = arrayRow2.f21138d.mo6798a();
                                int i7 = 0;
                                while (i7 < iMo6798a) {
                                    SolverVariable solverVariableMo6802e = arrayRow2.f21138d.mo6802e(i7);
                                    float f3 = f;
                                    float fMo6807j = arrayRow2.f21138d.mo6807j(solverVariableMo6802e);
                                    if (fMo6807j > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = solverVariableMo6802e.f21183i[i8] / fMo6807j;
                                            if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = solverVariableMo6802e.f21178b;
                                                i4 = i3;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = f3;
                                }
                            }
                            i3++;
                            f = f;
                        }
                        float f5 = f;
                        if (i4 != -1) {
                            ArrayRow arrayRow3 = this.f21151g[i4];
                            arrayRow3.f21135a.f21179c = -1;
                            arrayRow3.m6815g(this.f21157m.f21142c[i5]);
                            SolverVariable solverVariable = arrayRow3.f21135a;
                            solverVariable.f21179c = i4;
                            solverVariable.m6845e(this, arrayRow3);
                        } else {
                            z2 = true;
                        }
                        if (i2 > this.f21154j / 2) {
                            z2 = true;
                        }
                        f = f5;
                    }
                }
            }
            i++;
        }
        m6835r(priorityGoalRow);
        m6827i();
    }

    /* JADX INFO: renamed from: r */
    public final void m6835r(ArrayRow arrayRow) {
        for (int i = 0; i < this.f21154j; i++) {
            this.f21153i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f21154j * 2) {
                return;
            }
            SolverVariable solverVariable = arrayRow.f21135a;
            if (solverVariable != null) {
                this.f21153i[solverVariable.f21178b] = true;
            }
            SolverVariable solverVariableMo6809a = arrayRow.mo6809a(this.f21153i);
            if (solverVariableMo6809a != null) {
                boolean[] zArr = this.f21153i;
                int i3 = solverVariableMo6809a.f21178b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (solverVariableMo6809a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f21155k; i5++) {
                    ArrayRow arrayRow2 = this.f21151g[i5];
                    if (arrayRow2.f21135a.f21185n != SolverVariable.Type.f21189a && !arrayRow2.f21139e && arrayRow2.f21138d.mo6799b(solverVariableMo6809a)) {
                        float fMo6807j = arrayRow2.f21138d.mo6807j(solverVariableMo6809a);
                        if (fMo6807j < 0.0f) {
                            float f2 = (-arrayRow2.f21136b) / fMo6807j;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    ArrayRow arrayRow3 = this.f21151g[i4];
                    arrayRow3.f21135a.f21179c = -1;
                    arrayRow3.m6815g(solverVariableMo6809a);
                    SolverVariable solverVariable2 = arrayRow3.f21135a;
                    solverVariable2.f21179c = i4;
                    solverVariable2.m6845e(this, arrayRow3);
                }
            } else {
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6836s() {
        for (int i = 0; i < this.f21155k; i++) {
            ArrayRow arrayRow = this.f21151g[i];
            if (arrayRow != null) {
                this.f21157m.f21140a.m6838a(arrayRow);
            }
            this.f21151g[i] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6837t() {
        Cache cache;
        int i = 0;
        while (true) {
            cache = this.f21157m;
            SolverVariable[] solverVariableArr = cache.f21142c;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.m6843c();
            }
            i++;
        }
        Pools.SimplePool simplePool = cache.f21141b;
        SolverVariable[] solverVariableArr2 = this.f21158n;
        int length = this.f21159o;
        simplePool.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            SolverVariable solverVariable2 = solverVariableArr2[i2];
            int i3 = simplePool.f21170b;
            Object[] objArr = simplePool.f21169a;
            if (i3 < objArr.length) {
                objArr[i3] = solverVariable2;
                simplePool.f21170b = i3 + 1;
            }
        }
        this.f21159o = 0;
        Arrays.fill(cache.f21142c, (Object) null);
        this.f21147c = 0;
        PriorityGoalRow priorityGoalRow = this.f21148d;
        priorityGoalRow.f21173h = 0;
        priorityGoalRow.f21136b = 0.0f;
        this.f21154j = 1;
        for (int i4 = 0; i4 < this.f21155k; i4++) {
            ArrayRow arrayRow = this.f21151g[i4];
        }
        m6836s();
        this.f21155k = 0;
        this.f21160p = new ArrayRow(cache);
    }
}
