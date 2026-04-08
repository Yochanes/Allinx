package androidx.compose.foundation;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EdgeEffectCompat {
    /* JADX INFO: renamed from: a */
    public static float m2447a(EdgeEffect edgeEffect, float f, float f2, Density density) {
        float f3 = EdgeEffectCompat_androidKt.f4963a;
        double f20556a = density.getF20556a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) EdgeEffectCompat_androidKt.f4963a) * f20556a;
        if (((float) (Math.exp((EdgeEffectCompat_androidKt.f4964b / EdgeEffectCompat_androidKt.f4965c) * Math.log(dAbs / d)) * d)) > m2448b(edgeEffect) * f2) {
            return 0.0f;
        }
        m2449c(edgeEffect, MathKt.m18640b(f));
        return f;
    }

    /* JADX INFO: renamed from: b */
    public static float m2448b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m2427b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m2449c(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m2450d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m2428c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: e */
    public static void m2451e(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof GlowEdgeEffectCompat)) {
            edgeEffect.onRelease();
            return;
        }
        GlowEdgeEffectCompat glowEdgeEffectCompat = (GlowEdgeEffectCompat) edgeEffect;
        float f2 = glowEdgeEffectCompat.f5000b + f;
        glowEdgeEffectCompat.f5000b = f2;
        if (Math.abs(f2) > glowEdgeEffectCompat.f4999a) {
            glowEdgeEffectCompat.onRelease();
        }
    }
}
