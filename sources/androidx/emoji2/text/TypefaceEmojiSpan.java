package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public final class TypefaceEmojiSpan extends EmojiSpan {

    /* JADX INFO: renamed from: e */
    public TextPaint f24346e;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f24346e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f24346e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f24319c, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        EmojiCompat.m8782a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.f24318b;
        MetadataRepo metadataRepo = typefaceEmojiRasterizer.f24344b;
        Typeface typeface = metadataRepo.f24335d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText(metadataRepo.f24333b, typefaceEmojiRasterizer.f24343a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }
}
