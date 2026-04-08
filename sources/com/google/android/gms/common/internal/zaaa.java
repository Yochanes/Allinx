package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.android.gms.base.C3725R;
import com.google.android.gms.common.util.DeviceProperties;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(AbstractC2929c.m13702g(33, i, "Unknown color scheme: "));
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C3725R.drawable.common_google_signin_btn_icon_dark;
        int i5 = C3725R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i2, i4, i5, i5);
        int i6 = C3725R.drawable.common_google_signin_btn_text_dark;
        int i7 = C3725R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            throw new IllegalStateException(AbstractC2929c.m13702g(32, i, "Unknown button size: "));
        }
        Drawable drawable = resources.getDrawable(iZab);
        drawable.setTintList(resources.getColorStateList(C3725R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i8 = C3725R.color.common_google_signin_btn_text_dark;
        int i9 = C3725R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(C3725R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C3725R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new IllegalStateException(AbstractC2929c.m13702g(32, i, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
