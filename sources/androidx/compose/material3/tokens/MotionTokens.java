package androidx.compose.material3.tokens;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/tokens/MotionTokens;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MotionTokens {

    /* JADX INFO: renamed from: a */
    public static final CubicBezierEasing f15950a = new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b */
    public static final CubicBezierEasing f15951b;

    /* JADX INFO: renamed from: c */
    public static final CubicBezierEasing f15952c;

    static {
        new CubicBezierEasing(0.3f, 0.0f, 0.8f, 0.15f);
        f15951b = new CubicBezierEasing(0.05f, 0.7f, 0.1f, 1.0f);
        new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
        new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
        f15952c = new CubicBezierEasing(0.0f, 0.0f, 1.0f, 1.0f);
        new CubicBezierEasing(0.2f, 0.0f, 0.0f, 1.0f);
        new CubicBezierEasing(0.3f, 0.0f, 1.0f, 1.0f);
        new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
