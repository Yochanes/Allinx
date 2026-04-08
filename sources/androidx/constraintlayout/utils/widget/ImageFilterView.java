package androidx.constraintlayout.utils.widget;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: a */
    public Drawable f22565a;

    /* JADX INFO: renamed from: b */
    public float f22566b;

    /* JADX INFO: renamed from: c */
    public float f22567c;

    /* JADX INFO: renamed from: d */
    public float f22568d;

    /* JADX INFO: renamed from: f */
    public float f22569f;

    /* JADX INFO: renamed from: g */
    public float f22570g;

    /* JADX INFO: renamed from: i */
    public float f22571i;

    /* JADX INFO: renamed from: j */
    public float f22572j;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14101 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C14112 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ImageMatrix {
    }

    /* JADX INFO: renamed from: c */
    public final void m7312c() {
        if (Float.isNaN(this.f22569f) && Float.isNaN(this.f22570g) && Float.isNaN(this.f22571i) && Float.isNaN(this.f22572j)) {
            return;
        }
        float f = Float.isNaN(this.f22569f) ? 0.0f : this.f22569f;
        float f2 = Float.isNaN(this.f22570g) ? 0.0f : this.f22570g;
        float f3 = Float.isNaN(this.f22571i) ? 1.0f : this.f22571i;
        float f4 = Float.isNaN(this.f22572j) ? 0.0f : this.f22572j;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX INFO: renamed from: d */
    public final void m7313d() {
        if (Float.isNaN(this.f22569f) && Float.isNaN(this.f22570g) && Float.isNaN(this.f22571i) && Float.isNaN(this.f22572j)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m7312c();
        }
    }

    public float getBrightness() {
        throw null;
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f22566b;
    }

    public float getImagePanX() {
        return this.f22569f;
    }

    public float getImagePanY() {
        return this.f22570g;
    }

    public float getImageRotate() {
        return this.f22572j;
    }

    public float getImageZoom() {
        return this.f22571i;
    }

    public float getRound() {
        return this.f22568d;
    }

    public float getRoundPercent() {
        return this.f22567c;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m7312c();
    }

    public void setAltImageDrawable(Drawable drawable) {
        this.f22565a = drawable.mutate();
        throw null;
    }

    public void setAltImageResource(int i) {
        Drawable drawableM395a = AppCompatResources.m395a(getContext(), i);
        this.f22565a = drawableM395a;
        setAltImageDrawable(drawableM395a);
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setCrossfade(float f) {
        this.f22566b = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f22565a == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f) {
        this.f22569f = f;
        m7313d();
    }

    public void setImagePanY(float f) {
        this.f22570g = f;
        m7313d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f22565a == null) {
            super.setImageResource(i);
        } else {
            AppCompatResources.m395a(getContext(), i).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.f22572j = f;
        m7313d();
    }

    public void setImageZoom(float f) {
        this.f22571i = f;
        m7313d();
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f22568d = f;
            float f2 = this.f22567c;
            this.f22567c = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f22568d != f;
        this.f22568d = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z2) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z2 = this.f22567c != f;
        this.f22567c = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z2) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        throw null;
    }

    public void setWarmth(float f) {
        throw null;
    }

    private void setOverlay(boolean z2) {
    }
}
