package androidx.compose.p013ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p013ui.text.android.TextAndroidCanvas;
import androidx.compose.p013ui.text.android.TextLayout_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/style/IndentationFixSpan;", "Landroid/text/style/LeadingMarginSpan;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IndentationFixSpan implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z2, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f20167a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM6503b = IndentationFixSpan_androidKt.m6503b(layout, lineForOffset, paint) + IndentationFixSpan_androidKt.m6502a(layout, lineForOffset, paint);
            if (fM6503b == 0.0f) {
                return;
            }
            Intrinsics.m18596d(canvas);
            canvas.translate(fM6503b, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z2) {
        return 0;
    }
}
