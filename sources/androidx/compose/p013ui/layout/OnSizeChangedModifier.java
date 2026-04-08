package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnSizeChangedNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class OnSizeChangedModifier extends ModifierNodeElement<OnSizeChangedNode> {

    /* JADX INFO: renamed from: a */
    public final Function1 f18561a;

    public OnSizeChangedModifier(Function1 function1) {
        this.f18561a = function1;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        OnSizeChangedNode onSizeChangedNode = new OnSizeChangedNode();
        onSizeChangedNode.f18562t = this.f18561a;
        long j = Integer.MIN_VALUE;
        onSizeChangedNode.f18563u = (j & 4294967295L) | (j << 32);
        return onSizeChangedNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        OnSizeChangedNode onSizeChangedNode = (OnSizeChangedNode) node;
        onSizeChangedNode.f18562t = this.f18561a;
        long j = Integer.MIN_VALUE;
        onSizeChangedNode.f18563u = (j & 4294967295L) | (j << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f18561a == ((OnSizeChangedModifier) obj).f18561a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18561a.hashCode();
    }
}
