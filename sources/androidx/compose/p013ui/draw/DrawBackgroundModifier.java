package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.LayoutNodeDrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/draw/DrawBackgroundModifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {

    /* JADX INFO: renamed from: t */
    public Function1 f17398t;

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    /* JADX INFO: renamed from: z */
    public final void mo2209z(LayoutNodeDrawScope layoutNodeDrawScope) {
        this.f17398t.invoke(layoutNodeDrawScope);
        layoutNodeDrawScope.mo5369C1();
    }
}
