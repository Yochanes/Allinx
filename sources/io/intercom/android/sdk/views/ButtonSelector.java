package io.intercom.android.sdk.views;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ButtonSelector extends StateListDrawable {
    private final int color;

    public ButtonSelector(Context context, int i, int i2) {
        this.color = i2;
        addState(new int[]{R.attr.state_enabled}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_focused}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_pressed}, context.getResources().getDrawable(i));
    }

    private static int darken(int i, double d) {
        return Color.argb(255, (int) (((double) Color.red(i)) * d), (int) (((double) Color.green(i)) * d), (int) (((double) Color.blue(i)) * d));
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842919 || i == 16842908) {
                z2 = true;
            }
        }
        if (z2) {
            setColorFilter(darken(this.color, 0.9d), PorterDuff.Mode.SRC);
        } else {
            setColorFilter(this.color, PorterDuff.Mode.SRC);
        }
        return super.onStateChange(iArr);
    }
}
