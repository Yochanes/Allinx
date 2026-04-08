package androidx.compose.foundation;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BorderStroke {

    /* JADX INFO: renamed from: a */
    public final float f4899a;

    /* JADX INFO: renamed from: b */
    public final SolidColor f4900b;

    public BorderStroke(float f, SolidColor solidColor) {
        this.f4899a = f;
        this.f4900b = solidColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return C1338Dp.m6641a(this.f4899a, borderStroke.f4899a) && this.f4900b.equals(borderStroke.f4900b);
    }

    public final int hashCode() {
        return this.f4900b.hashCode() + (Float.hashCode(this.f4899a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        AbstractC0455a.m2248w(this.f4899a, ", brush=", sb);
        sb.append(this.f4900b);
        sb.append(')');
        return sb.toString();
    }
}
