package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.unit.Constraints;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class IntrinsicHeightNode extends IntrinsicSizeModifier {

    /* JADX INFO: renamed from: t */
    public IntrinsicSize f6468t;

    /* JADX INFO: renamed from: u */
    public boolean f6469u;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* JADX INFO: renamed from: X1 */
    public final long mo2779X1(Measurable measurable, long j) {
        int iMo5612p0 = this.f6468t == IntrinsicSize.f6470a ? measurable.mo5612p0(Constraints.m6617h(j)) : measurable.mo5614y(Constraints.m6617h(j));
        if (iMo5612p0 < 0) {
            iMo5612p0 = 0;
        }
        return Constraints.Companion.m6625d(iMo5612p0);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final boolean getF6469u() {
        return this.f6469u;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.f6468t == IntrinsicSize.f6470a ? intrinsicMeasurable.mo5612p0(i) : intrinsicMeasurable.mo5614y(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.f6468t == IntrinsicSize.f6470a ? intrinsicMeasurable.mo5612p0(i) : intrinsicMeasurable.mo5614y(i);
    }
}
