package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {

    /* JADX INFO: renamed from: a */
    public final IntrinsicSize f6466a;

    /* JADX INFO: renamed from: b */
    public final Function1 f6467b;

    public IntrinsicHeightElement(IntrinsicSize intrinsicSize, Function1 function1) {
        this.f6466a = intrinsicSize;
        this.f6467b = function1;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        IntrinsicHeightNode intrinsicHeightNode = new IntrinsicHeightNode();
        intrinsicHeightNode.f6468t = this.f6466a;
        intrinsicHeightNode.f6469u = true;
        return intrinsicHeightNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        IntrinsicHeightNode intrinsicHeightNode = (IntrinsicHeightNode) node;
        intrinsicHeightNode.f6468t = this.f6466a;
        intrinsicHeightNode.f6469u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f6466a == intrinsicHeightElement.f6466a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f6466a.hashCode() * 31);
    }
}
