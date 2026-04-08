package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ViewConfigurationCompat {

    /* JADX INFO: renamed from: a */
    public static final Method f23423a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static float m7860a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* JADX INFO: renamed from: b */
        public static float m7861b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static int m7862a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m7863b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
        /* JADX INFO: renamed from: a */
        public static int m7864a(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        /* JADX INFO: renamed from: b */
        public static int m7865b(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f23423a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m7855a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f23423a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static float m7856b(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.m7860a(viewConfiguration) : m7855a(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: c */
    public static int m7857c(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.m7862a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* JADX INFO: renamed from: d */
    public static float m7858d(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.m7861b(viewConfiguration) : m7855a(viewConfiguration, context);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7859e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.m7863b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
