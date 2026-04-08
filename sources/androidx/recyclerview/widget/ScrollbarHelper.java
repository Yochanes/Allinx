package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ScrollbarHelper {
    /* JADX INFO: renamed from: a */
    public static int m11708a(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2) {
        if (layoutManager.getChildCount() == 0 || state.m11703b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(orientationHelper.mo11622l(), orientationHelper.mo11612b(view2) - orientationHelper.mo11615e(view));
    }

    /* JADX INFO: renamed from: b */
    public static int m11709b(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2, boolean z3) {
        if (layoutManager.getChildCount() == 0 || state.m11703b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (state.m11703b() - Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2))) - 1) : Math.max(0, Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(orientationHelper.mo11612b(view2) - orientationHelper.mo11615e(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (orientationHelper.mo11621k() - orientationHelper.mo11615e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    public static int m11710c(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z2) {
        if (layoutManager.getChildCount() == 0 || state.m11703b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return state.m11703b();
        }
        return (int) (((orientationHelper.mo11612b(view2) - orientationHelper.mo11615e(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * state.m11703b());
    }
}
