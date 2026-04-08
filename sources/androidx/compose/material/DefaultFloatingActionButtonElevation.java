package androidx.compose.material;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/DefaultFloatingActionButtonElevation;", "Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultFloatingActionButtonElevation)) {
            return false;
        }
        ((DefaultFloatingActionButtonElevation) obj).getClass();
        if (C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f)) {
            return C1338Dp.m6641a(0.0f, 0.0f);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
    }
}
