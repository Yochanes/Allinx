package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/LayoutWeightNode;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutWeightElement extends ModifierNodeElement<LayoutWeightNode> {

    /* JADX INFO: renamed from: a */
    public final float f6483a;

    /* JADX INFO: renamed from: b */
    public final boolean f6484b;

    public LayoutWeightElement(float f, boolean z2) {
        this.f6483a = f;
        this.f6484b = z2;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        LayoutWeightNode layoutWeightNode = new LayoutWeightNode();
        layoutWeightNode.f6485t = this.f6483a;
        layoutWeightNode.f6486u = this.f6484b;
        return layoutWeightNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        LayoutWeightNode layoutWeightNode = (LayoutWeightNode) node;
        layoutWeightNode.f6485t = this.f6483a;
        layoutWeightNode.f6486u = this.f6484b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f6483a == layoutWeightElement.f6483a && this.f6484b == layoutWeightElement.f6484b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6484b) + (Float.hashCode(this.f6483a) * 31);
    }
}
