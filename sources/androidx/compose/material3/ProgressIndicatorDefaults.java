package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/ProgressIndicatorDefaults;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ProgressIndicatorDefaults {

    /* JADX INFO: renamed from: a */
    public static final float f14119a = ProgressIndicatorTokens.f16025c;

    /* JADX INFO: renamed from: b */
    public static final int f14120b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f14121c = 1;

    /* JADX INFO: renamed from: d */
    public static final float f14122d = ProgressIndicatorTokens.f16024b;

    /* JADX INFO: renamed from: e */
    public static final float f14123e;

    /* JADX INFO: renamed from: f */
    public static final float f14124f;

    static {
        float f = ProgressIndicatorTokens.f16023a;
        f14123e = f;
        f14124f = f;
    }

    /* JADX INFO: renamed from: a */
    public static long m4002a(Composer composer) {
        float f = ProgressIndicatorTokens.f16023a;
        return ColorSchemeKt.m3906d(ColorSchemeKeyTokens.f15846r, composer);
    }
}
