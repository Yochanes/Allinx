package androidx.compose.foundation.shape;

import androidx.compose.p013ui.platform.InspectableValue;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/shape/DpCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final /* data */ class DpCornerSize implements CornerSize, InspectableValue {

    /* JADX INFO: renamed from: a */
    public final float f7985a;

    public DpCornerSize(float f) {
        this.f7985a = f;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* JADX INFO: renamed from: a */
    public final float mo3188a(long j, Density density) {
        return density.mo2551X0(this.f7985a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && C1338Dp.m6641a(this.f7985a, ((DpCornerSize) obj).f7985a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7985a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7985a + ".dp)";
    }
}
