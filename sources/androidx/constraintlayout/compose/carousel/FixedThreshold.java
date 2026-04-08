package androidx.constraintlayout.compose.carousel;

import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/carousel/FixedThreshold;", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class FixedThreshold implements ThresholdConfig {

    /* JADX INFO: renamed from: a */
    public final float f21122a;

    public FixedThreshold(float f) {
        this.f21122a = f;
    }

    @Override // androidx.constraintlayout.compose.carousel.ThresholdConfig
    /* JADX INFO: renamed from: a */
    public final float mo6797a(Density density, float f, float f2) {
        return (Math.signum(f2 - f) * density.mo2551X0(this.f21122a)) + f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && C1338Dp.m6641a(this.f21122a, ((FixedThreshold) obj).f21122a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f21122a);
    }

    public final String toString() {
        return "FixedThreshold(offset=" + ((Object) C1338Dp.m6642b(this.f21122a)) + ')';
    }
}
