package androidx.compose.material;

import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Immutable;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/FixedThreshold;", "Landroidx/compose/material/ThresholdConfig;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Deprecated
@Immutable
@ExperimentalMaterialApi
public final /* data */ class FixedThreshold implements ThresholdConfig {

    /* JADX INFO: renamed from: a */
    public final float f10624a;

    public FixedThreshold(float f) {
        this.f10624a = f;
    }

    @Override // androidx.compose.material.ThresholdConfig
    /* JADX INFO: renamed from: a */
    public final float mo3749a(Density density, float f, float f2) {
        return (Math.signum(f2 - f) * density.mo2551X0(this.f10624a)) + f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && C1338Dp.m6641a(this.f10624a, ((FixedThreshold) obj).f10624a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10624a);
    }

    public final String toString() {
        return "FixedThreshold(offset=" + ((Object) C1338Dp.m6642b(this.f10624a)) + ')';
    }
}
