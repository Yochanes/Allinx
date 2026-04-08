package androidx.constraintlayout.compose;

import androidx.compose.p013ui.layout.ParentDataModifier;
import androidx.compose.p013ui.platform.InspectorValueInfo;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutTag;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/constraintlayout/compose/ConstraintLayoutTagParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ConstraintLayoutTag extends InspectorValueInfo implements ParentDataModifier, ConstraintLayoutTagParentData {
    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    /* JADX INFO: renamed from: a */
    public final String mo6755a() {
        return null;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    /* JADX INFO: renamed from: b */
    public final String mo6756b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConstraintLayoutTag ? (ConstraintLayoutTag) obj : null) != null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ConstraintLayoutTag(id=null)";
    }

    @Override // androidx.compose.p013ui.layout.ParentDataModifier
    /* JADX INFO: renamed from: x */
    public final Object mo2158x(Density density, Object obj) {
        return this;
    }
}
