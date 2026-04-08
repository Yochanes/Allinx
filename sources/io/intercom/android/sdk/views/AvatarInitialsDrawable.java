package io.intercom.android.sdk.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AvatarInitialsDrawable extends Drawable {
    private final Paint avatarBackground;
    private final String text;
    private final Rect textBounds = new Rect();
    private final Paint textPaint;

    public AvatarInitialsDrawable(String str, @ColorInt int i) {
        this.text = str;
        Paint paint = new Paint();
        this.avatarBackground = paint;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setFakeBoldText(true);
        paint2.setTextAlign(Paint.Align.LEFT);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.textPaint.setTextSize(bounds.height() / 3);
        Paint paint = this.textPaint;
        String str = this.text;
        paint.getTextBounds(str, 0, str.length(), this.textBounds);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.height() / 2, this.avatarBackground);
        canvas.drawText(this.text, bounds.centerX() - this.textBounds.exactCenterX(), bounds.centerY() - this.textBounds.exactCenterY(), this.textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.textPaint.setAlpha(i);
        this.avatarBackground.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
