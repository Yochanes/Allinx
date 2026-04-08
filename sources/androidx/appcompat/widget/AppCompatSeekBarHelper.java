package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {

    /* JADX INFO: renamed from: d */
    public final AppCompatSeekBar f1151d;

    /* JADX INFO: renamed from: e */
    public Drawable f1152e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f1153f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f1154g;

    /* JADX INFO: renamed from: h */
    public boolean f1155h;

    /* JADX INFO: renamed from: i */
    public boolean f1156i;

    public AppCompatSeekBarHelper(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f1153f = null;
        this.f1154g = null;
        this.f1155h = false;
        this.f1156i = false;
        this.f1151d = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    /* JADX INFO: renamed from: a */
    public final void mo559a(AttributeSet attributeSet, int i) {
        super.mo559a(attributeSet, R.attr.seekBarStyle);
        AppCompatSeekBar appCompatSeekBar = this.f1151d;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = androidx.appcompat.R.styleable.f268g;
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        ViewCompat.m7807z(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, tintTypedArrayM704f.f1413b, R.attr.seekBarStyle);
        Drawable drawableM707c = tintTypedArrayM704f.m707c(0);
        if (drawableM707c != null) {
            appCompatSeekBar.setThumb(drawableM707c);
        }
        Drawable drawableM706b = tintTypedArrayM704f.m706b(1);
        Drawable drawable = this.f1152e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1152e = drawableM706b;
        if (drawableM706b != null) {
            drawableM706b.setCallback(appCompatSeekBar);
            drawableM706b.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableM706b.isStateful()) {
                drawableM706b.setState(appCompatSeekBar.getDrawableState());
            }
            m563c();
        }
        appCompatSeekBar.invalidate();
        TypedArray typedArray = tintTypedArrayM704f.f1413b;
        if (typedArray.hasValue(3)) {
            this.f1154g = DrawableUtils.m649c(typedArray.getInt(3, -1), this.f1154g);
            this.f1156i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f1153f = tintTypedArrayM704f.m705a(2);
            this.f1155h = true;
        }
        tintTypedArrayM704f.m709g();
        m563c();
    }

    /* JADX INFO: renamed from: c */
    public final void m563c() {
        Drawable drawable = this.f1152e;
        if (drawable != null) {
            if (this.f1155h || this.f1156i) {
                Drawable drawableMutate = drawable.mutate();
                this.f1152e = drawableMutate;
                if (this.f1155h) {
                    drawableMutate.setTintList(this.f1153f);
                }
                if (this.f1156i) {
                    this.f1152e.setTintMode(this.f1154g);
                }
                if (this.f1152e.isStateful()) {
                    this.f1152e.setState(this.f1151d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m564d(Canvas canvas) {
        if (this.f1152e != null) {
            int max = this.f1151d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1152e.getIntrinsicWidth();
                int intrinsicHeight = this.f1152e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1152e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1152e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
