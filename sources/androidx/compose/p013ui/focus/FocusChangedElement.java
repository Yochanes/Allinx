package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusChangedNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {

    /* JADX INFO: renamed from: a */
    public final Function1 f17434a;

    public FocusChangedElement(Function1 function1) {
        this.f17434a = function1;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        FocusChangedNode focusChangedNode = new FocusChangedNode();
        focusChangedNode.f17435t = this.f17434a;
        return focusChangedNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((FocusChangedNode) node).f17435t = this.f17434a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.m18594b(this.f17434a, ((FocusChangedElement) obj).f17434a);
    }

    public final int hashCode() {
        return this.f17434a.hashCode();
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f17434a + ')';
    }
}
