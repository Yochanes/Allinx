package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.p013ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SideCalculator$Companion$LeftSideCalculator$1 implements SideCalculator {
    @Override // androidx.compose.foundation.layout.SideCalculator
    /* JADX INFO: renamed from: b */
    public final int mo2807b(Insets insets) {
        return AbstractC0020a.m47a(insets);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    /* JADX INFO: renamed from: d */
    public final long mo2809d(float f, long j) {
        return VelocityKt.m6691a(Velocity.m6685b(j) - f, 0.0f);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    /* JADX INFO: renamed from: f */
    public final long mo2811f(long j) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    /* JADX INFO: renamed from: g */
    public final Insets mo2812g(Insets insets, int i) {
        return AbstractC0605a.m2871b(i, AbstractC0020a.m59m(insets), AbstractC0020a.m66t(insets), AbstractC0020a.m69w(insets));
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    /* JADX INFO: renamed from: e */
    public final float mo2810e(float f, float f2) {
        return f;
    }
}
