package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/FocusableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/FocusableNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FocusableElement extends ModifierNodeElement<FocusableNode> {

    /* JADX INFO: renamed from: a */
    public final MutableInteractionSource f4977a;

    public FocusableElement(MutableInteractionSource mutableInteractionSource) {
        this.f4977a = mutableInteractionSource;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        return new FocusableNode(this.f4977a, 1, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((FocusableNode) node).m2470c2(this.f4977a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return Intrinsics.m18594b(this.f4977a, ((FocusableElement) obj).f4977a);
        }
        return false;
    }

    public final int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f4977a;
        if (mutableInteractionSource != null) {
            return mutableInteractionSource.hashCode();
        }
        return 0;
    }
}
