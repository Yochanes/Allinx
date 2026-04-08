package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.AbstractC0455a;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: compiled from: Proguard */
    public static class AnchorInfo {

        /* JADX INFO: renamed from: a */
        public OrientationHelper f31663a;

        /* JADX INFO: renamed from: b */
        public int f31664b;

        /* JADX INFO: renamed from: c */
        public int f31665c;

        /* JADX INFO: renamed from: d */
        public boolean f31666d;

        /* JADX INFO: renamed from: e */
        public boolean f31667e;

        public AnchorInfo() {
            m11604d();
        }

        /* JADX INFO: renamed from: a */
        public final void m11601a() {
            this.f31665c = this.f31666d ? this.f31663a.mo11617g() : this.f31663a.mo11621k();
        }

        /* JADX INFO: renamed from: b */
        public final void m11602b(int i, View view) {
            if (this.f31666d) {
                int iMo11612b = this.f31663a.mo11612b(view);
                OrientationHelper orientationHelper = this.f31663a;
                this.f31665c = (Integer.MIN_VALUE == orientationHelper.f31692b ? 0 : orientationHelper.mo11622l() - orientationHelper.f31692b) + iMo11612b;
            } else {
                this.f31665c = this.f31663a.mo11615e(view);
            }
            this.f31664b = i;
        }

        /* JADX INFO: renamed from: c */
        public final void m11603c(int i, View view) {
            OrientationHelper orientationHelper = this.f31663a;
            int iMo11622l = Integer.MIN_VALUE == orientationHelper.f31692b ? 0 : orientationHelper.mo11622l() - orientationHelper.f31692b;
            if (iMo11622l >= 0) {
                m11602b(i, view);
                return;
            }
            this.f31664b = i;
            if (!this.f31666d) {
                int iMo11615e = this.f31663a.mo11615e(view);
                int iMo11621k = iMo11615e - this.f31663a.mo11621k();
                this.f31665c = iMo11615e;
                if (iMo11621k > 0) {
                    int iMo11617g = (this.f31663a.mo11617g() - Math.min(0, (this.f31663a.mo11617g() - iMo11622l) - this.f31663a.mo11612b(view))) - (this.f31663a.mo11613c(view) + iMo11615e);
                    if (iMo11617g < 0) {
                        this.f31665c -= Math.min(iMo11621k, -iMo11617g);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo11617g2 = (this.f31663a.mo11617g() - iMo11622l) - this.f31663a.mo11612b(view);
            this.f31665c = this.f31663a.mo11617g() - iMo11617g2;
            if (iMo11617g2 > 0) {
                int iMo11613c = this.f31665c - this.f31663a.mo11613c(view);
                int iMo11621k2 = this.f31663a.mo11621k();
                int iMin = iMo11613c - (Math.min(this.f31663a.mo11615e(view) - iMo11621k2, 0) + iMo11621k2);
                if (iMin < 0) {
                    this.f31665c = Math.min(iMo11617g2, -iMin) + this.f31665c;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m11604d() {
            this.f31664b = -1;
            this.f31665c = Integer.MIN_VALUE;
            this.f31666d = false;
            this.f31667e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f31664b);
            sb.append(", mCoordinate=");
            sb.append(this.f31665c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f31666d);
            sb.append(", mValid=");
            return AbstractC0455a.m2243r(sb, this.f31667e, '}');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutChunkResult {

        /* JADX INFO: renamed from: a */
        public int f31668a;

        /* JADX INFO: renamed from: b */
        public boolean f31669b;

        /* JADX INFO: renamed from: c */
        public boolean f31670c;

        /* JADX INFO: renamed from: d */
        public boolean f31671d;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutState {

        /* JADX INFO: renamed from: a */
        public boolean f31672a;

        /* JADX INFO: renamed from: b */
        public int f31673b;

        /* JADX INFO: renamed from: c */
        public int f31674c;

        /* JADX INFO: renamed from: d */
        public int f31675d;

        /* JADX INFO: renamed from: e */
        public int f31676e;

        /* JADX INFO: renamed from: f */
        public int f31677f;

        /* JADX INFO: renamed from: g */
        public int f31678g;

        /* JADX INFO: renamed from: h */
        public int f31679h;

        /* JADX INFO: renamed from: i */
        public int f31680i;

        /* JADX INFO: renamed from: j */
        public int f31681j;

        /* JADX INFO: renamed from: k */
        public List f31682k;

        /* JADX INFO: renamed from: l */
        public boolean f31683l;

        /* JADX INFO: renamed from: a */
        public final void m11605a(View view) {
            int layoutPosition;
            int size = this.f31682k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.ViewHolder) this.f31682k.get(i2)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.f31720a.isRemoved() && (layoutPosition = (layoutParams.f31720a.getLayoutPosition() - this.f31675d) * this.f31676e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f31675d = -1;
            } else {
                this.f31675d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).f31720a.getLayoutPosition();
            }
        }

        /* JADX INFO: renamed from: b */
        public final View m11606b(RecyclerView.Recycler recycler) {
            List list = this.f31682k;
            if (list == null) {
                View view = recycler.m11695l(this.f31675d, Long.MAX_VALUE).itemView;
                this.f31675d += this.f31676e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = ((RecyclerView.ViewHolder) this.f31682k.get(i)).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                if (!layoutParams.f31720a.isRemoved() && this.f31675d == layoutParams.f31720a.getLayoutPosition()) {
                    m11605a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C21341();

        /* JADX INFO: renamed from: a */
        public int f31684a;

        /* JADX INFO: renamed from: b */
        public int f31685b;

        /* JADX INFO: renamed from: c */
        public boolean f31686c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C21341 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f31684a = parcel.readInt();
                savedState.f31685b = parcel.readInt();
                savedState.f31686c = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f31684a);
            parcel.writeInt(this.f31685b);
            parcel.writeInt(this.f31686c ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.f31677f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m11598m(i > 0 ? 1 : -1, Math.abs(i), true, state);
        collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z2;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i2 = savedState.f31684a) < 0) {
            m11597l();
            z2 = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = savedState.f31686c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            layoutPrefetchRegistry.mo11573a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = layoutState.f31675d;
        if (i < 0 || i >= state.m11703b()) {
            return;
        }
        layoutPrefetchRegistry.mo11573a(i, Math.max(0, layoutState.f31678g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m11589d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m11590e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m11591f(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m11589d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m11590e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m11591f(state);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public LayoutState createLayoutState() {
        LayoutState layoutState = new LayoutState();
        layoutState.f31672a = true;
        layoutState.f31679h = 0;
        layoutState.f31680i = 0;
        layoutState.f31682k = null;
        return layoutState;
    }

    /* JADX INFO: renamed from: d */
    public final int m11589d(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.m11708a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: e */
    public final int m11590e(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.m11709b(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m11591f(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.m11710c(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z2) {
        int i;
        int i2 = layoutState.f31674c;
        int i3 = layoutState.f31678g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                layoutState.f31678g = i3 + i2;
            }
            m11595j(recycler, layoutState);
        }
        int i4 = layoutState.f31674c + layoutState.f31679h;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.f31683l && i4 <= 0) || (i = layoutState.f31675d) < 0 || i >= state.m11703b()) {
                break;
            }
            layoutChunkResult.f31668a = 0;
            layoutChunkResult.f31669b = false;
            layoutChunkResult.f31670c = false;
            layoutChunkResult.f31671d = false;
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f31669b) {
                int i5 = layoutState.f31673b;
                int i6 = layoutChunkResult.f31668a;
                layoutState.f31673b = (layoutState.f31677f * i6) + i5;
                if (!layoutChunkResult.f31670c || layoutState.f31682k != null || !state.f31755g) {
                    layoutState.f31674c -= i6;
                    i4 -= i6;
                }
                int i7 = layoutState.f31678g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    layoutState.f31678g = i8;
                    int i9 = layoutState.f31674c;
                    if (i9 < 0) {
                        layoutState.f31678g = i8 + i9;
                    }
                    m11595j(recycler, layoutState);
                }
                if (z2 && layoutChunkResult.f31671d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - layoutState.f31674c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z2, boolean z3) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z2, z3) : findOneVisibleChild(getChildCount() - 1, -1, z2, z3);
    }

    public View findFirstVisibleChildClosestToStart(boolean z2, boolean z3) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z2, z3) : findOneVisibleChild(0, getChildCount(), z2, z3);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo11615e(getChildAt(i)) < this.mOrientationHelper.mo11621k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m11751a(i, i2, i3, i4) : this.mVerticalBoundCheck.m11751a(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z2, boolean z3) {
        ensureLayoutState();
        int i3 = z2 ? 24579 : 320;
        int i4 = z3 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m11751a(i, i2, i3, i4) : this.mVerticalBoundCheck.m11751a(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2, boolean z3) {
        int i;
        int childCount;
        int i2;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z3) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iM11703b = state.m11703b();
        int iMo11621k = this.mOrientationHelper.mo11621k();
        int iMo11617g = this.mOrientationHelper.mo11617g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo11615e = this.mOrientationHelper.mo11615e(childAt);
            int iMo11612b = this.mOrientationHelper.mo11612b(childAt);
            if (position >= 0 && position < iM11703b) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).f31720a.isRemoved()) {
                    boolean z4 = iMo11612b <= iMo11621k && iMo11615e < iMo11621k;
                    boolean z5 = iMo11615e >= iMo11617g && iMo11612b > iMo11617g;
                    if (!z4 && !z5) {
                        return childAt;
                    }
                    if (z2) {
                        if (z5) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (!z4) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    /* JADX INFO: renamed from: g */
    public final int m11592g(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iMo11617g;
        int iMo11617g2 = this.mOrientationHelper.mo11617g() - i;
        if (iMo11617g2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo11617g2, recycler, state);
        int i3 = i + i2;
        if (!z2 || (iMo11617g = this.mOrientationHelper.mo11617g() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo11625o(iMo11617g);
        return iMo11617g + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public final View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.f31749a != -1) {
            return this.mOrientationHelper.mo11622l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    /* JADX INFO: renamed from: h */
    public final int m11593h(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iMo11621k;
        int iMo11621k2 = i - this.mOrientationHelper.mo11621k();
        if (iMo11621k2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo11621k2, recycler, state);
        int i3 = i + i2;
        if (!z2 || (iMo11621k = i3 - this.mOrientationHelper.mo11621k()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo11625o(-iMo11621k);
        return i2 - iMo11621k;
    }

    /* JADX INFO: renamed from: i */
    public final void m11594i() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo11615e(childAt));
        }
        Log.d(TAG, "==============");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: j */
    public final void m11595j(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f31672a || layoutState.f31683l) {
            return;
        }
        int i = layoutState.f31678g;
        int i2 = layoutState.f31680i;
        if (layoutState.f31677f == -1) {
            int childCount = getChildCount();
            if (i < 0) {
                return;
            }
            int iMo11616f = (this.mOrientationHelper.mo11616f() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.mo11615e(childAt) < iMo11616f || this.mOrientationHelper.mo11624n(childAt) < iMo11616f) {
                        m11596k(recycler, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.mo11615e(childAt2) < iMo11616f || this.mOrientationHelper.mo11624n(childAt2) < iMo11616f) {
                    m11596k(recycler, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt3 = getChildAt(i7);
                if (this.mOrientationHelper.mo11612b(childAt3) > i6 || this.mOrientationHelper.mo11623m(childAt3) > i6) {
                    m11596k(recycler, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt4 = getChildAt(i9);
            if (this.mOrientationHelper.mo11612b(childAt4) > i6 || this.mOrientationHelper.mo11623m(childAt4) > i6) {
                m11596k(recycler, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11596k(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, recycler);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11597l() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iMo11614d;
        int i5;
        int i6;
        View viewM11606b = layoutState.m11606b(recycler);
        if (viewM11606b == null) {
            layoutChunkResult.f31669b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewM11606b.getLayoutParams();
        if (layoutState.f31682k == null) {
            if (this.mShouldReverseLayout == (layoutState.f31677f == -1)) {
                addView(viewM11606b);
            } else {
                addView(viewM11606b, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (layoutState.f31677f == -1)) {
                addDisappearingView(viewM11606b);
            } else {
                addDisappearingView(viewM11606b, 0);
            }
        }
        measureChildWithMargins(viewM11606b, 0, 0);
        layoutChunkResult.f31668a = this.mOrientationHelper.mo11613c(viewM11606b);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo11614d = getWidth() - getPaddingRight();
                paddingLeft = iMo11614d - this.mOrientationHelper.mo11614d(viewM11606b);
            } else {
                paddingLeft = getPaddingLeft();
                iMo11614d = this.mOrientationHelper.mo11614d(viewM11606b) + paddingLeft;
            }
            if (layoutState.f31677f == -1) {
                i6 = layoutState.f31673b;
                i5 = i6 - layoutChunkResult.f31668a;
            } else {
                i5 = layoutState.f31673b;
                i6 = layoutChunkResult.f31668a + i5;
            }
            int i7 = paddingLeft;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = iMo11614d;
        } else {
            int paddingTop = getPaddingTop();
            int iMo11614d2 = this.mOrientationHelper.mo11614d(viewM11606b) + paddingTop;
            if (layoutState.f31677f == -1) {
                int i8 = layoutState.f31673b;
                i3 = i8 - layoutChunkResult.f31668a;
                i = i8;
                i2 = iMo11614d2;
            } else {
                int i9 = layoutState.f31673b;
                i = layoutChunkResult.f31668a + i9;
                i2 = iMo11614d2;
                i3 = i9;
            }
            i4 = paddingTop;
        }
        layoutDecoratedWithMargins(viewM11606b, i3, i4, i, i2);
        if (layoutParams.f31720a.isRemoved() || layoutParams.f31720a.isUpdated()) {
            layoutChunkResult.f31670c = true;
        }
        layoutChunkResult.f31671d = viewM11606b.hasFocusable();
    }

    /* JADX INFO: renamed from: m */
    public final void m11598m(int i, int i2, boolean z2, RecyclerView.State state) {
        int iMo11621k;
        this.mLayoutState.f31683l = resolveIsInfinite();
        this.mLayoutState.f31677f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z3 = i == 1;
        LayoutState layoutState = this.mLayoutState;
        int i3 = z3 ? iMax2 : iMax;
        layoutState.f31679h = i3;
        if (!z3) {
            iMax = iMax2;
        }
        layoutState.f31680i = iMax;
        if (z3) {
            layoutState.f31679h = this.mOrientationHelper.mo11618h() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.f31676e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState2.f31675d = position + layoutState3.f31676e;
            layoutState3.f31673b = this.mOrientationHelper.mo11612b(childClosestToEnd);
            iMo11621k = this.mOrientationHelper.mo11612b(childClosestToEnd) - this.mOrientationHelper.mo11617g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.f31679h = this.mOrientationHelper.mo11621k() + layoutState4.f31679h;
            LayoutState layoutState5 = this.mLayoutState;
            layoutState5.f31676e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            LayoutState layoutState6 = this.mLayoutState;
            layoutState5.f31675d = position2 + layoutState6.f31676e;
            layoutState6.f31673b = this.mOrientationHelper.mo11615e(childClosestToStart);
            iMo11621k = (-this.mOrientationHelper.mo11615e(childClosestToStart)) + this.mOrientationHelper.mo11621k();
        }
        LayoutState layoutState7 = this.mLayoutState;
        layoutState7.f31674c = i2;
        if (z2) {
            layoutState7.f31674c = i2 - iMo11621k;
        }
        layoutState7.f31678g = iMo11621k;
    }

    /* JADX INFO: renamed from: n */
    public final void m11599n(int i, int i2) {
        this.mLayoutState.f31674c = this.mOrientationHelper.mo11617g() - i2;
        LayoutState layoutState = this.mLayoutState;
        layoutState.f31676e = this.mShouldReverseLayout ? -1 : 1;
        layoutState.f31675d = i;
        layoutState.f31677f = 1;
        layoutState.f31673b = i2;
        layoutState.f31678g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: o */
    public final void m11600o(int i, int i2) {
        this.mLayoutState.f31674c = i2 - this.mOrientationHelper.mo11621k();
        LayoutState layoutState = this.mLayoutState;
        layoutState.f31675d = i;
        layoutState.f31676e = this.mShouldReverseLayout ? 1 : -1;
        layoutState.f31677f = -1;
        layoutState.f31673b = i2;
        layoutState.f31678g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.f31731a.clear();
            recycler.m11690g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        m11597l();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            m11598m(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo11622l() * MAX_SCROLL_FACTOR), false, state);
            LayoutState layoutState = this.mLayoutState;
            layoutState.f31678g = Integer.MIN_VALUE;
            layoutState.f31672a = false;
            fill(recycler, layoutState, state, true);
            View viewFindOnePartiallyOrCompletelyInvisibleChild = iConvertFocusDirectionToLayoutDirection == -1 ? this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
            if (!childClosestToStart.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return childClosestToStart;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewFindReferenceChild;
        int i;
        int iMo11615e;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM11592g;
        int i6;
        View viewFindViewByPosition;
        int iMo11615e2;
        int iMo11617g;
        int i7;
        int i8 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.m11703b() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i7 = savedState.f31684a) >= 0) {
            this.mPendingScrollPosition = i7;
        }
        ensureLayoutState();
        this.mLayoutState.f31672a = false;
        m11597l();
        View focusedChild = getFocusedChild();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (!anchorInfo.f31667e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            anchorInfo.m11604d();
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            anchorInfo2.f31666d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (state.f31755g || (i = this.mPendingScrollPosition) == -1) {
                if (getChildCount() != 0) {
                    View focusedChild2 = getFocusedChild();
                    if (focusedChild2 != null) {
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) focusedChild2.getLayoutParams();
                        if (layoutParams.f31720a.isRemoved() || layoutParams.f31720a.getLayoutPosition() < 0 || layoutParams.f31720a.getLayoutPosition() >= state.m11703b()) {
                            boolean z2 = this.mLastStackFromEnd;
                            boolean z3 = this.mStackFromEnd;
                            if (z2 == z3 && (viewFindReferenceChild = findReferenceChild(recycler, state, anchorInfo2.f31666d, z3)) != null) {
                                anchorInfo2.m11602b(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                                if (!state.f31755g && supportsPredictiveItemAnimations()) {
                                    int iMo11615e3 = this.mOrientationHelper.mo11615e(viewFindReferenceChild);
                                    int iMo11612b = this.mOrientationHelper.mo11612b(viewFindReferenceChild);
                                    int iMo11621k = this.mOrientationHelper.mo11621k();
                                    int iMo11617g2 = this.mOrientationHelper.mo11617g();
                                    boolean z4 = iMo11612b <= iMo11621k && iMo11615e3 < iMo11621k;
                                    boolean z5 = iMo11615e3 >= iMo11617g2 && iMo11612b > iMo11617g2;
                                    if (z4 || z5) {
                                        if (anchorInfo2.f31666d) {
                                            iMo11621k = iMo11617g2;
                                        }
                                        anchorInfo2.f31665c = iMo11621k;
                                    }
                                }
                            } else {
                                anchorInfo2.m11601a();
                                anchorInfo2.f31664b = this.mStackFromEnd ? state.m11703b() - 1 : 0;
                            }
                        } else {
                            anchorInfo2.m11603c(getPosition(focusedChild2), focusedChild2);
                        }
                        this.mAnchorInfo.f31667e = true;
                    }
                }
            } else if (i < 0 || i >= state.m11703b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                }
            } else {
                int i9 = this.mPendingScrollPosition;
                anchorInfo2.f31664b = i9;
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 != null && savedState2.f31684a >= 0) {
                    boolean z6 = savedState2.f31686c;
                    anchorInfo2.f31666d = z6;
                    if (z6) {
                        anchorInfo2.f31665c = this.mOrientationHelper.mo11617g() - this.mPendingSavedState.f31685b;
                    } else {
                        anchorInfo2.f31665c = this.mOrientationHelper.mo11621k() + this.mPendingSavedState.f31685b;
                    }
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i9);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            anchorInfo2.f31666d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        anchorInfo2.m11601a();
                    } else if (this.mOrientationHelper.mo11613c(viewFindViewByPosition2) > this.mOrientationHelper.mo11622l()) {
                        anchorInfo2.m11601a();
                    } else if (this.mOrientationHelper.mo11615e(viewFindViewByPosition2) - this.mOrientationHelper.mo11621k() < 0) {
                        anchorInfo2.f31665c = this.mOrientationHelper.mo11621k();
                        anchorInfo2.f31666d = false;
                    } else if (this.mOrientationHelper.mo11617g() - this.mOrientationHelper.mo11612b(viewFindViewByPosition2) < 0) {
                        anchorInfo2.f31665c = this.mOrientationHelper.mo11617g();
                        anchorInfo2.f31666d = true;
                    } else {
                        if (anchorInfo2.f31666d) {
                            int iMo11612b2 = this.mOrientationHelper.mo11612b(viewFindViewByPosition2);
                            OrientationHelper orientationHelper = this.mOrientationHelper;
                            iMo11615e = (Integer.MIN_VALUE == orientationHelper.f31692b ? 0 : orientationHelper.mo11622l() - orientationHelper.f31692b) + iMo11612b2;
                        } else {
                            iMo11615e = this.mOrientationHelper.mo11615e(viewFindViewByPosition2);
                        }
                        anchorInfo2.f31665c = iMo11615e;
                    }
                } else {
                    boolean z7 = this.mShouldReverseLayout;
                    anchorInfo2.f31666d = z7;
                    if (z7) {
                        anchorInfo2.f31665c = this.mOrientationHelper.mo11617g() - this.mPendingScrollPositionOffset;
                    } else {
                        anchorInfo2.f31665c = this.mOrientationHelper.mo11621k() + this.mPendingScrollPositionOffset;
                    }
                }
                this.mAnchorInfo.f31667e = true;
            }
        } else if (focusedChild != null && (this.mOrientationHelper.mo11615e(focusedChild) >= this.mOrientationHelper.mo11617g() || this.mOrientationHelper.mo11612b(focusedChild) <= this.mOrientationHelper.mo11621k())) {
            this.mAnchorInfo.m11603c(getPosition(focusedChild), focusedChild);
        }
        LayoutState layoutState = this.mLayoutState;
        layoutState.f31677f = layoutState.f31681j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iMo11621k2 = this.mOrientationHelper.mo11621k() + Math.max(0, this.mReusableIntPair[0]);
        int iMo11618h = this.mOrientationHelper.mo11618h() + Math.max(0, this.mReusableIntPair[1]);
        if (state.f31755g && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayout) {
                iMo11617g = this.mOrientationHelper.mo11617g() - this.mOrientationHelper.mo11612b(viewFindViewByPosition);
                iMo11615e2 = this.mPendingScrollPositionOffset;
            } else {
                iMo11615e2 = this.mOrientationHelper.mo11615e(viewFindViewByPosition) - this.mOrientationHelper.mo11621k();
                iMo11617g = this.mPendingScrollPositionOffset;
            }
            int i10 = iMo11617g - iMo11615e2;
            if (i10 > 0) {
                iMo11621k2 += i10;
            } else {
                iMo11618h -= i10;
            }
        }
        AnchorInfo anchorInfo3 = this.mAnchorInfo;
        if (!anchorInfo3.f31666d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i8 = 1;
        }
        onAnchorReady(recycler, state, anchorInfo3, i8);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.f31683l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f31680i = 0;
        AnchorInfo anchorInfo4 = this.mAnchorInfo;
        if (anchorInfo4.f31666d) {
            m11600o(anchorInfo4.f31664b, anchorInfo4.f31665c);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.f31679h = iMo11621k2;
            fill(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.mLayoutState;
            i3 = layoutState3.f31673b;
            int i11 = layoutState3.f31675d;
            int i12 = layoutState3.f31674c;
            if (i12 > 0) {
                iMo11618h += i12;
            }
            AnchorInfo anchorInfo5 = this.mAnchorInfo;
            m11599n(anchorInfo5.f31664b, anchorInfo5.f31665c);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.f31679h = iMo11618h;
            layoutState4.f31675d += layoutState4.f31676e;
            fill(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.mLayoutState;
            i2 = layoutState5.f31673b;
            int i13 = layoutState5.f31674c;
            if (i13 > 0) {
                m11600o(i11, i3);
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.f31679h = i13;
                fill(recycler, layoutState6, state, false);
                i3 = this.mLayoutState.f31673b;
            }
        } else {
            m11599n(anchorInfo4.f31664b, anchorInfo4.f31665c);
            LayoutState layoutState7 = this.mLayoutState;
            layoutState7.f31679h = iMo11618h;
            fill(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.mLayoutState;
            i2 = layoutState8.f31673b;
            int i14 = layoutState8.f31675d;
            int i15 = layoutState8.f31674c;
            if (i15 > 0) {
                iMo11621k2 += i15;
            }
            AnchorInfo anchorInfo6 = this.mAnchorInfo;
            m11600o(anchorInfo6.f31664b, anchorInfo6.f31665c);
            LayoutState layoutState9 = this.mLayoutState;
            layoutState9.f31679h = iMo11621k2;
            layoutState9.f31675d += layoutState9.f31676e;
            fill(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.mLayoutState;
            int i16 = layoutState10.f31673b;
            int i17 = layoutState10.f31674c;
            if (i17 > 0) {
                m11599n(i14, i2);
                LayoutState layoutState11 = this.mLayoutState;
                layoutState11.f31679h = i17;
                fill(recycler, layoutState11, state, false);
                i2 = this.mLayoutState.f31673b;
            }
            i3 = i16;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM11592g2 = m11592g(i2, recycler, state, true);
                i4 = i3 + iM11592g2;
                i5 = i2 + iM11592g2;
                iM11592g = m11593h(i4, recycler, state, false);
            } else {
                int iM11593h = m11593h(i3, recycler, state, true);
                i4 = i3 + iM11593h;
                i5 = i2 + iM11593h;
                iM11592g = m11592g(i5, recycler, state, false);
            }
            i3 = i4 + iM11592g;
            i2 = i5 + iM11592g;
        }
        if (state.f31759k && getChildCount() != 0 && !state.f31755g && supportsPredictiveItemAnimations()) {
            List list = recycler.f31734d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int iMo11613c = 0;
            int iMo11613c2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list.get(i18);
                if (!viewHolder.isRemoved()) {
                    if ((viewHolder.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        iMo11613c += this.mOrientationHelper.mo11613c(viewHolder.itemView);
                    } else {
                        iMo11613c2 += this.mOrientationHelper.mo11613c(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.f31682k = list;
            if (iMo11613c > 0) {
                m11600o(getPosition(getChildClosestToStart()), i3);
                LayoutState layoutState12 = this.mLayoutState;
                layoutState12.f31679h = iMo11613c;
                layoutState12.f31674c = 0;
                layoutState12.m11605a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            if (iMo11613c2 > 0) {
                m11599n(getPosition(getChildClosestToEnd()), i2);
                LayoutState layoutState13 = this.mLayoutState;
                layoutState13.f31679h = iMo11613c2;
                layoutState13.f31674c = 0;
                layoutState13.m11605a(null);
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.f31682k = null;
        }
        if (state.f31755g) {
            this.mAnchorInfo.m11604d();
        } else {
            OrientationHelper orientationHelper2 = this.mOrientationHelper;
            orientationHelper2.f31692b = orientationHelper2.mo11622l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.State state) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m11604d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f31684a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f31684a = savedState.f31684a;
            savedState2.f31685b = savedState.f31685b;
            savedState2.f31686c = savedState.f31686c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.f31684a = -1;
            return savedState3;
        }
        ensureLayoutState();
        boolean z2 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState3.f31686c = z2;
        if (z2) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState3.f31685b = this.mOrientationHelper.mo11617g() - this.mOrientationHelper.mo11612b(childClosestToEnd);
            savedState3.f31684a = getPosition(childClosestToEnd);
            return savedState3;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState3.f31684a = getPosition(childClosestToStart);
        savedState3.f31685b = this.mOrientationHelper.mo11615e(childClosestToStart) - this.mOrientationHelper.mo11621k();
        return savedState3;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m11597l();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b2 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo11617g() - (this.mOrientationHelper.mo11613c(view) + this.mOrientationHelper.mo11615e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo11617g() - this.mOrientationHelper.mo11612b(view2));
                return;
            }
        }
        if (b2 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo11615e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo11612b(view2) - this.mOrientationHelper.mo11613c(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo11619i() == 0 && this.mOrientationHelper.mo11616f() == 0;
    }

    public int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f31672a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m11598m(i2, iAbs, true, state);
        LayoutState layoutState = this.mLayoutState;
        int iFill = fill(recycler, layoutState, state, false) + layoutState.f31678g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo11625o(-i);
        this.mLayoutState.f31681j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f31684a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f31684a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper orientationHelperM11611a = OrientationHelper.m11611a(this, i);
            this.mOrientationHelper = orientationHelperM11611a;
            this.mAnchorInfo.f31663a = orientationHelperM11611a;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z2) {
        this.mRecycleChildrenOnDetach = z2;
    }

    public void setReverseLayout(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (z2 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z2;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z2) {
        this.mSmoothScrollbarEnabled = z2;
    }

    public void setStackFromEnd(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z2) {
            return;
        }
        this.mStackFromEnd = z2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo11615e = this.mOrientationHelper.mo11615e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo11615e2 = this.mOrientationHelper.mo11615e(childAt);
                if (position2 < position) {
                    m11594i();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo11615e2 < iMo11615e);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo11615e2 > iMo11615e) {
                    m11594i();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo11615e3 = this.mOrientationHelper.mo11615e(childAt2);
            if (position3 < position) {
                m11594i();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo11615e3 < iMo11615e);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo11615e3 < iMo11615e) {
                m11594i();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f31716a);
        setReverseLayout(properties.f31718c);
        setStackFromEnd(properties.f31719d);
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i) {
    }
}
