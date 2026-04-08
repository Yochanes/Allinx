package io.intercom.android.sdk.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ActiveStateDrawable extends Drawable {
    private final Paint paint;
    private final RectF roundRect = new RectF();
    private final int stateColor;
    private final int strokeColor;
    private final float strokeWidth;

    public ActiveStateDrawable(int i, int i2, float f) {
        Paint paint = new Paint();
        this.paint = paint;
        this.stateColor = i;
        this.strokeColor = i2;
        this.strokeWidth = f;
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.roundRect.set(getBounds());
        RectF rectF = this.roundRect;
        float f = this.strokeWidth;
        rectF.inset(f, f);
        this.paint.setColor(this.stateColor);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(this.roundRect, canvas.getHeight() / 2, canvas.getHeight() / 2, this.paint);
        this.paint.setColor(this.strokeColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.strokeWidth);
        canvas.drawRoundRect(this.roundRect, canvas.getHeight() / 2, canvas.getHeight() / 2, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
