package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Grouping {
    /* JADX INFO: renamed from: a */
    public static WidgetGroup m7158a(ConstraintWidget constraintWidget, int i, ArrayList arrayList, WidgetGroup widgetGroup) {
        int i2;
        int i3 = i == 0 ? constraintWidget.f21940t0 : constraintWidget.f21942u0;
        if (i3 != -1 && (widgetGroup == null || i3 != widgetGroup.f22096b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = (WidgetGroup) arrayList.get(i4);
                if (widgetGroup2.f22096b == i3) {
                    if (widgetGroup != null) {
                        widgetGroup.m7169c(i, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if (constraintWidget instanceof HelperWidget) {
                HelperWidget helperWidget = (HelperWidget) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= helperWidget.f22027w0) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = helperWidget.f22026v0[i5];
                    if ((i == 0 && (i2 = constraintWidget2.f21940t0) != -1) || (i == 1 && (i2 = constraintWidget2.f21942u0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        WidgetGroup widgetGroup3 = (WidgetGroup) arrayList.get(i6);
                        if (widgetGroup3.f22096b == i2) {
                            widgetGroup = widgetGroup3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup();
                widgetGroup.f22095a = new ArrayList();
                widgetGroup.f22098d = null;
                widgetGroup.f22099e = -1;
                int i7 = WidgetGroup.f22094f;
                WidgetGroup.f22094f = i7 + 1;
                widgetGroup.f22096b = i7;
                widgetGroup.f22097c = i;
            }
            arrayList.add(widgetGroup);
        }
        ArrayList arrayList2 = widgetGroup.f22095a;
        if (arrayList2.contains(constraintWidget)) {
            return widgetGroup;
        }
        arrayList2.add(constraintWidget);
        if (constraintWidget instanceof Guideline) {
            Guideline guideline = (Guideline) constraintWidget;
            guideline.f22023y0.m7051c(guideline.f22024z0 == 0 ? 1 : 0, widgetGroup, arrayList);
        }
        int i8 = widgetGroup.f22096b;
        if (i == 0) {
            constraintWidget.f21940t0 = i8;
            constraintWidget.f21885K.m7051c(i, widgetGroup, arrayList);
            constraintWidget.f21887M.m7051c(i, widgetGroup, arrayList);
        } else {
            constraintWidget.f21942u0 = i8;
            constraintWidget.f21886L.m7051c(i, widgetGroup, arrayList);
            constraintWidget.f21889O.m7051c(i, widgetGroup, arrayList);
            constraintWidget.f21888N.m7051c(i, widgetGroup, arrayList);
        }
        constraintWidget.f21892R.m7051c(i, widgetGroup, arrayList);
        return widgetGroup;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7159b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f21949a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f21952d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f21950b;
        return (dimensionBehaviour3 == dimensionBehaviour5 || dimensionBehaviour3 == dimensionBehaviour7 || (dimensionBehaviour3 == dimensionBehaviour6 && dimensionBehaviour != dimensionBehaviour7)) || (dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviour4 == dimensionBehaviour7 || (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour2 != dimensionBehaviour7));
    }
}
