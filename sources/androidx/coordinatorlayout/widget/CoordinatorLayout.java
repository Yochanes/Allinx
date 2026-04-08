package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.compose.p013ui.graphics.layer.AbstractC1226a;
import androidx.core.util.Pools;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.exchange.allin.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors;
    private static final Pools.Pool<Rect> sRectPool;
    private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final DirectedAcyclicGraph<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private OnPreDrawListener mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$1 */
    /* JADX INFO: compiled from: Proguard */
    class C14171 implements OnApplyWindowInsetsListener {
        public C14171() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface AttachedBehavior {
        Behavior getBehavior();
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Behavior<V extends View> {
        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f22929r;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((LayoutParams) view.getLayoutParams()).f22929r = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return -16777216;
        }

        @FloatRange
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z2) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z2) {
            return false;
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void onDetachedFromLayoutParams() {
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class value();
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DispatchChangeEvent {
    }

    /* JADX INFO: compiled from: Proguard */
    public class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14181();

        /* JADX INFO: renamed from: a */
        public SparseArray f22931a;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C14181 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f22931a = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f22931a.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f22931a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f22931a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f22931a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ViewElevationComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float fM7799r = ViewCompat.m7799r(view);
            float fM7799r2 = ViewCompat.m7799r(view2);
            if (fM7799r > fM7799r2) {
                return -1;
            }
            return fM7799r < fM7799r2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new ViewElevationComparator();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new DirectedAcyclicGraph<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper();
        int[] iArr = androidx.coordinatorlayout.R.styleable.f22908a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1226a.m5469y(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i = 0; i < length; i++) {
                this.mKeylines[i] = (int) (r2[i] * f);
            }
        }
        this.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m7386j();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Rect m7377a() {
        Rect rect = (Rect) sRectPool.mo7693b();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: c */
    public static void m7378c(int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int i4 = layoutParams.f22914c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = layoutParams.f22915d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: h */
    public static void m7379h(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.f22920i;
        if (i2 != i) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            view.offsetLeftAndRight(i - i2);
            layoutParams.f22920i = i;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7380i(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.f22921j;
        if (i2 != i) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            view.offsetTopAndBottom(i - i2);
            layoutParams.f22921j = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = sConstructors;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException(AbstractC0000a.m13j("Could not inflate Behavior subclass ", str), e);
        }
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m7381b(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final int m7382d(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e(TAG, "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List list = (List) this.mChildDag.f22933b.get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            Behavior behavior = ((LayoutParams) view2.getLayoutParams()).f22912a;
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z2 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectM7377a = m7377a();
        getChildRect(view, view.getParent() != this, rectM7377a);
        Rect rectM7377a2 = m7377a();
        getChildRect(view2, view2.getParent() != this, rectM7377a2);
        try {
            if (rectM7377a.left <= rectM7377a2.right && rectM7377a.top <= rectM7377a2.bottom && rectM7377a.right >= rectM7377a2.left) {
                if (rectM7377a.bottom >= rectM7377a2.top) {
                    z2 = true;
                }
            }
            return z2;
        } finally {
            rectM7377a.setEmpty();
            Pools.Pool<Rect> pool = sRectPool;
            pool.mo7692a(rectM7377a);
            rectM7377a2.setEmpty();
            pool.mo7692a(rectM7377a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Behavior behavior = layoutParams.f22912a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(layoutParams.f22912a.getScrimColor(this, view));
                Paint paint = this.mScrimPaint;
                int iRound = Math.round(scrimOpacity * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7383e(MotionEvent motionEvent, int i) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.f22912a;
            if (!(zOnInterceptTouchEvent || z2) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behavior != null) {
                    if (i == 0) {
                        zOnInterceptTouchEvent = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        zOnInterceptTouchEvent = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                Behavior behavior2 = layoutParams.f22912a;
                if (behavior2 == null) {
                    layoutParams.f22924m = false;
                }
                boolean z3 = layoutParams.f22924m;
                if (z3) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = (behavior2 != null ? behavior2.blocksInteractionBelow(this, view) : false) | z3;
                    layoutParams.f22924m = zBlocksInteractionBelow;
                }
                boolean z4 = zBlocksInteractionBelow && !z3;
                if (zBlocksInteractionBelow && !z4) {
                    break;
                }
                z2 = z4;
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i == 1) {
                    behavior.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i = 0;
        loop0: while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            SimpleArrayMap simpleArrayMap = this.mChildDag.f22933b;
            int i2 = simpleArrayMap.f3884c;
            for (int i3 = 0; i3 < i2; i3++) {
                ArrayList arrayList = (ArrayList) simpleArrayMap.m2131m(i3);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i++;
        }
        if (z2 != this.mNeedsPreDrawListener) {
            if (z2) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7384f() {
        View viewFindViewById;
        Behavior behavior;
        this.mDependencySortedChildren.clear();
        DirectedAcyclicGraph<View> directedAcyclicGraph = this.mChildDag;
        SimpleArrayMap simpleArrayMap = directedAcyclicGraph.f22933b;
        int i = simpleArrayMap.f3884c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) simpleArrayMap.m2131m(i2);
            if (arrayList != null) {
                arrayList.clear();
                directedAcyclicGraph.f22932a.mo7692a(arrayList);
            }
        }
        simpleArrayMap.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams resolvedLayoutParams = getResolvedLayoutParams(childAt);
            int i4 = resolvedLayoutParams.f22917f;
            if (i4 == -1) {
                resolvedLayoutParams.f22923l = null;
                resolvedLayoutParams.f22922k = null;
            } else {
                View view = resolvedLayoutParams.f22922k;
                if (view == null || view.getId() != i4) {
                    viewFindViewById = findViewById(i4);
                    resolvedLayoutParams.f22922k = viewFindViewById;
                    if (viewFindViewById != null) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i4) + " to anchor view " + childAt);
                        }
                        resolvedLayoutParams.f22923l = null;
                        resolvedLayoutParams.f22922k = null;
                    } else if (viewFindViewById != this) {
                        for (ViewParent parent = viewFindViewById.getParent(); parent != this && parent != null; parent = parent.getParent()) {
                            if (parent != childAt) {
                                if (parent instanceof View) {
                                    viewFindViewById = parent;
                                }
                            } else {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                resolvedLayoutParams.f22923l = null;
                                resolvedLayoutParams.f22922k = null;
                            }
                        }
                        resolvedLayoutParams.f22923l = viewFindViewById;
                    } else {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                        resolvedLayoutParams.f22923l = null;
                        resolvedLayoutParams.f22922k = null;
                    }
                } else {
                    View view2 = resolvedLayoutParams.f22922k;
                    for (ViewParent parent2 = view2.getParent(); parent2 != this; parent2 = parent2.getParent()) {
                        if (parent2 == null || parent2 == childAt) {
                            resolvedLayoutParams.f22923l = null;
                            resolvedLayoutParams.f22922k = null;
                            viewFindViewById = findViewById(i4);
                            resolvedLayoutParams.f22922k = viewFindViewById;
                            if (viewFindViewById != null) {
                            }
                        } else {
                            if (parent2 instanceof View) {
                                view2 = parent2;
                            }
                        }
                    }
                    resolvedLayoutParams.f22923l = view2;
                }
            }
            SimpleArrayMap simpleArrayMap2 = this.mChildDag.f22933b;
            if (!simpleArrayMap2.containsKey(childAt)) {
                simpleArrayMap2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != resolvedLayoutParams.f22923l) {
                        WeakHashMap weakHashMap = ViewCompat.f23405a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((LayoutParams) childAt2.getLayoutParams()).f22918g, layoutDirection);
                        if ((absoluteGravity != 0 && (Gravity.getAbsoluteGravity(resolvedLayoutParams.f22919h, layoutDirection) & absoluteGravity) == absoluteGravity) || ((behavior = resolvedLayoutParams.f22912a) != null && behavior.layoutDependsOn(this, childAt, childAt2))) {
                            if (!this.mChildDag.f22933b.containsKey(childAt2)) {
                                SimpleArrayMap simpleArrayMap3 = this.mChildDag.f22933b;
                                if (!simpleArrayMap3.containsKey(childAt2)) {
                                    simpleArrayMap3.put(childAt2, null);
                                }
                            }
                            DirectedAcyclicGraph<View> directedAcyclicGraph2 = this.mChildDag;
                            SimpleArrayMap simpleArrayMap4 = directedAcyclicGraph2.f22933b;
                            if (!simpleArrayMap4.containsKey(childAt2) || !simpleArrayMap4.containsKey(childAt)) {
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            }
                            ArrayList arrayList2 = (ArrayList) simpleArrayMap4.get(childAt2);
                            if (arrayList2 == null) {
                                ArrayList arrayList3 = (ArrayList) directedAcyclicGraph2.f22932a.mo7693b();
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList2 = arrayList3;
                                simpleArrayMap4.put(childAt2, arrayList2);
                            }
                            arrayList2.add(childAt);
                        }
                    }
                }
            }
        }
        List<View> list = this.mDependencySortedChildren;
        DirectedAcyclicGraph<View> directedAcyclicGraph3 = this.mChildDag;
        ArrayList arrayList4 = directedAcyclicGraph3.f22934c;
        arrayList4.clear();
        HashSet hashSet = directedAcyclicGraph3.f22935d;
        hashSet.clear();
        SimpleArrayMap simpleArrayMap5 = directedAcyclicGraph3.f22933b;
        int i6 = simpleArrayMap5.f3884c;
        for (int i7 = 0; i7 < i6; i7++) {
            directedAcyclicGraph3.m7389a(simpleArrayMap5.m2128j(i7), arrayList4, hashSet);
        }
        list.addAll(arrayList4);
        Collections.reverse(this.mDependencySortedChildren);
    }

    /* JADX INFO: renamed from: g */
    public final void m7385g(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f22912a;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behavior.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((LayoutParams) getChildAt(i2).getLayoutParams()).f22924m = false;
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public void getChildRect(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        SimpleArrayMap simpleArrayMap = this.mChildDag.f22933b;
        int i = simpleArrayMap.f3884c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) simpleArrayMap.m2131m(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(simpleArrayMap.m2128j(i2));
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        m7384f();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List list = (List) this.mChildDag.f22933b.get(view);
        this.mTempDependenciesList.clear();
        if (list != null) {
            this.mTempDependenciesList.addAll(list);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal threadLocal = ViewGroupUtils.f22936a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = ViewGroupUtils.f22936a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ViewGroupUtils.m7390a(this, view, matrix);
        ThreadLocal threadLocal3 = ViewGroupUtils.f22937b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m7378c(i, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        m7381b(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).f22928q);
    }

    @RestrictTo
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mNestedScrollingParentHelper;
        return nestedScrollingParentHelper.f23387b | nestedScrollingParentHelper.f23386a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutParams getResolvedLayoutParams(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f22913b) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                layoutParams.m7388b(behavior);
                layoutParams.f22913b = true;
                return layoutParams;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    layoutParams.m7388b((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e) {
                    Log.e(TAG, "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            layoutParams.f22913b = true;
        }
        return layoutParams;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(@NonNull View view, int i, int i2) {
        Rect rectM7377a = m7377a();
        getDescendantRect(view, rectM7377a);
        try {
            return rectM7377a.contains(i, i2);
        } finally {
            rectM7377a.setEmpty();
            sRectPool.mo7692a(rectM7377a);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7386j() {
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        if (!getFitsSystemWindows()) {
            ViewCompat.m7773I(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new C14171();
        }
        ViewCompat.m7773I(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    public void offsetChildToAnchor(View view, int i) {
        Behavior behavior;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f22922k != null) {
            Rect rectM7377a = m7377a();
            Rect rectM7377a2 = m7377a();
            Rect rectM7377a3 = m7377a();
            getDescendantRect(layoutParams.f22922k, rectM7377a);
            getChildRect(view, false, rectM7377a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m7378c(i, rectM7377a, rectM7377a3, layoutParams, measuredWidth, measuredHeight);
            boolean z2 = (rectM7377a3.left == rectM7377a2.left && rectM7377a3.top == rectM7377a2.top) ? false : true;
            m7381b(layoutParams, rectM7377a3, measuredWidth, measuredHeight);
            int i2 = rectM7377a3.left - rectM7377a2.left;
            int i3 = rectM7377a3.top - rectM7377a2.top;
            if (i2 != 0) {
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                view.offsetLeftAndRight(i2);
            }
            if (i3 != 0) {
                WeakHashMap weakHashMap2 = ViewCompat.f23405a;
                view.offsetTopAndBottom(i3);
            }
            if (z2 && (behavior = layoutParams.f22912a) != null) {
                behavior.onDependentViewChanged(this, view, layoutParams.f22922k);
            }
            rectM7377a.setEmpty();
            Pools.Pool<Rect> pool = sRectPool;
            pool.mo7692a(rectM7377a);
            rectM7377a2.setEmpty();
            pool.mo7692a(rectM7377a2);
            rectM7377a3.setEmpty();
            pool.mo7692a(rectM7377a3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7385g(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            if (getFitsSystemWindows()) {
                ViewCompat.m7806y(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f0  */
    /* JADX WARN: Type inference failed for: r6v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onChildViewsChanged(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zOnDependentViewChanged;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 80;
        int i12 = 48;
        boolean z4 = 1;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect rectM7377a = m7377a();
        Rect rectM7377a2 = m7377a();
        Rect rectM7377a3 = m7377a();
        int i13 = 0;
        while (i13 < size) {
            View view = this.mDependencySortedChildren.get(i13);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = i11;
                i4 = i13;
            } else {
                for (int i14 = 0; i14 < i13; i14 += z4 ? 1 : 0) {
                    if (layoutParams.f22923l == this.mDependencySortedChildren.get(i14)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, z4, rectM7377a2);
                if (layoutParams.f22918g == 0 || rectM7377a2.isEmpty()) {
                    i2 = z4 ? 1 : 0;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f22918g, layoutDirection);
                    int i15 = absoluteGravity & 112;
                    if (i15 == i12) {
                        i2 = z4 ? 1 : 0;
                        rectM7377a.top = Math.max(rectM7377a.top, rectM7377a2.bottom);
                    } else if (i15 != i11) {
                        i2 = z4 ? 1 : 0;
                    } else {
                        int i16 = rectM7377a.bottom;
                        int height = getHeight();
                        i2 = z4 ? 1 : 0;
                        rectM7377a.bottom = Math.max(i16, height - rectM7377a2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectM7377a.left = Math.max(rectM7377a.left, rectM7377a2.right);
                    } else if (i17 == 5) {
                        rectM7377a.right = Math.max(rectM7377a.right, getWidth() - rectM7377a2.left);
                    }
                }
                if (layoutParams.f22919h == 0 || view.getVisibility() != 0) {
                    i3 = i11;
                    i4 = i13;
                    if (i != 2) {
                        getLastChildRect(view, rectM7377a3);
                        if (!rectM7377a3.equals(rectM7377a2)) {
                            recordLastChildRect(view, rectM7377a2);
                            i5 = i4 + 1;
                            while (i5 < size) {
                                View view2 = this.mDependencySortedChildren.get(i5);
                                LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                                Behavior behavior = layoutParams2.f22912a;
                                if (behavior == null || !behavior.layoutDependsOn(this, view2, view)) {
                                    i6 = i2 == true ? 1 : 0;
                                } else if (i == 0 && layoutParams2.f22927p) {
                                    layoutParams2.f22927p = false;
                                    i6 = i2 == true ? 1 : 0;
                                } else {
                                    if (i != 2) {
                                        zOnDependentViewChanged = behavior.onDependentViewChanged(this, view2, view);
                                        i6 = i2 == true ? 1 : 0;
                                    } else {
                                        behavior.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = i2 == true ? 1 : 0;
                                        i6 = zOnDependentViewChanged ? 1 : 0;
                                    }
                                    if (i == i6) {
                                        layoutParams2.f22927p = zOnDependentViewChanged;
                                    }
                                }
                                i5 += i6;
                                i2 = i6;
                            }
                        }
                        z4 = i2;
                    } else {
                        i5 = i4 + 1;
                        while (i5 < size) {
                        }
                        z4 = i2;
                    }
                } else {
                    WeakHashMap weakHashMap2 = ViewCompat.f23405a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
                        Behavior behavior2 = layoutParams3.f22912a;
                        Rect rectM7377a4 = m7377a();
                        Rect rectM7377a5 = m7377a();
                        int i18 = i11;
                        int i19 = i12;
                        i4 = i13;
                        rectM7377a5.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (behavior2 == null || !behavior2.getInsetDodgeRect(this, view, rectM7377a4)) {
                            rectM7377a4.set(rectM7377a5);
                        } else if (!rectM7377a5.contains(rectM7377a4)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM7377a4.toShortString() + " | Bounds:" + rectM7377a5.toShortString());
                        }
                        rectM7377a5.setEmpty();
                        Pools.Pool<Rect> pool = sRectPool;
                        pool.mo7692a(rectM7377a5);
                        if (rectM7377a4.isEmpty()) {
                            rectM7377a4.setEmpty();
                            pool.mo7692a(rectM7377a4);
                            i3 = i18;
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(layoutParams3.f22919h, layoutDirection);
                            if ((absoluteGravity2 & 48) != i19 || (i9 = (rectM7377a4.top - ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin) - layoutParams3.f22921j) >= (i10 = rectM7377a.top)) {
                                z2 = false;
                            } else {
                                m7380i(i10 - i9, view);
                                z2 = i2 == true ? 1 : 0;
                            }
                            i3 = i18;
                            boolean z5 = z2;
                            if ((absoluteGravity2 & 80) == i3) {
                                int height2 = ((getHeight() - rectM7377a4.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin) + layoutParams3.f22921j;
                                int i20 = rectM7377a.bottom;
                                z5 = z2;
                                if (height2 < i20) {
                                    m7380i(height2 - i20, view);
                                    z5 = i2 == true ? 1 : 0;
                                }
                            }
                            if (!z5) {
                                m7380i(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i7 = (rectM7377a4.left - ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin) - layoutParams3.f22920i) >= (i8 = rectM7377a.left)) {
                                z3 = false;
                            } else {
                                m7379h(i8 - i7, view);
                                z3 = i2 == true ? 1 : 0;
                            }
                            boolean z6 = z3;
                            if ((absoluteGravity2 & 5) == 5) {
                                int width = ((getWidth() - rectM7377a4.right) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin) + layoutParams3.f22920i;
                                int i21 = rectM7377a.right;
                                z6 = z3;
                                if (width < i21) {
                                    m7379h(width - i21, view);
                                    z6 = i2 == true ? 1 : 0;
                                }
                            }
                            if (!z6) {
                                m7379h(0, view);
                            }
                            rectM7377a4.setEmpty();
                            pool.mo7692a(rectM7377a4);
                            if (i != 2) {
                            }
                        }
                    }
                    if (i != 2) {
                    }
                }
            }
            i13 = i4 + 1;
            i11 = i3;
            i12 = 48;
            z4 = z4;
        }
        rectM7377a.setEmpty();
        Pools.Pool<Rect> pool2 = sRectPool;
        pool2.mo7692a(rectM7377a);
        rectM7377a2.setEmpty();
        pool2.mo7692a(rectM7377a2);
        rectM7377a3.setEmpty();
        pool2.mo7692a(rectM7377a3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7385g(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        int iM7904k = windowInsetsCompat != null ? windowInsetsCompat.m7904k() : 0;
        if (iM7904k > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iM7904k);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m7385g(true);
        }
        boolean zM7383e = m7383e(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM7383e;
        }
        m7385g(true);
        return zM7383e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).f22912a) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i) {
        Rect rectM7377a;
        Rect rectM7377a2;
        Pools.Pool<Rect> pool;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        View view2 = layoutParams.f22922k;
        if (view2 == null && layoutParams.f22917f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectM7377a = m7377a();
            rectM7377a2 = m7377a();
            try {
                getDescendantRect(view2, rectM7377a);
                getDesiredAnchoredChildRect(view, i, rectM7377a, rectM7377a2);
                view.layout(rectM7377a2.left, rectM7377a2.top, rectM7377a2.right, rectM7377a2.bottom);
                return;
            } finally {
                rectM7377a.setEmpty();
                pool = sRectPool;
                pool.mo7692a(rectM7377a);
                rectM7377a2.setEmpty();
                pool.mo7692a(rectM7377a2);
            }
        }
        int i2 = layoutParams.f22916e;
        if (i2 < 0) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            rectM7377a = m7377a();
            rectM7377a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            if (this.mLastInsets != null) {
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM7377a.left = this.mLastInsets.m7902i() + rectM7377a.left;
                    rectM7377a.top = this.mLastInsets.m7904k() + rectM7377a.top;
                    rectM7377a.right -= this.mLastInsets.m7903j();
                    rectM7377a.bottom -= this.mLastInsets.m7901h();
                }
            }
            rectM7377a2 = m7377a();
            int i3 = layoutParams2.f22914c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM7377a, rectM7377a2, i);
            view.layout(rectM7377a2.left, rectM7377a2.top, rectM7377a2.right, rectM7377a2.bottom);
            return;
        }
        LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams3.f22914c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iM7382d = m7382d(i2) - measuredWidth;
        if (i5 == 1) {
            iM7382d += measuredWidth / 2;
        } else if (i5 == 5) {
            iM7382d += measuredWidth;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, Math.min(iM7382d, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        View view2;
        CoordinatorLayout coordinatorLayout = this;
        boolean z2 = true;
        coordinatorLayout.m7384f();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.mLastInsets != null && coordinatorLayout.getFitsSystemWindows();
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i18 = 0;
        int iCombineMeasuredStates = 0;
        while (i18 < size3) {
            View view3 = coordinatorLayout.mDependencySortedChildren.get(i18);
            boolean z5 = z2;
            if (view3.getVisibility() == 8) {
                i5 = size3;
                i8 = i18;
                i6 = paddingLeft;
                i11 = paddingRight;
                i9 = layoutDirection;
            } else {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                int i19 = layoutParams.f22916e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumWidth;
                    i4 = suggestedMinimumHeight;
                } else {
                    int iM7382d = coordinatorLayout.m7382d(i19);
                    i3 = suggestedMinimumWidth;
                    int i20 = layoutParams.f22914c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i4 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iM7382d);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iM7382d - paddingLeft);
                    }
                    if (z4 || view3.getFitsSystemWindows()) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iM7903j = coordinatorLayout.mLastInsets.m7903j() + coordinatorLayout.mLastInsets.m7902i();
                        int iM7901h = coordinatorLayout.mLastInsets.m7901h() + coordinatorLayout.mLastInsets.m7904k();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM7903j, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM7901h, mode2);
                    }
                    behavior = layoutParams.f22912a;
                    if (behavior == null) {
                        i8 = i18;
                        int i21 = iMax;
                        view2 = view3;
                        int i22 = iMakeMeasureSpec;
                        i5 = size3;
                        int i23 = i3;
                        i6 = paddingLeft;
                        i7 = i23;
                        i9 = layoutDirection;
                        i10 = i4;
                        i11 = paddingRight;
                        i12 = iCombineMeasuredStates;
                        int i24 = iMakeMeasureSpec2;
                        if (behavior.onMeasureChild(this, view2, i22, i21, i24, 0)) {
                            coordinatorLayout = this;
                            suggestedMinimumWidth = Math.max(i7, view2.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                            int iMax2 = Math.max(i10, view2.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i12, view2.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            view = view2;
                            i14 = i22;
                            i13 = i21;
                            i15 = i24;
                        }
                    } else {
                        int i25 = iMakeMeasureSpec;
                        i5 = size3;
                        int i26 = i3;
                        i6 = paddingLeft;
                        i7 = i26;
                        i8 = i18;
                        i9 = layoutDirection;
                        i10 = i4;
                        i11 = paddingRight;
                        i12 = iCombineMeasuredStates;
                        i13 = iMax;
                        i14 = i25;
                        i15 = iMakeMeasureSpec2;
                        view = view3;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view, i14, i13, i15, 0);
                    view2 = view;
                    suggestedMinimumWidth = Math.max(i7, view2.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax22 = Math.max(i10, view2.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i12, view2.getMeasuredState());
                    suggestedMinimumHeight = iMax22;
                }
                iMax = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                    behavior = layoutParams.f22912a;
                    if (behavior == null) {
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view, i14, i13, i15, 0);
                    view2 = view;
                    suggestedMinimumWidth = Math.max(i7, view2.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax222 = Math.max(i10, view2.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i12, view2.getMeasuredState());
                    suggestedMinimumHeight = iMax222;
                }
            }
            i18 = i8 + 1;
            size3 = i5;
            z2 = z5;
            paddingLeft = i6;
            paddingRight = i11;
            layoutDirection = i9;
        }
        int i27 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i27), View.resolveSizeAndState(suggestedMinimumHeight, i2, i27 << 16));
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedFling(View view, float f, float f2, boolean z2) {
        Behavior behavior;
        View view2;
        float f3;
        float f4;
        boolean z3;
        int childCount = getChildCount();
        int i = 0;
        boolean zOnNestedFling = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f3 = f;
                f4 = f2;
                z3 = z2;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m7387a(0) && (behavior = layoutParams.f22912a) != null) {
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z3 = z2;
                    zOnNestedFling |= behavior.onNestedFling(this, childAt, view2, f3, f4, z3);
                }
            }
            i++;
            view = view2;
            f = f3;
            f2 = f4;
            z2 = z3;
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        View view2;
        float f3;
        float f4;
        int childCount = getChildCount();
        int i = 0;
        boolean zOnNestedPreFling = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f3 = f;
                f4 = f2;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m7387a(0) && (behavior = layoutParams.f22912a) != null) {
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view2, f3, f4);
                }
            }
            i++;
            view = view2;
            f = f3;
            f2 = f4;
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray sparseArray = savedState.f22931a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = getResolvedLayoutParams(childAt).f22912a;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f22912a;
            if (id != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.f22931a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM7383e;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zM7383e = m7383e(motionEvent, 1);
            if (!zM7383e) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView != null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zM7383e) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            m7385g(false);
            return zOnTouchEvent;
        }
        zM7383e = false;
        Behavior behavior = ((LayoutParams) this.mBehaviorTouchView.getLayoutParams()).f22912a;
        if (behavior != null) {
            zOnTouchEvent = behavior.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        m7385g(false);
        return zOnTouchEvent;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).f22928q.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).f22912a;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.mDisallowInterceptReset) {
            return;
        }
        m7385g(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        m7386j();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            WeakHashMap weakHashMap2 = ViewCompat.f23405a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.mStatusBarBackground.setVisible(z2, false);
    }

    public final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        Behavior behavior;
        if (!Objects.equals(this.mLastInsets, windowInsetsCompat)) {
            this.mLastInsets = windowInsetsCompat;
            boolean z2 = windowInsetsCompat != null && windowInsetsCompat.m7904k() > 0;
            this.mDrawStatusBarBackground = z2;
            setWillNotDraw(!z2 && getBackground() == null);
            if (!windowInsetsCompat.m7908p()) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    WeakHashMap weakHashMap = ViewCompat.f23405a;
                    if (childAt.getFitsSystemWindows() && (behavior = ((LayoutParams) childAt.getLayoutParams()).f22912a) != null) {
                        windowInsetsCompat = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                        if (windowInsetsCompat.m7908p()) {
                            break;
                        }
                    }
                }
            }
            requestLayout();
        }
        return windowInsetsCompat;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m7387a(i3) && (behavior = layoutParams.f22912a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior behavior;
        View view3;
        View view4;
        int i3;
        int i4;
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mNestedScrollingParentHelper;
        if (i2 == 1) {
            nestedScrollingParentHelper.f23387b = i;
        } else {
            nestedScrollingParentHelper.f23386a = i;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.m7387a(i2) && (behavior = layoutParams.f22912a) != null) {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
                behavior.onNestedScrollAccepted(this, childAt, view3, view4, i3, i4);
            } else {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
            }
            i5++;
            view = view3;
            view2 = view4;
            i = i3;
            i2 = i4;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.f22912a;
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z2 |= zOnStartNestedScroll;
                    if (i2 == 0) {
                        layoutParams.f22925n = zOnStartNestedScroll;
                    } else if (i2 == 1) {
                        layoutParams.f22926o = zOnStartNestedScroll;
                    }
                } else if (i2 == 0) {
                    layoutParams.f22925n = false;
                } else if (i2 == 1) {
                    layoutParams.f22926o = false;
                }
            }
        }
        return z2;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mNestedScrollingParentHelper;
        if (i == 1) {
            nestedScrollingParentHelper.f23387b = 0;
        } else {
            nestedScrollingParentHelper.f23386a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.m7387a(i)) {
                Behavior behavior = layoutParams.f22912a;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    layoutParams.f22925n = false;
                } else if (i == 1) {
                    layoutParams.f22926o = false;
                }
                layoutParams.f22927p = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.m7387a(i5) && (behavior = layoutParams.f22912a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i3 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public Behavior f22912a;

        /* JADX INFO: renamed from: b */
        public boolean f22913b;

        /* JADX INFO: renamed from: c */
        public int f22914c;

        /* JADX INFO: renamed from: d */
        public int f22915d;

        /* JADX INFO: renamed from: e */
        public final int f22916e;

        /* JADX INFO: renamed from: f */
        public final int f22917f;

        /* JADX INFO: renamed from: g */
        public int f22918g;

        /* JADX INFO: renamed from: h */
        public int f22919h;

        /* JADX INFO: renamed from: i */
        public int f22920i;

        /* JADX INFO: renamed from: j */
        public int f22921j;

        /* JADX INFO: renamed from: k */
        public View f22922k;

        /* JADX INFO: renamed from: l */
        public View f22923l;

        /* JADX INFO: renamed from: m */
        public boolean f22924m;

        /* JADX INFO: renamed from: n */
        public boolean f22925n;

        /* JADX INFO: renamed from: o */
        public boolean f22926o;

        /* JADX INFO: renamed from: p */
        public boolean f22927p;

        /* JADX INFO: renamed from: q */
        public final Rect f22928q;

        /* JADX INFO: renamed from: r */
        public Object f22929r;

        public LayoutParams() {
            super(-2, -2);
            this.f22913b = false;
            this.f22914c = 0;
            this.f22915d = 0;
            this.f22916e = -1;
            this.f22917f = -1;
            this.f22918g = 0;
            this.f22919h = 0;
            this.f22928q = new Rect();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7387a(int i) {
            if (i == 0) {
                return this.f22925n;
            }
            if (i != 1) {
                return false;
            }
            return this.f22926o;
        }

        /* JADX INFO: renamed from: b */
        public final void m7388b(Behavior behavior) {
            Behavior behavior2 = this.f22912a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f22912a = behavior;
                this.f22929r = null;
                this.f22913b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22913b = false;
            this.f22914c = 0;
            this.f22915d = 0;
            this.f22916e = -1;
            this.f22917f = -1;
            this.f22918g = 0;
            this.f22919h = 0;
            this.f22928q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.f22909b);
            this.f22914c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f22917f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f22915d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f22916e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f22918g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f22919h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f22913b = zHasValue;
            if (zHasValue) {
                this.f22912a = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(3));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f22912a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f22913b = false;
            this.f22914c = 0;
            this.f22915d = 0;
            this.f22916e = -1;
            this.f22917f = -1;
            this.f22918g = 0;
            this.f22919h = 0;
            this.f22928q = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22913b = false;
            this.f22914c = 0;
            this.f22915d = 0;
            this.f22916e = -1;
            this.f22917f = -1;
            this.f22918g = 0;
            this.f22919h = 0;
            this.f22928q = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22913b = false;
            this.f22914c = 0;
            this.f22915d = 0;
            this.f22916e = -1;
            this.f22917f = -1;
            this.f22918g = 0;
            this.f22919h = 0;
            this.f22928q = new Rect();
        }
    }
}
