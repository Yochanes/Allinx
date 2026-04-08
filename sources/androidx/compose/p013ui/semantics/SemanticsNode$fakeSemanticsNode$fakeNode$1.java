package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"androidx/compose/ui/semantics/SemanticsNode$fakeSemanticsNode$fakeNode$1", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Lambda f19779t;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsNode$fakeSemanticsNode$fakeNode$1(Function1 function1) {
        this.f19779t = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: t1 */
    public final void mo2410t1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.f19779t.invoke(semanticsPropertyReceiver);
    }
}
