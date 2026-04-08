package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import com.google.android.material.snackbar.AbstractC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lcoil/drawable/ScaleDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Animatable;", "coil-gif_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ScaleDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a */
    public final Drawable f33615a;

    /* JADX INFO: renamed from: b */
    public final Scale f33616b;

    /* JADX INFO: renamed from: c */
    public float f33617c;

    /* JADX INFO: renamed from: d */
    public float f33618d;

    /* JADX INFO: renamed from: f */
    public float f33619f = 1.0f;

    public ScaleDrawable(Drawable drawable, Scale scale) {
        this.f33615a = drawable;
        this.f33616b = scale;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f33617c, this.f33618d);
            float f = this.f33619f;
            canvas.scale(f, f);
            this.f33615a.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f33615a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f33615a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f33615a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f33615a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f33615a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f33615a;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f33615a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f33617c = 0.0f;
            this.f33618d = 0.0f;
            this.f33619f = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM12416a = DecodeUtils.m12416a(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f33616b);
        double d = 2;
        int iM18639a = MathKt.m18639a((((double) iWidth) - (((double) intrinsicWidth) * dM12416a)) / d);
        int iM18639a2 = MathKt.m18639a((((double) iHeight) - (((double) intrinsicHeight) * dM12416a)) / d);
        drawable.setBounds(iM18639a, iM18639a2, intrinsicWidth + iM18639a, intrinsicHeight + iM18639a2);
        this.f33617c = rect.left;
        this.f33618d = rect.top;
        this.f33619f = (float) dM12416a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f33615a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f33615a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f33615a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33615a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f33615a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        AbstractC3999a.m14728h(this.f33615a, blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f33615a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f33615a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f33615a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f33615a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
