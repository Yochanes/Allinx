package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ViewGroupUtils {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f22936a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f22937b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m7390a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m7390a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
