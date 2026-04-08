package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutIdModifier;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {

    /* JADX INFO: renamed from: a */
    public final Object f18470a;

    public LayoutIdElement(Object obj) {
        this.f18470a = obj;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        LayoutIdModifier layoutIdModifier = new LayoutIdModifier();
        layoutIdModifier.f18471t = this.f18470a;
        return layoutIdModifier;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((LayoutIdModifier) node).f18471t = this.f18470a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.m18594b(this.f18470a, ((LayoutIdElement) obj).f18470a);
    }

    public final int hashCode() {
        return this.f18470a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f18470a + ')';
    }
}
