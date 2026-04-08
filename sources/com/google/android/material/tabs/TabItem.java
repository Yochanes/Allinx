package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C3734R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayM703e = TintTypedArray.m703e(context, attributeSet, C3734R.styleable.TabItem);
        int i = C3734R.styleable.TabItem_android_text;
        TypedArray typedArray = tintTypedArrayM703e.f1413b;
        this.text = typedArray.getText(i);
        this.icon = tintTypedArrayM703e.m706b(C3734R.styleable.TabItem_android_icon);
        this.customLayout = typedArray.getResourceId(C3734R.styleable.TabItem_android_layout, 0);
        tintTypedArrayM703e.m709g();
    }
}
