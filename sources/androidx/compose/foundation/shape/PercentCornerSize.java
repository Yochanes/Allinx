package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.platform.InspectableValue;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/shape/PercentCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class PercentCornerSize implements CornerSize, InspectableValue {

    /* JADX INFO: renamed from: a */
    public final float f7986a;

    public PercentCornerSize(float f) {
        this.f7986a = f;
        if (f < 0.0f || f > 100.0f) {
            InlineClassHelperKt.m2705a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* JADX INFO: renamed from: a */
    public final float mo3188a(long j, Density density) {
        return (this.f7986a / 100.0f) * Size.m5082c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.f7986a, ((PercentCornerSize) obj).f7986a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7986a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7986a + "%)";
    }
}
