package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/ApproachLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {
    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        return new ApproachLayoutModifierNodeImpl();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final void mo2160b(Modifier.Node node) {
        ((ApproachLayoutModifierNodeImpl) node).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ((ApproachLayoutElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ApproachLayoutElement(approachMeasure=null, isMeasurementApproachInProgress=null, isPlacementApproachInProgress=null)";
    }
}
