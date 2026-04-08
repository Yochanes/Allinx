package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutModifierImpl;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {

    /* JADX INFO: renamed from: a */
    public final Function3 f18469a;

    public LayoutElement(Function3 function3) {
        this.f18469a = function3;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        LayoutModifierImpl layoutModifierImpl = new LayoutModifierImpl();
        layoutModifierImpl.f18480t = this.f18469a;
        return layoutModifierImpl;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((LayoutModifierImpl) node).f18480t = this.f18469a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && Intrinsics.m18594b(this.f18469a, ((LayoutElement) obj).f18469a);
    }

    public final int hashCode() {
        return this.f18469a.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f18469a + ')';
    }
}
