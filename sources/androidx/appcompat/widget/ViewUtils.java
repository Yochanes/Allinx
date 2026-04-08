package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ViewUtils {

    /* JADX INFO: renamed from: a */
    public static boolean f1490a;

    /* JADX INFO: renamed from: b */
    public static Method f1491b;

    /* JADX INFO: renamed from: c */
    public static final boolean f1492c;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m741a(@NonNull View view, @NonNull Rect rect, @NonNull Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f1492c = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: a */
    public static void m740a(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m741a(view, rect, rect2);
            return;
        }
        if (!f1490a) {
            f1490a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f1491b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1491b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f1491b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
