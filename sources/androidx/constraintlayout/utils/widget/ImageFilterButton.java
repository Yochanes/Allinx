package androidx.constraintlayout.utils.widget;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: a */
    public float f22557a;

    /* JADX INFO: renamed from: b */
    public float f22558b;

    /* JADX INFO: renamed from: c */
    public float f22559c;

    /* JADX INFO: renamed from: d */
    public Drawable f22560d;

    /* JADX INFO: renamed from: f */
    public float f22561f;

    /* JADX INFO: renamed from: g */
    public float f22562g;

    /* JADX INFO: renamed from: i */
    public float f22563i;

    /* JADX INFO: renamed from: j */
    public float f22564j;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14081 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C14092 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7310a() {
        if (Float.isNaN(this.f22561f) && Float.isNaN(this.f22562g) && Float.isNaN(this.f22563i) && Float.isNaN(this.f22564j)) {
            return;
        }
        float f = Float.isNaN(this.f22561f) ? 0.0f : this.f22561f;
        float f2 = Float.isNaN(this.f22562g) ? 0.0f : this.f22562g;
        float f3 = Float.isNaN(this.f22563i) ? 1.0f : this.f22563i;
        float f4 = Float.isNaN(this.f22564j) ? 0.0f : this.f22564j;
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

    /* JADX INFO: renamed from: b */
    public final void m7311b() {
        if (Float.isNaN(this.f22561f) && Float.isNaN(this.f22562g) && Float.isNaN(this.f22563i) && Float.isNaN(this.f22564j)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m7310a();
        }
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f22557a;
    }

    public float getImagePanX() {
        return this.f22561f;
    }

    public float getImagePanY() {
        return this.f22562g;
    }

    public float getImageRotate() {
        return this.f22564j;
    }

    public float getImageZoom() {
        return this.f22563i;
    }

    public float getRound() {
        return this.f22559c;
    }

    public float getRoundPercent() {
        return this.f22558b;
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
        m7310a();
    }

    public void setAltImageResource(int i) {
        this.f22560d = AppCompatResources.m395a(getContext(), i).mutate();
        throw null;
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setCrossfade(float f) {
        this.f22557a = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f22560d == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f) {
        this.f22561f = f;
        m7311b();
    }

    public void setImagePanY(float f) {
        this.f22562g = f;
        m7311b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f22560d == null) {
            super.setImageResource(i);
        } else {
            AppCompatResources.m395a(getContext(), i).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.f22564j = f;
        m7311b();
    }

    public void setImageZoom(float f) {
        this.f22563i = f;
        m7311b();
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f22559c = f;
            float f2 = this.f22558b;
            this.f22558b = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f22559c != f;
        this.f22559c = f;
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
        boolean z2 = this.f22558b != f;
        this.f22558b = f;
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
