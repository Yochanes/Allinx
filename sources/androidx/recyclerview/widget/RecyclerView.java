package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.compose.animation.AbstractC0455a;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.ViewBoundsCheck;
import androidx.recyclerview.widget.ViewInfoStore;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @VisibleForTesting
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;

    @VisibleForTesting
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC21421 implements Runnable {
        public RunnableC21421() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC21432 implements Runnable {
        public RunnableC21432() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            ItemAnimator itemAnimator = recyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.mo11553l();
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$3 */
    /* JADX INFO: compiled from: Proguard */
    public class InterpolatorC21443 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C21454 implements ViewInfoStore.ProcessCallback {
        public C21454() {
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* JADX INFO: renamed from: a */
        public final void mo11645a(ViewHolder viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(viewHolder.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* JADX INFO: renamed from: b */
        public final void mo11646b(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* JADX INFO: renamed from: c */
        public final void mo11647c(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mRecycler.m11696m(viewHolder);
            recyclerView.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* JADX INFO: renamed from: d */
        public final void mo11648d(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            viewHolder.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo11667b(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    recyclerView.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo11669d(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                recyclerView.postAnimationRunner();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$5 */
    /* JADX INFO: compiled from: Proguard */
    class C21465 implements ChildHelper.Callback {
        public C21465() {
        }

        /* JADX INFO: renamed from: a */
        public final void m11649a(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m11650b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$6 */
    /* JADX INFO: compiled from: Proguard */
    public class C21476 implements AdapterHelper.Callback {
        public C21476() {
        }

        /* JADX INFO: renamed from: a */
        public final void m11651a(AdapterHelper.UpdateOp updateOp) {
            int i = updateOp.f31527a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, updateOp.f31528b, updateOp.f31530d);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, updateOp.f31528b, updateOp.f31530d);
            } else if (i == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, updateOp.f31528b, updateOp.f31530d, updateOp.f31529c);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, updateOp.f31528b, updateOp.f31530d, 1);
            }
        }

        /* JADX INFO: renamed from: b */
        public final ViewHolder m11652b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            ViewHolder viewHolderFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i, true);
            if (viewHolderFindViewHolderForPosition != null) {
                ChildHelper childHelper = recyclerView.mChildHelper;
                if (!childHelper.f31535c.contains(viewHolderFindViewHolderForPosition.itemView)) {
                    return viewHolderFindViewHolderForPosition;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final void m11653c(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.viewRangeUpdate(i, i2, obj);
            recyclerView.mItemsChanged = true;
        }

        /* JADX INFO: renamed from: d */
        public final void m11654d(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i, i2);
            recyclerView.mItemsAddedOrRemoved = true;
        }

        /* JADX INFO: renamed from: e */
        public final void m11655e(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForMove(i, i2);
            recyclerView.mItemsAddedOrRemoved = true;
        }

        /* JADX INFO: renamed from: f */
        public final void m11656f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i2, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f31751c += i2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C21487 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31702a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f31702a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31702a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        /* JADX INFO: renamed from: a */
        public final boolean m11657a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: b */
        public final void m11658b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m11659c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m11660d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m11661e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m11662f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m11663g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AdapterDataObserver {
        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ChildDrawingOrderCallback {
        /* JADX INFO: renamed from: a */
        int mo11588a(int i, int i2);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EdgeEffectFactory {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        /* JADX INFO: renamed from: a */
        public EdgeEffect mo11664a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ItemAnimator {

        /* JADX INFO: renamed from: a */
        public ItemAnimatorListener f31705a;

        /* JADX INFO: renamed from: b */
        public ArrayList f31706b;

        /* JADX INFO: renamed from: c */
        public long f31707c;

        /* JADX INFO: renamed from: d */
        public long f31708d;

        /* JADX INFO: renamed from: e */
        public long f31709e;

        /* JADX INFO: renamed from: f */
        public long f31710f;

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        /* JADX INFO: compiled from: Proguard */
        public interface ItemAnimatorFinishedListener {
            /* JADX INFO: renamed from: a */
            void m11672a();
        }

        /* JADX INFO: compiled from: Proguard */
        public interface ItemAnimatorListener {
            /* JADX INFO: renamed from: a */
            void mo11673a(ViewHolder viewHolder);
        }

        /* JADX INFO: compiled from: Proguard */
        public static class ItemHolderInfo {

            /* JADX INFO: renamed from: a */
            public int f31711a;

            /* JADX INFO: renamed from: b */
            public int f31712b;

            /* JADX INFO: renamed from: a */
            public final void m11674a(ViewHolder viewHolder) {
                View view = viewHolder.itemView;
                this.f31711a = view.getLeft();
                this.f31712b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m11665e(ViewHolder viewHolder) {
            int i = viewHolder.mFlags;
            if (!viewHolder.isInvalid() && (i & 4) == 0) {
                viewHolder.getOldPosition();
                viewHolder.getAbsoluteAdapterPosition();
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo11666a(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo11667b(ViewHolder viewHolder, ViewHolder viewHolder2, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo11668c(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo11669d(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        /* JADX INFO: renamed from: f */
        public boolean mo11670f(ViewHolder viewHolder) {
            return true;
        }

        /* JADX INFO: renamed from: g */
        public boolean mo11549g(ViewHolder viewHolder, List list) {
            return mo11670f(viewHolder);
        }

        /* JADX INFO: renamed from: h */
        public final void m11671h(ViewHolder viewHolder) {
            ItemAnimatorListener itemAnimatorListener = this.f31705a;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.mo11673a(viewHolder);
            }
        }

        /* JADX INFO: renamed from: i */
        public abstract void mo11550i(ViewHolder viewHolder);

        /* JADX INFO: renamed from: j */
        public abstract void mo11551j();

        /* JADX INFO: renamed from: k */
        public abstract boolean mo11552k();

        /* JADX INFO: renamed from: l */
        public abstract void mo11553l();
    }

    /* JADX INFO: compiled from: Proguard */
    public class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        public ItemAnimatorRestoreListener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        /* JADX INFO: renamed from: a */
        public final void mo11673a(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild()) {
                return;
            }
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.removeAnimatingView(view) || !viewHolder.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(viewHolder.itemView, false);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).f31720a.getLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        SmoothScroller mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C21491 implements ViewBoundsCheck.Callback {
            public C21491() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: a */
            public final int mo11678a(View view) {
                return LayoutManager.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: b */
            public final int mo11679b() {
                return LayoutManager.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: c */
            public final int mo11680c() {
                LayoutManager layoutManager = LayoutManager.this;
                return layoutManager.getWidth() - layoutManager.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: d */
            public final View mo11681d(int i) {
                return LayoutManager.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: e */
            public final int mo11682e(View view) {
                return LayoutManager.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$2 */
        /* JADX INFO: compiled from: Proguard */
        public class C21502 implements ViewBoundsCheck.Callback {
            public C21502() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: a */
            public final int mo11678a(View view) {
                return LayoutManager.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: b */
            public final int mo11679b() {
                return LayoutManager.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: c */
            public final int mo11680c() {
                LayoutManager layoutManager = LayoutManager.this;
                return layoutManager.getHeight() - layoutManager.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: d */
            public final View mo11681d(int i) {
                return LayoutManager.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
            /* JADX INFO: renamed from: e */
            public final int mo11682e(View view) {
                return LayoutManager.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface LayoutPrefetchRegistry {
            /* JADX INFO: renamed from: a */
            void mo11573a(int i, int i2);
        }

        /* JADX INFO: compiled from: Proguard */
        public static class Properties {

            /* JADX INFO: renamed from: a */
            public int f31716a;

            /* JADX INFO: renamed from: b */
            public int f31717b;

            /* JADX INFO: renamed from: c */
            public boolean f31718c;

            /* JADX INFO: renamed from: d */
            public boolean f31719d;
        }

        public LayoutManager() {
            C21491 c21491 = new C21491();
            this.mHorizontalBoundCheckCallback = c21491;
            C21502 c21502 = new C21502();
            this.mVerticalBoundCheckCallback = c21502;
            this.mHorizontalBoundCheck = new ViewBoundsCheck(c21491);
            this.mVerticalBoundCheck = new ViewBoundsCheck(c21502);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m11675b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z2) {
            int i4 = i - i2;
            int i5 = 0;
            int iMax = Math.max(0, i4);
            if (z2) {
                if (i3 >= 0) {
                    i5 = 1073741824;
                } else {
                    i3 = 0;
                }
            } else if (i3 < 0) {
                if (i3 == -1) {
                    i3 = iMax;
                    i5 = 1073741824;
                } else if (i3 == -2) {
                    i5 = Integer.MIN_VALUE;
                    i3 = iMax;
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        public static Properties getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.f31520a, i, i2);
            properties.f31716a = typedArrayObtainStyledAttributes.getInt(0, 1);
            properties.f31717b = typedArrayObtainStyledAttributes.getInt(10, 1);
            properties.f31718c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            properties.f31719d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        /* JADX INFO: renamed from: a */
        public final void m11676a(View view, int i, boolean z2) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z2 || childViewHolderInt.isRemoved()) {
                SimpleArrayMap simpleArrayMap = this.mRecyclerView.mViewInfoStore.f31836a;
                ViewInfoStore.InfoRecord infoRecordM11758a = (ViewInfoStore.InfoRecord) simpleArrayMap.get(childViewHolderInt);
                if (infoRecordM11758a == null) {
                    infoRecordM11758a = ViewInfoStore.InfoRecord.m11758a();
                    simpleArrayMap.put(childViewHolderInt, infoRecordM11758a);
                }
                infoRecordM11758a.f31839a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.m11756c(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.m11534a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iM11538e = this.mChildHelper.m11538e(view);
                if (i == -1) {
                    i = this.mChildHelper.m11536c();
                }
                if (iM11538e == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(AbstractC1610a.m8732j(this.mRecyclerView, sb));
                }
                if (iM11538e != i) {
                    this.mRecyclerView.mLayout.moveView(iM11538e, i);
                }
            } else {
                ChildHelper childHelper = this.mChildHelper;
                RecyclerView recyclerView = RecyclerView.this;
                int childCount = i < 0 ? recyclerView.getChildCount() : childHelper.m11537d(i);
                childHelper.f31534b.m11544e(childCount, false);
                recyclerView.addView(view, childCount);
                recyclerView.dispatchChildAttached(view);
                layoutParams.f31722c = true;
                SmoothScroller smoothScroller = this.mSmoothScroller;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.f31723d) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.f31723d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i, LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                SimpleArrayMap simpleArrayMap = this.mRecyclerView.mViewInfoStore.f31836a;
                ViewInfoStore.InfoRecord infoRecordM11758a = (ViewInfoStore.InfoRecord) simpleArrayMap.get(childViewHolderInt);
                if (infoRecordM11758a == null) {
                    infoRecordM11758a = ViewInfoStore.InfoRecord.m11758a();
                    simpleArrayMap.put(childViewHolderInt, infoRecordM11758a);
                }
                infoRecordM11758a.f31839a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.m11756c(childViewHolderInt);
            }
            this.mChildHelper.m11534a(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        /* JADX INFO: renamed from: c */
        public final void m11677c(Recycler recycler, int i, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                recycler.m11693j(childViewHolderInt);
            } else {
                detachViewAt(i);
                recycler.m11694k(view);
                this.mRecyclerView.mViewInfoStore.m11756c(childViewHolderInt);
            }
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public int computeHorizontalScrollExtent(State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(State state) {
            return 0;
        }

        public int computeVerticalScrollRange(State state) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m11677c(recycler, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
            m11677c(recycler, this.mChildHelper.m11538e(view), view);
        }

        public void detachAndScrapViewAt(int i, @NonNull Recycler recycler) {
            m11677c(recycler, i, getChildAt(i));
        }

        public void detachView(@NonNull View view) {
            ViewHolder childViewHolderInt;
            int iM11538e = this.mChildHelper.m11538e(view);
            if (iM11538e >= 0) {
                ChildHelper childHelper = this.mChildHelper;
                int iM11537d = childHelper.m11537d(iM11538e);
                childHelper.f31534b.m11545f(iM11537d);
                RecyclerView recyclerView = RecyclerView.this;
                View childAt = recyclerView.getChildAt(iM11537d);
                if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                        sb.append(childViewHolderInt);
                        throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, sb));
                    }
                    childViewHolderInt.addFlags(256);
                }
                RecyclerView.access$100(recyclerView, iM11537d);
            }
        }

        public void detachViewAt(int i) {
            ViewHolder childViewHolderInt;
            getChildAt(i);
            ChildHelper childHelper = this.mChildHelper;
            int iM11537d = childHelper.m11537d(i);
            childHelper.f31534b.m11545f(iM11537d);
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(iM11537d);
            if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, sb));
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.access$100(recyclerView, iM11537d);
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.mo11550i(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f31535c.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f31755g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f31721b.bottom;
        }

        @Nullable
        public View getChildAt(int i) {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.m11535b(i);
            }
            return null;
        }

        public int getChildCount() {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.m11536c();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f31721b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f31721b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f31535c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return recyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f31721b.left;
        }

        @Px
        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return recyclerView.getMinimumHeight();
        }

        @Px
        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return recyclerView.getMinimumWidth();
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return recyclerView.getPaddingEnd();
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return recyclerView.getPaddingStart();
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f31720a.getLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f31721b.right;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f31721b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z2, @NonNull Rect rect) {
            Matrix matrix;
            if (z2) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f31721b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(AbstractC1610a.m8732j(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            this.mRecyclerView.mViewInfoStore.m11757d(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z2, boolean z3) {
            boolean z4 = this.mHorizontalBoundCheck.m11752b(view) && this.mVerticalBoundCheck.m11752b(view);
            return z2 ? z4 : !z4;
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f31721b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f31721b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@Px int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i) {
            return null;
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutChildren(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onSmoothScrollerStopped(SmoothScroller smoothScroller) {
            if (this.mSmoothScroller == smoothScroller) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ChildHelper childHelper = this.mChildHelper;
                int iM11537d = childHelper.m11537d(childCount);
                C21465 c21465 = childHelper.f31533a;
                View childAt = RecyclerView.this.getChildAt(iM11537d);
                if (childAt != null) {
                    if (childHelper.f31534b.m11545f(iM11537d)) {
                        childHelper.m11539f(childAt);
                    }
                    c21465.m11650b(iM11537d);
                }
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        public void removeAndRecycleScrapInt(Recycler recycler) {
            ArrayList arrayList;
            int size = recycler.f31731a.size();
            int i = size - 1;
            while (true) {
                arrayList = recycler.f31731a;
                if (i < 0) {
                    break;
                }
                View view = ((ViewHolder) arrayList.get(i)).itemView;
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.mo11550i(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    recycler.m11693j(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList arrayList2 = recycler.f31732b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
            removeView(view);
            recycler.m11692i(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull Recycler recycler) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            recycler.m11692i(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            ChildHelper childHelper = this.mChildHelper;
            C21465 c21465 = childHelper.f31533a;
            int iIndexOfChild = RecyclerView.this.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (childHelper.f31534b.m11545f(iIndexOfChild)) {
                childHelper.m11539f(view);
            }
            c21465.m11650b(iIndexOfChild);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                ChildHelper childHelper = this.mChildHelper;
                int iM11537d = childHelper.m11537d(i);
                C21465 c21465 = childHelper.f31533a;
                View childAt = RecyclerView.this.getChildAt(iM11537d);
                if (childAt == null) {
                    return;
                }
                if (childHelper.f31534b.m11545f(iM11537d)) {
                    childHelper.m11539f(childAt);
                }
                c21465.m11650b(iM11537d);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z2, boolean z3) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            int[] iArr = {iMax, iMin2};
            int i4 = iArr[0];
            int i5 = iArr[1];
            if (z3) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int width2 = getWidth() - getPaddingRight();
                    int height2 = getHeight() - getPaddingBottom();
                    Rect rect2 = this.mRecyclerView.mTempRect;
                    getDecoratedBoundsWithMargins(focusedChild, rect2);
                    if (rect2.left - i4 < width2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < height2 && rect2.bottom - i5 > paddingTop2) {
                    }
                }
            } else if (i4 != 0 || i5 != 0) {
                if (z2) {
                    recyclerView.scrollBy(i4, i5);
                } else {
                    recyclerView.smoothScrollBy(i4, i5);
                }
                return true;
            }
            return false;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        public int scrollVerticallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z2) {
            this.mAutoMeasure = z2;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), Ints.MAX_POWER_OF_TWO));
        }

        public final void setItemPrefetchEnabled(boolean z2) {
            if (z2 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z2;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m11697n();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z2) {
            this.mMeasurementCacheEnabled = z2;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = Ints.MAX_POWER_OF_TWO;
            this.mHeightMode = Ints.MAX_POWER_OF_TWO;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m11675b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m11675b(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && m11675b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m11675b(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.mSmoothScroller;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = smoothScroller;
            smoothScroller.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            m11676a(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            m11676a(view, i, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.m8005a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                accessibilityNodeInfoCompat.m8021r(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.m8005a(4096);
                accessibilityNodeInfoCompat.m8021r(true);
            }
            accessibilityNodeInfoCompat.m8016m(AccessibilityNodeInfoCompat.CollectionInfoCompat.m8033a(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), getSelectionModeForAccessibility(recycler, state), isLayoutHierarchical(recycler, state)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper.f31535c.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z2) {
            int iMax = Math.max(0, i - i3);
            if (z2) {
                if (i4 < 0) {
                    if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                        i2 = 0;
                        i4 = 0;
                    } else {
                        i4 = iMax;
                    }
                }
                i2 = 1073741824;
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1) {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i4 = iMax;
                        i2 = Integer.MIN_VALUE;
                    } else {
                        i4 = iMax;
                        i2 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            RecyclerView.access$300(this.mRecyclerView, i, i2);
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onLayoutCompleted(State state) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i) {
        }

        public void scrollToPosition(int i) {
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z2) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z2, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnChildAttachStateChangeListener {
        /* JADX INFO: renamed from: b */
        void mo11586b(View view);

        /* JADX INFO: renamed from: c */
        void mo11587c(View view);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i, int i2);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnItemTouchListener {
        /* JADX INFO: renamed from: a */
        void mo11563a(MotionEvent motionEvent);

        /* JADX INFO: renamed from: d */
        boolean mo11564d(MotionEvent motionEvent);

        /* JADX INFO: renamed from: e */
        void mo11565e(boolean z2);
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RecycledViewPool {

        /* JADX INFO: renamed from: a */
        public SparseArray f31724a;

        /* JADX INFO: renamed from: b */
        public int f31725b;

        /* JADX INFO: renamed from: c */
        public Set f31726c;

        /* JADX INFO: compiled from: Proguard */
        public static class ScrapData {

            /* JADX INFO: renamed from: a */
            public final ArrayList f31727a = new ArrayList();

            /* JADX INFO: renamed from: b */
            public final int f31728b = 5;

            /* JADX INFO: renamed from: c */
            public long f31729c = 0;

            /* JADX INFO: renamed from: d */
            public long f31730d = 0;
        }

        /* JADX INFO: renamed from: a */
        public final ScrapData m11683a(int i) {
            SparseArray sparseArray = this.f31724a;
            ScrapData scrapData = (ScrapData) sparseArray.get(i);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            sparseArray.put(i, scrapData2);
            return scrapData2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class Recycler {

        /* JADX INFO: renamed from: a */
        public final ArrayList f31731a;

        /* JADX INFO: renamed from: b */
        public ArrayList f31732b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f31733c;

        /* JADX INFO: renamed from: d */
        public final List f31734d;

        /* JADX INFO: renamed from: e */
        public int f31735e;

        /* JADX INFO: renamed from: f */
        public int f31736f;

        /* JADX INFO: renamed from: g */
        public RecycledViewPool f31737g;

        /* JADX INFO: renamed from: h */
        public ViewCacheExtension f31738h;

        public Recycler() {
            ArrayList arrayList = new ArrayList();
            this.f31731a = arrayList;
            this.f31732b = null;
            this.f31733c = new ArrayList();
            this.f31734d = Collections.unmodifiableList(arrayList);
            this.f31735e = 2;
            this.f31736f = 2;
        }

        /* JADX INFO: renamed from: d */
        public static void m11684d(ViewGroup viewGroup, boolean z2) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m11684d((ViewGroup) childAt, true);
                }
            }
            if (z2) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m11685a(ViewHolder viewHolder, boolean z2) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                ViewCompat.m7765A(view, itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate ? (AccessibilityDelegateCompat) ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).f31771b.remove(view) : null);
            }
            if (z2) {
                RecyclerListener recyclerListener = recyclerView.mRecyclerListener;
                if (recyclerListener != null) {
                    recyclerListener.m11698a();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).m11698a();
                }
                Adapter adapter = recyclerView.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(viewHolder);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.m11757d(viewHolder);
                }
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            RecycledViewPool recycledViewPoolM11687c = m11687c();
            recycledViewPoolM11687c.getClass();
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList = recycledViewPoolM11687c.m11683a(itemViewType).f31727a;
            if (((RecycledViewPool.ScrapData) recycledViewPoolM11687c.f31724a.get(itemViewType)).f31728b <= arrayList.size()) {
                PoolingContainer.m8205b(viewHolder.itemView);
            } else {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m11686b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.m11703b()) {
                return !recyclerView.mState.f31755g ? i : recyclerView.mAdapterHelper.m11527f(i, 0);
            }
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "invalid position ", ". State item count is ");
            sbM20q.append(recyclerView.mState.m11703b());
            sbM20q.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }

        /* JADX INFO: renamed from: c */
        public final RecycledViewPool m11687c() {
            if (this.f31737g == null) {
                RecycledViewPool recycledViewPool = new RecycledViewPool();
                recycledViewPool.f31724a = new SparseArray();
                recycledViewPool.f31725b = 0;
                recycledViewPool.f31726c = Collections.newSetFromMap(new IdentityHashMap());
                this.f31737g = recycledViewPool;
                m11688e();
            }
            return this.f31737g;
        }

        /* JADX INFO: renamed from: e */
        public final void m11688e() {
            if (this.f31737g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                RecycledViewPool recycledViewPool = this.f31737g;
                recycledViewPool.f31726c.add(recyclerView.mAdapter);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m11689f(Adapter adapter, boolean z2) {
            RecycledViewPool recycledViewPool = this.f31737g;
            if (recycledViewPool == null) {
                return;
            }
            Set set = recycledViewPool.f31726c;
            set.remove(adapter);
            if (set.size() != 0 || z2) {
                return;
            }
            int i = 0;
            while (true) {
                SparseArray sparseArray = recycledViewPool.f31724a;
                if (i >= sparseArray.size()) {
                    return;
                }
                ArrayList arrayList = ((RecycledViewPool.ScrapData) sparseArray.get(sparseArray.keyAt(i))).f31727a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    PoolingContainer.m8205b(((ViewHolder) arrayList.get(i2)).itemView);
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m11690g() {
            ArrayList arrayList = this.f31733c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m11691h(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = layoutPrefetchRegistryImpl.f31633c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                layoutPrefetchRegistryImpl.f31634d = 0;
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m11691h(int i) {
            ArrayList arrayList = this.f31733c;
            m11685a((ViewHolder) arrayList.get(i), true);
            arrayList.remove(i);
        }

        /* JADX INFO: renamed from: i */
        public final void m11692i(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m11693j(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.mo11550i(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
        
            r5 = r5 - 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
        /* JADX INFO: renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m11693j(ViewHolder viewHolder) {
            boolean z2;
            int i;
            boolean zIsScrap = viewHolder.isScrap();
            boolean z3 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsScrap || viewHolder.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(viewHolder.isScrap());
                sb.append(" isAttached:");
                sb.append(viewHolder.itemView.getParent() != null);
                sb.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (viewHolder.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(viewHolder);
                throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, sb2));
            }
            if (viewHolder.shouldIgnore()) {
                throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.mAdapter;
            if ((adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                if (this.f31736f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                    z2 = false;
                } else {
                    ArrayList arrayList = this.f31733c;
                    int size = arrayList.size();
                    if (size >= this.f31736f && size > 0) {
                        m11691h(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                        int i2 = viewHolder.mPosition;
                        if (layoutPrefetchRegistryImpl.f31633c != null) {
                            int i3 = layoutPrefetchRegistryImpl.f31634d * 2;
                            for (int i4 = 0; i4 < i3; i4 += 2) {
                                if (layoutPrefetchRegistryImpl.f31633c[i4] == i2) {
                                    break;
                                }
                            }
                            i = size - 1;
                            loop1: while (i >= 0) {
                                int i5 = ((ViewHolder) arrayList.get(i)).mPosition;
                                GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView.mPrefetchRegistry;
                                if (layoutPrefetchRegistryImpl2.f31633c == null) {
                                    break;
                                }
                                int i6 = layoutPrefetchRegistryImpl2.f31634d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (layoutPrefetchRegistryImpl2.f31633c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i + 1;
                        } else {
                            i = size - 1;
                            loop1: while (i >= 0) {
                            }
                            size = i + 1;
                        }
                    }
                    arrayList.add(size, viewHolder);
                    z2 = true;
                }
                if (z2) {
                    z3 = false;
                } else {
                    m11685a(viewHolder, true);
                }
                z = z2;
            } else {
                z3 = false;
            }
            recyclerView.mViewInfoStore.m11757d(viewHolder);
            if (z || z3 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            PoolingContainer.m8205b(viewHolder.itemView);
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
        }

        /* JADX INFO: renamed from: k */
        public final void m11694k(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f31732b == null) {
                    this.f31732b = new ArrayList();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f31732b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f31731a.add(childViewHolderInt);
        }

        /* JADX WARN: Removed duplicated region for block: B:198:0x038a  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x0510  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x051c  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x0537  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ViewHolder m11695l(int i, long j) {
            boolean z2;
            ViewHolder viewHolderCreateViewHolder;
            boolean z3;
            long j2;
            long j3;
            boolean z4;
            Object[] objArr;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            RecyclerView recyclerViewFindNestedRecyclerView;
            ViewHolder viewHolder;
            ViewCacheExtension viewCacheExtension;
            View viewM11704a;
            View view;
            ViewHolder childViewHolderInt;
            boolean z5;
            int size;
            int iM11527f;
            boolean z6 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.mState.m11703b()) {
                StringBuilder sbM24u = AbstractC0000a.m24u("Invalid item position ", "(", "). Item count:", i, i);
                sbM24u.append(recyclerView.mState.m11703b());
                sbM24u.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbM24u.toString());
            }
            if (recyclerView.mState.f31755g) {
                ArrayList arrayList = this.f31732b;
                if (arrayList == null || (size = arrayList.size()) == 0) {
                    viewHolderCreateViewHolder = null;
                    z2 = viewHolderCreateViewHolder == null;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            viewHolderCreateViewHolder = (ViewHolder) this.f31732b.get(i2);
                            if (!viewHolderCreateViewHolder.wasReturnedFromScrap() && viewHolderCreateViewHolder.getLayoutPosition() == i) {
                                viewHolderCreateViewHolder.addFlags(32);
                                break;
                            }
                            i2++;
                        } else if (recyclerView.mAdapter.hasStableIds() && (iM11527f = recyclerView.mAdapterHelper.m11527f(i, 0)) > 0 && iM11527f < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(iM11527f);
                            for (int i3 = 0; i3 < size; i3++) {
                                ViewHolder viewHolder2 = (ViewHolder) this.f31732b.get(i3);
                                if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                                    viewHolder2.addFlags(32);
                                    viewHolderCreateViewHolder = viewHolder2;
                                    break;
                                }
                            }
                        }
                    }
                    viewHolderCreateViewHolder = null;
                    if (viewHolderCreateViewHolder == null) {
                    }
                }
            } else {
                z2 = false;
                viewHolderCreateViewHolder = null;
            }
            ArrayList arrayList2 = this.f31733c;
            ArrayList arrayList3 = this.f31731a;
            if (viewHolderCreateViewHolder == null) {
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ViewHolder viewHolder3 = (ViewHolder) arrayList3.get(i4);
                    if (!viewHolder3.wasReturnedFromScrap() && viewHolder3.getLayoutPosition() == i && !viewHolder3.isInvalid() && (recyclerView.mState.f31755g || !viewHolder3.isRemoved())) {
                        viewHolder3.addFlags(32);
                        z3 = true;
                        viewHolderCreateViewHolder = viewHolder3;
                        break;
                    }
                }
                ArrayList arrayList4 = recyclerView.mChildHelper.f31535c;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        z3 = z6;
                        view = null;
                        break;
                    }
                    view = (View) arrayList4.get(i5);
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    z3 = z6;
                    if (childViewHolderInt2.getLayoutPosition() == i && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                        break;
                    }
                    i5++;
                    z6 = z3;
                }
                if (view == null) {
                    int size4 = arrayList2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            viewHolderCreateViewHolder = null;
                            break;
                        }
                        ViewHolder viewHolder4 = (ViewHolder) arrayList2.get(i6);
                        if (!viewHolder4.isInvalid() && viewHolder4.getLayoutPosition() == i && !viewHolder4.isAttachedToTransitionOverlay()) {
                            arrayList2.remove(i6);
                            viewHolderCreateViewHolder = viewHolder4;
                            break;
                        }
                        i6++;
                    }
                } else {
                    ViewHolder childViewHolderInt3 = RecyclerView.getChildViewHolderInt(view);
                    ChildHelper childHelper = recyclerView.mChildHelper;
                    int iIndexOfChild = RecyclerView.this.indexOfChild(view);
                    if (iIndexOfChild < 0) {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                    ChildHelper.Bucket bucket = childHelper.f31534b;
                    if (!bucket.m11543d(iIndexOfChild)) {
                        throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                    }
                    bucket.m11540a(iIndexOfChild);
                    childHelper.m11539f(view);
                    int iM11538e = recyclerView.mChildHelper.m11538e(view);
                    if (iM11538e == -1) {
                        StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb.append(childViewHolderInt3);
                        throw new IllegalStateException(AbstractC1610a.m8732j(recyclerView, sb));
                    }
                    ChildHelper childHelper2 = recyclerView.mChildHelper;
                    int iM11537d = childHelper2.m11537d(iM11538e);
                    childHelper2.f31534b.m11545f(iM11537d);
                    RecyclerView recyclerView2 = RecyclerView.this;
                    View childAt = recyclerView2.getChildAt(iM11537d);
                    if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                        if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                            StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                            sb2.append(childViewHolderInt);
                            throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView2, sb2));
                        }
                        childViewHolderInt.addFlags(256);
                    }
                    RecyclerView.access$100(recyclerView2, iM11537d);
                    m11694k(view);
                    childViewHolderInt3.addFlags(8224);
                    viewHolderCreateViewHolder = childViewHolderInt3;
                }
                if (viewHolderCreateViewHolder != null) {
                    if (viewHolderCreateViewHolder.isRemoved()) {
                        z5 = recyclerView.mState.f31755g;
                    } else {
                        int i7 = viewHolderCreateViewHolder.mPosition;
                        if (i7 < 0 || i7 >= recyclerView.mAdapter.getItemCount()) {
                            StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb3.append(viewHolderCreateViewHolder);
                            throw new IndexOutOfBoundsException(AbstractC1610a.m8732j(recyclerView, sb3));
                        }
                        z5 = ((recyclerView.mState.f31755g || recyclerView.mAdapter.getItemViewType(viewHolderCreateViewHolder.mPosition) == viewHolderCreateViewHolder.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || viewHolderCreateViewHolder.getItemId() == recyclerView.mAdapter.getItemId(viewHolderCreateViewHolder.mPosition))) ? z3 : false;
                    }
                    if (z5) {
                        z2 = z3;
                    } else {
                        viewHolderCreateViewHolder.addFlags(4);
                        if (viewHolderCreateViewHolder.isScrap()) {
                            recyclerView.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                            viewHolderCreateViewHolder.unScrap();
                        } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                            viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m11693j(viewHolderCreateViewHolder);
                        viewHolderCreateViewHolder = null;
                    }
                }
            } else {
                z3 = true;
            }
            if (viewHolderCreateViewHolder == null) {
                int iM11527f2 = recyclerView.mAdapterHelper.m11527f(i, 0);
                if (iM11527f2 < 0 || iM11527f2 >= recyclerView.mAdapter.getItemCount()) {
                    StringBuilder sbM24u2 = AbstractC0000a.m24u("Inconsistency detected. Invalid item position ", "(offset:", ").state:", i, iM11527f2);
                    sbM24u2.append(recyclerView.mState.m11703b());
                    sbM24u2.append(recyclerView.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbM24u2.toString());
                }
                int itemViewType = recyclerView.mAdapter.getItemViewType(iM11527f2);
                j2 = 3;
                if (recyclerView.mAdapter.hasStableIds()) {
                    long itemId2 = recyclerView.mAdapter.getItemId(iM11527f2);
                    int size5 = arrayList3.size() - 1;
                    while (true) {
                        if (size5 >= 0) {
                            j3 = 4;
                            ViewHolder viewHolder5 = (ViewHolder) arrayList3.get(size5);
                            if (viewHolder5.getItemId() == itemId2 && !viewHolder5.wasReturnedFromScrap()) {
                                if (itemViewType == viewHolder5.getItemViewType()) {
                                    viewHolder5.addFlags(32);
                                    if (viewHolder5.isRemoved() && !recyclerView.mState.f31755g) {
                                        viewHolder5.setFlags(2, 14);
                                    }
                                    viewHolderCreateViewHolder = viewHolder5;
                                } else {
                                    arrayList3.remove(size5);
                                    recyclerView.removeDetachedView(viewHolder5.itemView, false);
                                    ViewHolder childViewHolderInt4 = RecyclerView.getChildViewHolderInt(viewHolder5.itemView);
                                    childViewHolderInt4.mScrapContainer = null;
                                    childViewHolderInt4.mInChangeScrap = false;
                                    childViewHolderInt4.clearReturnedFromScrapFlag();
                                    m11693j(childViewHolderInt4);
                                }
                            }
                            size5--;
                        } else {
                            j3 = 4;
                            int size6 = arrayList2.size() - 1;
                            while (true) {
                                if (size6 < 0) {
                                    break;
                                }
                                viewHolderCreateViewHolder = (ViewHolder) arrayList2.get(size6);
                                if (viewHolderCreateViewHolder.getItemId() != itemId2 || viewHolderCreateViewHolder.isAttachedToTransitionOverlay()) {
                                    size6--;
                                } else if (itemViewType == viewHolderCreateViewHolder.getItemViewType()) {
                                    arrayList2.remove(size6);
                                } else {
                                    m11691h(size6);
                                }
                            }
                            viewHolderCreateViewHolder = null;
                        }
                    }
                    if (viewHolderCreateViewHolder != null) {
                        viewHolderCreateViewHolder.mPosition = iM11527f2;
                        z2 = z3;
                    }
                } else {
                    j3 = 4;
                }
                if (viewHolderCreateViewHolder == null && (viewCacheExtension = this.f31738h) != null && (viewM11704a = viewCacheExtension.m11704a()) != null) {
                    viewHolderCreateViewHolder = recyclerView.getChildViewHolder(viewM11704a);
                    if (viewHolderCreateViewHolder == null) {
                        throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                    }
                    if (viewHolderCreateViewHolder.shouldIgnore()) {
                        throw new IllegalArgumentException(AbstractC1610a.m8732j(recyclerView, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                    }
                }
                if (viewHolderCreateViewHolder == null) {
                    RecycledViewPool.ScrapData scrapData = (RecycledViewPool.ScrapData) m11687c().f31724a.get(itemViewType);
                    if (scrapData != null) {
                        ArrayList arrayList5 = scrapData.f31727a;
                        if (arrayList5.isEmpty()) {
                            viewHolder = null;
                            if (viewHolder != null) {
                            }
                            viewHolderCreateViewHolder = viewHolder;
                        } else {
                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                if (!((ViewHolder) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                    viewHolder = (ViewHolder) arrayList5.remove(size7);
                                    break;
                                }
                            }
                            viewHolder = null;
                            if (viewHolder != null) {
                                viewHolder.resetInternal();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    View view2 = viewHolder.itemView;
                                    if (view2 instanceof ViewGroup) {
                                        m11684d((ViewGroup) view2, false);
                                    }
                                }
                            }
                            viewHolderCreateViewHolder = viewHolder;
                        }
                    }
                }
                if (viewHolderCreateViewHolder == null) {
                    long nanoTime = recyclerView.getNanoTime();
                    if (j != RecyclerView.FOREVER_NS) {
                        long j4 = this.f31737g.m11683a(itemViewType).f31729c;
                        if (!((j4 == 0 || j4 + nanoTime < j) ? z3 : false)) {
                            return null;
                        }
                    }
                    viewHolderCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.itemView)) != null) {
                        viewHolderCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    RecycledViewPool.ScrapData scrapDataM11683a = this.f31737g.m11683a(itemViewType);
                    long j5 = scrapDataM11683a.f31729c;
                    if (j5 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j5 / j3) * 3);
                    }
                    scrapDataM11683a.f31729c = nanoTime2;
                }
            } else {
                j2 = 3;
                j3 = 4;
            }
            if (z2 && !recyclerView.mState.f31755g && viewHolderCreateViewHolder.hasAnyOfTheFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE)) {
                viewHolderCreateViewHolder.setFlags(0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                if (recyclerView.mState.f31758j) {
                    ItemAnimator.m11665e(viewHolderCreateViewHolder);
                    ItemAnimator itemAnimator = recyclerView.mItemAnimator;
                    viewHolderCreateViewHolder.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo.m11674a(viewHolderCreateViewHolder);
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(viewHolderCreateViewHolder, itemHolderInfo);
                }
            }
            if (!recyclerView.mState.f31755g || !viewHolderCreateViewHolder.isBound()) {
                if (!viewHolderCreateViewHolder.isBound() || viewHolderCreateViewHolder.needsUpdate() || viewHolderCreateViewHolder.isInvalid()) {
                    int iM11527f3 = recyclerView.mAdapterHelper.m11527f(i, 0);
                    viewHolderCreateViewHolder.mBindingAdapter = null;
                    viewHolderCreateViewHolder.mOwnerRecyclerView = recyclerView;
                    int itemViewType2 = viewHolderCreateViewHolder.getItemViewType();
                    long nanoTime3 = recyclerView.getNanoTime();
                    if (j != RecyclerView.FOREVER_NS) {
                        long j6 = this.f31737g.m11683a(itemViewType2).f31730d;
                        if (j6 == 0 || j6 + nanoTime3 < j) {
                        }
                    }
                    recyclerView.mAdapter.bindViewHolder(viewHolderCreateViewHolder, iM11527f3);
                    long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                    RecycledViewPool.ScrapData scrapDataM11683a2 = this.f31737g.m11683a(viewHolderCreateViewHolder.getItemViewType());
                    long j7 = scrapDataM11683a2.f31730d;
                    if (j7 != 0) {
                        nanoTime4 = (nanoTime4 / j3) + ((j7 / j3) * j2);
                    }
                    scrapDataM11683a2.f31730d = nanoTime4;
                    if (recyclerView.isAccessibilityEnabled()) {
                        View view3 = viewHolderCreateViewHolder.itemView;
                        WeakHashMap weakHashMap = ViewCompat.f23405a;
                        if (view3.getImportantForAccessibility() == 0) {
                            z4 = z3;
                            view3.setImportantForAccessibility(z4 ? 1 : 0);
                        } else {
                            z4 = z3;
                        }
                        RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = recyclerView.mAccessibilityDelegate;
                        if (recyclerViewAccessibilityDelegate != null) {
                            AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                            if (itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                                RecyclerViewAccessibilityDelegate.ItemDelegate itemDelegate2 = (RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate;
                                itemDelegate2.getClass();
                                AccessibilityDelegateCompat accessibilityDelegateCompatM7786e = ViewCompat.m7786e(view3);
                                if (accessibilityDelegateCompatM7786e != null && accessibilityDelegateCompatM7786e != itemDelegate2) {
                                    itemDelegate2.f31771b.put(view3, accessibilityDelegateCompatM7786e);
                                }
                            }
                            ViewCompat.m7765A(view3, itemDelegate);
                        }
                    } else {
                        z4 = z3;
                    }
                    if (recyclerView.mState.f31755g) {
                        viewHolderCreateViewHolder.mPreLayoutPosition = i;
                    }
                    objArr = z4 ? 1 : 0;
                }
                layoutParams = viewHolderCreateViewHolder.itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams2 = (LayoutParams) recyclerView.generateDefaultLayoutParams();
                    viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) layoutParams;
                } else {
                    layoutParams2 = (LayoutParams) recyclerView.generateLayoutParams(layoutParams);
                    viewHolderCreateViewHolder.itemView.setLayoutParams(layoutParams2);
                }
                layoutParams2.f31720a = viewHolderCreateViewHolder;
                if (z2 || objArr == null) {
                    z4 = false;
                }
                layoutParams2.f31723d = z4;
                return viewHolderCreateViewHolder;
            }
            viewHolderCreateViewHolder.mPreLayoutPosition = i;
            objArr = null;
            z4 = z3;
            layoutParams = viewHolderCreateViewHolder.itemView.getLayoutParams();
            if (layoutParams != null) {
            }
            layoutParams2.f31720a = viewHolderCreateViewHolder;
            if (z2) {
                z4 = false;
            }
            layoutParams2.f31723d = z4;
            return viewHolderCreateViewHolder;
        }

        /* JADX INFO: renamed from: m */
        public final void m11696m(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f31732b.remove(viewHolder);
            } else {
                this.f31731a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: renamed from: n */
        public final void m11697n() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.f31736f = this.f31735e + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            ArrayList arrayList = this.f31733c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f31736f; size--) {
                m11691h(size);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RecyclerListener {
        /* JADX INFO: renamed from: a */
        void m11698a();
    }

    /* JADX INFO: compiled from: Proguard */
    public class RecyclerViewDataObserver extends AdapterDataObserver {
        public RecyclerViewDataObserver() {
        }

        /* JADX INFO: renamed from: a */
        public final void m11699a() {
            boolean z2 = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z2 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f31754f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.m11528g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            if (i2 < 1) {
                adapterHelper.getClass();
                return;
            }
            ArrayList arrayList = adapterHelper.f31522b;
            arrayList.add(adapterHelper.m11529h(4, obj, i, i2));
            adapterHelper.f31526f |= 4;
            if (arrayList.size() == 1) {
                m11699a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            if (i2 < 1) {
                adapterHelper.getClass();
                return;
            }
            ArrayList arrayList = adapterHelper.f31522b;
            arrayList.add(adapterHelper.m11529h(1, null, i, i2));
            adapterHelper.f31526f |= 1;
            if (arrayList.size() == 1) {
                m11699a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            adapterHelper.getClass();
            if (i == i2) {
                return;
            }
            ArrayList arrayList = adapterHelper.f31522b;
            arrayList.add(adapterHelper.m11529h(8, null, i, i2));
            adapterHelper.f31526f |= 8;
            if (arrayList.size() == 1) {
                m11699a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
            if (i2 < 1) {
                adapterHelper.getClass();
                return;
            }
            ArrayList arrayList = adapterHelper.f31522b;
            arrayList.add(adapterHelper.m11529h(2, null, i, i2));
            adapterHelper.f31526f |= 2;
            if (arrayList.size() == 1) {
                m11699a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C21511();

        /* JADX INFO: renamed from: a */
        public Parcelable f31741a;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C21511 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31741a = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f31741a, 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final Action mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        /* JADX INFO: compiled from: Proguard */
        public static class Action {

            /* JADX INFO: renamed from: a */
            public int f31742a;

            /* JADX INFO: renamed from: b */
            public int f31743b;

            /* JADX INFO: renamed from: c */
            public int f31744c;

            /* JADX INFO: renamed from: d */
            public int f31745d;

            /* JADX INFO: renamed from: e */
            public Interpolator f31746e;

            /* JADX INFO: renamed from: f */
            public boolean f31747f;

            /* JADX INFO: renamed from: g */
            public int f31748g;

            /* JADX INFO: renamed from: a */
            public final void m11700a(RecyclerView recyclerView) {
                int i = this.f31745d;
                if (i >= 0) {
                    this.f31745d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f31747f = false;
                    return;
                }
                if (!this.f31747f) {
                    this.f31748g = 0;
                    return;
                }
                Interpolator interpolator = this.f31746e;
                if (interpolator != null && this.f31744c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.f31744c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.m11707c(this.f31742a, this.f31743b, interpolator, i2);
                int i3 = this.f31748g + 1;
                this.f31748g = i3;
                if (i3 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f31747f = false;
            }

            /* JADX INFO: renamed from: b */
            public final void m11701b(int i, int i2, Interpolator interpolator, int i3) {
                this.f31742a = i;
                this.f31743b = i2;
                this.f31744c = i3;
                this.f31746e = interpolator;
                this.f31747f = true;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public interface ScrollVectorProvider {
            PointF computeScrollVectorForPosition(int i);
        }

        public SmoothScroller() {
            Action action = new Action();
            action.f31745d = -1;
            action.f31747f = false;
            action.f31748g = 0;
            action.f31742a = 0;
            action.f31743b = 0;
            action.f31744c = Integer.MIN_VALUE;
            action.f31746e = null;
            this.mRecyclingAction = action;
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = pointFComputeScrollVectorForPosition.x;
                if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m11700a(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                Action action = this.mRecyclingAction;
                boolean z2 = action.f31745d >= 0;
                action.m11700a(recyclerView);
                if (z2 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m11706b();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(int i, int i2, State state, Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, State state, Action action);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            ViewFlinger viewFlinger = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.f31765c.abortAnimation();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i = this.mTargetPosition;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f31749a = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.m11706b();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f31749a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class State {

        /* JADX INFO: renamed from: a */
        public int f31749a;

        /* JADX INFO: renamed from: b */
        public int f31750b;

        /* JADX INFO: renamed from: c */
        public int f31751c;

        /* JADX INFO: renamed from: d */
        public int f31752d;

        /* JADX INFO: renamed from: e */
        public int f31753e;

        /* JADX INFO: renamed from: f */
        public boolean f31754f;

        /* JADX INFO: renamed from: g */
        public boolean f31755g;

        /* JADX INFO: renamed from: h */
        public boolean f31756h;

        /* JADX INFO: renamed from: i */
        public boolean f31757i;

        /* JADX INFO: renamed from: j */
        public boolean f31758j;

        /* JADX INFO: renamed from: k */
        public boolean f31759k;

        /* JADX INFO: renamed from: l */
        public int f31760l;

        /* JADX INFO: renamed from: m */
        public long f31761m;

        /* JADX INFO: renamed from: n */
        public int f31762n;

        /* JADX INFO: renamed from: a */
        public final void m11702a(int i) {
            if ((this.f31752d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f31752d));
        }

        /* JADX INFO: renamed from: b */
        public final int m11703b() {
            return this.f31755g ? this.f31750b - this.f31751c : this.f31753e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f31749a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.f31753e);
            sb.append(", mIsMeasuring=");
            sb.append(this.f31757i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f31750b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f31751c);
            sb.append(", mStructureChanged=");
            sb.append(this.f31754f);
            sb.append(", mInPreLayout=");
            sb.append(this.f31755g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f31758j);
            sb.append(", mRunPredictiveAnimations=");
            return AbstractC0455a.m2243r(sb, this.f31759k, '}');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        /* JADX INFO: renamed from: a */
        public final EdgeEffect mo11664a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ViewCacheExtension {
        /* JADX INFO: renamed from: a */
        public abstract View m11704a();
    }

    /* JADX INFO: compiled from: Proguard */
    public class ViewFlinger implements Runnable {

        /* JADX INFO: renamed from: a */
        public int f31763a;

        /* JADX INFO: renamed from: b */
        public int f31764b;

        /* JADX INFO: renamed from: c */
        public OverScroller f31765c;

        /* JADX INFO: renamed from: d */
        public Interpolator f31766d;

        /* JADX INFO: renamed from: f */
        public boolean f31767f;

        /* JADX INFO: renamed from: g */
        public boolean f31768g;

        public ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f31766d = interpolator;
            this.f31767f = false;
            this.f31768g = false;
            this.f31765c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: a */
        public final void m11705a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f31764b = 0;
            this.f31763a = 0;
            Interpolator interpolator = this.f31766d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f31766d = interpolator2;
                this.f31765c = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f31765c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m11706b();
        }

        /* JADX INFO: renamed from: b */
        public final void m11706b() {
            if (this.f31767f) {
                this.f31768g = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            recyclerView.postOnAnimation(this);
        }

        /* JADX INFO: renamed from: c */
        public final void m11707c(int i, int i2, Interpolator interpolator, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z2 = iAbs > iAbs2;
                int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z2) {
                    iAbs = iAbs2;
                }
                i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f31766d != interpolator) {
                this.f31766d = interpolator;
                this.f31765c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f31764b = 0;
            this.f31763a = 0;
            recyclerView.setScrollState(2);
            this.f31765c.startScroll(0, 0, i, i2, i4);
            m11706b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f31765c.abortAnimation();
                return;
            }
            this.f31768g = false;
            this.f31767f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f31765c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f31763a;
                int i6 = currY - this.f31764b;
                this.f31763a = currX;
                this.f31764b = currY;
                int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i5);
                int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i6);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i7 = iArr4[0];
                    int i8 = iArr4[1];
                    int i9 = iConsumeFlingInHorizontalStretch - i7;
                    int i10 = iConsumeFlingInVerticalStretch - i8;
                    SmoothScroller smoothScroller = recyclerView.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int iM11703b = recyclerView.mState.m11703b();
                        if (iM11703b == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= iM11703b) {
                            smoothScroller.setTargetPosition(iM11703b - 1);
                            smoothScroller.onAnimation(i7, i8);
                        } else {
                            smoothScroller.onAnimation(i7, i8);
                        }
                    }
                    i = i9;
                    i3 = i7;
                    i2 = i10;
                    i4 = i8;
                } else {
                    i = iConsumeFlingInHorizontalStretch;
                    i2 = iConsumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i3, i4, i, i2, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i11 = i - iArr6[0];
                int i12 = i2 - iArr6[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.dispatchOnScrolled(i3, i4);
                }
                if (!RecyclerView.access$200(recyclerView)) {
                    recyclerView.invalidate();
                }
                boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                SmoothScroller smoothScroller2 = recyclerView.mLayout.mSmoothScroller;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z2) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i13, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        GapWorker.LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = layoutPrefetchRegistryImpl.f31633c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        layoutPrefetchRegistryImpl.f31634d = 0;
                    }
                } else {
                    m11706b();
                    GapWorker gapWorker = recyclerView.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.m11571a(recyclerView, i3, i4);
                    }
                }
            }
            SmoothScroller smoothScroller3 = recyclerView.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.f31767f = false;
            if (!this.f31768g) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public ViewHolder(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                if (this.mPayloads == null) {
                    ArrayList arrayList = new ArrayList();
                    this.mPayloads = arrayList;
                    this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
                }
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z2) {
            addFlags(8);
            offsetPosition(i2, z2);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z2) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z2) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f31722c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z2) {
            int i = this.mIsRecyclableCount;
            int i2 = z2 ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z2 && i2 == 1) {
                this.mFlags |= 16;
            } else if (z2 && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z2) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z2;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbM21r = AbstractC0000a.m21r(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbM21r.append(Integer.toHexString(hashCode()));
            sbM21r.append(" position=");
            sbM21r.append(this.mPosition);
            sbM21r.append(" id=");
            sbM21r.append(this.mItemId);
            sbM21r.append(", oldPos=");
            sbM21r.append(this.mOldPosition);
            sbM21r.append(", pLpos:");
            sbM21r.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(sbM21r.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m11696m(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC21443();
        sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.exchange.allin.R.attr.recyclerViewStyle);
    }

    public static /* synthetic */ void access$000(RecyclerView recyclerView, View view, int i, ViewGroup.LayoutParams layoutParams) {
        recyclerView.attachViewToParent(view, i, layoutParams);
    }

    public static /* synthetic */ void access$100(RecyclerView recyclerView, int i) {
        recyclerView.detachViewFromParent(i);
    }

    public static /* synthetic */ boolean access$200(RecyclerView recyclerView) {
        return recyclerView.awakenScrollBars();
    }

    public static /* synthetic */ void access$300(RecyclerView recyclerView, int i, int i2) {
        recyclerView.setMeasuredDimension(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static int m11630b(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && EdgeEffectCompat.m8165a(edgeEffect) != 0.0f) {
            int iRound = Math.round(EdgeEffectCompat.m8166b(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f) * ((-i2) / FLING_DESTRETCH_FACTOR));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || EdgeEffectCompat.m8165a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(EdgeEffectCompat.m8166b(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f) * (f / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f31720a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f31721b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m11631a(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z2 = view.getParent() == this;
        this.mRecycler.m11696m(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.m11534a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            ChildHelper childHelper = this.mChildHelper;
            RecyclerView recyclerView = RecyclerView.this;
            int childCount = recyclerView.getChildCount();
            childHelper.f31534b.m11544e(childCount, true);
            childHelper.f31535c.add(view);
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(recyclerView);
            }
            recyclerView.addView(view, childCount);
            recyclerView.dispatchChildAttached(view);
            return;
        }
        ChildHelper childHelper2 = this.mChildHelper;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        childHelper2.f31534b.m11547h(iIndexOfChild);
        childHelper2.f31535c.add(view);
        C21465 c21465 = childHelper2.f31533a;
        ViewHolder childViewHolderInt2 = getChildViewHolderInt(view);
        if (childViewHolderInt2 != null) {
            childViewHolderInt2.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        Preconditions.m7695b(recyclerListener != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    public void animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.mo11666a(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        m11631a(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.mo11668c(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(AbstractC1610a.m8732j(this, AbstractC0455a.m2244s(str)));
        }
        throw new IllegalStateException(AbstractC1610a.m8732j(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC1610a.m8732j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC1610a.m8732j(this, new StringBuilder(""))));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11632c() {
        ViewInfoStore.InfoRecord infoRecord;
        this.mState.m11702a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f31757i = false;
        startInterceptRequestLayout();
        ViewInfoStore viewInfoStore = this.mViewInfoStore;
        viewInfoStore.f31836a.clear();
        viewInfoStore.f31837b.m1999a();
        onEnterLayoutOrScroll();
        m11638i();
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            State state = this.mState;
            state.f31761m = -1L;
            state.f31760l = -1;
            state.f31762n = -1;
        } else {
            this.mState.f31761m = this.mAdapter.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
            this.mState.f31760l = this.mDataSetHasChangedAfterLayout ? -1 : viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
            State state2 = this.mState;
            View focusedChild2 = viewHolderFindContainingViewHolder.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            state2.f31762n = id;
        }
        State state3 = this.mState;
        state3.f31756h = state3.f31758j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state3.f31755g = state3.f31759k;
        state3.f31753e = this.mAdapter.getItemCount();
        m11635f(this.mMinMaxLayoutPositions);
        if (this.mState.f31758j) {
            int iM11536c = this.mChildHelper.m11536c();
            for (int i = 0; i < iM11536c; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m11535b(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    ItemAnimator itemAnimator = this.mItemAnimator;
                    ItemAnimator.m11665e(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    itemAnimator.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo.m11674a(childViewHolderInt);
                    SimpleArrayMap simpleArrayMap = this.mViewInfoStore.f31836a;
                    ViewInfoStore.InfoRecord infoRecordM11758a = (ViewInfoStore.InfoRecord) simpleArrayMap.get(childViewHolderInt);
                    if (infoRecordM11758a == null) {
                        infoRecordM11758a = ViewInfoStore.InfoRecord.m11758a();
                        simpleArrayMap.put(childViewHolderInt, infoRecordM11758a);
                    }
                    infoRecordM11758a.f31840b = itemHolderInfo;
                    infoRecordM11758a.f31839a |= 4;
                    if (this.mState.f31756h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f31837b.m2005h(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f31759k) {
            saveOldPositions();
            State state4 = this.mState;
            boolean z2 = state4.f31754f;
            state4.f31754f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, state4);
            this.mState.f31754f = z2;
            for (int i2 = 0; i2 < this.mChildHelper.m11536c(); i2++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m11535b(i2));
                if (!childViewHolderInt2.shouldIgnore() && ((infoRecord = (ViewInfoStore.InfoRecord) this.mViewInfoStore.f31836a.get(childViewHolderInt2)) == null || (infoRecord.f31839a & 4) == 0)) {
                    ItemAnimator.m11665e(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    ItemAnimator itemAnimator2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    itemAnimator2.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo2 = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo2.m11674a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, itemHolderInfo2);
                    } else {
                        SimpleArrayMap simpleArrayMap2 = this.mViewInfoStore.f31836a;
                        ViewInfoStore.InfoRecord infoRecordM11758a2 = (ViewInfoStore.InfoRecord) simpleArrayMap2.get(childViewHolderInt2);
                        if (infoRecordM11758a2 == null) {
                            infoRecordM11758a2 = ViewInfoStore.InfoRecord.m11758a();
                            simpleArrayMap2.put(childViewHolderInt2, infoRecordM11758a2);
                        }
                        infoRecordM11758a2.f31839a |= 2;
                        infoRecordM11758a2.f31840b = itemHolderInfo2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f31752d = 2;
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.mo11549g(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f31733c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewHolder) arrayList.get(i2)).clearOldPosition();
        }
        ArrayList arrayList2 = recycler.f31731a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ViewHolder) arrayList2.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = recycler.f31732b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ViewHolder) recycler.f31732b.get(i4)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return m11630b(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return m11630b(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = TraceCompat.f23262a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.m11528g()) {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            int i2 = adapterHelper.f31526f;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (adapterHelper.m11528g()) {
                    int i3 = TraceCompat.f23262a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = TraceCompat.f23262a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m11531j();
            if (!this.mLayoutWasDefered) {
                int iM11536c = this.mChildHelper.m11536c();
                int i5 = 0;
                while (true) {
                    if (i5 < iM11536c) {
                        ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m11535b(i5));
                        if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                            dispatchLayout();
                            break;
                        }
                        i5++;
                    } else {
                        this.mAdapterHelper.m11523b();
                        break;
                    }
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11633d() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m11702a(6);
        this.mAdapterHelper.m11524c();
        this.mState.f31753e = this.mAdapter.getItemCount();
        this.mState.f31751c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f31741a;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.f31755g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, state);
        State state2 = this.mState;
        state2.f31754f = false;
        state2.f31758j = state2.f31758j && this.mItemAnimator != null;
        state2.f31752d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        setMeasuredDimension(LayoutManager.chooseSize(i, paddingRight, getMinimumWidth()), LayoutManager.chooseSize(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo11587c(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo11586b(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchLayout() {
        View viewFindViewById;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f31757i = false;
        boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f31752d == 1) {
            m11632c();
            this.mLayout.setExactMeasureSpecsFrom(this);
            m11633d();
        } else {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            if ((adapterHelper.f31523c.isEmpty() || adapterHelper.f31522b.isEmpty()) && !z2 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                m11633d();
            }
        }
        this.mState.m11702a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.f31752d = 1;
        View view = null;
        if (state.f31758j) {
            for (int iM11536c = this.mChildHelper.m11536c() - 1; iM11536c >= 0; iM11536c--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m11535b(iM11536c));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    ItemAnimator.ItemHolderInfo itemHolderInfo = new ItemAnimator.ItemHolderInfo();
                    itemHolderInfo.m11674a(childViewHolderInt);
                    ViewHolder viewHolder = (ViewHolder) this.mViewInfoStore.f31837b.m2001c(changedHolderKey);
                    if (viewHolder == null || viewHolder.shouldIgnore()) {
                        this.mViewInfoStore.m11754a(childViewHolderInt, itemHolderInfo);
                    } else {
                        ViewInfoStore.InfoRecord infoRecord = (ViewInfoStore.InfoRecord) this.mViewInfoStore.f31836a.get(viewHolder);
                        boolean z3 = (infoRecord == null || (infoRecord.f31839a & 1) == 0) ? false : true;
                        ViewInfoStore.InfoRecord infoRecord2 = (ViewInfoStore.InfoRecord) this.mViewInfoStore.f31836a.get(childViewHolderInt);
                        boolean z4 = (infoRecord2 == null || (infoRecord2.f31839a & 1) == 0) ? false : true;
                        if (z3 && viewHolder == childViewHolderInt) {
                            this.mViewInfoStore.m11754a(childViewHolderInt, itemHolderInfo);
                        } else {
                            ItemAnimator.ItemHolderInfo itemHolderInfoM11755b = this.mViewInfoStore.m11755b(viewHolder, 4);
                            this.mViewInfoStore.m11754a(childViewHolderInt, itemHolderInfo);
                            ItemAnimator.ItemHolderInfo itemHolderInfoM11755b2 = this.mViewInfoStore.m11755b(childViewHolderInt, 8);
                            if (itemHolderInfoM11755b == null) {
                                int iM11536c2 = this.mChildHelper.m11536c();
                                for (int i = 0; i < iM11536c2; i++) {
                                    ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m11535b(i));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        Adapter adapter = this.mAdapter;
                                        if (adapter == null || !adapter.hasStableIds()) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(childViewHolderInt2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(childViewHolderInt);
                                            throw new IllegalStateException(AbstractC1610a.m8732j(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(childViewHolderInt2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(childViewHolderInt);
                                        throw new IllegalStateException(AbstractC1610a.m8732j(this, sb2));
                                    }
                                }
                                Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                viewHolder.setIsRecyclable(false);
                                if (z3) {
                                    m11631a(viewHolder);
                                }
                                if (viewHolder != childViewHolderInt) {
                                    if (z4) {
                                        m11631a(childViewHolderInt);
                                    }
                                    viewHolder.mShadowedHolder = childViewHolderInt;
                                    m11631a(viewHolder);
                                    this.mRecycler.m11696m(viewHolder);
                                    childViewHolderInt.setIsRecyclable(false);
                                    childViewHolderInt.mShadowingHolder = viewHolder;
                                }
                                if (this.mItemAnimator.mo11667b(viewHolder, childViewHolderInt, itemHolderInfoM11755b, itemHolderInfoM11755b2)) {
                                    postAnimationRunner();
                                }
                            }
                        }
                    }
                }
            }
            ViewInfoStore viewInfoStore = this.mViewInfoStore;
            ViewInfoStore.ProcessCallback processCallback = this.mViewInfoProcessCallback;
            SimpleArrayMap simpleArrayMap = viewInfoStore.f31836a;
            for (int i2 = simpleArrayMap.f3884c - 1; i2 >= 0; i2--) {
                ViewHolder viewHolder2 = (ViewHolder) simpleArrayMap.m2128j(i2);
                ViewInfoStore.InfoRecord infoRecord3 = (ViewInfoStore.InfoRecord) simpleArrayMap.mo2129k(i2);
                int i3 = infoRecord3.f31839a;
                if ((i3 & 3) == 3) {
                    processCallback.mo11645a(viewHolder2);
                } else if ((i3 & 1) != 0) {
                    ItemAnimator.ItemHolderInfo itemHolderInfo2 = infoRecord3.f31840b;
                    if (itemHolderInfo2 == null) {
                        processCallback.mo11645a(viewHolder2);
                    } else {
                        processCallback.mo11647c(viewHolder2, itemHolderInfo2, infoRecord3.f31841c);
                    }
                } else if ((i3 & 14) == 14) {
                    processCallback.mo11646b(viewHolder2, infoRecord3.f31840b, infoRecord3.f31841c);
                } else if ((i3 & 12) == 12) {
                    processCallback.mo11648d(viewHolder2, infoRecord3.f31840b, infoRecord3.f31841c);
                } else if ((i3 & 4) != 0) {
                    processCallback.mo11647c(viewHolder2, infoRecord3.f31840b, null);
                } else if ((i3 & 8) != 0) {
                    processCallback.mo11646b(viewHolder2, infoRecord3.f31840b, infoRecord3.f31841c);
                }
                infoRecord3.f31839a = 0;
                infoRecord3.f31840b = null;
                infoRecord3.f31841c = null;
                ViewInfoStore.InfoRecord.f31838d.mo7692a(infoRecord3);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        State state2 = this.mState;
        state2.f31750b = state2.f31753e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        state2.f31758j = false;
        state2.f31759k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f31732b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m11697n();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        ViewInfoStore viewInfoStore2 = this.mViewInfoStore;
        viewInfoStore2.f31836a.clear();
        viewInfoStore2.f31837b.m1999a();
        int[] iArr = this.mMinMaxLayoutPositions;
        int i4 = iArr[0];
        int i5 = iArr[1];
        m11635f(iArr);
        int[] iArr2 = this.mMinMaxLayoutPositions;
        if (iArr2[0] != i4 || iArr2[1] != i5) {
            dispatchOnScrolled(0, 0);
        }
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                    if (this.mChildHelper.f31535c.contains(focusedChild)) {
                        ViewHolder viewHolderFindViewHolderForItemId = (this.mState.f31761m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f31761m);
                        if (viewHolderFindViewHolderForItemId != null) {
                            if (!this.mChildHelper.f31535c.contains(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
                                view = viewHolderFindViewHolderForItemId.itemView;
                            } else if (this.mChildHelper.m11536c() > 0) {
                                State state3 = this.mState;
                                int i6 = state3.f31760l;
                                int i7 = i6 != -1 ? i6 : 0;
                                int iM11703b = state3.m11703b();
                                for (int i8 = i7; i8 < iM11703b; i8++) {
                                    ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i8);
                                    if (viewHolderFindViewHolderForAdapterPosition == null) {
                                        break;
                                    }
                                    if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition.itemView;
                                        break;
                                    }
                                }
                                int iMin = Math.min(iM11703b, i7) - 1;
                                while (true) {
                                    if (iMin < 0) {
                                        break;
                                    }
                                    ViewHolder viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(iMin);
                                    if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                                        break;
                                    }
                                    if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                                        view = viewHolderFindViewHolderForAdapterPosition2.itemView;
                                        break;
                                    }
                                    iMin--;
                                }
                            }
                            if (view != null) {
                                int i9 = this.mState.f31762n;
                                if (i9 != -1 && (viewFindViewById = view.findViewById(i9)) != null && viewFindViewById.isFocusable()) {
                                    view = viewFindViewById;
                                }
                                view.requestFocus();
                            }
                        }
                    }
                } else if (this.mChildHelper.m11536c() == 0) {
                    requestFocus();
                }
            }
        }
        State state4 = this.mState;
        state4.f31761m = -1L;
        state4.f31760l = -1;
        state4.f31762n = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return getScrollingChildHelper().m7749a(f, f2, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m7750b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m7751c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m7752d(i, i2, i3, i4, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                View view = viewHolder.itemView;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                view.setImportantForAccessibility(i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo11552k()) ? z2 : true) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11634e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.mo11564d(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo11664a = this.mEdgeEffectFactory.mo11664a(this);
        this.mBottomGlow = edgeEffectMo11664a;
        if (this.mClipToPadding) {
            edgeEffectMo11664a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo11664a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo11664a = this.mEdgeEffectFactory.mo11664a(this);
        this.mLeftGlow = edgeEffectMo11664a;
        if (this.mClipToPadding) {
            edgeEffectMo11664a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo11664a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo11664a = this.mEdgeEffectFactory.mo11664a(this);
        this.mRightGlow = edgeEffectMo11664a;
        if (this.mClipToPadding) {
            edgeEffectMo11664a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo11664a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo11664a = this.mEdgeEffectFactory.mo11664a(this);
        this.mTopGlow = edgeEffectMo11664a;
        if (this.mClipToPadding) {
            edgeEffectMo11664a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo11664a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m11635f(int[] iArr) {
        int iM11536c = this.mChildHelper.m11536c();
        if (iM11536c == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM11536c; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m11535b(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void fillRemainingScrollValues(State state) {
        if (getScrollState() != 2) {
            state.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f31765c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        state.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Nullable
    public View findChildViewUnder(float f, float f2) {
        for (int iM11536c = this.mChildHelper.m11536c() - 1; iM11536c >= 0; iM11536c--) {
            View viewM11535b = this.mChildHelper.m11535b(iM11536c);
            float translationX = viewM11535b.getTranslationX();
            float translationY = viewM11535b.getTranslationY();
            if (f >= viewM11535b.getLeft() + translationX && f <= viewM11535b.getRight() + translationX && f2 >= viewM11535b.getTop() + translationY && f2 <= viewM11535b.getBottom() + translationY) {
                return viewM11535b;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int childCount = RecyclerView.this.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                ChildHelper childHelper = this.mChildHelper;
                if (!childHelper.f31535c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int childCount = RecyclerView.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    ChildHelper childHelper = this.mChildHelper;
                    if (!childHelper.f31535c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i2) {
        int iMax;
        int i3;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || EdgeEffectCompat.m8165a(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && EdgeEffectCompat.m8165a(edgeEffect2) != 0.0f) {
                    if (m11644o(this.mRightGlow, i, getWidth())) {
                        this.mRightGlow.onAbsorb(i);
                        i = 0;
                    }
                    iMax = i;
                    i = 0;
                }
                iMax = 0;
            } else {
                int i4 = -i;
                if (m11644o(this.mLeftGlow, i4, getWidth())) {
                    this.mLeftGlow.onAbsorb(i4);
                    i = 0;
                }
                iMax = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || EdgeEffectCompat.m8165a(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && EdgeEffectCompat.m8165a(edgeEffect4) != 0.0f) {
                    if (m11644o(this.mBottomGlow, i2, getHeight())) {
                        this.mBottomGlow.onAbsorb(i2);
                        i2 = 0;
                    }
                    i3 = 0;
                }
                i3 = i2;
                i2 = 0;
            } else {
                int i5 = -i2;
                if (m11644o(this.mTopGlow, i5, getHeight())) {
                    this.mTopGlow.onAbsorb(i5);
                    i2 = 0;
                }
                i3 = 0;
            }
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.mMaxFlingVelocity;
            iMax = Math.max(-i6, Math.min(iMax, i6));
            int i7 = this.mMaxFlingVelocity;
            i2 = Math.max(-i7, Math.min(i2, i7));
            this.mViewFlinger.m11705a(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z2 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z2);
            OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.onFling(i, i3)) {
                return true;
            }
            if (z2) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i8 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i8, Math.min(i, i8));
                int i9 = this.mMaxFlingVelocity;
                this.mViewFlinger.m11705a(iMax2, Math.max(-i9, Math.min(i3, i9)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x017e, code lost:
    
        if (r16 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0195, code lost:
    
        if (r5 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0198, code lost:
    
        if (r16 < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019b, code lost:
    
        if (r5 < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a3, code lost:
    
        if ((r5 * r6) <= 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ab, code lost:
    
        if ((r5 * r6) >= 0) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0128  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b2;
        boolean z2;
        int i7 = i;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i7);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i7 == 2 || i7 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i8 = i7 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i8) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i7 = i8;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.canScrollHorizontally()) {
                int i9 = (this.mLayout.getLayoutDirection() == 1) ^ (i7 == 2) ? 66 : 17;
                z2 = focusFinder.findNextFocus(this, view, i9) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i7 = i9;
                }
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) != null) {
                    startInterceptRequestLayout();
                    this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                return null;
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i7);
            if (viewOnFocusSearchFailed == null) {
            }
            if (viewOnFocusSearchFailed != null) {
                if (view != null) {
                    this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                    this.mTempRect2.set(0, 0, viewOnFocusSearchFailed.getWidth(), viewOnFocusSearchFailed.getHeight());
                    offsetDescendantRectToMyCoords(view, this.mTempRect);
                    offsetDescendantRectToMyCoords(viewOnFocusSearchFailed, this.mTempRect2);
                    if (this.mLayout.getLayoutDirection() != 1) {
                    }
                    Rect rect = this.mTempRect;
                    i2 = rect.left;
                    Rect rect2 = this.mTempRect2;
                    i3 = rect2.left;
                    if (i2 >= i3) {
                    }
                    i4 = 1;
                    i5 = rect.top;
                    i6 = rect2.top;
                    if (i5 >= i6) {
                    }
                    b2 = 1;
                    if (i7 == 1) {
                    }
                }
                return viewOnFocusSearchFailed;
            }
            return super.focusSearch(view, i7);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i7);
        if (viewFindNextFocus == null && z3) {
            consumePendingUpdateOperations();
            if (findContainingItemView(view) != null) {
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            return null;
        }
        viewOnFocusSearchFailed = viewFindNextFocus;
        if (viewOnFocusSearchFailed == null && !viewOnFocusSearchFailed.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i7);
            }
            m11641l(viewOnFocusSearchFailed, null);
            return view;
        }
        if (viewOnFocusSearchFailed != null && viewOnFocusSearchFailed != this && viewOnFocusSearchFailed != view && findContainingItemView(viewOnFocusSearchFailed) != null) {
            if (view != null && findContainingItemView(view) != null) {
                this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                this.mTempRect2.set(0, 0, viewOnFocusSearchFailed.getWidth(), viewOnFocusSearchFailed.getHeight());
                offsetDescendantRectToMyCoords(view, this.mTempRect);
                offsetDescendantRectToMyCoords(viewOnFocusSearchFailed, this.mTempRect2);
                int i10 = this.mLayout.getLayoutDirection() != 1 ? -1 : 1;
                Rect rect3 = this.mTempRect;
                i2 = rect3.left;
                Rect rect22 = this.mTempRect2;
                i3 = rect22.left;
                if ((i2 >= i3 || rect3.right <= i3) && rect3.right < rect22.right) {
                    i4 = 1;
                } else {
                    int i11 = rect3.right;
                    int i12 = rect22.right;
                    i4 = ((i11 > i12 || i2 >= i12) && i2 > i3) ? -1 : 0;
                }
                i5 = rect3.top;
                i6 = rect22.top;
                if ((i5 >= i6 || rect3.bottom <= i6) && rect3.bottom < rect22.bottom) {
                    b2 = 1;
                } else {
                    int i13 = rect3.bottom;
                    int i14 = rect22.bottom;
                    b2 = ((i13 > i14 || i5 >= i14) && i5 > i6) ? (byte) -1 : (byte) 0;
                }
                if (i7 == 1) {
                    if (i7 != 2) {
                        if (i7 != 17) {
                            if (i7 != 33) {
                                if (i7 != 66) {
                                    if (i7 != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i7);
                                        throw new IllegalArgumentException(AbstractC1610a.m8732j(this, sb));
                                    }
                                }
                            }
                        }
                    } else if (b2 <= 0) {
                        if (b2 == 0) {
                        }
                    }
                } else if (b2 >= 0) {
                    if (b2 == 0) {
                    }
                }
            }
            return viewOnFocusSearchFailed;
        }
        return super.focusSearch(view, i7);
    }

    /* JADX INFO: renamed from: g */
    public final void m11636g(int i, int i2, MotionEvent motionEvent) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i3 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iM11639j = i - m11639j(height, i);
        int iM11640k = i2 - m11640k(width, i2);
        startNestedScroll(i3, 1);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM11639j : 0, zCanScrollVertically ? iM11640k : 0, this.mReusableIntPair, this.mScrollOffset, 1)) {
            int[] iArr2 = this.mReusableIntPair;
            iM11639j -= iArr2[0];
            iM11640k -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iM11639j : 0, zCanScrollVertically ? iM11640k : 0, motionEvent, 1);
        GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (iM11639j != 0 || iM11640k != 0)) {
            gapWorker.m11571a(this, iM11639j, iM11640k);
        }
        stopNestedScroll(1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(AbstractC1610a.m8732j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC1610a.m8732j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        AdapterHelper adapterHelper = this.mAdapterHelper;
        int i = viewHolder.mPosition;
        ArrayList arrayList = adapterHelper.f31522b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AdapterHelper.UpdateOp updateOp = (AdapterHelper.UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f31527a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = updateOp.f31528b;
                    if (i4 <= i) {
                        int i5 = updateOp.f31530d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = updateOp.f31528b;
                    if (i6 == i) {
                        i = updateOp.f31530d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (updateOp.f31530d <= i) {
                            i++;
                        }
                    }
                }
            } else if (updateOp.f31528b <= i) {
                i += updateOp.f31530d;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i, i2) : childDrawingOrderCallback.mo11588a(i, i2);
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z2 = layoutParams.f31722c;
        Rect rect = layoutParams.f31721b;
        if (!z2 || (this.mState.f31755g && (layoutParams.f31720a.isUpdated() || layoutParams.f31720a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f31722c = false;
        return rect;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.m11687c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    /* JADX INFO: renamed from: h */
    public final void m11637h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m7754f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m11528g();
    }

    /* JADX INFO: renamed from: i */
    public final void m11638i() {
        boolean z2;
        boolean z3 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            AdapterHelper adapterHelper = this.mAdapterHelper;
            adapterHelper.m11532k(adapterHelper.f31522b);
            adapterHelper.m11532k(adapterHelper.f31523c);
            adapterHelper.f31526f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (this.mItemAnimator == null || !this.mLayout.supportsPredictiveItemAnimations()) {
            this.mAdapterHelper.m11524c();
        } else {
            this.mAdapterHelper.m11531j();
        }
        boolean z4 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f31758j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z4 || this.mLayout.mRequestedSimpleAnimations) && (!z2 || this.mAdapter.hasStableIds());
        State state = this.mState;
        if (state.f31758j && z4 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            z3 = true;
        }
        state.f31759k = z3;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new C21476());
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(AbstractC1610a.m8732j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.exchange.allin.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.exchange.allin.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.exchange.allin.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.mo11552k();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f23384d;
    }

    /* JADX INFO: renamed from: j */
    public final int m11639j(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || EdgeEffectCompat.m8165a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.m8165a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fM8166b = EdgeEffectCompat.m8166b(this.mRightGlow, width, height);
                    if (EdgeEffectCompat.m8165a(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fM8166b;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.m8166b(this.mLeftGlow, -width, 1.0f - height);
                if (EdgeEffectCompat.m8165a(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    /* JADX INFO: renamed from: k */
    public final int m11640k(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || EdgeEffectCompat.m8165a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.m8165a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fM8166b = EdgeEffectCompat.m8166b(this.mBottomGlow, height, 1.0f - width);
                    if (EdgeEffectCompat.m8165a(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fM8166b;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.m8166b(this.mTopGlow, -height, width);
                if (EdgeEffectCompat.m8165a(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    /* JADX INFO: renamed from: l */
    public final void m11641l(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f31722c) {
                Rect rect = this.mTempRect;
                int i = rect.left;
                Rect rect2 = layoutParams2.f31721b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    /* JADX INFO: renamed from: m */
    public final void m11642m() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            postInvalidateOnAnimation();
        }
    }

    public void markItemDecorInsetsDirty() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((LayoutParams) RecyclerView.this.getChildAt(i).getLayoutParams()).f31722c = true;
        }
        ArrayList arrayList = this.mRecycler.f31733c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((ViewHolder) arrayList.get(i2)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f31722c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f31733c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i2);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            recycler.m11690g();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11643n(Adapter adapter, boolean z2, boolean z3) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        AdapterHelper adapterHelper = this.mAdapterHelper;
        adapterHelper.m11532k(adapterHelper.f31522b);
        adapterHelper.m11532k(adapterHelper.f31523c);
        int i = 0;
        adapterHelper.f31526f = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.mAdapter);
        }
        Recycler recycler = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        recycler.f31731a.clear();
        recycler.m11690g();
        recycler.m11689f(adapter3, true);
        RecycledViewPool recycledViewPoolM11687c = recycler.m11687c();
        if (adapter3 != null) {
            recycledViewPoolM11687c.f31725b--;
        }
        if (!z2 && recycledViewPoolM11687c.f31725b == 0) {
            while (true) {
                SparseArray sparseArray = recycledViewPoolM11687c.f31724a;
                if (i >= sparseArray.size()) {
                    break;
                }
                RecycledViewPool.ScrapData scrapData = (RecycledViewPool.ScrapData) sparseArray.valueAt(i);
                Iterator it = scrapData.f31727a.iterator();
                while (it.hasNext()) {
                    PoolingContainer.m8205b(((ViewHolder) it.next()).itemView);
                }
                scrapData.f31727a.clear();
                i++;
            }
        }
        if (adapter4 != null) {
            recycledViewPoolM11687c.f31725b++;
        } else {
            recycledViewPoolM11687c.getClass();
        }
        recycler.m11688e();
        this.mState.f31754f = true;
    }

    public void nestedScrollBy(int i, int i2) {
        m11636g(i, i2, null);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11644o(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fM8165a = EdgeEffectCompat.m8165a(edgeEffect) * i2;
        double dLog = Math.log((Math.abs(-i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        double d = DECELERATION_RATE;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)))) < fM8165a;
    }

    public void offsetChildrenHorizontal(@Px int i) {
        int iM11536c = this.mChildHelper.m11536c();
        for (int i2 = 0; i2 < iM11536c; i2++) {
            this.mChildHelper.m11535b(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@Px int i) {
        int iM11536c = this.mChildHelper.m11536c();
        for (int i2 = 0; i2 < iM11536c; i2++) {
            this.mChildHelper.m11535b(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int childCount = RecyclerView.this.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f31754f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f31733c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i4);
            if (viewHolder != null && viewHolder.mPosition >= i) {
                viewHolder.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = RecyclerView.this.getChildCount();
        int i10 = 1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f31754f = true;
            }
        }
        Recycler recycler = this.mRecycler;
        recycler.getClass();
        if (i < i2) {
            i6 = i2;
            i10 = -1;
            i7 = i;
        } else {
            i6 = i;
            i7 = i2;
        }
        ArrayList arrayList = recycler.f31733c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(i12);
            if (viewHolder != null && (i8 = viewHolder.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    viewHolder.offsetPosition(i2 - i, false);
                } else {
                    viewHolder.offsetPosition(i10, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int childCount = RecyclerView.this.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z2);
                    this.mState.f31754f = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z2);
                    this.mState.f31754f = true;
                }
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f31733c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null) {
                int i6 = viewHolder.mPosition;
                if (i6 >= i3) {
                    viewHolder.offsetPosition(-i2, z2);
                } else if (i6 >= i) {
                    viewHolder.addFlags(8);
                    recycler.m11691h(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.m11688e();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = GapWorker.f31625f;
            GapWorker gapWorker = (GapWorker) threadLocal.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                GapWorker gapWorker2 = new GapWorker();
                gapWorker2.f31627a = new ArrayList();
                gapWorker2.f31630d = new ArrayList();
                this.mGapWorker = gapWorker2;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    GapWorker gapWorker3 = this.mGapWorker;
                    gapWorker3.f31629c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(gapWorker3);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    GapWorker gapWorker32 = this.mGapWorker;
                    gapWorker32.f31629c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(gapWorker32);
                }
            }
            this.mGapWorker.f31627a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.mo11551j();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (ViewInfoStore.InfoRecord.f31838d.mo7693b() != null) {
        }
        Recycler recycler = this.mRecycler;
        int i = 0;
        while (true) {
            ArrayList arrayList = recycler.f31733c;
            if (i >= arrayList.size()) {
                break;
            }
            PoolingContainer.m8205b(((ViewHolder) arrayList.get(i)).itemView);
            i++;
        }
        recycler.m11689f(RecyclerView.this.mAdapter, false);
        PoolingContainer.m8206c(this);
        if (!ALLOW_THREAD_GAP_WORK || (gapWorker = this.mGapWorker) == null) {
            return;
        }
        gapWorker.f31627a.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f != 0.0f || axisValue != 0.0f) {
                    m11636g((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                    if (f != 0.0f) {
                        m11636g((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                } else {
                    if (this.mLayout.canScrollHorizontally()) {
                        axisValue = axisValue2;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (m11634e(motionEvent)) {
                m11642m();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
                boolean zCanScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y2;
                    this.mInitialTouchY = y2;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || EdgeEffectCompat.m8165a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z2 = false;
                    } else {
                        EdgeEffectCompat.m8166b(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z2 = true;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    boolean z4 = z2;
                    if (edgeEffect2 != null) {
                        z4 = z2;
                        if (EdgeEffectCompat.m8165a(edgeEffect2) != 0.0f) {
                            z4 = z2;
                            if (!canScrollHorizontally(1)) {
                                EdgeEffectCompat.m8166b(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
                                z4 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    boolean z5 = z4;
                    if (edgeEffect3 != null) {
                        z5 = z4;
                        if (EdgeEffectCompat.m8165a(edgeEffect3) != 0.0f) {
                            z5 = z4;
                            if (!canScrollVertically(-1)) {
                                EdgeEffectCompat.m8166b(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
                                z5 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    boolean z6 = z5;
                    if (edgeEffect4 != null) {
                        z6 = z5;
                        if (EdgeEffectCompat.m8165a(edgeEffect4) != 0.0f) {
                            z6 = z5;
                            if (!canScrollVertically(1)) {
                                EdgeEffectCompat.m8166b(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z6 = true;
                            }
                        }
                    }
                    if (z6 || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zCanScrollHorizontally;
                    if (zCanScrollVertically) {
                        i = (zCanScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i, 0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (iFindPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i2 = x2 - this.mInitialTouchX;
                        int i3 = y3 - this.mInitialTouchY;
                        if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                            z3 = false;
                        } else {
                            this.mLastTouchX = x2;
                            z3 = true;
                        }
                        if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                            this.mLastTouchY = y3;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    m11642m();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y4;
                    this.mInitialTouchY = y4;
                } else if (actionMasked == 6) {
                    m11637h(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = TraceCompat.f23262a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z2 = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f31752d == 1) {
                m11632c();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f31757i = true;
            m11633d();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Ints.MAX_POWER_OF_TWO));
                this.mState.f31757i = true;
                m11633d();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            m11638i();
            onExitLayoutOrScroll();
            State state = this.mState;
            if (state.f31759k) {
                state.f31755g = true;
            } else {
                this.mAdapterHelper.m11524c();
                this.mState.f31755g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f31759k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.f31753e = adapter.getItemCount();
        } else {
            this.mState.f31753e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f31755g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f31741a = savedState2.f31741a;
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.f31741a = layoutManager.onSaveInstanceState();
            return savedState;
        }
        savedState.f31741a = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff A[PHI: r1
      0x00ff: PHI (r1v50 int) = (r1v30 int), (r1v54 int) binds: [B:50:0x00e8, B:54:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM11634e;
        boolean z2;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
            if (onItemTouchListener == null) {
                zM11634e = motionEvent.getAction() == 0 ? false : m11634e(motionEvent);
            } else {
                onItemTouchListener.mo11563a(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.mInterceptingOnItemTouchListener = null;
                }
                zM11634e = true;
            }
            if (zM11634e) {
                m11642m();
                setScrollState(0);
                return true;
            }
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
                boolean zCanScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.mNestedOffsets;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked == 0) {
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y2;
                    this.mInitialTouchY = y2;
                    int i = zCanScrollHorizontally;
                    if (zCanScrollVertically) {
                        i = (zCanScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i, 0);
                } else {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(motionEventObtain);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                        float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                            setScrollState(0);
                        }
                        m11642m();
                        motionEventObtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (iFindPointerIndex < 0) {
                            Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.mLastTouchX - x2;
                        int iMax2 = this.mLastTouchY - y3;
                        if (this.mScrollState != 1) {
                            if (zCanScrollHorizontally) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                                if (iMax != 0) {
                                    z2 = true;
                                }
                                if (zCanScrollVertically) {
                                }
                                if (z2) {
                                }
                            } else {
                                z2 = false;
                                if (zCanScrollVertically) {
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                                    if (iMax2 != 0) {
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    setScrollState(1);
                                }
                            }
                            motionEventObtain.recycle();
                            return true;
                        }
                        if (this.mScrollState == 1) {
                            int[] iArr3 = this.mReusableIntPair;
                            iArr3[0] = 0;
                            iArr3[1] = 0;
                            int iM11639j = iMax - m11639j(motionEvent.getY(), iMax);
                            int iM11640k = iMax2 - m11640k(motionEvent.getX(), iMax2);
                            if (dispatchNestedPreScroll(zCanScrollHorizontally ? iM11639j : 0, zCanScrollVertically ? iM11640k : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                                int[] iArr4 = this.mReusableIntPair;
                                iM11639j -= iArr4[0];
                                iM11640k -= iArr4[1];
                                int[] iArr5 = this.mNestedOffsets;
                                int i2 = iArr5[0];
                                int[] iArr6 = this.mScrollOffset;
                                iArr5[0] = i2 + iArr6[0];
                                iArr5[1] = iArr5[1] + iArr6[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArr7 = this.mScrollOffset;
                            this.mLastTouchX = x2 - iArr7[0];
                            this.mLastTouchY = y3 - iArr7[1];
                            if (scrollByInternal(zCanScrollHorizontally ? iM11639j : 0, zCanScrollVertically ? iM11640k : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            GapWorker gapWorker = this.mGapWorker;
                            if (gapWorker != null && (iM11639j != 0 || iM11640k != 0)) {
                                gapWorker.m11571a(this, iM11639j, iM11640k);
                            }
                        }
                    } else if (actionMasked == 3) {
                        m11642m();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.mLastTouchX = x3;
                        this.mInitialTouchX = x3;
                        int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.mLastTouchY = y4;
                        this.mInitialTouchY = y4;
                    } else if (actionMasked == 6) {
                        m11637h(motionEvent);
                    }
                }
                this.mVelocityTracker.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (this.mState.f31756h && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.f31837b.m2005h(getChangedHolderKey(viewHolder), viewHolder);
        }
        SimpleArrayMap simpleArrayMap = this.mViewInfoStore.f31836a;
        ViewInfoStore.InfoRecord infoRecordM11758a = (ViewInfoStore.InfoRecord) simpleArrayMap.get(viewHolder);
        if (infoRecordM11758a == null) {
            infoRecordM11758a = ViewInfoStore.InfoRecord.m11758a();
            simpleArrayMap.put(viewHolder, infoRecordM11758a);
        }
        infoRecordM11758a.f31840b = itemHolderInfo;
        infoRecordM11758a.f31839a |= 4;
    }

    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.mo11551j();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        Recycler recycler = this.mRecycler;
        recycler.f31731a.clear();
        recycler.m11690g();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        ChildHelper childHelper = this.mChildHelper;
        C21465 c21465 = childHelper.f31533a;
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z2 = true;
        if (iIndexOfChild == -1) {
            childHelper.m11539f(view);
        } else {
            ChildHelper.Bucket bucket = childHelper.f31534b;
            if (bucket.m11543d(iIndexOfChild)) {
                bucket.m11545f(iIndexOfChild);
                childHelper.m11539f(view);
                c21465.m11650b(iIndexOfChild);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m11696m(childViewHolderInt);
            this.mRecycler.m11693j(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(AbstractC1610a.m8732j(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    public void repositionShadowingViews() {
        ViewHolder viewHolder;
        int iM11536c = this.mChildHelper.m11536c();
        for (int i = 0; i < iM11536c; i++) {
            View viewM11535b = this.mChildHelper.m11535b(i);
            ViewHolder childViewHolder = getChildViewHolder(viewM11535b);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = viewM11535b.getLeft();
                int top = viewM11535b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            m11641l(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo11565e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int childCount = RecyclerView.this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i6 = i - i8;
            i7 = i2 - i9;
            i5 = i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z4 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z2 = true;
            } else {
                float x = motionEvent.getX();
                float f = i11;
                float y2 = motionEvent.getY();
                float f2 = i13;
                if (f < 0.0f) {
                    ensureLeftGlow();
                    z2 = true;
                    EdgeEffectCompat.m8166b(this.mLeftGlow, (-f) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    z2 = true;
                    if (f > 0.0f) {
                        ensureRightGlow();
                        EdgeEffectCompat.m8166b(this.mRightGlow, f / getWidth(), y2 / getHeight());
                    } else {
                        z3 = false;
                        if (f2 >= 0.0f) {
                            ensureTopGlow();
                            EdgeEffectCompat.m8166b(this.mTopGlow, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                ensureBottomGlow();
                                EdgeEffectCompat.m8166b(this.mBottomGlow, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (z3 || f != 0.0f || f2 != 0.0f) {
                                WeakHashMap weakHashMap = ViewCompat.f23405a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z3 = z2;
                        if (z3) {
                            WeakHashMap weakHashMap2 = ViewCompat.f23405a;
                            postInvalidateOnAnimation();
                        }
                    }
                }
                z3 = z2;
                if (f2 >= 0.0f) {
                }
                z3 = z2;
                if (z3) {
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        } else {
            z2 = true;
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z4 && i4 == 0 && i5 == 0) {
            return false;
        }
        return z2;
    }

    public void scrollStep(int i, int i2, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = TraceCompat.f23262a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        ViewCompat.m7765A(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        m11643n(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        View view = viewHolder.itemView;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        view.setImportantForAccessibility(i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        edgeEffectFactory.getClass();
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.mo11551j();
            this.mItemAnimator.f31705a = null;
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.f31705a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        Recycler recycler = this.mRecycler;
        recycler.f31735e = i;
        recycler.m11697n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        C21465 c21465;
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.mo11551j();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            Recycler recycler = this.mRecycler;
            recycler.f31731a.clear();
            recycler.m11690g();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            Recycler recycler2 = this.mRecycler;
            recycler2.f31731a.clear();
            recycler2.m11690g();
        }
        ChildHelper childHelper = this.mChildHelper;
        childHelper.f31534b.m11546g();
        ArrayList arrayList = childHelper.f31535c;
        int size = arrayList.size();
        while (true) {
            size--;
            c21465 = childHelper.f31533a;
            if (size < 0) {
                break;
            }
            c21465.m11649a((View) arrayList.get(size));
            arrayList.remove(size);
        }
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(layoutManager);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC1610a.m8732j(layoutManager.mRecyclerView, sb));
            }
            layoutManager.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m11697n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m7755g(z2);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        Recycler recycler = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        recycler.m11689f(recyclerView.mAdapter, false);
        if (recycler.f31737g != null) {
            r2.f31725b--;
        }
        recycler.f31737g = recycledViewPool;
        if (recycledViewPool != null && recyclerView.getAdapter() != null) {
            recycler.f31737g.f31725b++;
        }
        recycler.m11688e();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            ViewFlinger viewFlinger = this.mViewFlinger;
            RecyclerView.this.removeCallbacks(viewFlinger);
            viewFlinger.f31765c.abortAnimation();
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                layoutManager.stopSmoothScroller();
            }
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.mRecycler.f31738h = viewCacheExtension;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(@Px int i, @Px int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m7756h(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m7757i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        ViewFlinger viewFlinger = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(viewFlinger);
        viewFlinger.f31765c.abortAnimation();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z2) {
        setLayoutFrozen(false);
        m11643n(adapter, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int childCount = RecyclerView.this.getChildCount();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = RecyclerView.this.getChildAt(i6);
            ViewHolder childViewHolderInt = getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) childAt.getLayoutParams()).f31722c = true;
            }
        }
        Recycler recycler = this.mRecycler;
        ArrayList arrayList = recycler.f31733c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) arrayList.get(size);
            if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i5) {
                viewHolder.addFlags(2);
                recycler.m11691h(size);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.f31703a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: Proguard */
        public static final class StateRestorationPolicy {

            /* JADX INFO: renamed from: a */
            public static final StateRestorationPolicy f31703a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ StateRestorationPolicy[] f31704b;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                f31703a = stateRestorationPolicy;
                f31704b = new StateRestorationPolicy[]{stateRestorationPolicy, new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1), new StateRestorationPolicy("PREVENT", 2)};
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) f31704b.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z2 = vh.mBindingAdapter == null;
            if (z2) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = TraceCompat.f23262a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z2) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f31722c = true;
                }
                int i3 = TraceCompat.f23262a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return false;
                }
            } else if (getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                int i2 = TraceCompat.f23262a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                Trace.endSection();
                return vh;
            } catch (Throwable th) {
                int i3 = TraceCompat.f23262a;
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m11657a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m11658b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m11660d(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m11661e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m11659c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m11660d(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m11661e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m11662f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m11662f(i, 1);
        }

        public abstract void onBindViewHolder(ViewHolder viewHolder, int i);

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z2) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z2;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.m11663g();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.m11660d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.m11660d(i, i2, obj);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        Constructor constructor;
        super(context, attributeSet, i);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new RunnableC21421();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        Object[] objArr = null;
        defaultItemAnimator.f31705a = null;
        defaultItemAnimator.f31706b = new ArrayList();
        defaultItemAnimator.f31707c = 120L;
        defaultItemAnimator.f31708d = 120L;
        defaultItemAnimator.f31709e = 250L;
        defaultItemAnimator.f31710f = 250L;
        defaultItemAnimator.f31772g = true;
        defaultItemAnimator.f31540h = new ArrayList();
        defaultItemAnimator.f31541i = new ArrayList();
        defaultItemAnimator.f31542j = new ArrayList();
        defaultItemAnimator.f31543k = new ArrayList();
        defaultItemAnimator.f31544l = new ArrayList();
        defaultItemAnimator.f31545m = new ArrayList();
        defaultItemAnimator.f31546n = new ArrayList();
        defaultItemAnimator.f31547o = new ArrayList();
        defaultItemAnimator.f31548p = new ArrayList();
        defaultItemAnimator.f31549q = new ArrayList();
        defaultItemAnimator.f31550r = new ArrayList();
        this.mItemAnimator = defaultItemAnimator;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        State state = new State();
        state.f31749a = -1;
        state.f31750b = 0;
        state.f31751c = 0;
        state.f31752d = 1;
        state.f31753e = 0;
        state.f31754f = false;
        state.f31755g = false;
        state.f31756h = false;
        state.f31757i = false;
        state.f31758j = false;
        state.f31759k = false;
        this.mState = state;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC21432();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C21454();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.m7856b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.m7858d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f31705a = this.mItemAnimatorListener;
        initAdapterManager();
        this.mChildHelper = new ChildHelper(new C21465());
        if (ViewCompat.m7793l(this) == 0) {
            ViewCompat.m7771G(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = androidx.recyclerview.R.styleable.f31520a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.m7807z(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ViewCompat.m7807z(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        setTag(com.exchange.allin.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewHolder findViewHolderForPosition(int i, boolean z2) {
        int childCount = RecyclerView.this.getChildCount();
        ViewHolder viewHolder = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(RecyclerView.this.getChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z2) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        ChildHelper childHelper = this.mChildHelper;
                        if (!childHelper.f31535c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        viewHolder = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
            }
        }
        return viewHolder;
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                int i2 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i2 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i2);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m7751c(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m7752d(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m7754f(i);
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m7756h(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m7757i(i);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public ViewHolder f31720a;

        /* JADX INFO: renamed from: b */
        public final Rect f31721b;

        /* JADX INFO: renamed from: c */
        public boolean f31722c;

        /* JADX INFO: renamed from: d */
        public boolean f31723d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31721b = new Rect();
            this.f31722c = true;
            this.f31723d = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f31721b = new Rect();
            this.f31722c = true;
            this.f31723d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31721b = new Rect();
            this.f31722c = true;
            this.f31723d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31721b = new Rect();
            this.f31722c = true;
            this.f31723d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f31721b = new Rect();
            this.f31722c = true;
            this.f31723d = false;
        }
    }

    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator, int i3, boolean z2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z2) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.m11707c(i, i2, interpolator, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().m7752d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(AbstractC1610a.m8732j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* JADX INFO: renamed from: d */
        public final boolean mo11564d(MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* JADX INFO: renamed from: a */
        public final void mo11563a(MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* JADX INFO: renamed from: e */
        public final void mo11565e(boolean z2) {
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public void onScrolled(@Px int i, @Px int i2) {
    }
}
