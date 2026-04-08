package io.intercom.android.sdk.utilities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BackgroundUtils {
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setButtonColor(TextView textView, @ColorInt int i) {
        int iButtonTextColorVariant = ColorUtils.buttonTextColorVariant(i);
        int iButtonBackgroundColorVariant = ColorUtils.buttonBackgroundColorVariant(i);
        textView.setTextColor(iButtonTextColorVariant);
        textView.getBackground().setColorFilter(iButtonBackgroundColorVariant, PorterDuff.Mode.SRC_ATOP);
    }
}
