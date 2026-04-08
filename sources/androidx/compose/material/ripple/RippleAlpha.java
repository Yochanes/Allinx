package androidx.compose.material.ripple;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ripple/RippleAlpha;", "", "material-ripple_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class RippleAlpha {

    /* JADX INFO: renamed from: a */
    public final float f11855a;

    /* JADX INFO: renamed from: b */
    public final float f11856b;

    /* JADX INFO: renamed from: c */
    public final float f11857c;

    /* JADX INFO: renamed from: d */
    public final float f11858d;

    public RippleAlpha(float f, float f2, float f3, float f4) {
        this.f11855a = f;
        this.f11856b = f2;
        this.f11857c = f3;
        this.f11858d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        return this.f11855a == rippleAlpha.f11855a && this.f11856b == rippleAlpha.f11856b && this.f11857c == rippleAlpha.f11857c && this.f11858d == rippleAlpha.f11858d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11858d) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f11855a) * 31, this.f11856b, 31), this.f11857c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f11855a);
        sb.append(", focusedAlpha=");
        sb.append(this.f11856b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f11857c);
        sb.append(", pressedAlpha=");
        return AbstractC0000a.m16m(sb, this.f11858d, ')');
    }
}
