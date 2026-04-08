package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /* JADX INFO: renamed from: a0 */
    public final void mo7031a0(int i, int i2, int i3, int i4) {
        int iM7099v = this.f22030B0 + this.f22031C0;
        int iM7095p = this.f22037x0 + this.f22038y0;
        if (this.f22027w0 > 0) {
            iM7099v += this.f22026v0[0].m7099v();
            iM7095p += this.f22026v0[0].m7095p();
        }
        int iMax = Math.max(this.f21910e0, iM7099v);
        int iMax2 = Math.max(this.f21912f0, iM7095p);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(iMax, i2) : i == 0 ? iMax : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(iMax2, i4) : i3 == 0 ? iMax2 : 0;
        }
        this.f22033E0 = i2;
        this.f22034F0 = i4;
        m7083W(i2);
        m7078R(i4);
        this.f22032D0 = this.f22027w0 > 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: f */
    public final void mo7034f(LinearSystem linearSystem, boolean z2) {
        super.mo7034f(linearSystem, z2);
        if (this.f22027w0 > 0) {
            ConstraintWidget constraintWidget = this.f22026v0[0];
            constraintWidget.m7071I();
            constraintWidget.f21916h0 = 0.5f;
            constraintWidget.f21914g0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.f21866a;
            constraintWidget.m7089i(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f21868c;
            constraintWidget.m7089i(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f21867b;
            constraintWidget.m7089i(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f21869d;
            constraintWidget.m7089i(type4, this, type4, 0);
        }
    }
}
