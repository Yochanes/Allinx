package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ThemeUtils {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f1400a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f1401b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f1402c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f1403d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f1404e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f1405f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f1406g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m697a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(androidx.appcompat.R.styleable.f271j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m698b(Context context, int i) {
        ColorStateList colorStateListM700d = m700d(context, i);
        if (colorStateListM700d != null && colorStateListM700d.isStateful()) {
            return colorStateListM700d.getColorForState(f1401b, colorStateListM700d.getDefaultColor());
        }
        ThreadLocal threadLocal = f1400a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return ColorUtils.m7560i(m699c(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m699c(Context context, int i) {
        int[] iArr = f1406g;
        iArr[0] = i;
        TintTypedArray tintTypedArrayM703e = TintTypedArray.m703e(context, null, iArr);
        try {
            return tintTypedArrayM703e.f1413b.getColor(0, 0);
        } finally {
            tintTypedArrayM703e.m709g();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m700d(Context context, int i) {
        int[] iArr = f1406g;
        iArr[0] = i;
        TintTypedArray tintTypedArrayM703e = TintTypedArray.m703e(context, null, iArr);
        try {
            return tintTypedArrayM703e.m705a(0);
        } finally {
            tintTypedArrayM703e.m709g();
        }
    }
}
