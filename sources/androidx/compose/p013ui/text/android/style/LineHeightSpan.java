package androidx.compose.p013ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LineHeightSpan implements android.text.style.LineHeightSpan {

    /* JADX INFO: renamed from: a */
    public final float f20185a;

    public LineHeightSpan(float f) {
        this.f20185a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f20185a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i5)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
