package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    /* JADX INFO: renamed from: X1 */
    public abstract long mo2779X1(Measurable measurable, long j);

    /* JADX INFO: renamed from: Y1 */
    public abstract boolean mo2780Y1();

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.mo5614y(i);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.mo5610O(i);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo21913measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long jMo2779X1 = mo2779X1(measurable, j);
        if (mo2780Y1()) {
            jMo2779X1 = ConstraintsKt.m6631e(j, jMo2779X1);
        }
        Placeable placeableMo5611P = measurable.mo5611P(jMo2779X1);
        return measureScope.mo3065n1(placeableMo5611P.f18567a, placeableMo5611P.f18568b, MapsKt.m18481d(), new IntrinsicSizeModifier$measure$1(placeableMo5611P));
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.mo5612p0(i);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.mo5609N(i);
    }
}
