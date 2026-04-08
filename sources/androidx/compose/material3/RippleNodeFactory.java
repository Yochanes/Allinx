package androidx.compose.material3;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/RippleNodeFactory;", "Landroidx/compose/foundation/IndicationNodeFactory;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class RippleNodeFactory implements IndicationNodeFactory {

    /* JADX INFO: renamed from: a */
    public final boolean f14232a;

    /* JADX INFO: renamed from: b */
    public final float f14233b;

    /* JADX INFO: renamed from: c */
    public final long f14234c;

    public RippleNodeFactory(boolean z2, float f, long j) {
        this.f14232a = z2;
        this.f14233b = f;
        this.f14234c = j;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    /* JADX INFO: renamed from: b */
    public final DelegatableNode mo2446b(InteractionSource interactionSource) {
        RippleNodeFactory$create$colorProducer$1 rippleNodeFactory$create$colorProducer$1 = new RippleNodeFactory$create$colorProducer$1(this);
        return new DelegatingThemeAwareRippleNode(interactionSource, this.f14232a, this.f14233b, rippleNodeFactory$create$colorProducer$1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.f14232a == rippleNodeFactory.f14232a && C1338Dp.m6641a(this.f14233b, rippleNodeFactory.f14233b)) {
            return Color.m5181c(this.f14234c, rippleNodeFactory.f14234c);
        }
        return false;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final int hashCode() {
        int iM2226a = AbstractC0455a.m2226a(Boolean.hashCode(this.f14232a) * 31, this.f14233b, 961);
        int i = Color.f17584l;
        return Long.hashCode(this.f14234c) + iM2226a;
    }
}
