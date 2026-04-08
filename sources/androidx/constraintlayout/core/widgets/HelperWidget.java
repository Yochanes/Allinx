package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class HelperWidget extends ConstraintWidget implements Helper {

    /* JADX INFO: renamed from: v0 */
    public ConstraintWidget[] f22026v0 = new ConstraintWidget[4];

    /* JADX INFO: renamed from: w0 */
    public int f22027w0 = 0;

    /* JADX INFO: renamed from: Z */
    public final void m7123Z(int i, WidgetGroup widgetGroup, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f22027w0; i2++) {
            ConstraintWidget constraintWidget = this.f22026v0[i2];
            ArrayList arrayList2 = widgetGroup.f22095a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i3 = 0; i3 < this.f22027w0; i3++) {
            Grouping.m7158a(this.f22026v0[i3], i, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    /* JADX INFO: renamed from: a */
    public final void mo7120a() {
        this.f22027w0 = 0;
        Arrays.fill(this.f22026v0, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    /* JADX INFO: renamed from: b */
    public final void mo7121b(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.f22027w0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f22026v0;
        if (i > constraintWidgetArr.length) {
            this.f22026v0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f22026v0;
        int i2 = this.f22027w0;
        constraintWidgetArr2[i2] = constraintWidget;
        this.f22027w0 = i2 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: k */
    public void mo7047k(ConstraintWidget constraintWidget, HashMap map) {
        super.mo7047k(constraintWidget, map);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.f22027w0 = 0;
        int i = helperWidget.f22027w0;
        for (int i2 = 0; i2 < i; i2++) {
            mo7121b((ConstraintWidget) map.get(helperWidget.f22026v0[i2]));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    /* JADX INFO: renamed from: c */
    public void mo7122c() {
    }
}
