package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    /* JADX INFO: renamed from: t */
    public boolean f19721t;

    /* JADX INFO: renamed from: u */
    public final boolean f19722u;

    /* JADX INFO: renamed from: v */
    public Function1 f19723v;

    public CoreSemanticsModifierNode(boolean z2, boolean z3, Function1 function1) {
        this.f19721t = z2;
        this.f19722u = z3;
        this.f19723v = function1;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: A1, reason: from getter */
    public final boolean getF19721t() {
        return this.f19721t;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final boolean getF19722u() {
        return this.f19722u;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: t1 */
    public final void mo2410t1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.f19723v.invoke(semanticsPropertyReceiver);
    }
}
