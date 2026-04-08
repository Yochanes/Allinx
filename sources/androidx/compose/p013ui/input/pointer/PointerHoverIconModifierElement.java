package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {

    /* JADX INFO: renamed from: a */
    public final AndroidPointerIconType f18292a;

    public PointerHoverIconModifierElement(AndroidPointerIconType androidPointerIconType) {
        this.f18292a = androidPointerIconType;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        return new PointerHoverIconModifierNode(this.f18292a, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) node;
        AndroidPointerIconType androidPointerIconType = this.f18292a;
        if (Intrinsics.m18594b(pointerHoverIconModifierNode.f18259u, androidPointerIconType)) {
            return;
        }
        pointerHoverIconModifierNode.f18259u = androidPointerIconType;
        if (pointerHoverIconModifierNode.f18260v) {
            pointerHoverIconModifierNode.m5538Z1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerHoverIconModifierElement) {
            return this.f18292a.equals(((PointerHoverIconModifierElement) obj).f18292a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f18292a.getF18243b() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f18292a + ", overrideDescendants=false)";
    }
}
