package io.intercom.android.sdk.p041ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.p041ui.theme.BaseColors;
import io.intercom.android.sdk.post.C5661a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\r\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0000\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0000\"\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m18302d2 = {"getIntercomColors", "Lio/intercom/android/sdk/ui/theme/IntercomColors;", "action", "Landroidx/compose/ui/graphics/Color;", "onAction", "actionContrastWhite", "onActionContrastWhite", "header", "onHeader", "isLight", "", "inputAlt", "getIntercomColors-hIzCY_Q", "(JJJJJJZLandroidx/compose/ui/graphics/Color;)Lio/intercom/android/sdk/ui/theme/IntercomColors;", "intercomLightColors", "intercomDarkColors", "toMaterialColors", "Landroidx/compose/material3/ColorScheme;", "LocalIntercomColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalIntercomColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "currentThemeMode", "Landroidx/compose/runtime/MutableState;", "Lio/intercom/android/sdk/ui/theme/ThemeMode;", "getCurrentThemeMode", "()Landroidx/compose/runtime/MutableState;", "setCurrentThemeMode", "(Landroidx/compose/runtime/MutableState;)V", "intercom-sdk-ui_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class IntercomColorsKt {

    @NotNull
    private static final ProvidableCompositionLocal<IntercomColors> LocalIntercomColors = new StaticProvidableCompositionLocal(new C5661a(8));

    @NotNull
    private static MutableState<ThemeMode> currentThemeMode = SnapshotStateKt.m4525g(ThemeMode.LIGHT);

    private static final IntercomColors LocalIntercomColors$lambda$0() {
        return intercomLightColors();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ IntercomColors m16759a() {
        return LocalIntercomColors$lambda$0();
    }

    @NotNull
    public static final MutableState<ThemeMode> getCurrentThemeMode() {
        return currentThemeMode;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntercomColors-hIzCY_Q, reason: not valid java name */
    public static final IntercomColors m22703getIntercomColorshIzCY_Q(long j, long j2, long j3, long j4, long j5, long j6, boolean z2, @Nullable Color color) {
        if (z2) {
            return IntercomColors.m22621copy0EgJgxk$default(intercomLightColors(), j, j2, j3, j4, j5, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, color != null ? color.f17585a : intercomLightColors().m22685getInputAlt0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, -64, 510, null);
        }
        return IntercomColors.m22621copy0EgJgxk$default(intercomDarkColors(), j, j2, j3, j4, j5, j6, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, color != null ? color.f17585a : intercomDarkColors().m22685getInputAlt0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, -64, 510, null);
    }

    /* JADX INFO: renamed from: getIntercomColors-hIzCY_Q$default, reason: not valid java name */
    public static /* synthetic */ IntercomColors m22704getIntercomColorshIzCY_Q$default(long j, long j2, long j3, long j4, long j5, long j6, boolean z2, Color color, int i, Object obj) {
        return m22703getIntercomColorshIzCY_Q(j, j2, j3, j4, j5, j6, z2, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : color);
    }

    @NotNull
    public static final ProvidableCompositionLocal<IntercomColors> getLocalIntercomColors() {
        return LocalIntercomColors;
    }

    @NotNull
    public static final IntercomColors intercomDarkColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long jM22610getFallback0d7_KjU = baseColors.m22610getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(jM22610getFallback0d7_KjU, newColorScheme.m22618getGray250d7_KjU(), newColorScheme.m22618getGray250d7_KjU(), newColorScheme.m22620getGray9000d7_KjU(), newColorScheme.m22620getGray9000d7_KjU(), newColorScheme.m22618getGray250d7_KjU(), newColorScheme.m22620getGray9000d7_KjU(), newColorScheme.m22618getGray250d7_KjU(), newColorScheme.m22618getGray250d7_KjU(), baseColors.m22604getBlack450d7_KjU(), baseColors.m22608getBlack950d7_KjU(), baseColors.m22602getBlack100d7_KjU(), newColorScheme.m22619getGray8500d7_KjU(), Color.m5180b(0.02f, newColorScheme.m22619getGray8500d7_KjU()), baseColors.m22602getBlack100d7_KjU(), Color.m5180b(0.15f, newColorScheme.m22618getGray250d7_KjU()), Color.m5180b(0.1f, newColorScheme.m22619getGray8500d7_KjU()), baseColors.m22603getBlack200d7_KjU(), newColorScheme.m22619getGray8500d7_KjU(), Color.m5180b(0.7f, newColorScheme.m22619getGray8500d7_KjU()), newColorScheme.m22619getGray8500d7_KjU(), ColorKt.m5195d(4279176975L), newColorScheme.m22619getGray8500d7_KjU(), baseColors.m22602getBlack100d7_KjU(), baseColors.m22602getBlack100d7_KjU(), Color.m5180b(0.9f, newColorScheme.m22619getGray8500d7_KjU()), baseColors.m22607getBlack900d7_KjU(), baseColors.m22604getBlack450d7_KjU(), newColorScheme.m22618getGray250d7_KjU(), baseColors.m22605getBlack700d7_KjU(), baseColors.m22605getBlack700d7_KjU(), ColorKt.m5195d(4293256677L), ColorKt.m5195d(4281216558L), baseColors.m22614getRed0d7_KjU(), baseColors.m22613getOrange0d7_KjU(), baseColors.m22609getBlue0d7_KjU(), baseColors.m22611getGreen0d7_KjU(), baseColors.m22616getYellow0d7_KjU(), baseColors.m22612getGreenLighter200d7_KjU(), baseColors.m22614getRed0d7_KjU(), false, null);
    }

    @NotNull
    public static final IntercomColors intercomLightColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        return new IntercomColors(baseColors.m22610getFallback0d7_KjU(), baseColors.m22615getWhite0d7_KjU(), baseColors.m22601getBlack0d7_KjU(), baseColors.m22615getWhite0d7_KjU(), baseColors.m22615getWhite0d7_KjU(), baseColors.m22601getBlack0d7_KjU(), baseColors.m22615getWhite0d7_KjU(), baseColors.m22602getBlack100d7_KjU(), baseColors.m22601getBlack0d7_KjU(), baseColors.m22604getBlack450d7_KjU(), baseColors.m22603getBlack200d7_KjU(), baseColors.m22608getBlack950d7_KjU(), Color.m5180b(0.04f, baseColors.m22601getBlack0d7_KjU()), Color.m5180b(0.02f, baseColors.m22601getBlack0d7_KjU()), baseColors.m22608getBlack950d7_KjU(), Color.m5180b(0.2f, baseColors.m22602getBlack100d7_KjU()), Color.m5180b(0.1f, baseColors.m22601getBlack0d7_KjU()), Color.m5180b(0.1f, baseColors.m22601getBlack0d7_KjU()), ColorKt.m5195d(4292993505L), ColorKt.m5195d(4294375158L), BaseColors.NewColorScheme.INSTANCE.m22617getGray1000d7_KjU(), ColorKt.m5195d(4279176975L), baseColors.m22615getWhite0d7_KjU(), baseColors.m22608getBlack950d7_KjU(), ColorKt.m5195d(4294440951L), Color.m5180b(0.05f, baseColors.m22601getBlack0d7_KjU()), baseColors.m22607getBlack900d7_KjU(), baseColors.m22604getBlack450d7_KjU(), baseColors.m22601getBlack0d7_KjU(), baseColors.m22605getBlack700d7_KjU(), baseColors.m22605getBlack700d7_KjU(), ColorKt.m5195d(4293256677L), baseColors.m22615getWhite0d7_KjU(), baseColors.m22614getRed0d7_KjU(), baseColors.m22613getOrange0d7_KjU(), baseColors.m22609getBlue0d7_KjU(), baseColors.m22611getGreen0d7_KjU(), baseColors.m22616getYellow0d7_KjU(), baseColors.m22612getGreenLighter200d7_KjU(), baseColors.m22614getRed0d7_KjU(), true, null);
    }

    public static final void setCurrentThemeMode(@NotNull MutableState<ThemeMode> mutableState) {
        Intrinsics.m18599g(mutableState, "<set-?>");
        currentThemeMode = mutableState;
    }

    @NotNull
    public static final ColorScheme toMaterialColors(@NotNull IntercomColors intercomColors) {
        Intrinsics.m18599g(intercomColors, "<this>");
        if (intercomColors.isLight()) {
            return ColorSchemeKt.m3907e(intercomColors.m22663getAction0d7_KjU(), intercomColors.m22687getOnAction0d7_KjU(), 0L, 0L, 0L, intercomColors.m22669getBackground0d7_KjU(), intercomColors.m22693getPrimaryText0d7_KjU(), intercomColors.m22669getBackground0d7_KjU(), intercomColors.m22693getPrimaryText0d7_KjU(), intercomColors.m22669getBackground0d7_KjU(), intercomColors.m22693getPrimaryText0d7_KjU(), intercomColors.m22669getBackground0d7_KjU(), intercomColors.m22681getError0d7_KjU(), -5234692);
        }
        long jM22663getAction0d7_KjU = intercomColors.m22663getAction0d7_KjU();
        long jM22687getOnAction0d7_KjU = intercomColors.m22687getOnAction0d7_KjU();
        long jM22669getBackground0d7_KjU = intercomColors.m22669getBackground0d7_KjU();
        long jM22693getPrimaryText0d7_KjU = intercomColors.m22693getPrimaryText0d7_KjU();
        long jM22669getBackground0d7_KjU2 = intercomColors.m22669getBackground0d7_KjU();
        long jM22693getPrimaryText0d7_KjU2 = intercomColors.m22693getPrimaryText0d7_KjU();
        long jM22669getBackground0d7_KjU3 = intercomColors.m22669getBackground0d7_KjU();
        long jM22669getBackground0d7_KjU4 = intercomColors.m22669getBackground0d7_KjU();
        long jM22693getPrimaryText0d7_KjU3 = intercomColors.m22693getPrimaryText0d7_KjU();
        long jM22681getError0d7_KjU = intercomColors.m22681getError0d7_KjU();
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorSchemeKt.f12599a;
        return new ColorScheme(jM22663getAction0d7_KjU, jM22687getOnAction0d7_KjU, ColorDarkTokens.f15782n, ColorDarkTokens.f15775g, ColorDarkTokens.f15771c, ColorDarkTokens.f15784p, ColorDarkTokens.f15776h, ColorDarkTokens.f15785q, ColorDarkTokens.f15777i, ColorDarkTokens.f15793y, ColorDarkTokens.f15778j, ColorDarkTokens.f15794z, ColorDarkTokens.f15779k, jM22669getBackground0d7_KjU4, jM22693getPrimaryText0d7_KjU3, jM22669getBackground0d7_KjU, jM22693getPrimaryText0d7_KjU, jM22669getBackground0d7_KjU2, jM22693getPrimaryText0d7_KjU2, jM22669getBackground0d7_KjU3, ColorDarkTokens.f15772d, ColorDarkTokens.f15770b, jM22681getError0d7_KjU, ColorDarkTokens.f15773e, ColorDarkTokens.f15769a, ColorDarkTokens.f15774f, ColorDarkTokens.f15780l, ColorDarkTokens.f15781m, ColorDarkTokens.f15783o, ColorDarkTokens.f15786r, ColorDarkTokens.f15792x, ColorDarkTokens.f15787s, ColorDarkTokens.f15788t, ColorDarkTokens.f15789u, ColorDarkTokens.f15790v, ColorDarkTokens.f15791w);
    }
}
