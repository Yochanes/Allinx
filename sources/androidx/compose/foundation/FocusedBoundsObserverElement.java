package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FocusedBoundsObserverElement extends ModifierNodeElement<FocusedBoundsObserverNode> {
    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        return new FocusedBoundsObserverNode(null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((FocusedBoundsObserverNode) node).f4998t = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null) != null;
    }

    public final int hashCode() {
        throw null;
    }
}
