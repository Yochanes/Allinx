package androidx.compose.p013ui.graphics;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CanvasUtils {

    /* JADX INFO: renamed from: a */
    public static Method f17571a;

    /* JADX INFO: renamed from: b */
    public static Method f17572b;

    /* JADX INFO: renamed from: c */
    public static boolean f17573c;

    /* JADX INFO: renamed from: a */
    public static void m5178a(Canvas canvas, boolean z2) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z2) {
                AbstractC1221b.m5291e(canvas);
                return;
            } else {
                AbstractC1221b.m5300n(canvas);
                return;
            }
        }
        if (!f17573c) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f17571a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f17572b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f17571a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f17572b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f17571a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f17572b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f17573c = true;
        }
        if (z2) {
            try {
                Method method4 = f17571a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = f17572b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
