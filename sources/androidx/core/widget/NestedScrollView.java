package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {

    /* JADX INFO: renamed from: H */
    public static final float f23581H = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: I */
    public static final AccessibilityDelegate f23582I = new AccessibilityDelegate();

    /* JADX INFO: renamed from: J */
    public static final int[] f23583J = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public int f23584A;

    /* JADX INFO: renamed from: B */
    public SavedState f23585B;

    /* JADX INFO: renamed from: C */
    public final NestedScrollingParentHelper f23586C;

    /* JADX INFO: renamed from: D */
    public final NestedScrollingChildHelper f23587D;

    /* JADX INFO: renamed from: E */
    public float f23588E;

    /* JADX INFO: renamed from: F */
    public OnScrollChangeListener f23589F;

    /* JADX INFO: renamed from: G */
    public final DifferentialMotionFlingController f23590G;

    /* JADX INFO: renamed from: a */
    public final float f23591a;

    /* JADX INFO: renamed from: b */
    public long f23592b;

    /* JADX INFO: renamed from: c */
    public final Rect f23593c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f23594d;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f23595f;

    /* JADX INFO: renamed from: g */
    public final EdgeEffect f23596g;

    /* JADX INFO: renamed from: i */
    public int f23597i;

    /* JADX INFO: renamed from: j */
    public boolean f23598j;

    /* JADX INFO: renamed from: n */
    public boolean f23599n;

    /* JADX INFO: renamed from: o */
    public View f23600o;

    /* JADX INFO: renamed from: p */
    public boolean f23601p;

    /* JADX INFO: renamed from: q */
    public VelocityTracker f23602q;

    /* JADX INFO: renamed from: r */
    public boolean f23603r;

    /* JADX INFO: renamed from: s */
    public boolean f23604s;

    /* JADX INFO: renamed from: t */
    public final int f23605t;

    /* JADX INFO: renamed from: u */
    public final int f23606u;

    /* JADX INFO: renamed from: v */
    public final int f23607v;

    /* JADX INFO: renamed from: w */
    public int f23608w;

    /* JADX INFO: renamed from: x */
    public final int[] f23609x;

    /* JADX INFO: renamed from: y */
    public final int[] f23610y;

    /* JADX INFO: renamed from: z */
    public int f23611z;

    /* JADX INFO: compiled from: Proguard */
    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.m8014k(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.m8021r(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.m8006b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f23514l);
                accessibilityNodeInfoCompat.m8006b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f23518p);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.m8006b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f23513k);
                accessibilityNodeInfoCompat.m8006b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f23520r);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i == 4096) {
                    int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (iMin != nestedScrollView.getScrollY()) {
                        nestedScrollView.m8186p(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax != nestedScrollView.getScrollY()) {
                        nestedScrollView.m8186p(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                } else if (i == 16908346) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api35Impl {
        /* JADX INFO: renamed from: a */
        public static void m8189a(NestedScrollView nestedScrollView, float f) {
            try {
                nestedScrollView.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class DifferentialMotionFlingTargetImpl implements DifferentialMotionFlingTarget {
        public DifferentialMotionFlingTargetImpl() {
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        /* JADX INFO: renamed from: a */
        public final boolean mo7719a(float f) {
            if (f == 0.0f) {
                return false;
            }
            mo7721c();
            NestedScrollView.this.m8176e((int) f);
            return true;
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        /* JADX INFO: renamed from: b */
        public final float mo7720b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        /* JADX INFO: renamed from: c */
        public final void mo7721c() {
            NestedScrollView.this.f23594d.abortAnimation();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnScrollChangeListener {
        /* JADX INFO: renamed from: a */
        void mo254a(NestedScrollView nestedScrollView);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14781();

        /* JADX INFO: renamed from: a */
        public int f23613a;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C14781 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f23613a = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return AbstractC0000a.m11h(this.f23613a, "}", sb);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23613a);
        }
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.exchange.allin.R.attr.nestedScrollViewStyle);
        this.f23593c = new Rect();
        this.f23598j = true;
        this.f23599n = false;
        this.f23600o = null;
        this.f23601p = false;
        this.f23604s = true;
        this.f23608w = -1;
        this.f23609x = new int[2];
        this.f23610y = new int[2];
        this.f23590G = new DifferentialMotionFlingController(getContext(), new DifferentialMotionFlingTargetImpl());
        int i = Build.VERSION.SDK_INT;
        this.f23595f = i >= 31 ? EdgeEffectCompat.Api31Impl.m8168a(context, attributeSet) : new EdgeEffect(context);
        this.f23596g = i >= 31 ? EdgeEffectCompat.Api31Impl.m8168a(context, attributeSet) : new EdgeEffect(context);
        this.f23591a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f23594d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f23605t = viewConfiguration.getScaledTouchSlop();
        this.f23606u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23607v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23583J, com.exchange.allin.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f23586C = new NestedScrollingParentHelper();
        this.f23587D = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m7765A(this, f23582I);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m8171g(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m8171g((View) parent, nestedScrollView);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8172a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m8178h(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m8184n(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f23593c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m8184n(m8173b(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m8178h(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public final int m8173b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8174c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f23587D.m7751c(i, i2, iArr, null, i3);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int iRound;
        int i;
        int i2;
        if (this.f23594d.isFinished()) {
            return;
        }
        this.f23594d.computeScrollOffset();
        int currY = this.f23594d.getCurrY();
        int i3 = currY - this.f23584A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f23596g;
        EdgeEffect edgeEffect2 = this.f23595f;
        if (i3 <= 0 || EdgeEffectCompat.m8165a(edgeEffect2) == 0.0f) {
            if (i3 < 0 && EdgeEffectCompat.m8165a(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(EdgeEffectCompat.m8166b(edgeEffect, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect.finish();
                }
            }
            this.f23584A = currY;
            int[] iArr = this.f23610y;
            iArr[1] = 0;
            m8174c(0, i3, iArr, null, 1);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (BuildCompat.m7632b()) {
                Api35Impl.m8189a(this, Math.abs(this.f23594d.getCurrVelocity()));
            }
            if (i == 0) {
                int scrollY = getScrollY();
                m8181k(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.f23587D.m7752d(0, scrollY2, 0, i4, this.f23609x, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f23594d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f23594d.getCurrVelocity());
                    }
                }
                this.f23594d.abortAnimation();
                m8188r(i2);
            }
            if (this.f23594d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                m8188r(i2);
                return;
            }
        }
        iRound = Math.round(EdgeEffectCompat.m8166b(edgeEffect2, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect2.finish();
        }
        i3 -= iRound;
        this.f23584A = currY;
        int[] iArr2 = this.f23610y;
        iArr2[1] = 0;
        m8174c(0, i3, iArr2, null, 1);
        i = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (BuildCompat.m7632b()) {
        }
        if (i == 0) {
        }
        if (i != 0) {
        }
        if (this.f23594d.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8175d(KeyEvent keyEvent) {
        this.f23593c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m8177f(33) : m8172a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m8177f(130) : m8172a(130);
                    }
                    if (keyCode == 62) {
                        m8182l(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m8177f(33);
                    }
                    if (keyCode == 93) {
                        return m8177f(130);
                    }
                    if (keyCode == 122) {
                        m8182l(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m8182l(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m8175d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return this.f23587D.m7749a(f, f2, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f23587D.m7750b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f23587D.m7751c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f23587D.m7752d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f23595f;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f23596g;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: e */
    public final void m8176e(int i) {
        if (getChildCount() > 0) {
            this.f23594d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f23587D.m7756h(2, 1);
            this.f23584A = getScrollY();
            postInvalidateOnAnimation();
            if (BuildCompat.m7632b()) {
                Api35Impl.m8189a(this, Math.abs(this.f23594d.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8177f(int i) {
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f23593c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m8183m(i, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f23586C;
        return nestedScrollingParentHelper.f23387b | nestedScrollingParentHelper.f23386a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @VisibleForTesting
    public float getVerticalScrollFactorCompat() {
        if (this.f23588E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f23588E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f23588E;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8178h(View view, int i, int i2) {
        Rect rect = this.f23593c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f23587D.m7754f(0);
    }

    /* JADX INFO: renamed from: i */
    public final void m8179i(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f23587D.m7752d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f23587D.f23384d;
    }

    /* JADX INFO: renamed from: j */
    public final void m8180j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f23608w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f23597i = (int) motionEvent.getY(i);
            this.f23608w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f23602q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m8181k(int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z2 = false;
        } else {
            i5 = 0;
            z2 = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z3 = false;
                if (z3 && !this.f23587D.m7754f(1)) {
                    this.f23594d.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z2 || z3;
            }
            i6 = 0;
        }
        z3 = true;
        if (z3) {
            this.f23594d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z2) {
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8182l(int i) {
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f23593c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m8183m(i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8183m(int i, int i2, int i3) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z3 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z5 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m8184n(z3 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final int m8184n(int i, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        VelocityTracker velocityTracker;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f23587D;
        if (i3 == 1) {
            nestedScrollingChildHelper.m7756h(2, i3);
        }
        boolean zM7751c = this.f23587D.m7751c(0, i, this.f23610y, this.f23609x, i3);
        int[] iArr = this.f23610y;
        int[] iArr2 = this.f23609x;
        if (zM7751c) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = m8181k(i4, 0, scrollY, scrollRange) && !nestedScrollingChildHelper.m7754f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f23587D.m7752d(0, scrollY2, 0, i4 - scrollY2, this.f23609x, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f23596g;
        EdgeEffect edgeEffect2 = this.f23595f;
        if (i8 < 0) {
            if (z4) {
                EdgeEffectCompat.m8166b(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z4) {
            EdgeEffectCompat.m8166b(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i3 == 0 && (velocityTracker = this.f23602q) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m8188r(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8185o(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM8165a = EdgeEffectCompat.m8165a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f23591a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f23581H;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM8165a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23599n = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f23601p) {
            if ((motionEvent.getSource() & 2) == 2) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                i = 26;
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m8184n(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
                if (i != 0) {
                    this.f23590G.m7718a(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f23601p) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m8187q(motionEvent) && this.f23594d.isFinished()) {
                        z2 = false;
                    }
                    this.f23601p = z2;
                    VelocityTracker velocityTracker = this.f23602q;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f23602q = null;
                    }
                } else {
                    this.f23597i = y2;
                    this.f23608w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f23602q;
                    if (velocityTracker2 == null) {
                        this.f23602q = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f23602q.addMovement(motionEvent);
                    this.f23594d.computeScrollOffset();
                    if (!m8187q(motionEvent) && this.f23594d.isFinished()) {
                        z2 = false;
                    }
                    this.f23601p = z2;
                    this.f23587D.m7756h(2, 0);
                }
            }
        } else if (i == 1) {
            this.f23601p = false;
            this.f23608w = -1;
            VelocityTracker velocityTracker3 = this.f23602q;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f23602q = null;
            }
            if (this.f23594d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m8188r(0);
        } else if (i == 2) {
            int i2 = this.f23608w;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f23597i) > this.f23605t && (2 & getNestedScrollAxes()) == 0) {
                        this.f23601p = true;
                        this.f23597i = y3;
                        if (this.f23602q == null) {
                            this.f23602q = VelocityTracker.obtain();
                        }
                        this.f23602q.addMovement(motionEvent);
                        this.f23611z = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i != 3) {
            if (i == 6) {
                m8180j(motionEvent);
            }
        }
        return this.f23601p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        this.f23598j = false;
        View view = this.f23600o;
        if (view != null && m8171g(view, this)) {
            View view2 = this.f23600o;
            Rect rect = this.f23593c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM8173b = m8173b(rect);
            if (iM8173b != 0) {
                scrollBy(0, iM8173b);
            }
        }
        this.f23600o = null;
        if (!this.f23599n) {
            if (this.f23585B != null) {
                scrollTo(getScrollX(), this.f23585B.f23613a);
                this.f23585B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f23599n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f23603r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Ints.MAX_POWER_OF_TWO));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m8176e((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f23587D.m7750b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m8174c(i, i2, iArr, null, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m8179i(i4, i5, iArr);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f23586C;
        if (i2 == 1) {
            nestedScrollingParentHelper.f23387b = i;
        } else {
            nestedScrollingParentHelper.f23386a = i;
        }
        this.f23587D.m7756h(2, i2);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m8178h(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f23585B = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23613a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener = this.f23589F;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.mo254a(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m8178h(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f23593c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM8173b = m8173b(rect);
        if (iM8173b != 0) {
            if (this.f23604s) {
                m8186p(0, iM8173b, false);
            } else {
                scrollBy(0, iM8173b);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f23586C;
        if (i == 1) {
            nestedScrollingParentHelper.f23387b = 0;
        } else {
            nestedScrollingParentHelper.f23386a = 0;
        }
        m8188r(i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f23602q == null) {
            this.f23602q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f23611z = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f23611z);
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f23587D;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f23596g;
            EdgeEffect edgeEffect2 = this.f23595f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f23602q;
                velocityTracker.computeCurrentVelocity(1000, this.f23607v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f23608w);
                if (Math.abs(yVelocity) >= this.f23606u) {
                    if (EdgeEffectCompat.m8165a(edgeEffect2) != 0.0f) {
                        if (m8185o(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m8176e(-yVelocity);
                        }
                    } else if (EdgeEffectCompat.m8165a(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (m8185o(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            m8176e(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!nestedScrollingChildHelper.m7750b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m8176e(i2);
                        }
                    }
                } else if (this.f23594d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f23608w = -1;
                this.f23601p = false;
                VelocityTracker velocityTracker2 = this.f23602q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f23602q = null;
                }
                m8188r(0);
                this.f23595f.onRelease();
                this.f23596g.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f23608w);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f23608w + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f23597i - y2;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (EdgeEffectCompat.m8165a(edgeEffect2) != 0.0f) {
                        float f3 = -EdgeEffectCompat.m8166b(edgeEffect2, -height, x);
                        if (EdgeEffectCompat.m8165a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (EdgeEffectCompat.m8165a(edgeEffect) != 0.0f) {
                        float fM8166b = EdgeEffectCompat.m8166b(edgeEffect, height, 1.0f - x);
                        if (EdgeEffectCompat.m8165a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = fM8166b;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.f23601p && Math.abs(i4) > this.f23605t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f23601p = true;
                        i4 = i4 > 0 ? i4 - this.f23605t : i4 + this.f23605t;
                    }
                    if (this.f23601p) {
                        int iM8184n = m8184n(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f23597i = y2 - iM8184n;
                        this.f23611z += iM8184n;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f23601p && getChildCount() > 0 && this.f23594d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f23608w = -1;
                this.f23601p = false;
                VelocityTracker velocityTracker3 = this.f23602q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f23602q = null;
                }
                m8188r(0);
                this.f23595f.onRelease();
                this.f23596g.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f23597i = (int) motionEvent.getY(actionIndex);
                this.f23608w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m8180j(motionEvent);
                this.f23597i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f23608w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f23601p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f23594d.isFinished()) {
                this.f23594d.abortAnimation();
                m8188r(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f23597i = y3;
            this.f23608w = pointerId;
            nestedScrollingChildHelper.m7756h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f23602q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m8186p(int i, int i2, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f23592b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f23594d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f23587D.m7756h(2, 1);
            } else {
                m8188r(1);
            }
            this.f23584A = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f23594d.isFinished()) {
                this.f23594d.abortAnimation();
                m8188r(1);
            }
            scrollBy(i, i2);
        }
        this.f23592b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8187q(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f23595f;
        if (EdgeEffectCompat.m8165a(edgeEffect) != 0.0f) {
            EdgeEffectCompat.m8166b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f23596g;
        if (EdgeEffectCompat.m8165a(edgeEffect2) == 0.0f) {
            return z2;
        }
        EdgeEffectCompat.m8166b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m8188r(int i) {
        this.f23587D.m7757i(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f23598j) {
            this.f23600o = view2;
        } else {
            Rect rect = this.f23593c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM8173b = m8173b(rect);
            if (iM8173b != 0) {
                scrollBy(0, iM8173b);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM8173b = m8173b(rect);
        boolean z3 = iM8173b != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM8173b);
                return z3;
            }
            m8186p(0, iM8173b, false);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f23602q) != null) {
            velocityTracker.recycle();
            this.f23602q = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f23598j = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f23603r) {
            this.f23603r = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.f23587D.m7755g(z2);
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.f23589F = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f23604s = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f23587D.m7756h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m8188r(0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        m8174c(i, i2, iArr, null, i3);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m8179i(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m8179i(i4, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
