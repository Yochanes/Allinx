package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicWidthNode;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class IntrinsicWidthElement extends ModifierNodeElement<IntrinsicWidthNode> {

    /* JADX INFO: renamed from: a */
    public final IntrinsicSize f6475a;

    /* JADX INFO: renamed from: b */
    public final Function1 f6476b;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize, Function1 function1) {
        this.f6475a = intrinsicSize;
        this.f6476b = function1;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        IntrinsicWidthNode intrinsicWidthNode = new IntrinsicWidthNode();
        intrinsicWidthNode.f6477t = this.f6475a;
        intrinsicWidthNode.f6478u = true;
        return intrinsicWidthNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        IntrinsicWidthNode intrinsicWidthNode = (IntrinsicWidthNode) node;
        intrinsicWidthNode.f6477t = this.f6475a;
        intrinsicWidthNode.f6478u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f6475a == intrinsicWidthElement.f6475a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f6475a.hashCode() * 31);
    }
}
