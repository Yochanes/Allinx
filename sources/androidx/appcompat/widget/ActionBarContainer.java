package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f928a;

    /* JADX INFO: renamed from: b */
    public ScrollingTabContainerView f929b;

    /* JADX INFO: renamed from: c */
    public View f930c;

    /* JADX INFO: renamed from: d */
    public View f931d;

    /* JADX INFO: renamed from: f */
    public Drawable f932f;

    /* JADX INFO: renamed from: g */
    public Drawable f933g;

    /* JADX INFO: renamed from: i */
    public Drawable f934i;

    /* JADX INFO: renamed from: j */
    public final boolean f935j;

    /* JADX INFO: renamed from: n */
    public boolean f936n;

    /* JADX INFO: renamed from: o */
    public final int f937o;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new ActionBarBackgroundDrawable(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f262a);
        boolean z2 = false;
        this.f932f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f933g = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f937o = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.exchange.allin.R.id.split_action_bar) {
            this.f935j = true;
            this.f934i = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f935j ? !(this.f932f != null || this.f933g != null) : this.f934i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    /* JADX INFO: renamed from: a */
    public static int m494a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f932f;
        if (drawable != null && drawable.isStateful()) {
            this.f932f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f933g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f933g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f934i;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f934i.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f929b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f932f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f933g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f934i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f930c = findViewById(com.exchange.allin.R.id.action_bar);
        this.f931d = findViewById(com.exchange.allin.R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f928a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z2, i, i2, i3, i4);
        ScrollingTabContainerView scrollingTabContainerView = this.f929b;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8) ? false : true;
        if (scrollingTabContainerView != null && scrollingTabContainerView.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) scrollingTabContainerView.getLayoutParams();
            int measuredHeight2 = measuredHeight - scrollingTabContainerView.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            scrollingTabContainerView.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f935j) {
            Drawable drawable2 = this.f934i;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = z4;
            }
        } else {
            if (this.f932f != null) {
                if (this.f930c.getVisibility() == 0) {
                    this.f932f.setBounds(this.f930c.getLeft(), this.f930c.getTop(), this.f930c.getRight(), this.f930c.getBottom());
                } else {
                    View view = this.f931d;
                    if (view == null || view.getVisibility() != 0) {
                        this.f932f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f932f.setBounds(this.f931d.getLeft(), this.f931d.getTop(), this.f931d.getRight(), this.f931d.getBottom());
                    }
                }
                z4 = true;
            }
            this.f936n = z5;
            if (z5 && (drawable = this.f933g) != null) {
                drawable.setBounds(scrollingTabContainerView.getLeft(), scrollingTabContainerView.getTop(), scrollingTabContainerView.getRight(), scrollingTabContainerView.getBottom());
            }
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iM494a;
        int i3;
        if (this.f930c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f937o) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f930c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        ScrollingTabContainerView scrollingTabContainerView = this.f929b;
        if (scrollingTabContainerView == null || scrollingTabContainerView.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f930c;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f931d;
            iM494a = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : m494a(this.f931d);
        } else {
            iM494a = m494a(this.f930c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m494a(this.f929b) + iM494a, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f932f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f932f);
        }
        this.f932f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f930c;
            if (view != null) {
                this.f932f.setBounds(view.getLeft(), this.f930c.getTop(), this.f930c.getRight(), this.f930c.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f935j ? !(this.f932f != null || this.f933g != null) : this.f934i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f934i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f934i);
        }
        this.f934i = drawable;
        boolean z2 = this.f935j;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f934i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f932f != null || this.f933g != null) : this.f934i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f933g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f933g);
        }
        this.f933g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f936n && (drawable2 = this.f933g) != null) {
                drawable2.setBounds(this.f929b.getLeft(), this.f929b.getTop(), this.f929b.getRight(), this.f929b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f935j ? !(this.f932f != null || this.f933g != null) : this.f934i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        ScrollingTabContainerView scrollingTabContainerView2 = this.f929b;
        if (scrollingTabContainerView2 != null) {
            removeView(scrollingTabContainerView2);
        }
        this.f929b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f928a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f932f;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f933g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f934i;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f932f;
        boolean z2 = this.f935j;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f933g && this.f936n) {
            return true;
        }
        return (drawable == this.f934i && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
