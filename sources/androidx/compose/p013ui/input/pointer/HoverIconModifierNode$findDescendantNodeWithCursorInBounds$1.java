package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "it", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 extends Lambda implements Function1<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.f19016a;
        if (((HoverIconModifierNode) obj).f18260v) {
            throw null;
        }
        return traverseDescendantsAction;
    }
}
