package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;Landroidx/compose/ui/unit/Constraints;)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface MeasurePolicy {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.f18457b, IntrinsicWidthHeight.f18461b));
        }
        return mo21912measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getF18464a()), arrayList, ConstraintsKt.m6628b(i, 0, 13)).getF18538b();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.f18457b, IntrinsicWidthHeight.f18460a));
        }
        return mo21912measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getF18464a()), arrayList, ConstraintsKt.m6628b(0, i, 7)).getF18537a();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo21912measure3p2s80s(MeasureScope measureScope, List list, long j);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.f18456a, IntrinsicWidthHeight.f18461b));
        }
        return mo21912measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getF18464a()), arrayList, ConstraintsKt.m6628b(i, 0, 13)).getF18538b();
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.f18456a, IntrinsicWidthHeight.f18460a));
        }
        return mo21912measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getF18464a()), arrayList, ConstraintsKt.m6628b(0, i, 7)).getF18537a();
    }
}
