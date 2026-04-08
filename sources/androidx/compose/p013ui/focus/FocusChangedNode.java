package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusChangedNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {

    /* JADX INFO: renamed from: t */
    public Function1 f17435t;

    /* JADX INFO: renamed from: u */
    public FocusStateImpl f17436u;

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    /* JADX INFO: renamed from: A */
    public final void mo2488A(FocusStateImpl focusStateImpl) {
        if (Intrinsics.m18594b(this.f17436u, focusStateImpl)) {
            return;
        }
        this.f17436u = focusStateImpl;
        this.f17435t.invoke(focusStateImpl);
    }
}
