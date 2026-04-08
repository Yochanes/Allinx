package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class ShimmerDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ValueAnimator.AnimatorUpdateListener f42149a = new C35701();

    /* JADX INFO: renamed from: b */
    public final Paint f42150b;

    /* JADX INFO: renamed from: c */
    public final Rect f42151c;

    /* JADX INFO: renamed from: d */
    public final Matrix f42152d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f42153e;

    /* JADX INFO: renamed from: f */
    public Shimmer f42154f;

    /* JADX INFO: renamed from: com.facebook.shimmer.ShimmerDrawable$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C35701 implements ValueAnimator.AnimatorUpdateListener {
        public C35701() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShimmerDrawable.this.invalidateSelf();
        }
    }

    public ShimmerDrawable() {
        Paint paint = new Paint();
        this.f42150b = paint;
        this.f42151c = new Rect();
        this.f42152d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m14313a() {
        Shimmer shimmer;
        ValueAnimator valueAnimator = this.f42153e;
        if (valueAnimator == null || valueAnimator.isStarted() || (shimmer = this.f42154f) == null || !shimmer.f42142o || getCallback() == null) {
            return;
        }
        this.f42153e.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m14314b() {
        Shimmer shimmer;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (shimmer = this.f42154f) == null) {
            return;
        }
        int iRound = shimmer.f42134g;
        if (iRound <= 0) {
            iRound = Math.round(shimmer.f42136i * iWidth);
        }
        Shimmer shimmer2 = this.f42154f;
        int iRound2 = shimmer2.f42135h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(shimmer2.f42137j * iHeight);
        }
        Shimmer shimmer3 = this.f42154f;
        boolean z2 = true;
        if (shimmer3.f42133f != 1) {
            int i = shimmer3.f42130c;
            if (i != 1 && i != 3) {
                z2 = false;
            }
            if (z2) {
                iRound = 0;
            }
            if (!z2) {
                iRound2 = 0;
            }
            Shimmer shimmer4 = this.f42154f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, shimmer4.f42129b, shimmer4.f42128a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            Shimmer shimmer5 = this.f42154f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, shimmer5.f42129b, shimmer5.f42128a, Shader.TileMode.CLAMP);
        }
        this.f42150b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fM4a;
        float fM4a2;
        if (this.f42154f != null) {
            Paint paint = this.f42150b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f42154f.f42140m));
            Rect rect = this.f42151c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f42153e;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f42154f.f42130c;
            if (i != 1) {
                if (i == 2) {
                    fM4a2 = AbstractC0000a.m4a(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f2 = -fHeight;
                    fM4a2 = AbstractC0000a.m4a(fHeight, f2, animatedFraction, f2);
                } else {
                    fM4a = AbstractC0000a.m4a(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fM4a2;
                fM4a = 0.0f;
            } else {
                float f3 = -fWidth;
                fM4a = AbstractC0000a.m4a(fWidth, f3, animatedFraction, f3);
            }
            Matrix matrix = this.f42152d;
            matrix.reset();
            matrix.setRotate(this.f42154f.f42140m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fM4a);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Shimmer shimmer = this.f42154f;
        if (shimmer != null) {
            return (shimmer.f42141n || shimmer.f42143p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42151c.set(0, 0, rect.width(), rect.height());
        m14314b();
        m14313a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
