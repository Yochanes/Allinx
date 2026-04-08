package androidx.activity;

import android.content.pm.ShortcutInfo;
import android.graphics.Typeface;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: androidx.activity.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0050i {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder m192A(PrecomputedText.Params.Builder builder, int i) {
        return builder.setHyphenationFrequency(i);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m193B(int i, View view) {
        view.setOutlineAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m194C(WindowManager.LayoutParams layoutParams) {
        layoutParams.layoutInDisplayCutoutMode = 3;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m195D(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setHeading(z2);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m196a(PrecomputedText.Params params) {
        return params.getBreakStrategy();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m197b(DisplayCutout displayCutout) {
        return displayCutout.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Typeface m198c(Typeface typeface, int i, boolean z2) {
        return Typeface.create(typeface, i, z2);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder m199d(PrecomputedText.Params.Builder builder, int i) {
        return builder.setBreakStrategy(i);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder m200e(PrecomputedText.Params.Builder builder, TextDirectionHeuristic textDirectionHeuristic) {
        return builder.setTextDirection(textDirectionHeuristic);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ PrecomputedText.Params.Builder m201f(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ PrecomputedText.Params m202g(PrecomputedText.Params.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ PrecomputedText m203h(Object obj) {
        return (PrecomputedText) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ TextDirectionHeuristic m204i(PrecomputedText.Params params) {
        return params.getTextDirection();
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ TextPaint m205j(PrecomputedText.Params params) {
        return params.getTextPaint();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ DisplayCutout m206k(WindowInsets windowInsets) {
        return windowInsets.getDisplayCutout();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ WindowInsets m207l(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ CharSequence m208m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTooltipText();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m209n(int i, View view) {
        view.setOutlineSpotShadowColor(i);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m210o(ShortcutInfo shortcutInfo) {
        shortcutInfo.getDisabledReason();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m211p(PrecomputedText precomputedText, Object obj) {
        precomputedText.removeSpan(obj);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m212q(PrecomputedText precomputedText, Object obj, int i, int i2, int i3) {
        precomputedText.setSpan(obj, i, i2, i3);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m213r(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m214s(View view) {
        view.resetPivot();
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m215t(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m216u(WindowManager.LayoutParams layoutParams) {
        layoutParams.layoutInDisplayCutoutMode = 1;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m217v(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m218w(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setScreenReaderFocusable(z2);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m219x(Object obj) {
        return obj instanceof PrecomputedText;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ Object[] m220y(PrecomputedText precomputedText, int i, int i2, Class cls) {
        return precomputedText.getSpans(i, i2, cls);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m221z(PrecomputedText.Params params) {
        return params.getHyphenationFrequency();
    }
}
