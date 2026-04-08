package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: d */
    public int f32436d;

    /* JADX INFO: renamed from: f */
    public boolean f32437f;

    /* JADX INFO: renamed from: g */
    public boolean f32438g;

    /* JADX INFO: renamed from: i */
    public float f32439i;

    /* JADX INFO: renamed from: j */
    public float f32440j;

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$1 */
    /* JADX INFO: compiled from: Proguard */
    class ViewOnClickListenerC22411 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$2 */
    /* JADX INFO: compiled from: Proguard */
    class ViewOnClickListenerC22422 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* JADX INFO: renamed from: b */
    public final void mo12060b(float f) {
        getHeight();
        throw null;
    }

    public boolean getDrawFullUnderline() {
        return this.f32437f;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), 0);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f32436d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f32438g) {
            return false;
        }
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (action == 0) {
            this.f32439i = x;
            this.f32440j = y2;
            this.f32438g = false;
            return true;
        }
        if (action == 1) {
            throw null;
        }
        if (action == 2) {
            float f = 0;
            if (Math.abs(x - this.f32439i) > f || Math.abs(y2 - this.f32440j) > f) {
                this.f32438g = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
    }

    public void setDrawFullUnderline(boolean z2) {
        this.f32437f = z2;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.f32436d = i;
        throw null;
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(getContext().getColor(i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        if (i < 0) {
            i = 0;
        }
        super.setTextSpacing(i);
    }
}
