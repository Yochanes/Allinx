package androidx.compose.foundation.layout;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class RowColumnParentData {

    /* JADX INFO: renamed from: a */
    public float f6542a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f6543b = true;

    /* JADX INFO: renamed from: c */
    public CrossAxisAlignment f6544c = null;

    /* JADX INFO: renamed from: d */
    public FlowLayoutData f6545d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.f6542a, rowColumnParentData.f6542a) == 0 && this.f6543b == rowColumnParentData.f6543b && Intrinsics.m18594b(this.f6544c, rowColumnParentData.f6544c) && Intrinsics.m18594b(this.f6545d, rowColumnParentData.f6545d);
    }

    public final int hashCode() {
        int iM2230e = AbstractC0455a.m2230e(Float.hashCode(this.f6542a) * 31, 31, this.f6543b);
        CrossAxisAlignment crossAxisAlignment = this.f6544c;
        return ((iM2230e + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31) + (this.f6545d != null ? Float.hashCode(0.0f) : 0);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f6542a + ", fill=" + this.f6543b + ", crossAxisAlignment=" + this.f6544c + ", flowLayoutData=" + this.f6545d + ')';
    }
}
