package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PagerSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: a */
    public OrientationHelper f31694a;

    /* JADX INFO: renamed from: b */
    public OrientationHelper f31695b;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.PagerSnapHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    class C21411 extends LinearSmoothScroller {
        public C21411(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
            int[] iArrCalculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                action.m11701b(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11626a(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.mo11613c(view) / 2) + orientationHelper.mo11615e(view)) - ((orientationHelper.mo11622l() / 2) + orientationHelper.mo11621k());
    }

    /* JADX INFO: renamed from: b */
    public static View m11627b(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
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

    /* JADX INFO: renamed from: c */
    public final OrientationHelper m11628c(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f31695b;
        if (orientationHelper == null || orientationHelper.f31691a != layoutManager) {
            this.f31695b = new OrientationHelper.C21391(layoutManager);
        }
        return this.f31695b;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = m11626a(view, m11628c(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = m11626a(view, m11629d(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new C21411(this.mRecyclerView.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final OrientationHelper m11629d(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f31694a;
        if (orientationHelper == null || orientationHelper.f31691a != layoutManager) {
            this.f31694a = new OrientationHelper.C21402(layoutManager);
        }
        return this.f31694a;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return m11627b(layoutManager, m11629d(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return m11627b(layoutManager, m11628c(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (itemCount != 0) {
            View view = null;
            OrientationHelper orientationHelperM11629d = layoutManager.canScrollVertically() ? m11629d(layoutManager) : layoutManager.canScrollHorizontally() ? m11628c(layoutManager) : null;
            if (orientationHelperM11629d != null) {
                int childCount = layoutManager.getChildCount();
                boolean z2 = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = layoutManager.getChildAt(i5);
                    if (childAt != null) {
                        int iM11626a = m11626a(childAt, orientationHelperM11629d);
                        if (iM11626a <= 0 && iM11626a > i4) {
                            view2 = childAt;
                            i4 = iM11626a;
                        }
                        if (iM11626a >= 0 && iM11626a < i3) {
                            view = childAt;
                            i3 = iM11626a;
                        }
                    }
                }
                boolean z3 = !layoutManager.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z3 && view != null) {
                    return layoutManager.getPosition(view);
                }
                if (!z3 && view2 != null) {
                    return layoutManager.getPosition(view2);
                }
                if (z3) {
                    view = view2;
                }
                if (view != null) {
                    int position = layoutManager.getPosition(view);
                    int itemCount2 = layoutManager.getItemCount();
                    if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z2 = true;
                    }
                    int i6 = position + (z2 == z3 ? -1 : 1);
                    if (i6 >= 0 && i6 < itemCount) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }
}
