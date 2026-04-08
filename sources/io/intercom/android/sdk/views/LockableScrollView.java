package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LockableScrollView extends ScrollView {
    private boolean interceptTouch;
    private boolean isExpanded;
    private int maxHeight;
    private boolean scrollable;

    public LockableScrollView(Context context) {
        super(context);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.interceptTouch;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.isExpanded) {
            int mode = View.MeasureSpec.getMode(i2);
            i2 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.maxHeight), mode) : View.MeasureSpec.makeMeasureSpec(this.maxHeight, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.scrollable && super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        if (this.scrollable) {
            super.scrollTo(i, i2);
        }
    }

    public void setExpanded(boolean z2) {
        if (z2 != this.isExpanded) {
            this.isExpanded = z2;
            requestLayout();
            invalidate();
        }
    }

    public void setScrollingEnabled(boolean z2) {
        this.scrollable = z2;
    }

    public void setUp(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5101R.styleable.LockableScrollView);
        this.maxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5101R.styleable.LockableScrollView_intercomHeightLimit, 0);
        this.isExpanded = typedArrayObtainStyledAttributes.getBoolean(C5101R.styleable.LockableScrollView_intercomExpanded, true);
        this.interceptTouch = typedArrayObtainStyledAttributes.getBoolean(C5101R.styleable.LockableScrollView_intercomInterceptTouch, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void toggleExpanded() {
        setExpanded(!this.isExpanded);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
        setUp(attributeSet);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollable = true;
        this.maxHeight = 0;
        this.isExpanded = true;
        this.interceptTouch = false;
        setUp(attributeSet);
    }
}
