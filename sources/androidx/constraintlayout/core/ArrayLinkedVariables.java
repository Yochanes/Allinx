package androidx.constraintlayout.core;

import androidx.compose.animation.AbstractC0455a;
import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {

    /* JADX INFO: renamed from: b */
    public final ArrayRow f21126b;

    /* JADX INFO: renamed from: c */
    public final Cache f21127c;

    /* JADX INFO: renamed from: a */
    public int f21125a = 0;

    /* JADX INFO: renamed from: d */
    public int f21128d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f21129e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f21130f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f21131g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f21132h = -1;

    /* JADX INFO: renamed from: i */
    public int f21133i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f21134j = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.f21126b = arrayRow;
        this.f21127c = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: a */
    public final int mo6798a() {
        return this.f21125a;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: b */
    public final boolean mo6799b(SolverVariable solverVariable) {
        int i = this.f21132h;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f21125a; i2++) {
                if (this.f21129e[i] == solverVariable.f21178b) {
                    return true;
                }
                i = this.f21130f[i];
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: c */
    public final float mo6800c(ArrayRow arrayRow, boolean z2) {
        float fMo6807j = mo6807j(arrayRow.f21135a);
        mo6806i(arrayRow.f21135a, z2);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.f21138d;
        int iMo6798a = arrayRowVariables.mo6798a();
        for (int i = 0; i < iMo6798a; i++) {
            SolverVariable solverVariableMo6802e = arrayRowVariables.mo6802e(i);
            mo6803f(solverVariableMo6802e, arrayRowVariables.mo6807j(solverVariableMo6802e) * fMo6807j, z2);
        }
        return fMo6807j;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.f21132h;
        for (int i2 = 0; i != -1 && i2 < this.f21125a; i2++) {
            SolverVariable solverVariable = this.f21127c.f21142c[this.f21129e[i]];
            if (solverVariable != null) {
                solverVariable.m6842b(this.f21126b);
            }
            i = this.f21130f[i];
        }
        this.f21132h = -1;
        this.f21133i = -1;
        this.f21134j = false;
        this.f21125a = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: d */
    public final void mo6801d(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            mo6806i(solverVariable, true);
            return;
        }
        int i = this.f21132h;
        ArrayRow arrayRow = this.f21126b;
        if (i == -1) {
            this.f21132h = 0;
            this.f21131g[0] = f;
            this.f21129e[0] = solverVariable.f21178b;
            this.f21130f[0] = -1;
            solverVariable.f21188q++;
            solverVariable.m6841a(arrayRow);
            this.f21125a++;
            if (this.f21134j) {
                return;
            }
            int i2 = this.f21133i + 1;
            this.f21133i = i2;
            int[] iArr = this.f21129e;
            if (i2 >= iArr.length) {
                this.f21134j = true;
                this.f21133i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f21125a; i4++) {
            int i5 = this.f21129e[i];
            int i6 = solverVariable.f21178b;
            if (i5 == i6) {
                this.f21131g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f21130f[i];
        }
        int length = this.f21133i;
        int i7 = length + 1;
        if (this.f21134j) {
            int[] iArr2 = this.f21129e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f21129e;
        if (length >= iArr3.length && this.f21125a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f21129e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f21129e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f21128d * 2;
            this.f21128d = i9;
            this.f21134j = false;
            this.f21133i = length - 1;
            this.f21131g = Arrays.copyOf(this.f21131g, i9);
            this.f21129e = Arrays.copyOf(this.f21129e, this.f21128d);
            this.f21130f = Arrays.copyOf(this.f21130f, this.f21128d);
        }
        this.f21129e[length] = solverVariable.f21178b;
        this.f21131g[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f21130f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f21130f[length] = this.f21132h;
            this.f21132h = length;
        }
        solverVariable.f21188q++;
        solverVariable.m6841a(arrayRow);
        int i10 = this.f21125a + 1;
        this.f21125a = i10;
        if (!this.f21134j) {
            this.f21133i++;
        }
        int[] iArr7 = this.f21129e;
        if (i10 >= iArr7.length) {
            this.f21134j = true;
        }
        if (this.f21133i >= iArr7.length) {
            this.f21134j = true;
            this.f21133i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: e */
    public final SolverVariable mo6802e(int i) {
        int i2 = this.f21132h;
        for (int i3 = 0; i2 != -1 && i3 < this.f21125a; i3++) {
            if (i3 == i) {
                return this.f21127c.f21142c[this.f21129e[i2]];
            }
            i2 = this.f21130f[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: f */
    public final void mo6803f(SolverVariable solverVariable, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f21132h;
            ArrayRow arrayRow = this.f21126b;
            if (i == -1) {
                this.f21132h = 0;
                this.f21131g[0] = f;
                this.f21129e[0] = solverVariable.f21178b;
                this.f21130f[0] = -1;
                solverVariable.f21188q++;
                solverVariable.m6841a(arrayRow);
                this.f21125a++;
                if (this.f21134j) {
                    return;
                }
                int i2 = this.f21133i + 1;
                this.f21133i = i2;
                int[] iArr = this.f21129e;
                if (i2 >= iArr.length) {
                    this.f21134j = true;
                    this.f21133i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f21125a; i4++) {
                int i5 = this.f21129e[i];
                int i6 = solverVariable.f21178b;
                if (i5 == i6) {
                    float[] fArr = this.f21131g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f21132h) {
                            this.f21132h = this.f21130f[i];
                        } else {
                            int[] iArr2 = this.f21130f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            solverVariable.m6842b(arrayRow);
                        }
                        if (this.f21134j) {
                            this.f21133i = i;
                        }
                        solverVariable.f21188q--;
                        this.f21125a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f21130f[i];
            }
            int length = this.f21133i;
            int i7 = length + 1;
            if (this.f21134j) {
                int[] iArr3 = this.f21129e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f21129e;
            if (length >= iArr4.length && this.f21125a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f21129e;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f21129e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f21128d * 2;
                this.f21128d = i9;
                this.f21134j = false;
                this.f21133i = length - 1;
                this.f21131g = Arrays.copyOf(this.f21131g, i9);
                this.f21129e = Arrays.copyOf(this.f21129e, this.f21128d);
                this.f21130f = Arrays.copyOf(this.f21130f, this.f21128d);
            }
            this.f21129e[length] = solverVariable.f21178b;
            this.f21131g[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f21130f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f21130f[length] = this.f21132h;
                this.f21132h = length;
            }
            solverVariable.f21188q++;
            solverVariable.m6841a(arrayRow);
            this.f21125a++;
            if (!this.f21134j) {
                this.f21133i++;
            }
            int i10 = this.f21133i;
            int[] iArr8 = this.f21129e;
            if (i10 >= iArr8.length) {
                this.f21134j = true;
                this.f21133i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: g */
    public final void mo6804g() {
        int i = this.f21132h;
        for (int i2 = 0; i != -1 && i2 < this.f21125a; i2++) {
            float[] fArr = this.f21131g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f21130f[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: h */
    public final float mo6805h(int i) {
        int i2 = this.f21132h;
        for (int i3 = 0; i2 != -1 && i3 < this.f21125a; i3++) {
            if (i3 == i) {
                return this.f21131g[i2];
            }
            i2 = this.f21130f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: i */
    public final float mo6806i(SolverVariable solverVariable, boolean z2) {
        int i = this.f21132h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f21125a) {
            if (this.f21129e[i] == solverVariable.f21178b) {
                if (i == this.f21132h) {
                    this.f21132h = this.f21130f[i];
                } else {
                    int[] iArr = this.f21130f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    solverVariable.m6842b(this.f21126b);
                }
                solverVariable.f21188q--;
                this.f21125a--;
                this.f21129e[i] = -1;
                if (this.f21134j) {
                    this.f21133i = i;
                }
                return this.f21131g[i];
            }
            i2++;
            i3 = i;
            i = this.f21130f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: j */
    public final float mo6807j(SolverVariable solverVariable) {
        int i = this.f21132h;
        for (int i2 = 0; i != -1 && i2 < this.f21125a; i2++) {
            if (this.f21129e[i] == solverVariable.f21178b) {
                return this.f21131g[i];
            }
            i = this.f21130f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    /* JADX INFO: renamed from: k */
    public final void mo6808k(float f) {
        int i = this.f21132h;
        for (int i2 = 0; i != -1 && i2 < this.f21125a; i2++) {
            float[] fArr = this.f21131g;
            fArr[i] = fArr[i] / f;
            i = this.f21130f[i];
        }
    }

    public final String toString() {
        int i = this.f21132h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f21125a; i2++) {
            StringBuilder sbM2244s = AbstractC0455a.m2244s(AbstractC0000a.m2C(string, " -> "));
            sbM2244s.append(this.f21131g[i]);
            sbM2244s.append(" : ");
            StringBuilder sbM2244s2 = AbstractC0455a.m2244s(sbM2244s.toString());
            sbM2244s2.append(this.f21127c.f21142c[this.f21129e[i]]);
            string = sbM2244s2.toString();
            i = this.f21130f[i];
        }
        return string;
    }
}
