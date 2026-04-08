package io.intercom.android.sdk.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class OrderedListSpan implements LeadingMarginSpan {
    private final int gapWidth;
    private final String number;

    public OrderedListSpan(int i, String str) {
        this.gapWidth = i;
        this.number = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z2, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float fMeasureText = i;
            if (i2 == -1) {
                fMeasureText -= paint.measureText(this.number);
            }
            canvas.drawText(AbstractC0000a.m19p(new StringBuilder(), this.number, " "), fMeasureText, i4, paint);
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z2) {
        return (int) (new Paint().measureText(this.number) + this.gapWidth);
    }
}
