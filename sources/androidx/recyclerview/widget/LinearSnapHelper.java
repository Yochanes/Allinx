package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LinearSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: a */
    public OrientationHelper f31687a;

    /* JADX INFO: renamed from: b */
    public OrientationHelper f31688b;

    /* JADX INFO: renamed from: b */
    public static View m11607b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo11622l = (orientationHelper.mo11622l() / 2) + orientationHelper.mo11621k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs(((orientationHelper.mo11613c(childAt) / 2) + orientationHelper.mo11615e(childAt)) - iMo11622l);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final int m11608a(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        int childCount = layoutManager.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = layoutManager.getChildAt(i5);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i4) {
                        view = childAt;
                        i4 = position;
                    }
                    if (position > i3) {
                        view2 = childAt;
                        i3 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(orientationHelper.mo11612b(view), orientationHelper.mo11612b(view2)) - Math.min(orientationHelper.mo11615e(view), orientationHelper.mo11615e(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / f);
    }

    /* JADX INFO: renamed from: c */
    public final OrientationHelper m11609c(RecyclerView.LayoutManager layoutManager) {
        if (this.f31688b.f31691a != layoutManager) {
            this.f31688b = new OrientationHelper.C21391(layoutManager);
        }
        return this.f31688b;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            OrientationHelper orientationHelperM11609c = m11609c(layoutManager);
            iArr[0] = ((orientationHelperM11609c.mo11613c(view) / 2) + orientationHelperM11609c.mo11615e(view)) - ((orientationHelperM11609c.mo11622l() / 2) + orientationHelperM11609c.mo11621k());
        } else {
            iArr[0] = 0;
        }
        if (!layoutManager.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        OrientationHelper orientationHelperM11610d = m11610d(layoutManager);
        iArr[1] = ((orientationHelperM11610d.mo11613c(view) / 2) + orientationHelperM11610d.mo11615e(view)) - ((orientationHelperM11610d.mo11622l() / 2) + orientationHelperM11610d.mo11621k());
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final OrientationHelper m11610d(RecyclerView.LayoutManager layoutManager) {
        if (this.f31687a.f31691a != layoutManager) {
            this.f31687a = new OrientationHelper.C21402(layoutManager);
        }
        return this.f31687a;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return m11607b(layoutManager, m11610d(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return m11607b(layoutManager, m11609c(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iM11608a;
        int iM11608a2;
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (itemCount = layoutManager.getItemCount()) != 0 && (viewFindSnapView = findSnapView(layoutManager)) != null && (position = layoutManager.getPosition(viewFindSnapView)) != -1 && (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) != null) {
            if (layoutManager.canScrollHorizontally()) {
                iM11608a = m11608a(layoutManager, m11609c(layoutManager), i, 0);
                if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                    iM11608a = -iM11608a;
                }
            } else {
                iM11608a = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iM11608a2 = m11608a(layoutManager, m11610d(layoutManager), 0, i2);
                if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                    iM11608a2 = -iM11608a2;
                }
            } else {
                iM11608a2 = 0;
            }
            if (layoutManager.canScrollVertically()) {
                iM11608a = iM11608a2;
            }
            if (iM11608a != 0) {
                int i4 = position + iM11608a;
                int i5 = i4 >= 0 ? i4 : 0;
                return i5 >= itemCount ? i3 : i5;
            }
        }
        return -1;
    }
}
