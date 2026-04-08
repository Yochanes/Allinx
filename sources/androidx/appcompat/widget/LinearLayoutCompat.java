package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import com.google.common.primitives.Ints;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DividerMode {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a */
        public int f1292a;

        /* JADX INFO: renamed from: b */
        public int f1293b;

        /* JADX INFO: renamed from: c */
        public int f1294c;

        /* JADX INFO: renamed from: d */
        public int f1295d;

        /* JADX INFO: renamed from: e */
        public int f1296e;

        /* JADX INFO: renamed from: f */
        public int f1297f;

        /* JADX INFO: renamed from: g */
        public int f1298g;

        /* JADX INFO: renamed from: h */
        public int f1299h;

        /* JADX INFO: renamed from: i */
        public int f1300i;

        /* JADX INFO: renamed from: androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$1 */
        /* JADX INFO: compiled from: Proguard */
        class C01191 implements IntFunction<String> {
            @Override // java.util.function.IntFunction
            public final String apply(int i) {
                return i != 0 ? i != 1 ? String.valueOf(i) : "vertical" : "horizontal";
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$2 */
        /* JADX INFO: compiled from: Proguard */
        class C01202 implements IntFunction<Set<String>> {
            @Override // java.util.function.IntFunction
            public final Set<String> apply(int i) {
                HashSet hashSet = new HashSet();
                if (i == 0) {
                    hashSet.add("none");
                }
                if (i == 1) {
                    hashSet.add("beginning");
                }
                if (i == 2) {
                    hashSet.add("middle");
                }
                if (i == 4) {
                    hashSet.add("end");
                }
                return hashSet;
            }
        }

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f1292a = AbstractC0020a.m65s(propertyMapper);
            this.f1293b = AbstractC0148a.m747a(propertyMapper);
            this.f1294c = AbstractC0148a.m754h(propertyMapper);
            this.f1295d = AbstractC0148a.m748b(propertyMapper, new C01191());
            this.f1296e = AbstractC0148a.m766t(propertyMapper);
            this.f1297f = AbstractC0148a.m770x(propertyMapper);
            this.f1298g = AbstractC0148a.m771y(propertyMapper);
            this.f1299h = AbstractC0148a.m772z(propertyMapper);
            this.f1300i = AbstractC0148a.m755i(propertyMapper, new C01202());
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) obj;
            AbstractC0148a.m753g(propertyReader, this.f1292a, linearLayoutCompat.isBaselineAligned());
            AbstractC0020a.m53g(propertyReader, this.f1293b, linearLayoutCompat.getBaselineAlignedChildIndex());
            AbstractC0020a.m68v(propertyReader, this.f1294c, linearLayoutCompat.getGravity());
            AbstractC0020a.m61o(propertyReader, this.f1295d, linearLayoutCompat.getOrientation());
            AbstractC0148a.m749c(propertyReader, this.f1296e, linearLayoutCompat.getWeightSum());
            AbstractC0148a.m751e(propertyReader, this.f1297f, linearLayoutCompat.getDividerDrawable());
            AbstractC0020a.m53g(propertyReader, this.f1298g, linearLayoutCompat.getDividerPadding());
            AbstractC0148a.m753g(propertyReader, this.f1299h, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            AbstractC0148a.m750d(propertyReader, this.f1300i, linearLayoutCompat.getShowDividers());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends LinearLayout.LayoutParams {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = R.styleable.f276o;
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(context, attributeSet, iArr, i, 0);
        ViewCompat.m7807z(this, context, iArr, attributeSet, tintTypedArrayM704f.f1413b, i);
        TypedArray typedArray = tintTypedArrayM704f.f1413b;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.mWeightSum = typedArray.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
        this.mUseLargestChild = typedArray.getBoolean(7, false);
        setDividerDrawable(tintTypedArrayM704f.m706b(5));
        this.mShowDividers = typedArray.getInt(8, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
        tintTypedArrayM704f.m709g();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean z2 = ViewUtils.f1490a;
        boolean z3 = getLayoutDirection() == 1;
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z3 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (z3) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @GravityInt
    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int measuredHeight;
        char c2 = 1;
        boolean z2 = ViewUtils.f1490a;
        int childrenSkipCount = 0;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i13 = i4 - i2;
        int paddingBottom = i13 - getPaddingBottom();
        int paddingBottom2 = (i13 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i14 = this.mGravity;
        int i15 = 8388615 & i14;
        int i16 = i14 & 112;
        boolean z4 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection());
        char c3 = 2;
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength : getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        if (z3) {
            i6 = virtualChildCount - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        while (childrenSkipCount < virtualChildCount) {
            char c4 = c2;
            int i17 = (i5 * childrenSkipCount) + i6;
            char c5 = c3;
            View virtualChildAt = getVirtualChildAt(i17);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i17) + paddingLeft;
                i7 = i6;
            } else {
                i7 = i6;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i18 = childrenSkipCount;
                    if (z4) {
                        i8 = paddingTop;
                        int baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i9 < 0) {
                            i9 = i16;
                        }
                        i10 = i9 & 112;
                        i11 = paddingBottom2;
                        if (i10 == 16) {
                            if (i10 == 48) {
                                i12 = i8 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                if (baseline != -1) {
                                    i12 = (iArr[c4] - baseline) + i12;
                                }
                            } else if (i10 != 80) {
                                i12 = i8;
                            } else {
                                i12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c5] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i17)) {
                                paddingLeft += this.mDividerWidth;
                            }
                            int i19 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                            int locationOffset = getLocationOffset(virtualChildAt) + i19;
                            virtualChildAt.layout(locationOffset, i12, locationOffset + measuredWidth, measuredHeight2 + i12);
                            paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i19;
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i17) + i18;
                            childrenSkipCount++;
                            c3 = c5;
                            i6 = i7;
                            c2 = c4;
                            paddingTop = i8;
                            paddingBottom2 = i11;
                        } else {
                            i12 = ((i11 - measuredHeight2) / 2) + i8 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        }
                        i12 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i17)) {
                        }
                        int i192 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        int locationOffset2 = getLocationOffset(virtualChildAt) + i192;
                        virtualChildAt.layout(locationOffset2, i12, locationOffset2 + measuredWidth, measuredHeight2 + i12);
                        paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i192;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i17) + i18;
                        childrenSkipCount++;
                        c3 = c5;
                        i6 = i7;
                        c2 = c4;
                        paddingTop = i8;
                        paddingBottom2 = i11;
                    } else {
                        i8 = paddingTop;
                    }
                    i9 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i9 < 0) {
                    }
                    i10 = i9 & 112;
                    i11 = paddingBottom2;
                    if (i10 == 16) {
                    }
                    i12 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i17)) {
                    }
                    int i1922 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    int locationOffset22 = getLocationOffset(virtualChildAt) + i1922;
                    virtualChildAt.layout(locationOffset22, i12, locationOffset22 + measuredWidth, measuredHeight2 + i12);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i1922;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i17) + i18;
                    childrenSkipCount++;
                    c3 = c5;
                    i6 = i7;
                    c2 = c4;
                    paddingTop = i8;
                    paddingBottom2 = i11;
                }
            }
            i8 = paddingTop;
            i11 = paddingBottom2;
            childrenSkipCount++;
            c3 = c5;
            i6 = i7;
            c2 = c4;
            paddingTop = i8;
            paddingBottom2 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.mGravity;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : (((i4 - i2) - this.mTotalLength) / 2) + getPaddingTop();
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(childrenSkipCount) + paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i12 < 0) {
                    i12 = i11;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else if (absoluteGravity != 5) {
                    i7 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    int locationOffset = getLocationOffset(virtualChildAt) + i13;
                    virtualChildAt.layout(i7, locationOffset, measuredWidth + i7, locationOffset + measuredHeight);
                    int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i13;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    paddingTop = nextLocationOffset;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i7 = i5 - i6;
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                }
                int i132 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                int locationOffset2 = getLocationOffset(virtualChildAt) + i132;
                virtualChildAt.layout(i7, locationOffset2, measuredWidth + i7, locationOffset2 + measuredHeight);
                int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i132;
                childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                paddingTop = nextLocationOffset2;
            }
            childrenSkipCount++;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iMax;
        int i7;
        int i8;
        int i9;
        int baseline;
        int i10;
        int i11;
        int i12;
        int childrenSkipCount;
        byte b2;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        boolean z3;
        int[] iArr2;
        View view;
        boolean z4;
        boolean z5;
        int baseline2;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (linearLayoutCompat.mMaxAscent == null || linearLayoutCompat.mMaxDescent == null) {
            linearLayoutCompat.mMaxAscent = new int[4];
            linearLayoutCompat.mMaxDescent = new int[4];
        }
        int[] iArr3 = linearLayoutCompat.mMaxAscent;
        int[] iArr4 = linearLayoutCompat.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z6 = linearLayoutCompat.mBaselineAligned;
        boolean z7 = linearLayoutCompat.mUseLargestChild;
        int i17 = Ints.MAX_POWER_OF_TWO;
        boolean z8 = mode == 1073741824;
        boolean z9 = z7;
        int childrenSkipCount2 = 0;
        int i18 = 0;
        int iMax2 = 0;
        boolean z10 = false;
        int iCombineMeasuredStates = 0;
        boolean z11 = false;
        boolean z12 = true;
        float f = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i3 = i18;
            if (childrenSkipCount2 >= virtualChildCount) {
                break;
            }
            boolean z13 = z6;
            View virtualChildAt = linearLayoutCompat.getVirtualChildAt(childrenSkipCount2);
            if (virtualChildAt == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(childrenSkipCount2) + linearLayoutCompat.mTotalLength;
            } else if (virtualChildAt.getVisibility() == 8) {
                childrenSkipCount2 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
            } else {
                if (linearLayoutCompat.hasDividerBeforeChildAt(childrenSkipCount2)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
                }
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                float f2 = ((LinearLayout.LayoutParams) layoutParams).weight;
                float f3 = f + f2;
                if (mode == i17 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f2 > 0.0f) {
                    if (z8) {
                        linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i19 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i19, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i19 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z13) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        view = virtualChildAt;
                        i15 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        view = virtualChildAt;
                        i15 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z10 = true;
                    }
                    i16 = i3;
                    z3 = z9;
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f2 <= 0.0f) {
                        b2 = -2;
                        i13 = Integer.MIN_VALUE;
                    } else {
                        b2 = -2;
                        ((LinearLayout.LayoutParams) layoutParams).width = -2;
                        i13 = 0;
                    }
                    if (f3 == 0.0f) {
                        z2 = z9;
                        i14 = linearLayoutCompat.mTotalLength;
                    } else {
                        z2 = z9;
                        i14 = 0;
                    }
                    i15 = mode;
                    iArr = iArr3;
                    i16 = i3;
                    int i20 = i13;
                    z3 = z2;
                    iArr2 = iArr4;
                    linearLayoutCompat.measureChildBeforeLayout(virtualChildAt, childrenSkipCount2, i, i14, i2, 0);
                    view = virtualChildAt;
                    if (i20 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams).width = i20;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z8) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(view) + ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i21 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i21, linearLayoutCompat.getNextLocationOffset(view) + i21 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z3) {
                        iMax2 = Math.max(measuredWidth, iMax2);
                    }
                }
                if (mode2 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                    z4 = false;
                } else {
                    z4 = true;
                    z11 = true;
                }
                int i22 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i22;
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                if (!z13 || (baseline2 = view.getBaseline()) == -1) {
                    z5 = z4;
                } else {
                    int i23 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i23 < 0) {
                        i23 = linearLayoutCompat.mGravity;
                    }
                    int i24 = (((i23 & 112) >> 4) & (-2)) >> 1;
                    z5 = z4;
                    iArr[i24] = Math.max(iArr[i24], baseline2);
                    iArr2[i24] = Math.max(iArr2[i24], measuredHeight - baseline2);
                }
                int iMax5 = Math.max(i16, measuredHeight);
                z12 = z12 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                    if (!z5) {
                        i22 = measuredHeight;
                    }
                    iMax4 = Math.max(iMax4, i22);
                } else {
                    if (!z5) {
                        i22 = measuredHeight;
                    }
                    iMax3 = Math.max(iMax3, i22);
                }
                childrenSkipCount2 += linearLayoutCompat.getChildrenSkipCount(view, childrenSkipCount2);
                i18 = iMax5;
                f = f3;
                childrenSkipCount2++;
                z9 = z3;
                iArr4 = iArr2;
                z6 = z13;
                iArr3 = iArr;
                mode = i15;
                i17 = Ints.MAX_POWER_OF_TWO;
            }
            i15 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i18 = i3;
            z3 = z9;
            childrenSkipCount2++;
            z9 = z3;
            iArr4 = iArr2;
            z6 = z13;
            iArr3 = iArr;
            mode = i15;
            i17 = Ints.MAX_POWER_OF_TWO;
        }
        boolean z14 = z6;
        int i25 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int iCombineMeasuredStates2 = iCombineMeasuredStates;
        boolean z15 = z9;
        if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(virtualChildCount)) {
            linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
        }
        int i26 = iArr5[1];
        int iMax6 = (i26 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i3 : Math.max(i3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i26, iArr5[2]))));
        int i27 = i25;
        if (z15 && (i27 == Integer.MIN_VALUE || i27 == 0)) {
            linearLayoutCompat.mTotalLength = 0;
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i28);
                if (virtualChildAt2 == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i28) + linearLayoutCompat.mTotalLength;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount = i28 + linearLayoutCompat.getChildrenSkipCount(virtualChildAt2, i28);
                    i28 = childrenSkipCount + 1;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                    if (z8) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i29 = linearLayoutCompat.mTotalLength;
                        i12 = i28;
                        linearLayoutCompat.mTotalLength = Math.max(i29, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + i29 + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                        childrenSkipCount = i12;
                        i28 = childrenSkipCount + 1;
                    }
                }
                i12 = i28;
                childrenSkipCount = i12;
                i28 = childrenSkipCount + 1;
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
        linearLayoutCompat.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i, 0);
        int i30 = (16777215 & iResolveSizeAndState) - linearLayoutCompat.mTotalLength;
        if (z10 || (i30 != 0 && f > 0.0f)) {
            float f4 = linearLayoutCompat.mWeightSum;
            if (f4 > 0.0f) {
                f = f4;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            linearLayoutCompat.mTotalLength = 0;
            iMax6 = -1;
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i31);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i7 = i27;
                    i8 = iResolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f5 > 0.0f) {
                        i8 = iResolveSizeAndState;
                        int i32 = (int) ((i30 * f5) / f);
                        f -= f5;
                        i30 -= i32;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i11 = Ints.MAX_POWER_OF_TWO;
                            if (i27 == 1073741824) {
                                i7 = i27;
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i32 > 0 ? i32 : 0, Ints.MAX_POWER_OF_TWO), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                        } else {
                            i11 = Ints.MAX_POWER_OF_TWO;
                        }
                        i7 = i27;
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i32;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i11), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                    } else {
                        i7 = i27;
                        i8 = iResolveSizeAndState;
                    }
                    if (z8) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i33 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i33, linearLayoutCompat.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i33 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                    }
                    boolean z16 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i34 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i34;
                    iMax6 = Math.max(iMax6, measuredHeight2);
                    if (!z16) {
                        i34 = measuredHeight2;
                    }
                    int iMax7 = Math.max(iMax3, i34);
                    if (z12) {
                        i9 = -1;
                        boolean z17 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z14 && (baseline = virtualChildAt3.getBaseline()) != i9) {
                            i10 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i10 < 0) {
                                i10 = linearLayoutCompat.mGravity;
                            }
                            int i35 = (((i10 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i35] = Math.max(iArr5[i35], baseline);
                            iArr6[i35] = Math.max(iArr6[i35], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax7;
                        z12 = z17;
                    } else {
                        i9 = -1;
                    }
                    if (z14) {
                        i10 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i10 < 0) {
                        }
                        int i352 = (((i10 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i352] = Math.max(iArr5[i352], baseline);
                        iArr6[i352] = Math.max(iArr6[i352], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax7;
                    z12 = z17;
                }
                i31++;
                iResolveSizeAndState = i8;
                i27 = i7;
            }
            i4 = iResolveSizeAndState;
            i5 = -16777216;
            linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
            int i36 = iArr5[1];
            if (i36 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) {
                i6 = 0;
            } else {
                i6 = 0;
                iMax6 = Math.max(iMax6, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i36, iArr5[2]))));
            }
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z15 && i27 != 1073741824) {
                for (int i37 = 0; i37 < virtualChildCount; i37++) {
                    View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i37);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), Ints.MAX_POWER_OF_TWO));
                    }
                }
            }
            i4 = iResolveSizeAndState;
            i5 = -16777216;
            i6 = 0;
        }
        if (z12 || mode2 == 1073741824) {
            iMax = iMax6;
        }
        linearLayoutCompat.setMeasuredDimension(i4 | (iCombineMeasuredStates2 & i5), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax, linearLayoutCompat.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
        if (z11) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), Ints.MAX_POWER_OF_TWO);
            int i38 = i6;
            while (i38 < virtualChildCount) {
                int i39 = iMakeMeasureSpec2;
                View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(i38);
                if (virtualChildAt5.getVisibility() != 8) {
                    LayoutParams layoutParams4 = (LayoutParams) virtualChildAt5.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams4).height == -1) {
                        int i40 = ((LinearLayout.LayoutParams) layoutParams4).width;
                        ((LinearLayout.LayoutParams) layoutParams4).width = virtualChildAt5.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(virtualChildAt5, i, 0, i39, 0);
                        ((LinearLayout.LayoutParams) layoutParams4).width = i40;
                    }
                }
                i38++;
                linearLayoutCompat = this;
                iMakeMeasureSpec2 = i39;
            }
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i, int i2) {
        int iMax;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View view;
        boolean z3;
        int iMax2;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i15 = linearLayoutCompat.mBaselineAlignedChildIndex;
        boolean z4 = linearLayoutCompat.mUseLargestChild;
        int childrenSkipCount = 0;
        int i16 = 0;
        int iMax3 = 0;
        int i17 = 0;
        int i18 = 0;
        int iMax4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        float f = 0.0f;
        boolean z7 = true;
        while (true) {
            int i19 = i16;
            int i20 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f2 = f;
                int i21 = virtualChildCount;
                boolean z8 = z4;
                int i22 = iMax4;
                int iMax5 = i17;
                int iCombineMeasuredStates = i18;
                int i23 = mode2;
                int i24 = iMax3;
                if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(i21)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                }
                int i25 = i23;
                if (z8 && (i25 == Integer.MIN_VALUE || i25 == 0)) {
                    linearLayoutCompat.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i21) {
                        View virtualChildAt = linearLayoutCompat.getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(childrenSkipCount2) + linearLayoutCompat.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i20) {
                            childrenSkipCount2 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i26 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i26, linearLayoutCompat.getNextLocationOffset(virtualChildAt) + i26 + i24 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin);
                        }
                        childrenSkipCount2++;
                        i20 = 8;
                    }
                }
                int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                linearLayoutCompat.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i2, 0);
                int i27 = (16777215 & iResolveSizeAndState) - linearLayoutCompat.mTotalLength;
                if (z5 || (i27 != 0 && f2 > 0.0f)) {
                    float f3 = linearLayoutCompat.mWeightSum;
                    if (f3 > 0.0f) {
                        f2 = f3;
                    }
                    linearLayoutCompat.mTotalLength = 0;
                    int i28 = i22;
                    int i29 = i27;
                    int i30 = 0;
                    while (i30 < i21) {
                        View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i30);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i3 = i25;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f4 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f4 > 0.0f) {
                                int i31 = (int) ((i29 * f4) / f2);
                                f2 -= f4;
                                i29 -= i31;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i5 = Ints.MAX_POWER_OF_TWO;
                                    if (i25 == 1073741824) {
                                        if (i31 <= 0) {
                                            i31 = 0;
                                        }
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i31, Ints.MAX_POWER_OF_TWO));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                } else {
                                    i5 = Ints.MAX_POWER_OF_TWO;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i31;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i5));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                            }
                            int i32 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i32;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            if (mode != 1073741824) {
                                i3 = i25;
                                i4 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width != -1) {
                                }
                                int iMax6 = Math.max(i28, i32);
                                boolean z9 = !z7 && ((LinearLayout.LayoutParams) layoutParams2).width == i4;
                                int i33 = linearLayoutCompat.mTotalLength;
                                linearLayoutCompat.mTotalLength = Math.max(i33, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i33 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                                z7 = z9;
                                i28 = iMax6;
                            } else {
                                i3 = i25;
                                i4 = -1;
                            }
                            i32 = measuredWidth;
                            int iMax62 = Math.max(i28, i32);
                            if (z7) {
                                int i332 = linearLayoutCompat.mTotalLength;
                                linearLayoutCompat.mTotalLength = Math.max(i332, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i332 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                                z7 = z9;
                                i28 = iMax62;
                            }
                        }
                        i30++;
                        i25 = i3;
                    }
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                    iMax = i28;
                } else {
                    iMax = Math.max(i22, i19);
                    if (z8 && i25 != 1073741824) {
                        for (int i34 = 0; i34 < i21; i34++) {
                            View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i34);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i24, Ints.MAX_POWER_OF_TWO));
                            }
                        }
                    }
                }
                if (z7 || mode == 1073741824) {
                    iMax = iMax5;
                }
                linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax, linearLayoutCompat.getSuggestedMinimumWidth()), i, iCombineMeasuredStates), iResolveSizeAndState);
                if (z6) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), Ints.MAX_POWER_OF_TWO);
                    int i35 = 0;
                    while (i35 < i21) {
                        View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i35);
                        if (virtualChildAt4.getVisibility() != 8) {
                            LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                            if (((LinearLayout.LayoutParams) layoutParams3).width == -1) {
                                int i36 = ((LinearLayout.LayoutParams) layoutParams3).height;
                                ((LinearLayout.LayoutParams) layoutParams3).height = virtualChildAt4.getMeasuredHeight();
                                linearLayoutCompat.measureChildWithMargins(virtualChildAt4, iMakeMeasureSpec, 0, i2, 0);
                                ((LinearLayout.LayoutParams) layoutParams3).height = i36;
                            }
                        }
                        i35++;
                        linearLayoutCompat = this;
                    }
                    return;
                }
                return;
            }
            float f5 = f;
            View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt5 == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(childrenSkipCount) + linearLayoutCompat.mTotalLength;
            } else if (virtualChildAt5.getVisibility() == 8) {
                childrenSkipCount += linearLayoutCompat.getChildrenSkipCount(virtualChildAt5, childrenSkipCount);
            } else {
                if (linearLayoutCompat.hasDividerBeforeChildAt(childrenSkipCount)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                }
                LayoutParams layoutParams4 = (LayoutParams) virtualChildAt5.getLayoutParams();
                float f6 = ((LinearLayout.LayoutParams) layoutParams4).weight;
                f5 += f6;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams4).height == 0 && f6 > 0.0f) {
                    int i37 = linearLayoutCompat.mTotalLength;
                    linearLayoutCompat.mTotalLength = Math.max(i37, ((LinearLayout.LayoutParams) layoutParams4).topMargin + i37 + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
                    view = virtualChildAt5;
                    i13 = virtualChildCount;
                    z2 = z4;
                    i9 = iMax4;
                    z5 = true;
                    i10 = i19;
                    i14 = i17;
                    i11 = i18;
                    i12 = mode2;
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams4).height != 0 || f6 <= 0.0f) {
                        i6 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) layoutParams4).height = -2;
                        i6 = 0;
                    }
                    if (f5 == 0.0f) {
                        int i38 = i18;
                        i8 = linearLayoutCompat.mTotalLength;
                        i7 = i38;
                    } else {
                        i7 = i18;
                        i8 = 0;
                    }
                    int i39 = iMax3;
                    z2 = z4;
                    i9 = iMax4;
                    i10 = i19;
                    i11 = i7;
                    i12 = mode2;
                    i13 = virtualChildCount;
                    i14 = i17;
                    linearLayoutCompat.measureChildBeforeLayout(virtualChildAt5, childrenSkipCount, i, 0, i2, i8);
                    view = virtualChildAt5;
                    if (i6 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams4).height = i6;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i40 = linearLayoutCompat.mTotalLength;
                    linearLayoutCompat.mTotalLength = Math.max(i40, linearLayoutCompat.getNextLocationOffset(view) + i40 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
                    iMax3 = z2 ? Math.max(measuredHeight2, i39) : i39;
                }
                if (i15 >= 0 && i15 == childrenSkipCount + 1) {
                    linearLayoutCompat.mBaselineChildTop = linearLayoutCompat.mTotalLength;
                }
                if (childrenSkipCount < i15 && ((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams4).width != -1) {
                    z3 = false;
                } else {
                    z3 = true;
                    z6 = true;
                }
                int i41 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i41;
                int iMax7 = Math.max(i14, measuredWidth2);
                int iCombineMeasuredStates2 = View.combineMeasuredStates(i11, view.getMeasuredState());
                z7 = z7 && ((LinearLayout.LayoutParams) layoutParams4).width == -1;
                if (((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                    if (!z3) {
                        i41 = measuredWidth2;
                    }
                    iMax2 = Math.max(i10, i41);
                    iMax4 = i9;
                } else {
                    if (!z3) {
                        i41 = measuredWidth2;
                    }
                    iMax4 = Math.max(i9, i41);
                    iMax2 = i10;
                }
                childrenSkipCount += linearLayoutCompat.getChildrenSkipCount(view, childrenSkipCount);
                i16 = iMax2;
                i17 = iMax7;
                i18 = iCombineMeasuredStates2;
                childrenSkipCount++;
                mode2 = i12;
                f = f5;
                virtualChildCount = i13;
                z4 = z2;
            }
            i13 = virtualChildCount;
            z2 = z4;
            i16 = i19;
            i12 = mode2;
            childrenSkipCount++;
            mode2 = i12;
            f = f5;
            virtualChildCount = i13;
            z4 = z2;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.mBaselineAligned = z2;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(@GravityInt int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.mUseLargestChild = z2;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
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
}
