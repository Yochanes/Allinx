package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.unit.Constraints;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthNode;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class IntrinsicWidthNode extends IntrinsicSizeModifier {

    /* JADX INFO: renamed from: t */
    public IntrinsicSize f6477t;

    /* JADX INFO: renamed from: u */
    public boolean f6478u;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* JADX INFO: renamed from: X1 */
    public final long mo2779X1(Measurable measurable, long j) {
        int iMo5609N = this.f6477t == IntrinsicSize.f6470a ? measurable.mo5609N(Constraints.m6616g(j)) : measurable.mo5610O(Constraints.m6616g(j));
        if (iMo5609N < 0) {
            iMo5609N = 0;
        }
        return Constraints.Companion.m6626e(iMo5609N);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final boolean getF6478u() {
        return this.f6478u;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.f6477t == IntrinsicSize.f6470a ? intrinsicMeasurable.mo5609N(i) : intrinsicMeasurable.mo5610O(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.f6477t == IntrinsicSize.f6470a ? intrinsicMeasurable.mo5609N(i) : intrinsicMeasurable.mo5610O(i);
    }
}
