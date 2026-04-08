package androidx.compose.p013ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/BaselineShiftSpan;", "Landroid/text/style/MetricAffectingSpan;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class BaselineShiftSpan extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final float f20180a;

    public BaselineShiftSpan(float f) {
        this.f20180a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f20180a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f20180a);
    }
}
