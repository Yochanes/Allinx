package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.transition.CanvasUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewPort extends ViewGroup implements GhostView {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f32232c = 0;

    /* JADX INFO: renamed from: a */
    public ViewGroup f32233a;

    /* JADX INFO: renamed from: b */
    public View f32234b;

    /* JADX INFO: renamed from: androidx.transition.GhostViewPort$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewTreeObserverOnPreDrawListenerC22161 implements ViewTreeObserver.OnPreDrawListener {
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            CanvasUtils.Api29Impl.m11957b(canvas);
        } else {
            if (i == 28) {
                throw new IllegalStateException("This method doesn't work on Pie!");
            }
            if (!CanvasUtils.f32162c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    CanvasUtils.f32160a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    CanvasUtils.f32161b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                CanvasUtils.f32162c = true;
            }
            try {
                Method method = CanvasUtils.f32160a;
                if (method != null) {
                    method.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        canvas.setMatrix(null);
        ViewUtils.m12007b(null, 0);
        throw null;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
