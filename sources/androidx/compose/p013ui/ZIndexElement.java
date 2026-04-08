package androidx.compose.p013ui;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/ZIndexElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/ZIndexNode;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class ZIndexElement extends ModifierNodeElement<ZIndexNode> {

    /* JADX INFO: renamed from: a */
    public final float f17205a;

    public ZIndexElement(float f) {
        this.f17205a = f;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        ZIndexNode zIndexNode = new ZIndexNode();
        zIndexNode.f17206t = this.f17205a;
        return zIndexNode;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((ZIndexNode) node).f17206t = this.f17205a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f17205a, ((ZIndexElement) obj).f17205a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17205a);
    }

    public final String toString() {
        return AbstractC0000a.m16m(new StringBuilder("ZIndexElement(zIndex="), this.f17205a, ')');
    }
}
