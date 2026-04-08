package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {

    /* JADX INFO: renamed from: l */
    public static final float f641l = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a */
    public final Paint f642a;

    /* JADX INFO: renamed from: b */
    public final float f643b;

    /* JADX INFO: renamed from: c */
    public final float f644c;

    /* JADX INFO: renamed from: d */
    public final float f645d;

    /* JADX INFO: renamed from: e */
    public final float f646e;

    /* JADX INFO: renamed from: f */
    public final boolean f647f;

    /* JADX INFO: renamed from: g */
    public final Path f648g;

    /* JADX INFO: renamed from: h */
    public final int f649h;

    /* JADX INFO: renamed from: i */
    public float f650i;

    /* JADX INFO: renamed from: j */
    public final float f651j;

    /* JADX INFO: renamed from: k */
    public final int f652k;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f642a = paint;
        this.f648g = new Path();
        this.f652k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.f275n, com.exchange.allin.R.attr.drawerArrowStyle, com.exchange.allin.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f651j = (float) (Math.cos(f641l) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f647f != z2) {
            this.f647f = z2;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f646e) {
            this.f646e = fRound;
            invalidateSelf();
        }
        this.f649h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f644c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f643b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f645d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static float m411a(float f, float f2, float f3) {
        return AbstractC0000a.m4a(f2, f, f3, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f652k;
        boolean z2 = false;
        if (i != 0 && (i == 1 || (i == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z2 = true;
        }
        float f = this.f643b;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f650i;
        float f3 = this.f644c;
        float fM411a = m411a(f3, fSqrt, f2);
        float fM411a2 = m411a(f3, this.f645d, this.f650i);
        float fRound = Math.round(m411a(0.0f, this.f651j, this.f650i));
        float fM411a3 = m411a(0.0f, f641l, this.f650i);
        float fM411a4 = m411a(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.f650i);
        double d = fM411a;
        double d2 = fM411a3;
        boolean z3 = z2;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.f648g;
        path.rewind();
        float f4 = this.f646e;
        Paint paint = this.f642a;
        float fM411a5 = m411a(paint.getStrokeWidth() + f4, -this.f651j, this.f650i);
        float f5 = (-fM411a2) / 2.0f;
        path.moveTo(f5 + fRound, 0.0f);
        path.rLineTo(fM411a2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f5, fM411a5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fM411a5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f646e + ((((int) (fHeight - (r6 * 2.0f))) / 4) * 2));
        if (this.f647f) {
            canvas.rotate(fM411a4 * (z3 ? -1 : 1));
        } else if (z3) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f649h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f649h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f642a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f642a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
