package androidx.compose.p013ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/FontFeatureSpan;", "Landroid/text/style/MetricAffectingSpan;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FontFeatureSpan extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final String f20181a;

    public FontFeatureSpan(String str) {
        this.f20181a = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f20181a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f20181a);
    }
}
