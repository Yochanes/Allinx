package androidx.compose.material3.carousel;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/carousel/ShiftPointRange;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* data */ class ShiftPointRange {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftPointRange)) {
            return false;
        }
        ((ShiftPointRange) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + AbstractC0455a.m2228c(0, Integer.hashCode(0) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShiftPointRange(fromStepIndex=");
        sb.append(0);
        sb.append(", toStepIndex=");
        sb.append(0);
        sb.append(", steppedInterpolation=");
        return AbstractC0000a.m16m(sb, 0.0f, ')');
    }
}
