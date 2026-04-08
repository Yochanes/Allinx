package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/TailModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TailModifierNode extends Modifier.Node {

    /* JADX INFO: renamed from: t */
    public boolean f19013t;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: P1 */
    public final void mo2174P1() {
        this.f19013t = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        this.f19013t = false;
    }

    public final String toString() {
        return "<tail>";
    }
}
