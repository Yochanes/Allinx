package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class WidgetGroup {

    /* JADX INFO: renamed from: f */
    public static int f22094f;

    /* JADX INFO: renamed from: a */
    public ArrayList f22095a;

    /* JADX INFO: renamed from: b */
    public int f22096b;

    /* JADX INFO: renamed from: c */
    public int f22097c;

    /* JADX INFO: renamed from: d */
    public ArrayList f22098d;

    /* JADX INFO: renamed from: e */
    public int f22099e;

    /* JADX INFO: compiled from: Proguard */
    public static class MeasureResult {
    }

    /* JADX INFO: renamed from: a */
    public final void m7167a(ArrayList arrayList) {
        int size = this.f22095a.size();
        if (this.f22099e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup widgetGroup = (WidgetGroup) arrayList.get(i);
                if (this.f22099e == widgetGroup.f22096b) {
                    m7169c(this.f22097c, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m7168b(LinearSystem linearSystem, int i) {
        int iM6818n;
        int iM6818n2;
        ArrayList arrayList = this.f22095a;
        if (arrayList.size() == 0) {
            return 0;
        }
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) ((ConstraintWidget) arrayList.get(0)).f21897W;
        linearSystem.m6837t();
        constraintWidgetContainer.mo7034f(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConstraintWidget) arrayList.get(i2)).mo7034f(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.f21959F0 > 0) {
            Chain.m7048a(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.f21960G0 > 0) {
            Chain.m7048a(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.m6833p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f22098d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i3);
            MeasureResult measureResult = new MeasureResult();
            new WeakReference(constraintWidget);
            LinearSystem.m6818n(constraintWidget.f21885K);
            LinearSystem.m6818n(constraintWidget.f21886L);
            LinearSystem.m6818n(constraintWidget.f21887M);
            LinearSystem.m6818n(constraintWidget.f21888N);
            LinearSystem.m6818n(constraintWidget.f21889O);
            this.f22098d.add(measureResult);
        }
        if (i == 0) {
            iM6818n = LinearSystem.m6818n(constraintWidgetContainer.f21885K);
            iM6818n2 = LinearSystem.m6818n(constraintWidgetContainer.f21887M);
            linearSystem.m6837t();
        } else {
            iM6818n = LinearSystem.m6818n(constraintWidgetContainer.f21886L);
            iM6818n2 = LinearSystem.m6818n(constraintWidgetContainer.f21888N);
            linearSystem.m6837t();
        }
        return iM6818n2 - iM6818n;
    }

    /* JADX INFO: renamed from: c */
    public final void m7169c(int i, WidgetGroup widgetGroup) {
        for (ConstraintWidget constraintWidget : this.f22095a) {
            ArrayList arrayList = widgetGroup.f22095a;
            if (!arrayList.contains(constraintWidget)) {
                arrayList.add(constraintWidget);
            }
            int i2 = widgetGroup.f22096b;
            if (i == 0) {
                constraintWidget.f21940t0 = i2;
            } else {
                constraintWidget.f21942u0 = i2;
            }
        }
        this.f22099e = widgetGroup.f22096b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f22097c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strM11h = AbstractC0000a.m11h(this.f22096b, "] <", sb);
        for (ConstraintWidget constraintWidget : this.f22095a) {
            StringBuilder sbM21r = AbstractC0000a.m21r(strM11h, " ");
            sbM21r.append(constraintWidget.f21924l0);
            strM11h = sbM21r.toString();
        }
        return AbstractC0000a.m2C(strM11h, " >");
    }
}
