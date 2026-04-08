package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class WidgetContainer extends ConstraintWidget {

    /* JADX INFO: renamed from: v0 */
    public ArrayList f22040v0;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: H */
    public void mo7070H() {
        this.f22040v0.clear();
        super.mo7070H();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: K */
    public final void mo7073K(Cache cache) {
        super.mo7073K(cache);
        int size = this.f22040v0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.f22040v0.get(i)).mo7073K(cache);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void mo7105Z() {
        ArrayList arrayList = this.f22040v0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f22040v0.get(i);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).mo7105Z();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7127b(ConstraintWidget constraintWidget) {
        this.f22040v0.add(constraintWidget);
        ConstraintWidget constraintWidget2 = constraintWidget.f21897W;
        if (constraintWidget2 != null) {
            ((WidgetContainer) constraintWidget2).f22040v0.remove(constraintWidget);
            constraintWidget.mo7070H();
        }
        constraintWidget.f21897W = this;
    }
}
