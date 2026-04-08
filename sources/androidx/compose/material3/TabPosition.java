package androidx.compose.material3;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/TabPosition;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TabPosition {

    /* JADX INFO: renamed from: a */
    public final float f14794a;

    /* JADX INFO: renamed from: b */
    public final float f14795b;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final float contentWidth;

    public TabPosition(float f, float f2, float f3) {
        this.f14794a = f;
        this.f14795b = f2;
        this.contentWidth = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return C1338Dp.m6641a(this.f14794a, tabPosition.f14794a) && C1338Dp.m6641a(this.f14795b, tabPosition.f14795b) && C1338Dp.m6641a(this.contentWidth, tabPosition.contentWidth);
    }

    public final int hashCode() {
        return Float.hashCode(this.contentWidth) + AbstractC0455a.m2226a(Float.hashCode(this.f14794a) * 31, this.f14795b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.f14794a;
        AbstractC0455a.m2248w(f, ", right=", sb);
        float f2 = this.f14795b;
        sb.append((Object) C1338Dp.m6642b(f + f2));
        sb.append(", width=");
        sb.append((Object) C1338Dp.m6642b(f2));
        sb.append(", contentWidth=");
        sb.append((Object) C1338Dp.m6642b(this.contentWidth));
        sb.append(')');
        return sb.toString();
    }
}
