package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class RoundRectDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f3606a;

    /* JADX INFO: renamed from: b */
    public final Paint f3607b;

    /* JADX INFO: renamed from: c */
    public final RectF f3608c;

    /* JADX INFO: renamed from: d */
    public final Rect f3609d;

    /* JADX INFO: renamed from: e */
    public float f3610e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f3613h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f3614i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f3615j;

    /* JADX INFO: renamed from: f */
    public boolean f3611f = false;

    /* JADX INFO: renamed from: g */
    public boolean f3612g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f3616k = PorterDuff.Mode.SRC_IN;

    public RoundRectDrawable(float f, ColorStateList colorStateList) {
        this.f3606a = f;
        Paint paint = new Paint(5);
        this.f3607b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f3613h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f3613h.getDefaultColor()));
        this.f3608c = new RectF();
        this.f3609d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1970a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m1971b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f3608c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f3609d;
        rect2.set(rect);
        if (this.f3611f) {
            rect2.inset((int) Math.ceil(RoundRectDrawableWithShadow.m1972a(this.f3610e, this.f3606a, this.f3612g)), (int) Math.ceil(RoundRectDrawableWithShadow.m1973b(this.f3610e, this.f3606a, this.f3612g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f3607b;
        if (this.f3614i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f3614i);
            z2 = true;
        }
        RectF rectF = this.f3608c;
        float f = this.f3606a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f3609d, this.f3606a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f3615j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f3613h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1971b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3613h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f3607b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3615j;
        if (colorStateList2 == null || (mode = this.f3616k) == null) {
            return z2;
        }
        this.f3614i = m1970a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3607b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3607b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f3615j = colorStateList;
        this.f3614i = m1970a(colorStateList, this.f3616k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f3616k = mode;
        this.f3614i = m1970a(this.f3615j, mode);
        invalidateSelf();
    }
}
