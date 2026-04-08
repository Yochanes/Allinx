package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ParentDataModifierNode;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/layout/LayoutIdModifier;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {

    /* JADX INFO: renamed from: t */
    public Object f18471t;

    @Override // androidx.compose.p013ui.layout.LayoutIdParentData
    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Object getF18471t() {
        return this.f18471t;
    }

    @Override // androidx.compose.p013ui.node.ParentDataModifierNode
    /* JADX INFO: renamed from: x */
    public final Object mo2738x(Density density, Object obj) {
        return this;
    }
}
