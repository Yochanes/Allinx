package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.FloatLayout;
import com.exchange.allin.R;
import com.google.common.primitives.Ints;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements FloatLayout {

    /* JADX INFO: renamed from: a */
    public int f22575a;

    /* JADX INFO: renamed from: b */
    public boolean f22576b;

    /* JADX INFO: renamed from: c */
    public float f22577c;

    /* JADX INFO: renamed from: d */
    public float f22578d;

    /* JADX INFO: renamed from: f */
    public float f22579f;

    /* JADX INFO: renamed from: g */
    public float f22580g;

    /* JADX INFO: renamed from: i */
    public String f22581i;

    /* JADX INFO: renamed from: j */
    public int f22582j;

    /* JADX INFO: renamed from: n */
    public int f22583n;

    /* JADX INFO: renamed from: o */
    public int f22584o;

    /* JADX INFO: renamed from: p */
    public float f22585p;

    /* JADX INFO: renamed from: q */
    public float f22586q;

    /* JADX INFO: renamed from: r */
    public float f22587r;

    /* JADX INFO: renamed from: s */
    public float f22588s;

    /* JADX INFO: renamed from: t */
    public float f22589t;

    /* JADX INFO: renamed from: u */
    public float f22590u;

    /* JADX INFO: renamed from: v */
    public float f22591v;

    /* JADX INFO: renamed from: w */
    public float f22592w;

    /* JADX INFO: renamed from: x */
    public float f22593x;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionLabel$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14141 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionLabel$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C14152 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    private float getHorizontalOffset() {
        Float.isNaN(this.f22580g);
        this.f22581i.length();
        throw null;
    }

    private float getVerticalOffset() {
        Float.isNaN(this.f22580g);
        throw null;
    }

    private void setUpTheme(Context context) {
        context.getTheme().resolveAttribute(R.attr.colorPrimary, new TypedValue(), true);
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    /* JADX INFO: renamed from: a */
    public final void mo7213a(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f22585p = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (f2 + 0.5f);
        int i6 = i4 - i5;
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i6, Ints.MAX_POWER_OF_TWO));
            super.layout(i, i5, i2, i4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7314b() {
        Float.isNaN(this.f22590u);
        Float.isNaN(this.f22591v);
        Float.isNaN(this.f22592w);
        Float.isNaN(this.f22593x);
        throw null;
    }

    public float getRound() {
        return this.f22578d;
    }

    public float getRoundPercent() {
        return this.f22577c;
    }

    public float getScaleFromTextSize() {
        return this.f22580g;
    }

    public float getTextBackgroundPanX() {
        return this.f22590u;
    }

    public float getTextBackgroundPanY() {
        return this.f22591v;
    }

    public float getTextBackgroundRotate() {
        return this.f22593x;
    }

    public float getTextBackgroundZoom() {
        return this.f22592w;
    }

    public int getTextOutlineColor() {
        return this.f22575a;
    }

    public float getTextPanX() {
        return this.f22588s;
    }

    public float getTextPanY() {
        return this.f22589t;
    }

    public float getTextureHeight() {
        return this.f22586q;
    }

    public float getTextureWidth() {
        return this.f22587r;
    }

    public Typeface getTypeface() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f22580g);
        float f = zIsNaN ? 1.0f : this.f22579f / this.f22580g;
        boolean z2 = this.f22576b;
        if (z2 || !zIsNaN) {
            if (z2 || f != 1.0f) {
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f22580g) ? 1.0f : this.f22579f / this.f22580g;
        super.onDraw(canvas);
        boolean z2 = this.f22576b;
        if (!z2 && f == 1.0f) {
            canvas.drawText(this.f22581i, this.f22585p + this.f22582j + getHorizontalOffset(), this.f22583n + getVerticalOffset(), null);
        } else {
            if (z2) {
                throw null;
            }
            getHorizontalOffset();
            getVerticalOffset();
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f22582j = getPaddingLeft();
        getPaddingRight();
        this.f22583n = getPaddingTop();
        getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            this.f22581i.getClass();
            throw null;
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f22584o) {
            invalidate();
        }
        this.f22584o = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f22589t = -1.0f;
        } else if (i2 != 80) {
            this.f22589t = 0.0f;
        } else {
            this.f22589t = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f22588s = 0.0f;
                        return;
                    }
                }
            }
            this.f22588s = 1.0f;
            return;
        }
        this.f22588s = -1.0f;
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f22578d = f;
            float f2 = this.f22577c;
            this.f22577c = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f22578d != f;
        this.f22578d = f;
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
        boolean z2 = this.f22577c != f;
        this.f22577c = f;
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

    public void setScaleFromTextSize(float f) {
        this.f22580g = f;
    }

    public void setText(CharSequence charSequence) {
        this.f22581i = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f22590u = f;
        m7314b();
        throw null;
    }

    public void setTextBackgroundPanY(float f) {
        this.f22591v = f;
        m7314b();
        throw null;
    }

    public void setTextBackgroundRotate(float f) {
        this.f22593x = f;
        m7314b();
        throw null;
    }

    public void setTextBackgroundZoom(float f) {
        this.f22592w = f;
        m7314b();
        throw null;
    }

    public void setTextFillColor(int i) {
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f22575a = i;
        this.f22576b = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f22576b = true;
        if (Float.isNaN(f)) {
            this.f22576b = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f22588s = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f22589t = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f22579f = f;
        Float.isNaN(this.f22580g);
        throw null;
    }

    public void setTextureHeight(float f) {
        this.f22586q = f;
        m7314b();
        throw null;
    }

    public void setTextureWidth(float f) {
        this.f22587r = f;
        m7314b();
        throw null;
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }
}
