package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.C3734R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
final class NavigationRailItemView extends NavigationBarItemView {
    public NavigationRailItemView(@NonNull Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @DimenRes
    public int getItemDefaultMarginResId() {
        return C3734R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @LayoutRes
    public int getItemLayoutResId() {
        return C3734R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
