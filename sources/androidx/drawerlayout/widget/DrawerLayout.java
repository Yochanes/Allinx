package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements Openable {

    /* JADX INFO: renamed from: r */
    public static final int[] f24202r = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: s */
    public static final boolean f24203s;

    /* JADX INFO: renamed from: t */
    public static final boolean f24204t;

    /* JADX INFO: renamed from: u */
    public static final boolean f24205u;

    /* JADX INFO: renamed from: a */
    public float f24206a;

    /* JADX INFO: renamed from: b */
    public float f24207b;

    /* JADX INFO: renamed from: c */
    public boolean f24208c;

    /* JADX INFO: renamed from: d */
    public boolean f24209d;

    /* JADX INFO: renamed from: f */
    public int f24210f;

    /* JADX INFO: renamed from: g */
    public int f24211g;

    /* JADX INFO: renamed from: i */
    public int f24212i;

    /* JADX INFO: renamed from: j */
    public int f24213j;

    /* JADX INFO: renamed from: n */
    public DrawerListener f24214n;

    /* JADX INFO: renamed from: o */
    public Drawable f24215o;

    /* JADX INFO: renamed from: p */
    public WindowInsets f24216p;

    /* JADX INFO: renamed from: q */
    public boolean f24217q;

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C16111 implements AccessibilityViewCommand {
        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$2 */
    /* JADX INFO: compiled from: Proguard */
    class ViewOnApplyWindowInsetsListenerC16122 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z2 = false;
            boolean z3 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f24216p = windowInsets;
            drawerLayout.f24217q = z3;
            if (!z3 && drawerLayout.getBackground() == null) {
                z2 = true;
            }
            drawerLayout.setWillNotDraw(z2);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.f24203s) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f23504a);
                super.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain));
                accessibilityNodeInfoCompat.f23506c = -1;
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f23504a;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfoCompat.f23505b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                accessibilityNodeInfoObtain.getBoundsInScreen(null);
                accessibilityNodeInfoCompat.m8013j(null);
                accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                accessibilityNodeInfoCompat.m8014k(accessibilityNodeInfoObtain.getClassName());
                accessibilityNodeInfoCompat.m8018o(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                accessibilityNodeInfoCompat.m8005a(accessibilityNodeInfoObtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.m8749f(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.m8014k("androidx.drawerlayout.widget.DrawerLayout");
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfoCompat.f23504a;
            accessibilityNodeInfo2.setFocusable(false);
            accessibilityNodeInfo2.setFocused(false);
            accessibilityNodeInfoCompat.m8011h(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f23507e);
            accessibilityNodeInfoCompat.m8011h(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f23508f);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f24203s || DrawerLayout.m8749f(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (DrawerLayout.m8749f(view)) {
                return;
            }
            accessibilityNodeInfoCompat.f23505b = -1;
            accessibilityNodeInfoCompat.f23504a.setParent(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface DrawerListener {
        void onDrawerSlide(View view, float f);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f24218a;

        /* JADX INFO: renamed from: b */
        public float f24219b;

        /* JADX INFO: renamed from: c */
        public int f24220c;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16131();

        /* JADX INFO: renamed from: a */
        public int f24221a;

        /* JADX INFO: renamed from: b */
        public int f24222b;

        /* JADX INFO: renamed from: c */
        public int f24223c;

        /* JADX INFO: renamed from: d */
        public int f24224d;

        /* JADX INFO: renamed from: f */
        public int f24225f;

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C16131 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f24221a = 0;
            this.f24221a = parcel.readInt();
            this.f24222b = parcel.readInt();
            this.f24223c = parcel.readInt();
            this.f24224d = parcel.readInt();
            this.f24225f = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24221a);
            parcel.writeInt(this.f24222b);
            parcel.writeInt(this.f24223c);
            parcel.writeInt(this.f24224d);
            parcel.writeInt(this.f24225f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ViewDragCallback extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1 */
        /* JADX INFO: compiled from: Proguard */
        public class RunnableC16141 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeDragStarted(int i, int i2) {
            if ((i & 1) != 1) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean onEdgeLock(int i) {
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeTouched(int i, int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).getClass();
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            view.getWidth();
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f, float f2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i) {
            throw null;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f24203s = true;
        f24204t = true;
        f24205u = i >= 29;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8749f(View view) {
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8750g(View view) {
        return ((LayoutParams) view.getLayoutParams()).f24218a == 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8751h(View view) {
        if (m8752i(view)) {
            return (((LayoutParams) view.getLayoutParams()).f24220c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m8752i(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f24218a;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8753a(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f24218a;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        return (Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 3) == 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m8752i(childAt)) {
                throw null;
            }
            if (m8751h(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z2 = true;
            }
        }
        if (!z2) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).f24220c & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || m8752i(view)) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = ViewCompat.f23405a;
            view.setImportantForAccessibility(1);
        }
        if (f24203s) {
            return;
        }
        ViewCompat.m7765A(view, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m8754b(View view, boolean z2) {
        if (!m8752i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f24209d) {
            layoutParams.f24219b = 0.0f;
            layoutParams.f24220c = 0;
            invalidate();
            return;
        }
        if (z2) {
            layoutParams.f24220c |= 4;
            if (m8753a(view)) {
                view.getWidth();
                view.getTop();
                throw null;
            }
            getWidth();
            view.getTop();
            throw null;
        }
        float f = ((LayoutParams) view.getLayoutParams()).f24219b;
        float width = view.getWidth();
        int i = ((int) (width * 0.0f)) - ((int) (f * width));
        if (!m8753a(view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m8760l(0.0f, view);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m8755c(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m8752i(childAt)) {
                if (!z2) {
                    childAt.getWidth();
                    if (m8753a(childAt)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
                layoutParams.getClass();
            }
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).f24219b);
        }
        this.f24207b = fMax;
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final View m8756d(int i) {
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int i3 = ((LayoutParams) childAt.getLayoutParams()).f24218a;
            WeakHashMap weakHashMap2 = ViewCompat.f23405a;
            if ((Gravity.getAbsoluteGravity(i3, getLayoutDirection()) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f24207b <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        int i = childCount - 1;
        if (i < 0) {
            return false;
        }
        getChildAt(i).getHitRect(null);
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zM8750g = m8750g(view);
        int width = getWidth();
        int iSave = canvas.save();
        if (zM8750g) {
            int childCount = getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m8752i(childAt) && childAt.getHeight() >= height) {
                    if (m8753a(childAt)) {
                        int right = childAt.getRight();
                        if (right > i) {
                            i = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        if (this.f24207b <= 0.0f || !zM8750g) {
            return zDrawChild;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final int m8757e(View view) {
        if (!m8752i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i = ((LayoutParams) view.getLayoutParams()).f24218a;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.f24210f;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.f24212i : this.f24213j;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.f24211g;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.f24213j : this.f24212i;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.f24212i;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.f24210f : this.f24211g;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.f24213j;
        if (i8 != 3) {
            return i8;
        }
        int i9 = layoutDirection == 0 ? this.f24211g : this.f24210f;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f24218a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f24218a = 0;
            layoutParams3.f24218a = layoutParams2.f24218a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f24218a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f24218a = 0;
        return layoutParams5;
    }

    public float getDrawerElevation() {
        if (f24204t) {
            return this.f24206a;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f24215o;
    }

    /* JADX INFO: renamed from: j */
    public final void m8758j(View view) {
        if (!m8752i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f24209d) {
            layoutParams.f24220c |= 2;
            if (m8753a(view)) {
                view.getTop();
                throw null;
            }
            getWidth();
            view.getWidth();
            view.getTop();
            throw null;
        }
        layoutParams.f24219b = 1.0f;
        layoutParams.f24220c = 1;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == view) {
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                childAt.setImportantForAccessibility(1);
            } else {
                WeakHashMap weakHashMap2 = ViewCompat.f23405a;
                childAt.setImportantForAccessibility(4);
            }
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.f23517o;
        ViewCompat.m7804w(accessibilityActionCompat.m8024a(), view);
        ViewCompat.m7801t(0, view);
        if (m8751h(view) && m8757e(view) != 2) {
            ViewCompat.m7805x(view, accessibilityActionCompat, null, null);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public final void m8759k(int i, int i2) {
        View viewM8756d;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.f24210f = i;
        } else if (i2 == 5) {
            this.f24211g = i;
        } else if (i2 == 8388611) {
            this.f24212i = i;
        } else if (i2 == 8388613) {
            this.f24213j = i;
        }
        if (i != 0) {
            throw null;
        }
        if (i != 1) {
            if (i == 2 && (viewM8756d = m8756d(absoluteGravity)) != null) {
                m8758j(viewM8756d);
                return;
            }
            return;
        }
        View viewM8756d2 = m8756d(absoluteGravity);
        if (viewM8756d2 != null) {
            m8754b(viewM8756d2, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8760l(float f, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f24219b) {
            return;
        }
        layoutParams.f24219b = f;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24209d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24209d = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f24217q || this.f24215o == null) {
            return;
        }
        WindowInsets windowInsets = this.f24216p;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f24215o.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f24215o.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        View childAt;
        if (i == 4) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = getChildAt(i2);
                if (m8752i(childAt)) {
                    if (!m8752i(childAt)) {
                        throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                    }
                    if (((LayoutParams) childAt.getLayoutParams()).f24219b > 0.0f) {
                        break;
                    }
                }
                i2++;
            }
            if (childAt != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        View childAt;
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if (m8752i(childAt)) {
                if (!m8752i(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((LayoutParams) childAt.getLayoutParams()).f24219b > 0.0f) {
                    break;
                }
            }
            i2++;
        }
        if (childAt == null || m8757e(childAt) != 0) {
            return childAt != null;
        }
        m8755c(false);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z3 = true;
        this.f24208c = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m8750g(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m8753a(childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f24219b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (layoutParams.f24219b * f3));
                    }
                    boolean z4 = f != layoutParams.f24219b ? z3 : false;
                    int i9 = layoutParams.f24218a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = i10 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i13 > i14) {
                                i11 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z4) {
                        m8760l(f, childAt);
                    }
                    int i17 = layoutParams.f24219b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z3 = true;
        }
        if (f24205u && (rootWindowInsets = getRootWindowInsets()) != null) {
            WindowInsetsCompat.m7893t(null, rootWindowInsets).m7900g();
            throw null;
        }
        this.f24208c = false;
        this.f24209d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4 = 3;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        char c2 = Ascii.MIN;
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f24216p != null) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            z2 = getFitsSystemWindows();
        }
        WeakHashMap weakHashMap2 = ViewCompat.f23405a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f24218a, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = this.f24216p;
                        if (absoluteGravity == i4) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = this.f24216p;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m8750g(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, Ints.MAX_POWER_OF_TWO));
                } else {
                    if (!m8752i(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f24204t) {
                        float fM7792k = ViewCompat.m7792k(childAt);
                        float f = this.f24206a;
                        if (fM7792k != f) {
                            ViewCompat.m7770F(childAt, f);
                        }
                    }
                    int i6 = ((LayoutParams) childAt.getLayoutParams()).f24218a;
                    WeakHashMap weakHashMap3 = ViewCompat.f23405a;
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, getLayoutDirection());
                    int i7 = absoluteGravity2 & 7;
                    boolean z5 = i7 == 3;
                    if ((z5 && z3) || (!z5 && z4)) {
                        throw new IllegalStateException(AbstractC0000a.m19p(new StringBuilder("Child drawer has absolute gravity "), (absoluteGravity2 & 3) != 3 ? (absoluteGravity2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i7) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    i3 = 3;
                    if (z5) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    i5++;
                    i4 = i3;
                    c2 = Ascii.MIN;
                }
            }
            i3 = 3;
            i5++;
            i4 = i3;
            c2 = Ascii.MIN;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewM8756d;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f24221a;
        if (i != 0 && (viewM8756d = m8756d(i)) != null) {
            m8758j(viewM8756d);
        }
        int i2 = savedState.f24222b;
        if (i2 != 3) {
            m8759k(i2, 3);
        }
        int i3 = savedState.f24223c;
        if (i3 != 3) {
            m8759k(i3, 5);
        }
        int i4 = savedState.f24224d;
        if (i4 != 3) {
            m8759k(i4, 8388611);
        }
        int i5 = savedState.f24225f;
        if (i5 != 3) {
            m8759k(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f24204t) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f24221a = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f24220c;
            boolean z2 = i2 == 1;
            boolean z3 = i2 == 2;
            if (z2 || z3) {
                savedState.f24221a = layoutParams.f24218a;
                break;
            }
        }
        savedState.f24222b = this.f24210f;
        savedState.f24223c = this.f24211g;
        savedState.f24224d = this.f24212i;
        savedState.f24225f = this.f24213j;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            m8755c(true);
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f24208c) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f24206a = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m8752i(childAt)) {
                ViewCompat.m7770F(childAt, this.f24206a);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        if (this.f24214n != null) {
            throw null;
        }
        if (drawerListener != null) {
            throw null;
        }
        this.f24214n = drawerListener;
    }

    public void setDrawerLockMode(int i) {
        m8759k(i, 3);
        m8759k(i, 5);
    }

    public void setScrimColor(@ColorInt int i) {
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f24215o = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.f24215o = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f24215o = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f24218a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24202r);
        layoutParams.f24218a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SimpleDrawerListener implements DrawerListener {
        public void onDrawerStateChanged(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View view, float f) {
        }
    }
}
