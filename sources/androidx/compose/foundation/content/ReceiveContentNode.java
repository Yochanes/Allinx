package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import androidx.compose.p013ui.modifier.ModifierLocalMap;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p013ui.modifier.SingleLocalMap;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ReceiveContentNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: v */
    public final SingleLocalMap f5194v;

    /* JADX INFO: renamed from: androidx.compose.foundation.content.ReceiveContentNode$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C04951 extends Lambda implements Function1<DragAndDropEvent, Unit> {
        public C04951() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            DragAndDropRequestPermission_androidKt.m2522a(ReceiveContentNode.this, (DragAndDropEvent) obj);
            return Unit.f51459a;
        }
    }

    public ReceiveContentNode() {
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = new DynamicReceiveContentConfiguration(this);
        this.f5194v = ModifierLocalModifierNodeKt.m5699a(new Pair(ReceiveContentConfigurationKt.f5200a, dynamicReceiveContentConfiguration));
        m5746X1(ReceiveContentDragAndDropNode_androidKt.m2528a(dynamicReceiveContentConfiguration, new C04951()));
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalModifierNode
    /* JADX INFO: renamed from: P0 */
    public final ModifierLocalMap mo2210P0() {
        return this.f5194v;
    }
}
