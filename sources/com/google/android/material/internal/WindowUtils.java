package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.AbstractC2335a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class WindowUtils {
    private static final String TAG = "WindowUtils";

    /* JADX INFO: compiled from: Proguard */
    public static class Api14Impl {
        private Api14Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            int i;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            int i2 = realSizeForDisplay.x;
            if (i2 == 0 || (i = realSizeForDisplay.y) == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = i2;
            rect.bottom = i;
            return rect;
        }

        private static Point getRealSizeForDisplay(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (IllegalAccessException e) {
                Log.w(WindowUtils.access$000(), e);
                return point;
            } catch (NoSuchMethodException e2) {
                Log.w(WindowUtils.access$000(), e2);
                return point;
            } catch (InvocationTargetException e3) {
                Log.w(WindowUtils.access$000(), e3);
                return point;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api17Impl {
        private Api17Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        private Api30Impl() {
        }

        @NonNull
        public static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            return AbstractC2335a.m12300i(AbstractC2335a.m12302k(windowManager));
        }
    }

    private WindowUtils() {
    }

    public static /* synthetic */ String access$000() {
        return TAG;
    }

    @NonNull
    public static Rect getCurrentWindowBounds(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.getCurrentWindowBounds(windowManager) : Api17Impl.getCurrentWindowBounds(windowManager);
    }
}
