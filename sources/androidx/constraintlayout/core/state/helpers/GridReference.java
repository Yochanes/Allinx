package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class GridReference extends HelperReference {

    /* JADX INFO: renamed from: A0 */
    public String f21791A0;

    /* JADX INFO: renamed from: B0 */
    public String f21792B0;

    /* JADX INFO: renamed from: C0 */
    public int f21793C0;

    /* JADX INFO: renamed from: o0 */
    public GridCore f21794o0;

    /* JADX INFO: renamed from: p0 */
    public int f21795p0;

    /* JADX INFO: renamed from: q0 */
    public int f21796q0;

    /* JADX INFO: renamed from: r0 */
    public int f21797r0;

    /* JADX INFO: renamed from: s0 */
    public int f21798s0;

    /* JADX INFO: renamed from: t0 */
    public int f21799t0;

    /* JADX INFO: renamed from: u0 */
    public int f21800u0;

    /* JADX INFO: renamed from: v0 */
    public int f21801v0;

    /* JADX INFO: renamed from: w0 */
    public float f21802w0;

    /* JADX INFO: renamed from: x0 */
    public float f21803x0;

    /* JADX INFO: renamed from: y0 */
    public String f21804y0;

    /* JADX INFO: renamed from: z0 */
    public String f21805z0;

    public GridReference(State state, State.Helper helper) {
        super(state, helper);
        this.f21795p0 = 0;
        this.f21796q0 = 0;
        this.f21797r0 = 0;
        this.f21798s0 = 0;
        if (helper == State.Helper.f21680j) {
            this.f21800u0 = 1;
        } else if (helper == State.Helper.f21681n) {
            this.f21801v0 = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public final void apply() {
        mo6996s();
        GridCore gridCore = this.f21794o0;
        int i = this.f21799t0;
        gridCore.getClass();
        if ((i == 0 || i == 1) && gridCore.f21828V0 != i) {
            gridCore.f21828V0 = i;
        }
        int i2 = this.f21800u0;
        if (i2 != 0) {
            GridCore gridCore2 = this.f21794o0;
            if (i2 > 50) {
                gridCore2.getClass();
            } else if (gridCore2.f21819M0 != i2) {
                gridCore2.f21819M0 = i2;
                gridCore2.m7041m0();
                gridCore2.m7038i0();
            }
        }
        int i3 = this.f21801v0;
        if (i3 != 0) {
            GridCore gridCore3 = this.f21794o0;
            if (i3 > 50) {
                gridCore3.getClass();
            } else if (gridCore3.f21821O0 != i3) {
                gridCore3.f21821O0 = i3;
                gridCore3.m7041m0();
                gridCore3.m7038i0();
            }
        }
        float f = this.f21802w0;
        if (f != 0.0f) {
            GridCore gridCore4 = this.f21794o0;
            if (f < 0.0f) {
                gridCore4.getClass();
            } else if (gridCore4.f21822P0 != f) {
                gridCore4.f21822P0 = f;
            }
        }
        float f2 = this.f21803x0;
        if (f2 != 0.0f) {
            GridCore gridCore5 = this.f21794o0;
            if (f2 < 0.0f) {
                gridCore5.getClass();
            } else if (gridCore5.f21823Q0 != f2) {
                gridCore5.f21823Q0 = f2;
            }
        }
        String str = this.f21804y0;
        if (str != null && !str.isEmpty()) {
            GridCore gridCore6 = this.f21794o0;
            String str2 = this.f21804y0;
            String str3 = gridCore6.f21824R0;
            if (str3 == null || !str3.equals(str2)) {
                gridCore6.f21824R0 = str2;
            }
        }
        String str4 = this.f21805z0;
        if (str4 != null && !str4.isEmpty()) {
            GridCore gridCore7 = this.f21794o0;
            String str5 = this.f21805z0;
            String str6 = gridCore7.f21825S0;
            if (str6 == null || !str6.equals(str5)) {
                gridCore7.f21825S0 = str5;
            }
        }
        String str7 = this.f21791A0;
        if (str7 != null && !str7.isEmpty()) {
            GridCore gridCore8 = this.f21794o0;
            String str8 = this.f21791A0;
            String str9 = gridCore8.f21826T0;
            if (str9 == null || !str9.equals(str8.toString())) {
                gridCore8.f21817K0 = false;
                gridCore8.f21826T0 = str8.toString();
            }
        }
        String str10 = this.f21792B0;
        if (str10 != null && !str10.isEmpty()) {
            GridCore gridCore9 = this.f21794o0;
            String str11 = this.f21792B0;
            String str12 = gridCore9.f21827U0;
            if (str12 == null || !str12.equals(str11)) {
                gridCore9.f21817K0 = false;
                gridCore9.f21827U0 = str11;
            }
        }
        GridCore gridCore10 = this.f21794o0;
        gridCore10.f21833a1 = this.f21793C0;
        int i4 = this.f21795p0;
        gridCore10.f22039z0 = i4;
        gridCore10.f22030B0 = i4;
        gridCore10.f22031C0 = i4;
        gridCore10.f22029A0 = this.f21796q0;
        gridCore10.f22037x0 = this.f21797r0;
        gridCore10.f22038y0 = this.f21798s0;
        m6995r();
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    /* JADX INFO: renamed from: s */
    public final HelperWidget mo6996s() {
        int[][] iArrM7040k0;
        int[][] iArrM7040k02;
        boolean[][] zArr;
        if (this.f21794o0 == null) {
            GridCore gridCore = new GridCore();
            gridCore.f21817K0 = false;
            gridCore.f21829W0 = 0;
            gridCore.f21831Y0 = new HashSet();
            gridCore.f21835c1 = 0;
            gridCore.m7041m0();
            int[][] iArr = gridCore.f21832Z0;
            boolean z2 = iArr != null && iArr.length == gridCore.f22027w0 && (zArr = gridCore.f21830X0) != null && zArr.length == gridCore.f21818L0 && zArr[0].length == gridCore.f21820N0;
            if (!z2) {
                gridCore.m7038i0();
            }
            if (z2) {
                for (int i = 0; i < gridCore.f21830X0.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = gridCore.f21830X0;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < gridCore.f21832Z0.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = gridCore.f21832Z0;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            gridCore.f21829W0 = 0;
            String str = gridCore.f21827U0;
            if (str != null && !str.trim().isEmpty() && (iArrM7040k02 = gridCore.m7040k0(gridCore.f21827U0, false)) != null) {
                gridCore.m7036g0(iArrM7040k02);
            }
            String str2 = gridCore.f21826T0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrM7040k0 = gridCore.m7040k0(gridCore.f21826T0, true)) != null) {
                gridCore.m7037h0(iArrM7040k0);
            }
            this.f21794o0 = gridCore;
        }
        return this.f21794o0;
    }
}
