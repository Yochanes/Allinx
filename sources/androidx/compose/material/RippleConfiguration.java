package androidx.compose.material;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/RippleConfiguration;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class RippleConfiguration {

    /* JADX INFO: renamed from: a */
    public final long f10888a;

    /* JADX INFO: renamed from: b */
    public final RippleAlpha f10889b;

    public RippleConfiguration(long j, RippleAlpha rippleAlpha) {
        this.f10888a = j;
        this.f10889b = rippleAlpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m5181c(this.f10888a, rippleConfiguration.f10888a) && Intrinsics.m18594b(this.f10889b, rippleConfiguration.f10889b);
    }

    public final int hashCode() {
        int i = Color.f17584l;
        int iHashCode = Long.hashCode(this.f10888a) * 31;
        RippleAlpha rippleAlpha = this.f10889b;
        return iHashCode + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        AbstractC0455a.m2223B(this.f10888a, ", rippleAlpha=", sb);
        sb.append(this.f10889b);
        sb.append(')');
        return sb.toString();
    }
}
