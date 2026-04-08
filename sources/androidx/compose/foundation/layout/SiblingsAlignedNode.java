package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ParentDataModifierNode;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "WithAlignmentLineBlockNode", "WithAlignmentLineNode", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        @Override // androidx.compose.p013ui.node.ParentDataModifierNode
        /* JADX INFO: renamed from: x */
        public final Object mo2738x(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData();
            }
            rowColumnParentData.f6544c = new CrossAxisAlignment.AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Block());
            return rowColumnParentData;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        @Override // androidx.compose.p013ui.node.ParentDataModifierNode
        /* JADX INFO: renamed from: x */
        public final Object mo2738x(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData();
            }
            rowColumnParentData.f6544c = new CrossAxisAlignment.AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Value());
            return rowColumnParentData;
        }
    }
}
