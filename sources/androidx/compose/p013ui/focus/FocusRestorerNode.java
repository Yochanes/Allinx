package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.PinnableContainer;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusRestorerNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {

    /* JADX INFO: renamed from: t */
    public PinnableContainer.PinnedHandle f17489t;

    /* JADX INFO: renamed from: u */
    public final Function1 f17490u = new FocusRestorerNode$onExit$1(this);

    /* JADX INFO: renamed from: v */
    public final Function1 f17491v = new FocusRestorerNode$onEnter$1(this);

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: Q1 */
    public final void mo2208Q1() {
        PinnableContainer.PinnedHandle pinnedHandle = this.f17489t;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.f17489t = null;
    }

    @Override // androidx.compose.p013ui.focus.FocusPropertiesModifierNode
    /* JADX INFO: renamed from: m0 */
    public final void mo5000m0(FocusProperties focusProperties) {
        focusProperties.mo4999d(this.f17491v);
        focusProperties.mo4997b(this.f17490u);
    }
}
