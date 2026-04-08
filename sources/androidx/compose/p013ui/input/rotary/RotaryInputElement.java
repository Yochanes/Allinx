package androidx.compose.p013ui.input.rotary;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/rotary/RotaryInputNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {

    /* JADX INFO: renamed from: a */
    public final Function1 f18414a;

    public RotaryInputElement(Function1 function1) {
        this.f18414a = function1;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        RotaryInputNode rotaryInputNode = new RotaryInputNode();
        rotaryInputNode.f18415t = this.f18414a;
        return rotaryInputNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((RotaryInputNode) node).f18415t = this.f18414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return this.f18414a.equals(((RotaryInputElement) obj).f18414a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18414a.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f18414a + ", onPreRotaryScrollEvent=null)";
    }
}
