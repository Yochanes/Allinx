package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/OnSizeChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class OnSizeChangedNode extends Modifier.Node implements LayoutAwareModifierNode {

    /* JADX INFO: renamed from: t */
    public Function1 f18562t;

    /* JADX INFO: renamed from: u */
    public long f18563u;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: M1 */
    public final boolean mo2398M1() {
        return true;
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: m */
    public final void mo2547m(long j) {
        if (IntSize.m6665b(this.f18563u, j)) {
            return;
        }
        this.f18562t.invoke(new IntSize(j));
        this.f18563u = j;
    }
}
