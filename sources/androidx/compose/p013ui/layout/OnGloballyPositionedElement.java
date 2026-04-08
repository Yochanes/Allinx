package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnGloballyPositionedNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class OnGloballyPositionedElement extends ModifierNodeElement<OnGloballyPositionedNode> {

    /* JADX INFO: renamed from: a */
    public final Function1 f18556a;

    public OnGloballyPositionedElement(Function1 function1) {
        this.f18556a = function1;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        OnGloballyPositionedNode onGloballyPositionedNode = new OnGloballyPositionedNode();
        onGloballyPositionedNode.f18557t = this.f18556a;
        return onGloballyPositionedNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((OnGloballyPositionedNode) node).f18557t = this.f18556a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f18556a == ((OnGloballyPositionedElement) obj).f18556a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18556a.hashCode();
    }
}
