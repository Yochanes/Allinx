package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/selection/SelectableNode;", "Landroidx/compose/foundation/ClickableNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SelectableNode extends ClickableNode {

    /* JADX INFO: renamed from: M */
    public boolean f7951M;

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: a2 */
    public final void mo2401a2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6305q(semanticsPropertyReceiver, this.f7951M);
    }
}
