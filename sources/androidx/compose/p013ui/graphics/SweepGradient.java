package androidx.compose.p013ui.graphics;

import android.graphics.Shader;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SweepGradient extends ShaderBrush {
    @Override // androidx.compose.p013ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: b */
    public final Shader mo5175b(long j) {
        int i = (int) 0;
        float fIntBitsToFloat = Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(i);
        Float.floatToRawIntBits(fIntBitsToFloat);
        Float.floatToRawIntBits(fIntBitsToFloat2);
        AndroidShader_androidKt.m5167d(null, null);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        sweepGradient.getClass();
        if (!Offset.m5053c(0L, 0L)) {
            return false;
        }
        sweepGradient.getClass();
        sweepGradient.getClass();
        return true;
    }

    public final int hashCode() {
        Long.hashCode(0L);
        throw null;
    }

    public final String toString() {
        return AbstractC0000a.m3D("SweepGradient(", "center=" + ((Object) Offset.m5060j(0L)) + ", ", "colors=null, stops=null)");
    }
}
