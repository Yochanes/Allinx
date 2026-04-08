package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private final View view;
    private boolean verticalOffsetEnabled = true;
    private boolean horizontalOffsetEnabled = true;

    public ViewOffsetHelper(View view) {
        this.view = view;
    }

    public void applyOffsets() {
        View view = this.view;
        int top = this.offsetTop - (view.getTop() - this.layoutTop);
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        view.offsetTopAndBottom(top);
        View view2 = this.view;
        view2.offsetLeftAndRight(this.offsetLeft - (view2.getLeft() - this.layoutLeft));
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    public void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean z2) {
        this.horizontalOffsetEnabled = z2;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (!this.horizontalOffsetEnabled || this.offsetLeft == i) {
            return false;
        }
        this.offsetLeft = i;
        applyOffsets();
        return true;
    }

    public boolean setTopAndBottomOffset(int i) {
        if (!this.verticalOffsetEnabled || this.offsetTop == i) {
            return false;
        }
        this.offsetTop = i;
        applyOffsets();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z2) {
        this.verticalOffsetEnabled = z2;
    }
}
