package androidx.constraintlayout.core.utils;

import androidx.camera.core.impl.C0281g;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class GridCore extends VirtualLayout {

    /* JADX INFO: renamed from: I0 */
    public ConstraintWidgetContainer f21815I0;

    /* JADX INFO: renamed from: J0 */
    public ConstraintWidget[] f21816J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f21817K0;

    /* JADX INFO: renamed from: L0 */
    public int f21818L0;

    /* JADX INFO: renamed from: M0 */
    public int f21819M0;

    /* JADX INFO: renamed from: N0 */
    public int f21820N0;

    /* JADX INFO: renamed from: O0 */
    public int f21821O0;

    /* JADX INFO: renamed from: P0 */
    public float f21822P0;

    /* JADX INFO: renamed from: Q0 */
    public float f21823Q0;

    /* JADX INFO: renamed from: R0 */
    public String f21824R0;

    /* JADX INFO: renamed from: S0 */
    public String f21825S0;

    /* JADX INFO: renamed from: T0 */
    public String f21826T0;

    /* JADX INFO: renamed from: U0 */
    public String f21827U0;

    /* JADX INFO: renamed from: V0 */
    public int f21828V0;

    /* JADX INFO: renamed from: W0 */
    public int f21829W0;

    /* JADX INFO: renamed from: X0 */
    public boolean[][] f21830X0;

    /* JADX INFO: renamed from: Y0 */
    public HashSet f21831Y0;

    /* JADX INFO: renamed from: Z0 */
    public int[][] f21832Z0;

    /* JADX INFO: renamed from: a1 */
    public int f21833a1;

    /* JADX INFO: renamed from: b1 */
    public int[][] f21834b1;

    /* JADX INFO: renamed from: c1 */
    public int f21835c1;

    /* JADX INFO: renamed from: c0 */
    public static void m7029c0(ConstraintWidget constraintWidget) {
        constraintWidget.f21930o0[1] = -1.0f;
        constraintWidget.f21886L.m7058j();
        constraintWidget.f21888N.m7058j();
        constraintWidget.f21889O.m7058j();
    }

    /* JADX INFO: renamed from: l0 */
    public static float[] m7030l0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < strArrSplit.length) {
                try {
                    fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /* JADX INFO: renamed from: a0 */
    public final void mo7031a0(int i, int i2, int i3, int i4) {
        int[][] iArrM7040k0;
        this.f21815I0 = (ConstraintWidgetContainer) this.f21897W;
        if (this.f21818L0 >= 1 && this.f21820N0 >= 1) {
            this.f21829W0 = 0;
            String str = this.f21827U0;
            if (str != null && !str.trim().isEmpty() && (iArrM7040k0 = m7040k0(this.f21827U0, false)) != null) {
                m7036g0(iArrM7040k0);
            }
            String str2 = this.f21826T0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f21834b1 = m7040k0(this.f21826T0, true);
            }
            int iMax = Math.max(this.f21818L0, this.f21820N0);
            ConstraintWidget[] constraintWidgetArr = this.f21816J0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f21951c;
            if (constraintWidgetArr == null) {
                this.f21816J0 = new ConstraintWidget[iMax];
                int i5 = 0;
                while (true) {
                    ConstraintWidget[] constraintWidgetArr2 = this.f21816J0;
                    if (i5 >= constraintWidgetArr2.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget = new ConstraintWidget();
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f21896V;
                    dimensionBehaviourArr[0] = dimensionBehaviour;
                    dimensionBehaviourArr[1] = dimensionBehaviour;
                    constraintWidget.f21921k = String.valueOf(constraintWidget.hashCode());
                    constraintWidgetArr2[i5] = constraintWidget;
                    i5++;
                }
            } else if (iMax != constraintWidgetArr.length) {
                ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    ConstraintWidget[] constraintWidgetArr4 = this.f21816J0;
                    if (i6 < constraintWidgetArr4.length) {
                        constraintWidgetArr3[i6] = constraintWidgetArr4[i6];
                    } else {
                        ConstraintWidget constraintWidget2 = new ConstraintWidget();
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget2.f21896V;
                        dimensionBehaviourArr2[0] = dimensionBehaviour;
                        dimensionBehaviourArr2[1] = dimensionBehaviour;
                        constraintWidget2.f21921k = String.valueOf(constraintWidget2.hashCode());
                        constraintWidgetArr3[i6] = constraintWidget2;
                    }
                }
                while (true) {
                    ConstraintWidget[] constraintWidgetArr5 = this.f21816J0;
                    if (iMax >= constraintWidgetArr5.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = constraintWidgetArr5[iMax];
                    this.f21815I0.f22040v0.remove(constraintWidget3);
                    constraintWidget3.mo7070H();
                    iMax++;
                }
                this.f21816J0 = constraintWidgetArr3;
            }
            int[][] iArr = this.f21834b1;
            if (iArr != null) {
                m7037h0(iArr);
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer = this.f21815I0;
        ConstraintWidget[] constraintWidgetArr6 = this.f21816J0;
        constraintWidgetContainer.getClass();
        for (ConstraintWidget constraintWidget4 : constraintWidgetArr6) {
            constraintWidgetContainer.m7127b(constraintWidget4);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m7032d0(ConstraintWidget constraintWidget, int i, int i2, int i3, int i4) {
        constraintWidget.f21885K.m7049a(this.f21816J0[i2].f21885K, 0);
        constraintWidget.f21886L.m7049a(this.f21816J0[i].f21886L, 0);
        constraintWidget.f21887M.m7049a(this.f21816J0[(i2 + i4) - 1].f21887M, 0);
        constraintWidget.f21888N.m7049a(this.f21816J0[(i + i3) - 1].f21888N, 0);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m7033e0(int i) {
        return this.f21828V0 == 1 ? i / this.f21818L0 : i % this.f21820N0;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7034f(LinearSystem linearSystem, boolean z2) {
        int i;
        int i2;
        int[][] iArr;
        int i3;
        super.mo7034f(linearSystem, z2);
        int iMax = Math.max(this.f21818L0, this.f21820N0);
        ConstraintWidget constraintWidget = this.f21816J0[0];
        float[] fArrM7030l0 = m7030l0(this.f21818L0, this.f21824R0);
        int i4 = this.f21818L0;
        ConstraintAnchor constraintAnchor = this.f21888N;
        ConstraintAnchor constraintAnchor2 = this.f21886L;
        if (i4 == 1) {
            m7029c0(constraintWidget);
            constraintWidget.f21886L.m7049a(constraintAnchor2, 0);
            constraintWidget.f21888N.m7049a(constraintAnchor, 0);
        } else {
            int i5 = 0;
            while (true) {
                i = this.f21818L0;
                if (i5 >= i) {
                    break;
                }
                ConstraintWidget constraintWidget2 = this.f21816J0[i5];
                m7029c0(constraintWidget2);
                if (fArrM7030l0 != null) {
                    constraintWidget2.f21930o0[1] = fArrM7030l0[i5];
                }
                ConstraintAnchor constraintAnchor3 = constraintWidget2.f21886L;
                if (i5 > 0) {
                    constraintAnchor3.m7049a(this.f21816J0[i5 - 1].f21888N, 0);
                } else {
                    constraintAnchor3.m7049a(constraintAnchor2, 0);
                }
                int i6 = this.f21818L0 - 1;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.f21888N;
                if (i5 < i6) {
                    constraintAnchor4.m7049a(this.f21816J0[i5 + 1].f21886L, 0);
                } else {
                    constraintAnchor4.m7049a(constraintAnchor, 0);
                }
                if (i5 > 0) {
                    constraintAnchor3.f21863g = (int) this.f21823Q0;
                }
                i5++;
            }
            while (i < iMax) {
                ConstraintWidget constraintWidget3 = this.f21816J0[i];
                m7029c0(constraintWidget3);
                constraintWidget3.f21886L.m7049a(constraintAnchor2, 0);
                constraintWidget3.f21888N.m7049a(constraintAnchor, 0);
                i++;
            }
        }
        int iMax2 = Math.max(this.f21818L0, this.f21820N0);
        ConstraintWidget constraintWidget4 = this.f21816J0[0];
        float[] fArrM7030l02 = m7030l0(this.f21820N0, this.f21825S0);
        int i7 = this.f21820N0;
        ConstraintAnchor constraintAnchor5 = this.f21887M;
        ConstraintAnchor constraintAnchor6 = this.f21885K;
        if (i7 == 1) {
            constraintWidget4.f21930o0[0] = -1.0f;
            constraintWidget4.f21885K.m7058j();
            constraintWidget4.f21887M.m7058j();
            constraintWidget4.f21885K.m7049a(constraintAnchor6, 0);
            constraintWidget4.f21887M.m7049a(constraintAnchor5, 0);
        } else {
            int i8 = 0;
            while (true) {
                i2 = this.f21820N0;
                if (i8 >= i2) {
                    break;
                }
                ConstraintWidget constraintWidget5 = this.f21816J0[i8];
                constraintWidget5.f21930o0[0] = -1.0f;
                constraintWidget5.f21885K.m7058j();
                constraintWidget5.f21887M.m7058j();
                if (fArrM7030l02 != null) {
                    constraintWidget5.f21930o0[0] = fArrM7030l02[i8];
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget5.f21885K;
                if (i8 > 0) {
                    constraintAnchor7.m7049a(this.f21816J0[i8 - 1].f21887M, 0);
                } else {
                    constraintAnchor7.m7049a(constraintAnchor6, 0);
                }
                int i9 = this.f21820N0 - 1;
                ConstraintAnchor constraintAnchor8 = constraintWidget5.f21887M;
                if (i8 < i9) {
                    constraintAnchor8.m7049a(this.f21816J0[i8 + 1].f21885K, 0);
                } else {
                    constraintAnchor8.m7049a(constraintAnchor5, 0);
                }
                if (i8 > 0) {
                    constraintAnchor7.f21863g = (int) this.f21822P0;
                }
                i8++;
            }
            while (i2 < iMax2) {
                ConstraintWidget constraintWidget6 = this.f21816J0[i2];
                constraintWidget6.f21930o0[0] = -1.0f;
                constraintWidget6.f21885K.m7058j();
                constraintWidget6.f21887M.m7058j();
                constraintWidget6.f21885K.m7049a(constraintAnchor6, 0);
                constraintWidget6.f21887M.m7049a(constraintAnchor5, 0);
                i2++;
            }
        }
        for (int i10 = 0; i10 < this.f22027w0; i10++) {
            if (!this.f21831Y0.contains(this.f22026v0[i10].f21921k)) {
                boolean z3 = false;
                int i11 = 0;
                while (true) {
                    if (z3) {
                        break;
                    }
                    i11 = this.f21829W0;
                    if (i11 >= this.f21818L0 * this.f21820N0) {
                        i11 = -1;
                        break;
                    }
                    int iM7035f0 = m7035f0(i11);
                    int iM7033e0 = m7033e0(this.f21829W0);
                    boolean[] zArr = this.f21830X0[iM7035f0];
                    if (zArr[iM7033e0]) {
                        zArr[iM7033e0] = false;
                        z3 = true;
                    }
                    this.f21829W0++;
                }
                int iM7035f02 = m7035f0(i11);
                int iM7033e02 = m7033e0(i11);
                if (i11 == -1) {
                    return;
                }
                if ((this.f21833a1 & 2) <= 0 || (iArr = this.f21834b1) == null || (i3 = this.f21835c1) >= iArr.length) {
                    m7032d0(this.f22026v0[i10], iM7035f02, iM7033e02, 1, 1);
                } else {
                    int[] iArr2 = iArr[i3];
                    if (iArr2[0] == i11) {
                        this.f21830X0[iM7035f02][iM7033e02] = true;
                        if (m7039j0(iM7035f02, iM7033e02, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget7 = this.f22026v0[i10];
                            int[] iArr3 = this.f21834b1[this.f21835c1];
                            m7032d0(constraintWidget7, iM7035f02, iM7033e02, iArr3[1], iArr3[2]);
                            this.f21835c1++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final int m7035f0(int i) {
        return this.f21828V0 == 1 ? i % this.f21818L0 : i / this.f21820N0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m7036g0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!m7039j0(m7035f0(iArr2[0]), m7033e0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7037h0(int[][] iArr) {
        if ((this.f21833a1 & 2) > 0) {
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            int iM7035f0 = m7035f0(iArr[i][0]);
            int iM7033e0 = m7033e0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!m7039j0(iM7035f0, iM7033e0, iArr2[1], iArr2[2])) {
                break;
            }
            ConstraintWidget constraintWidget = this.f22026v0[i];
            int[] iArr3 = iArr[i];
            m7032d0(constraintWidget, iM7035f0, iM7033e0, iArr3[1], iArr3[2]);
            this.f21831Y0.add(this.f22026v0[i].f21921k);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7038i0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f21818L0, this.f21820N0);
        this.f21830X0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.f22027w0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.f21832Z0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m7039j0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.f21830X0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final int[][] m7040k0(String str, boolean z2) {
        int i;
        int i2;
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new C0281g(8));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.f21818L0 != 1 && this.f21820N0 != 1) {
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    String[] strArrSplit2 = strArrSplit[i3].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i3][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.f21833a1 & 1) > 0) {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                String[] strArrSplit4 = strArrSplit[i6].trim().split(":");
                iArr[i6][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i6];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f21820N0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i4 += iArr[i6][1];
                    if (z2) {
                        i4--;
                    }
                }
                if (this.f21818L0 == 1) {
                    iArr[i6][2] = Integer.parseInt(strArrSplit4[1]);
                    i5 += iArr[i6][2];
                    if (z2) {
                        i5--;
                    }
                }
            }
            if (i4 != 0 && !this.f21817K0 && (i2 = this.f21818L0 + i4) <= 50 && this.f21819M0 != i2) {
                this.f21819M0 = i2;
                m7041m0();
                m7038i0();
            }
            if (i5 != 0 && !this.f21817K0 && (i = this.f21820N0 + i5) <= 50 && this.f21821O0 != i) {
                this.f21821O0 = i;
                m7041m0();
                m7038i0();
            }
            this.f21817K0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7041m0() {
        int i;
        int i2 = this.f21819M0;
        if (i2 != 0 && (i = this.f21821O0) != 0) {
            this.f21818L0 = i2;
            this.f21820N0 = i;
            return;
        }
        int i3 = this.f21821O0;
        if (i3 > 0) {
            this.f21820N0 = i3;
            this.f21818L0 = ((this.f22027w0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.f21818L0 = i2;
            this.f21820N0 = ((this.f22027w0 + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f22027w0) + 1.5d);
            this.f21818L0 = iSqrt;
            this.f21820N0 = ((this.f22027w0 + iSqrt) - 1) / iSqrt;
        }
    }
}
