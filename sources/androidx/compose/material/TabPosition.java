package androidx.compose.material;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/TabPosition;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TabPosition {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        ((TabPosition) obj).getClass();
        return C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        AbstractC0455a.m2248w(0.0f, ", right=", sb);
        sb.append((Object) C1338Dp.m6642b(0.0f + 0.0f));
        sb.append(", width=");
        sb.append((Object) C1338Dp.m6642b(0.0f));
        sb.append(')');
        return sb.toString();
    }
}
