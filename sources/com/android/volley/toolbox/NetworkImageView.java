package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    public int f35020a;

    /* JADX INFO: renamed from: b */
    public Drawable f35021b;

    /* JADX INFO: renamed from: c */
    public Bitmap f35022c;

    /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$1 */
    /* JADX INFO: compiled from: Proguard */
    class C24601 implements ImageLoader.ImageListener {

        /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // com.android.volley.Response.ErrorListener
        /* JADX INFO: renamed from: b */
        public final void mo12806b(VolleyError volleyError) {
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3;
        boolean z4;
        super.onLayout(z2, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        if (getLayoutParams() != null) {
            z3 = getLayoutParams().width == -2;
            z4 = getLayoutParams().height == -2;
        } else {
            z3 = false;
            z4 = false;
        }
        boolean z5 = z3 && z4;
        if (width == 0 && height == 0 && !z5) {
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        int i5 = this.f35020a;
        if (i5 != 0) {
            setImageResource(i5);
            return;
        }
        Drawable drawable = this.f35021b;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f35022c;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f35020a = 0;
        this.f35021b = null;
        this.f35022c = bitmap;
    }

    public void setDefaultImageDrawable(@Nullable Drawable drawable) {
        this.f35020a = 0;
        this.f35022c = null;
        this.f35021b = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.f35022c = null;
        this.f35021b = null;
        this.f35020a = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
    }

    public void setErrorImageDrawable(@Nullable Drawable drawable) {
    }

    public void setErrorImageResId(int i) {
    }
}
