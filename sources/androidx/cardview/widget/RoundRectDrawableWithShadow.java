package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class RoundRectDrawableWithShadow extends Drawable {

    /* JADX INFO: renamed from: q */
    public static final double f3617q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public final int f3618a;

    /* JADX INFO: renamed from: c */
    public final Paint f3620c;

    /* JADX INFO: renamed from: d */
    public final Paint f3621d;

    /* JADX INFO: renamed from: e */
    public final RectF f3622e;

    /* JADX INFO: renamed from: f */
    public float f3623f;

    /* JADX INFO: renamed from: g */
    public Path f3624g;

    /* JADX INFO: renamed from: h */
    public float f3625h;

    /* JADX INFO: renamed from: i */
    public float f3626i;

    /* JADX INFO: renamed from: j */
    public float f3627j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f3628k;

    /* JADX INFO: renamed from: m */
    public final int f3630m;

    /* JADX INFO: renamed from: n */
    public final int f3631n;

    /* JADX INFO: renamed from: l */
    public boolean f3629l = true;

    /* JADX INFO: renamed from: o */
    public boolean f3632o = true;

    /* JADX INFO: renamed from: p */
    public boolean f3633p = false;

    /* JADX INFO: renamed from: b */
    public final Paint f3619b = new Paint(5);

    /* JADX INFO: compiled from: Proguard */
    public interface RoundRectHelper {
    }

    public RoundRectDrawableWithShadow(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f3630m = resources.getColor(R.color.cardview_shadow_start_color);
        this.f3631n = resources.getColor(R.color.cardview_shadow_end_color);
        this.f3618a = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f3628k = colorStateList;
        this.f3619b.setColor(colorStateList.getColorForState(getState(), this.f3628k.getDefaultColor()));
        Paint paint = new Paint(5);
        this.f3620c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3623f = (int) (f + 0.5f);
        this.f3622e = new RectF();
        Paint paint2 = new Paint(paint);
        this.f3621d = paint2;
        paint2.setAntiAlias(false);
        m1974c(f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public static float m1972a(float f, float f2, boolean z2) {
        if (!z2) {
            return f;
        }
        return (float) (((1.0d - f3617q) * ((double) f2)) + ((double) f));
    }

    /* JADX INFO: renamed from: b */
    public static float m1973b(float f, float f2, boolean z2) {
        if (!z2) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f3617q) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    /* JADX INFO: renamed from: c */
    public final void m1974c(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            i--;
        }
        float f3 = i;
        int i2 = (int) (f2 + 0.5f);
        if (i2 % 2 == 1) {
            i2--;
        }
        float f4 = i2;
        if (f3 > f4) {
            if (!this.f3633p) {
                this.f3633p = true;
            }
            f3 = f4;
        }
        if (this.f3627j == f3 && this.f3625h == f4) {
            return;
        }
        this.f3627j = f3;
        this.f3625h = f4;
        this.f3626i = (int) ((f3 * 1.5f) + this.f3618a + 0.5f);
        this.f3629l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        float f;
        int i;
        boolean z3 = this.f3629l;
        Paint paint = this.f3621d;
        Paint paint2 = this.f3620c;
        RectF rectF = this.f3622e;
        if (z3) {
            Rect bounds = getBounds();
            float f2 = this.f3625h;
            float f3 = 1.5f * f2;
            z2 = true;
            rectF.set(bounds.left + f2, bounds.top + f3, bounds.right - f2, bounds.bottom - f3);
            float f4 = this.f3623f;
            float f5 = -f4;
            RectF rectF2 = new RectF(f5, f5, f4, f4);
            RectF rectF3 = new RectF(rectF2);
            float f6 = -this.f3626i;
            rectF3.inset(f6, f6);
            Path path = this.f3624g;
            if (path == null) {
                this.f3624g = new Path();
            } else {
                path.reset();
            }
            this.f3624g.setFillType(Path.FillType.EVEN_ODD);
            this.f3624g.moveTo(-this.f3623f, 0.0f);
            this.f3624g.rLineTo(-this.f3626i, 0.0f);
            this.f3624g.arcTo(rectF3, 180.0f, 90.0f, false);
            this.f3624g.arcTo(rectF2, 270.0f, -90.0f, false);
            this.f3624g.close();
            float f7 = this.f3623f;
            float f8 = f7 / (this.f3626i + f7);
            float f9 = this.f3623f + this.f3626i;
            int i2 = this.f3630m;
            int i3 = this.f3631n;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{i2, i2, i3}, new float[]{0.0f, f8, 1.0f}, tileMode));
            float f10 = -this.f3623f;
            float f11 = this.f3626i;
            paint.setShader(new LinearGradient(0.0f, f10 + f11, 0.0f, f10 - f11, new int[]{i2, i2, i3}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
            paint.setAntiAlias(false);
            this.f3629l = false;
        } else {
            z2 = true;
        }
        canvas.translate(0.0f, this.f3627j / 2.0f);
        float f12 = this.f3623f;
        float f13 = (-f12) - this.f3626i;
        float f14 = (this.f3627j / 2.0f) + f12 + this.f3618a;
        float f15 = f14 * 2.0f;
        boolean z4 = rectF.width() - f15 > 0.0f ? z2 : false;
        if (rectF.height() - f15 <= 0.0f) {
            z2 = false;
        }
        int iSave = canvas.save();
        canvas.translate(rectF.left + f14, rectF.top + f14);
        canvas.drawPath(this.f3624g, paint2);
        if (z4) {
            f = 2.0f;
            i = iSave;
            canvas.drawRect(0.0f, f13, rectF.width() - f15, -this.f3623f, paint);
        } else {
            f = 2.0f;
            i = iSave;
        }
        canvas.restoreToCount(i);
        int iSave2 = canvas.save();
        canvas.translate(rectF.right - f14, rectF.bottom - f14);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f3624g, paint2);
        if (z4) {
            canvas.drawRect(0.0f, f13, rectF.width() - f15, this.f3626i + (-this.f3623f), paint);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(rectF.left + f14, rectF.bottom - f14);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f3624g, paint2);
        if (z2) {
            canvas.drawRect(0.0f, f13, rectF.height() - f15, -this.f3623f, paint);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(rectF.right - f14, rectF.top + f14);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f3624g, paint2);
        if (z2) {
            canvas.drawRect(0.0f, f13, rectF.height() - f15, -this.f3623f, paint);
        }
        canvas.restoreToCount(iSave4);
        canvas.translate(0.0f, (-this.f3627j) / f);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(m1973b(this.f3625h, this.f3623f, this.f3632o));
        int iCeil2 = (int) Math.ceil(m1972a(this.f3625h, this.f3623f, this.f3632o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f3628k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3629l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f3628k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f3619b;
        if (paint.getColor() == colorForState) {
            return false;
        }
        paint.setColor(colorForState);
        this.f3629l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3619b.setAlpha(i);
        this.f3620c.setAlpha(i);
        this.f3621d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3619b.setColorFilter(colorFilter);
    }
}
