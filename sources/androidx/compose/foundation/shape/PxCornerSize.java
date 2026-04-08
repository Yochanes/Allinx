package androidx.compose.foundation.shape;

import androidx.compose.p013ui.platform.InspectableValue;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/shape/PxCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class PxCornerSize implements CornerSize, InspectableValue {
    @Override // androidx.compose.foundation.shape.CornerSize
    /* JADX INFO: renamed from: a */
    public final float mo3188a(long j, Density density) {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PxCornerSize)) {
            return false;
        }
        ((PxCornerSize) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f);
    }

    public final String toString() {
        return "CornerSize(size = 0.0.px)";
    }
}
