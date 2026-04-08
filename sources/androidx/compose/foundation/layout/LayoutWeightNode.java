package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ParentDataModifierNode;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/LayoutWeightNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {

    /* JADX INFO: renamed from: t */
    public float f6485t;

    /* JADX INFO: renamed from: u */
    public boolean f6486u;

    @Override // androidx.compose.p013ui.node.ParentDataModifierNode
    /* JADX INFO: renamed from: x */
    public final Object mo2738x(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData();
        }
        rowColumnParentData.f6542a = this.f6485t;
        rowColumnParentData.f6543b = this.f6486u;
        return rowColumnParentData;
    }
}
