package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AvatarDefaultDrawable extends Drawable {
    private final Paint avatarBackground;
    private final Drawable companyIcon;
    private final RectF roundRect = new RectF();

    public AvatarDefaultDrawable(Context context, @ColorInt int i) {
        this.companyIcon = context.getDrawable(C5101R.drawable.intercom_default_avatar_icon);
        Paint paint = new Paint();
        this.avatarBackground = paint;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.roundRect.set(getBounds());
        canvas.drawRoundRect(this.roundRect, canvas.getHeight() / 2, canvas.getHeight() / 2, this.avatarBackground);
        int width = (canvas.getWidth() - this.companyIcon.getIntrinsicWidth()) / 2;
        int height = (canvas.getHeight() - this.companyIcon.getIntrinsicHeight()) / 2;
        Drawable drawable = this.companyIcon;
        drawable.setBounds(width, height, drawable.getIntrinsicWidth() + width, this.companyIcon.getIntrinsicHeight() + height);
        this.companyIcon.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
