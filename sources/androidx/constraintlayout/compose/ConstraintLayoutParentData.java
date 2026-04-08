package androidx.constraintlayout.compose;

import androidx.compose.p013ui.layout.LayoutIdParentData;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ConstraintLayoutParentData implements LayoutIdParentData {

    /* JADX INFO: renamed from: a */
    public final ConstrainedLayoutReference f20880a;

    /* JADX INFO: renamed from: b */
    public final Function1 f20881b;

    /* JADX INFO: renamed from: c */
    public final Object f20882c;

    public ConstraintLayoutParentData(ConstrainedLayoutReference constrainedLayoutReference, Function1 function1) {
        this.f20880a = constrainedLayoutReference;
        this.f20881b = function1;
        this.f20882c = constrainedLayoutReference.f20867b;
    }

    @Override // androidx.compose.p013ui.layout.LayoutIdParentData
    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Object getF20882c() {
        return this.f20882c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConstraintLayoutParentData)) {
            return false;
        }
        ConstraintLayoutParentData constraintLayoutParentData = (ConstraintLayoutParentData) obj;
        return Intrinsics.m18594b(this.f20880a.f20867b, constraintLayoutParentData.f20880a.f20867b) && this.f20881b == constraintLayoutParentData.f20881b;
    }

    public final int hashCode() {
        return this.f20881b.hashCode() + (this.f20880a.f20867b.hashCode() * 31);
    }
}
