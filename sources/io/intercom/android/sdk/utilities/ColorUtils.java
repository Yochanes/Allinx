package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.identity.AppConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ColorUtils {
    private static final double ACCESSIBILITY_CONTRAST_RATIO = 4.5d;
    private static final float BRIGHTNESS_CUTOFF = 0.7f;
    private static final char COLOR_PREFIX = '#';
    private static final String SHORT_COLOR_REGEX = "#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])";
    private static final int SHORT_COLOR_WITH_PREFIX_LENGTH = 4;

    public static int buttonBackgroundColorVariant(int i) {
        float[] fArr = new float[3];
        androidx.core.graphics.ColorUtils.m7556e(i, fArr);
        float f = fArr[2];
        float f2 = 0.95f - f;
        double d = f;
        return d > 0.9d ? darkenColor(i, f - 0.85f) : d < 0.35d ? lightenColor(i, f2) : lightenColor(i, f2);
    }

    public static int buttonTextColorVariant(int i) {
        float[] fArr = new float[3];
        androidx.core.graphics.ColorUtils.m7556e(i, fArr);
        float f = fArr[2];
        float f2 = f - 0.3f;
        double d = f;
        return d > 0.9d ? darkenColor(i, f2) : d < 0.35d ? i : darkenColor(i, f2);
    }

    @ColorRes
    private static int darkColorRes() {
        return C5101R.color.intercom_accessibility_black;
    }

    public static int darkenColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.79f;
        return Color.HSVToColor(fArr);
    }

    public static int desaturateColor(int i, float f) {
        float[] fArr = {0.0f, f, 0.0f};
        androidx.core.graphics.ColorUtils.m7556e(i, fArr);
        float f2 = fArr[1] - f;
        fArr[1] = Math.max(0.0f, Math.min(f2, 1.0f));
        return androidx.core.graphics.ColorUtils.m7552a(fArr);
    }

    public static boolean isColorLight(String str) {
        return androidx.core.graphics.ColorUtils.m7555d(Color.parseColor(str)) > 0.699999988079071d;
    }

    public static boolean isComparedColorsLowerThanAccessibilityContrastRatio(@ColorInt int i, @ColorInt int i2) {
        ThreadLocal threadLocal = androidx.core.graphics.ColorUtils.f23198a;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = androidx.core.graphics.ColorUtils.m7557f(i, i2);
        }
        double dM7555d = androidx.core.graphics.ColorUtils.m7555d(i) + 0.05d;
        double dM7555d2 = androidx.core.graphics.ColorUtils.m7555d(i2) + 0.05d;
        return Math.max(dM7555d, dM7555d2) / Math.min(dM7555d, dM7555d2) < 4.5d;
    }

    public static int lightenColor(int i) {
        return Color.argb(Color.alpha(i), (Color.red(i) + 255) / 2, (Color.green(i) + 255) / 2, (Color.blue(i) + 255) / 2);
    }

    public static ColorFilter newGreyscaleFilter() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    @ColorInt
    public static int parseColor(@NonNull String str) {
        if (str.length() == 4 && str.charAt(0) == '#') {
            str = str.replaceAll(SHORT_COLOR_REGEX, "#$1$1$2$2$3$3");
        }
        return Color.parseColor(str);
    }

    @ColorInt
    public static int primaryOrBlackAccessibility(Context context, AppConfig appConfig) {
        return isColorLight(appConfig.getPrimaryColor()) ? context.getColor(C5101R.color.intercom_accessibility_black) : appConfig.getPrimaryColor();
    }

    @ColorInt
    private static int primaryOrBlackColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? context.getColor(C5101R.color.intercom_black) : appConfig.getPrimaryColor();
    }

    @ColorInt
    public static int primaryOrDarkColor(Context context, AppConfig appConfig) {
        return appConfig.isPrimaryColorRenderDarkText() ? context.getColor(darkColorRes()) : appConfig.getPrimaryColor();
    }

    public static void setImageColorWhiteOrBlack(ImageView imageView, boolean z2) {
        imageView.setColorFilter(whiteOrBlackColor(imageView.getContext(), z2));
    }

    public static void setTextColorPrimaryOrBlack(TextView textView, AppConfig appConfig) {
        int iPrimaryOrBlackColor = primaryOrBlackColor(textView.getContext(), appConfig);
        textView.setTextColor(iPrimaryOrBlackColor);
        textView.setLinkTextColor(iPrimaryOrBlackColor);
    }

    public static void setTextColorPrimaryOrDark(TextView textView, AppConfig appConfig) {
        int iPrimaryOrDarkColor = primaryOrDarkColor(textView.getContext(), appConfig);
        textView.setTextColor(iPrimaryOrDarkColor);
        textView.setLinkTextColor(iPrimaryOrDarkColor);
    }

    public static void setTextColorWhiteOrBlack(TextView textView, boolean z2) {
        int iWhiteOrBlackColor = whiteOrBlackColor(textView.getContext(), z2);
        textView.setTextColor(iWhiteOrBlackColor);
        textView.setLinkTextColor(iWhiteOrBlackColor);
    }

    public static void setTextColorWhiteOrDark(TextView textView, boolean z2) {
        int iWhiteOrDarkColor = whiteOrDarkColor(textView.getContext(), z2);
        textView.setTextColor(iWhiteOrDarkColor);
        textView.setLinkTextColor(iWhiteOrDarkColor);
    }

    @ColorInt
    public static int whiteOrBlackAccessibility(Context context, AppConfig appConfig) {
        return isColorLight(appConfig.getPrimaryColor()) ? context.getColor(C5101R.color.intercom_accessibility_black) : context.getColor(C5101R.color.intercom_white);
    }

    @ColorInt
    public static int whiteOrBlackColor(Context context, boolean z2) {
        return context.getColor(z2 ? C5101R.color.intercom_accessibility_black : C5101R.color.intercom_white);
    }

    @ColorInt
    public static int whiteOrDarkColor(Context context, boolean z2) {
        return z2 ? context.getColor(darkColorRes()) : context.getColor(C5101R.color.intercom_white);
    }

    public static boolean isColorLight(@ColorInt int i) {
        return 1.05d / (androidx.core.graphics.ColorUtils.m7555d(i) + 0.05d) < 4.5d;
    }

    public static int darkenColor(int i, float f) {
        float[] fArr = {0.0f, 0.0f, f};
        androidx.core.graphics.ColorUtils.m7556e(i, fArr);
        float f2 = fArr[2] - f;
        fArr[2] = Math.max(0.0f, Math.min(f2, 1.0f));
        return androidx.core.graphics.ColorUtils.m7552a(fArr);
    }

    public static int lightenColor(int i, float f) {
        float[] fArr = {0.0f, 0.0f, f};
        androidx.core.graphics.ColorUtils.m7556e(i, fArr);
        float f2 = fArr[2] + f;
        fArr[2] = Math.max(0.0f, Math.min(f2, 1.0f));
        return androidx.core.graphics.ColorUtils.m7552a(fArr);
    }
}
