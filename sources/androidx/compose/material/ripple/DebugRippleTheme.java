package androidx.compose.material.ripple;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ripple/DebugRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "material-ripple_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DebugRippleTheme implements RippleTheme {

    /* JADX INFO: renamed from: a */
    public static final DebugRippleTheme f11845a = new DebugRippleTheme();

    @Override // androidx.compose.material.ripple.RippleTheme
    /* JADX INFO: renamed from: a */
    public final long mo3831a(Composer composer) {
        composer.mo4221N(2042140174);
        long j = Color.f17574b;
        ColorKt.m5200i(j);
        composer.mo4213F();
        return j;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    /* JADX INFO: renamed from: b */
    public final RippleAlpha mo3832b(Composer composer) {
        composer.mo4221N(-1629816343);
        RippleAlpha rippleAlpha = ((double) ColorKt.m5200i(Color.f17574b)) > 0.5d ? RippleThemeKt.f11921b : RippleThemeKt.f11922c;
        composer.mo4213F();
        return rippleAlpha;
    }
}
