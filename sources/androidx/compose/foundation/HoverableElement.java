package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/HoverableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/HoverableNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class HoverableElement extends ModifierNodeElement<HoverableNode> {

    /* JADX INFO: renamed from: a */
    public final MutableInteractionSource f5005a;

    public HoverableElement(MutableInteractionSource mutableInteractionSource) {
        this.f5005a = mutableInteractionSource;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        HoverableNode hoverableNode = new HoverableNode();
        hoverableNode.f5006t = this.f5005a;
        return hoverableNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        HoverableNode hoverableNode = (HoverableNode) node;
        MutableInteractionSource mutableInteractionSource = hoverableNode.f5006t;
        MutableInteractionSource mutableInteractionSource2 = this.f5005a;
        if (Intrinsics.m18594b(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        hoverableNode.m2476Z1();
        hoverableNode.f5006t = mutableInteractionSource2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.m18594b(((HoverableElement) obj).f5005a, this.f5005a);
    }

    public final int hashCode() {
        return this.f5005a.hashCode() * 31;
    }
}
