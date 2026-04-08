package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class VirtualLayout extends HelperWidget {

    /* JADX INFO: renamed from: x0 */
    public int f22037x0 = 0;

    /* JADX INFO: renamed from: y0 */
    public int f22038y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public int f22039z0 = 0;

    /* JADX INFO: renamed from: A0 */
    public int f22029A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f22030B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public int f22031C0 = 0;

    /* JADX INFO: renamed from: D0 */
    public boolean f22032D0 = false;

    /* JADX INFO: renamed from: E0 */
    public int f22033E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public int f22034F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public final BasicMeasure.Measure f22035G0 = new BasicMeasure.Measure();

    /* JADX INFO: renamed from: H0 */
    public BasicMeasure.Measurer f22036H0 = null;

    /* JADX INFO: renamed from: b0 */
    public final void m7126b0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        BasicMeasure.Measurer measurer;
        ConstraintWidget constraintWidget2;
        while (true) {
            measurer = this.f22036H0;
            if (measurer != null || (constraintWidget2 = this.f21897W) == null) {
                break;
            } else {
                this.f22036H0 = ((ConstraintWidgetContainer) constraintWidget2).f21975z0;
            }
        }
        BasicMeasure.Measure measure = this.f22035G0;
        measure.f22044a = dimensionBehaviour;
        measure.f22045b = dimensionBehaviour2;
        measure.f22046c = i;
        measure.f22047d = i2;
        measurer.mo6772b(constraintWidget, measure);
        constraintWidget.m7083W(measure.f22048e);
        constraintWidget.m7078R(measure.f22049f);
        constraintWidget.f21880F = measure.f22051h;
        constraintWidget.m7074N(measure.f22050g);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    /* JADX INFO: renamed from: c */
    public final void mo7122c() {
        for (int i = 0; i < this.f22027w0; i++) {
            ConstraintWidget constraintWidget = this.f22026v0[i];
            if (constraintWidget != null) {
                constraintWidget.f21882H = true;
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void mo7031a0(int i, int i2, int i3, int i4) {
    }
}
