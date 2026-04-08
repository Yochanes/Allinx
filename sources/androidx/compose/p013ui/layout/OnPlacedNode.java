package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/OnPlacedNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {

    /* JADX INFO: renamed from: t */
    public Function1 f18560t;

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: p */
    public final void mo2548p(LayoutCoordinates layoutCoordinates) {
        this.f18560t.invoke(layoutCoordinates);
    }
}
