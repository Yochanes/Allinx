package androidx.compose.p013ui.input.key;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/key/KeyInputNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {

    /* JADX INFO: renamed from: a */
    public final Function1 f18209a;

    /* JADX INFO: renamed from: b */
    public final Function1 f18210b;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.f18209a = function1;
        this.f18210b = function12;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        KeyInputNode keyInputNode = new KeyInputNode();
        keyInputNode.f18211t = this.f18209a;
        keyInputNode.f18212u = this.f18210b;
        return keyInputNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        KeyInputNode keyInputNode = (KeyInputNode) node;
        keyInputNode.f18211t = this.f18209a;
        keyInputNode.f18212u = this.f18210b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f18209a == keyInputElement.f18209a && this.f18210b == keyInputElement.f18210b;
    }

    public final int hashCode() {
        Function1 function1 = this.f18209a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f18210b;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }
}
