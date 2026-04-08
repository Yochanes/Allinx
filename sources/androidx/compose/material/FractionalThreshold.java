package androidx.compose.material;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Immutable;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/FractionalThreshold;", "Landroidx/compose/material/ThresholdConfig;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Deprecated
@Immutable
@ExperimentalMaterialApi
public final /* data */ class FractionalThreshold implements ThresholdConfig {
    @Override // androidx.compose.material.ThresholdConfig
    /* JADX INFO: renamed from: a */
    public final float mo3749a(Density density, float f, float f2) {
        return MathHelpersKt.m6699b(f, f2, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FractionalThreshold)) {
            return false;
        }
        ((FractionalThreshold) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f);
    }

    public final String toString() {
        return "FractionalThreshold(fraction=0.0)";
    }
}
