package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class BackButtonCountDrawable extends Drawable {
    private static final String COUNT_BACKGROUND_COLOR = "#FE536C";
    private static final int COUNT_BACKGROUND_RADIUS_DP = 8;
    private static final int COUNT_TEXT_PADDING_TOP = 4;
    private static final int COUNT_TEXT_SIZE_DP = 11;
    private static final int ICON_PADDING_DP = 16;
    private static final int ICON_SIZE_DP = 24;
    private final Drawable backIcon;
    private final Paint countBackgroundPaint;
    private final int countBackgroundRadius;
    private final int iconPadding;
    private final int iconSize;

    @Nullable
    private String text;
    private final Paint textPaint;
    private final int textTopPadding;

    public BackButtonCountDrawable(Context context, @Nullable String str) {
        this.text = str;
        Drawable drawable = context.getDrawable(C5101R.drawable.intercom_back);
        this.backIcon = drawable;
        drawable.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.iconPadding = ScreenUtils.dpToPx(16.0f, context);
        this.iconSize = ScreenUtils.dpToPx(24.0f, context);
        Paint paint = new Paint();
        this.countBackgroundPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor(COUNT_BACKGROUND_COLOR));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.countBackgroundRadius = ScreenUtils.dpToPx(8.0f, context);
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setTextSize(ScreenUtils.dpToPx(11.0f, context));
        paint2.setFakeBoldText(true);
        paint2.setStyle(style);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.textTopPadding = ScreenUtils.dpToPx(4.0f, context);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.left;
        int i2 = this.iconPadding;
        int i3 = i + i2;
        int i4 = bounds.top + i2;
        int i5 = this.iconSize;
        int i6 = i3 + i5;
        this.backIcon.setBounds(i3, i4, i6, i5 + i4);
        this.backIcon.draw(canvas);
        if (TextUtils.isEmpty(this.text)) {
            return;
        }
        float f = i6;
        canvas.drawCircle(f, i4, this.countBackgroundRadius, this.countBackgroundPaint);
        canvas.drawText(this.text, f, i4 + this.textTopPadding, this.textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.textPaint.setAlpha(i);
        this.countBackgroundPaint.setAlpha(i);
        this.backIcon.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.backIcon.setColorFilter(colorFilter);
    }

    public void setText(@Nullable String str) {
        this.text = str;
        invalidateSelf();
    }
}
