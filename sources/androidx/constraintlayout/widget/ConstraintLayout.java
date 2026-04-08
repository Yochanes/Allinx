package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.engagelab.privates.common.observer.MTObservable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.aztec.encoder.Encoder;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static SharedValues sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<ValueModifier> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C14161 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22624a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f22624a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22624a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22624a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22624a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class Measurer implements BasicMeasure.Measurer {

        /* JADX INFO: renamed from: a */
        public final ConstraintLayout f22695a;

        /* JADX INFO: renamed from: b */
        public int f22696b;

        /* JADX INFO: renamed from: c */
        public int f22697c;

        /* JADX INFO: renamed from: d */
        public int f22698d;

        /* JADX INFO: renamed from: e */
        public int f22699e;

        /* JADX INFO: renamed from: f */
        public int f22700f;

        /* JADX INFO: renamed from: g */
        public int f22701g;

        public Measurer(ConstraintLayout constraintLayout) {
            this.f22695a = constraintLayout;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m7335c(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        /* JADX INFO: renamed from: a */
        public final void mo6771a() {
            ConstraintLayout constraintLayout = this.f22695a;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.f22867b != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.f22867b.getLayoutParams();
                        ConstraintWidget constraintWidget = layoutParams2.f22684q0;
                        constraintWidget.f21920j0 = 0;
                        ConstraintWidget constraintWidget2 = layoutParams.f22684q0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f21896V[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f21949a;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.m7083W(constraintWidget.m7099v());
                        }
                        ConstraintWidget constraintWidget3 = layoutParams.f22684q0;
                        if (constraintWidget3.f21896V[1] != dimensionBehaviour2) {
                            constraintWidget3.m7078R(layoutParams2.f22684q0.m7095p());
                        }
                        layoutParams2.f22684q0.f21920j0 = 8;
                    }
                }
            }
            int size = ConstraintLayout.access$200(constraintLayout).size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) ConstraintLayout.access$200(constraintLayout).get(i2)).getClass();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01be  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo6772b(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iOrdinal;
            int iMakeMeasureSpec3;
            ConstraintWidgetContainer constraintWidgetContainer;
            int baseline;
            int iMax;
            int iMax2;
            ConstraintLayout constraintLayout;
            boolean z2;
            int i;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f21920j0 == 8 && !constraintWidget.f21881G) {
                measure.f22048e = 0;
                measure.f22049f = 0;
                measure.f22050g = 0;
                return;
            }
            if (constraintWidget.f21897W == null) {
                return;
            }
            ConstraintLayout constraintLayout2 = ConstraintLayout.this;
            if (ConstraintLayout.access$000(constraintLayout2) != null) {
                ConstraintLayout.access$000(constraintLayout2).getClass();
                System.nanoTime();
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f22044a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f22045b;
            int i2 = measure.f22046c;
            int i3 = measure.f22047d;
            int i4 = this.f22696b + this.f22697c;
            int i5 = this.f22698d;
            View view = (View) constraintWidget.f21918i0;
            int iOrdinal2 = dimensionBehaviour.ordinal();
            ConstraintAnchor constraintAnchor = constraintWidget.f21887M;
            ConstraintAnchor constraintAnchor2 = constraintWidget.f21885K;
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Ints.MAX_POWER_OF_TWO);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f22700f, i5, -2);
            } else {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        int i6 = this.f22700f;
                        int i7 = constraintAnchor2 != null ? constraintAnchor2.f21863g : 0;
                        if (constraintAnchor != null) {
                            i7 += constraintAnchor.f21863g;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, i5 + i7, -1);
                    }
                    iOrdinal = dimensionBehaviour2.ordinal();
                    if (iOrdinal != 0) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i3, Ints.MAX_POWER_OF_TWO);
                    } else if (iOrdinal == 1) {
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f22701g, i4, -2);
                    } else if (iOrdinal == 2) {
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f22701g, i4, -2);
                        boolean z3 = constraintWidget.f21939t == 1;
                        int i8 = measure.f22053j;
                        if (i8 == 1 || i8 == 2) {
                            boolean z4 = view.getMeasuredWidth() == constraintWidget.m7099v();
                            if (measure.f22053j == 2 || !z3 || ((z3 && z4) || (view instanceof Placeholder) || constraintWidget.mo7043G())) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(constraintWidget.m7095p(), Ints.MAX_POWER_OF_TWO);
                            }
                        }
                    } else if (iOrdinal != 3) {
                        iMakeMeasureSpec3 = 0;
                    } else {
                        int i9 = this.f22701g;
                        int i10 = constraintAnchor2 != null ? constraintWidget.f21886L.f21863g : 0;
                        if (constraintAnchor != null) {
                            i10 += constraintWidget.f21888N.f21863g;
                        }
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i9, i4 + i10, -1);
                    }
                    constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.f21897W;
                    if (constraintWidgetContainer == null && Optimizer.m7125b(ConstraintLayout.access$100(constraintLayout2), 256) && view.getMeasuredWidth() == constraintWidget.m7099v() && view.getMeasuredWidth() < constraintWidgetContainer.m7099v() && view.getMeasuredHeight() == constraintWidget.m7095p() && view.getMeasuredHeight() < constraintWidgetContainer.m7095p() && view.getBaseline() == constraintWidget.f21908d0 && !constraintWidget.m7069E() && m7335c(constraintWidget.f21883I, iMakeMeasureSpec2, constraintWidget.m7099v()) && m7335c(constraintWidget.f21884J, iMakeMeasureSpec3, constraintWidget.m7095p())) {
                        measure.f22048e = constraintWidget.m7099v();
                        measure.f22049f = constraintWidget.m7095p();
                        measure.f22050g = constraintWidget.f21908d0;
                        return;
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f21951c;
                    boolean z5 = dimensionBehaviour != dimensionBehaviour3;
                    boolean z6 = dimensionBehaviour2 != dimensionBehaviour3;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f21952d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f21949a;
                    boolean z7 = dimensionBehaviour2 != dimensionBehaviour4 || dimensionBehaviour2 == dimensionBehaviour5;
                    boolean z8 = dimensionBehaviour != dimensionBehaviour4 || dimensionBehaviour == dimensionBehaviour5;
                    boolean z9 = !z5 && constraintWidget.f21900Z > 0.0f;
                    boolean z10 = !z6 && constraintWidget.f21900Z > 0.0f;
                    if (view != null) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int i11 = measure.f22053j;
                    if (i11 != 1 && i11 != 2 && z5 && constraintWidget.f21937s == 0 && z6 && constraintWidget.f21939t == 0) {
                        constraintLayout = constraintLayout2;
                        iMax2 = 0;
                        i = -1;
                        z2 = false;
                        baseline = 0;
                        iMax = 0;
                    } else {
                        if ((view instanceof VirtualLayout) && (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                            ((VirtualLayout) view).mo7182r((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget, iMakeMeasureSpec2, iMakeMeasureSpec3);
                        } else {
                            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                        }
                        constraintWidget.f21883I = iMakeMeasureSpec2;
                        constraintWidget.f21884J = iMakeMeasureSpec3;
                        constraintWidget.f21913g = false;
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        int i12 = constraintWidget.f21943v;
                        iMax = i12 > 0 ? Math.max(i12, measuredWidth) : measuredWidth;
                        int i13 = constraintWidget.f21944w;
                        if (i13 > 0) {
                            iMax = Math.min(i13, iMax);
                        }
                        int i14 = constraintWidget.f21946y;
                        iMax2 = i14 > 0 ? Math.max(i14, measuredHeight) : measuredHeight;
                        constraintLayout = constraintLayout2;
                        int i15 = constraintWidget.f21947z;
                        if (i15 > 0) {
                            iMax2 = Math.min(i15, iMax2);
                        }
                        boolean z11 = z10;
                        if (!Optimizer.m7125b(ConstraintLayout.access$100(constraintLayout), 1)) {
                            if (z9 && z7) {
                                iMax = (int) ((iMax2 * constraintWidget.f21900Z) + 0.5f);
                            } else if (z11 && z8) {
                                iMax2 = (int) ((iMax / constraintWidget.f21900Z) + 0.5f);
                            }
                        }
                        if (measuredWidth == iMax && measuredHeight == iMax2) {
                            i = -1;
                            z2 = false;
                        } else {
                            if (measuredWidth != iMax) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, Ints.MAX_POWER_OF_TWO);
                            }
                            if (measuredHeight != iMax2) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, Ints.MAX_POWER_OF_TWO);
                            }
                            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                            constraintWidget.f21883I = iMakeMeasureSpec2;
                            constraintWidget.f21884J = iMakeMeasureSpec3;
                            z2 = false;
                            constraintWidget.f21913g = false;
                            iMax = view.getMeasuredWidth();
                            iMax2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            i = -1;
                        }
                    }
                    boolean z12 = baseline != i ? true : z2;
                    measure.f22052i = (iMax == measure.f22046c && iMax2 == measure.f22047d) ? z2 : true;
                    if (layoutParams.f22656c0) {
                        z12 = true;
                    }
                    if (z12 && baseline != -1 && constraintWidget.f21908d0 != baseline) {
                        measure.f22052i = true;
                    }
                    measure.f22048e = iMax;
                    measure.f22049f = iMax2;
                    measure.f22051h = z12;
                    measure.f22050g = baseline;
                    if (ConstraintLayout.access$000(constraintLayout) != null) {
                        System.nanoTime();
                        ConstraintLayout.access$000(constraintLayout).getClass();
                        return;
                    }
                    return;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f22700f, i5, -2);
                boolean z13 = constraintWidget.f21937s == 1;
                int i16 = measure.f22053j;
                if (i16 == 1 || i16 == 2) {
                    boolean z14 = view.getMeasuredHeight() == constraintWidget.m7095p();
                    if (measure.f22053j == 2 || !z13 || ((z13 && z14) || (view instanceof Placeholder) || constraintWidget.mo7042F())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.m7099v(), Ints.MAX_POWER_OF_TWO);
                    }
                }
            }
            iMakeMeasureSpec2 = iMakeMeasureSpec;
            iOrdinal = dimensionBehaviour2.ordinal();
            if (iOrdinal != 0) {
            }
            constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.f21897W;
            if (constraintWidgetContainer == null) {
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour32 = ConstraintWidget.DimensionBehaviour.f21951c;
            if (dimensionBehaviour != dimensionBehaviour32) {
            }
            if (dimensionBehaviour2 != dimensionBehaviour32) {
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour42 = ConstraintWidget.DimensionBehaviour.f21952d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour52 = ConstraintWidget.DimensionBehaviour.f21949a;
            if (dimensionBehaviour2 != dimensionBehaviour42) {
            }
            if (dimensionBehaviour != dimensionBehaviour42) {
            }
            if (z5) {
            }
            if (z6) {
            }
            if (view != null) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ValueModifier {
        /* JADX INFO: renamed from: a */
        boolean m7336a();
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m7332a(attributeSet, 0);
    }

    public static /* synthetic */ Metrics access$000(ConstraintLayout constraintLayout) {
        return constraintLayout.mMetrics;
    }

    public static /* synthetic */ int access$100(ConstraintLayout constraintLayout) {
        return constraintLayout.mOptimizationLevel;
    }

    public static /* synthetic */ ArrayList access$200(ConstraintLayout constraintLayout) {
        return constraintLayout.mConstraintHelpers;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static SharedValues getSharedValues() {
        if (sSharedValues == null) {
            SharedValues sharedValues = new SharedValues();
            new SparseIntArray();
            sharedValues.f22895a = new HashMap();
            sSharedValues = sharedValues;
        }
        return sSharedValues;
    }

    /* JADX INFO: renamed from: a */
    public final void m7332a(AttributeSet attributeSet, int i) {
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.f21918i0 = this;
        Measurer measurer = this.mMeasurer;
        constraintWidgetContainer.f21975z0 = measurer;
        constraintWidgetContainer.f21973x0.f22061f = measurer;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f22870b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.m7354k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
        constraintWidgetContainer2.f21963J0 = this.mOptimizationLevel;
        LinearSystem.f21143q = constraintWidgetContainer2.m7109e0(512);
    }

    public void addValueModifier(ValueModifier valueModifier) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(valueModifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyConstraintsFromLayoutParams(boolean z2, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintLayout constraintLayout;
        ConstraintAnchor.Type type;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor.Type type2;
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor.Type type5;
        int i;
        ConstraintAnchor.Type type6;
        ConstraintWidget constraintWidget4;
        ConstraintAnchor.Type type7;
        ConstraintAnchor.Type type8;
        int i2;
        ConstraintAnchor.Type type9;
        ConstraintWidget constraintWidget5;
        int i3;
        LayoutParams layoutParams2;
        ConstraintWidget constraintWidget6;
        ConstraintAnchor.Type type10;
        float f;
        int i4;
        ConstraintWidget constraintWidget7 = constraintWidget;
        layoutParams.m7334a();
        constraintWidget7.f21920j0 = view.getVisibility();
        if (layoutParams.f22662f0) {
            constraintWidget7.f21881G = true;
            constraintWidget7.f21920j0 = 8;
        }
        constraintWidget7.f21918i0 = view;
        if (view instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) view).mo7181m(constraintWidget7, constraintLayout.mLayoutWidget.f21954A0);
        } else {
            constraintLayout = this;
        }
        if (layoutParams.f22658d0) {
            androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget7;
            int i5 = layoutParams.f22678n0;
            int i6 = layoutParams.f22680o0;
            float f2 = layoutParams.f22682p0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    guideline.f22020v0 = f2;
                    guideline.f22021w0 = -1;
                    guideline.f22022x0 = -1;
                    return;
                }
                return;
            }
            if (i5 != -1) {
                if (i5 > -1) {
                    guideline.f22020v0 = -1.0f;
                    guideline.f22021w0 = i5;
                    guideline.f22022x0 = -1;
                    return;
                }
                return;
            }
            if (i6 == -1 || i6 <= -1) {
                return;
            }
            guideline.f22020v0 = -1.0f;
            guideline.f22021w0 = -1;
            guideline.f22022x0 = i6;
            return;
        }
        int i7 = layoutParams.f22664g0;
        int i8 = layoutParams.f22666h0;
        int i9 = layoutParams.f22668i0;
        int i10 = layoutParams.f22670j0;
        int i11 = layoutParams.f22672k0;
        int i12 = layoutParams.f22674l0;
        float f3 = layoutParams.f22676m0;
        int i13 = layoutParams.f22681p;
        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.f21868c;
        ConstraintAnchor.Type type12 = ConstraintAnchor.Type.f21866a;
        ConstraintAnchor.Type type13 = ConstraintAnchor.Type.f21869d;
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.f21867b;
        if (i13 != -1) {
            ConstraintWidget constraintWidget8 = sparseArray.get(i13);
            if (constraintWidget8 != null) {
                float f4 = layoutParams.f22685r;
                int i14 = layoutParams.f22683q;
                ConstraintAnchor.Type type15 = ConstraintAnchor.Type.f21871g;
                constraintWidget.m7065A(type15, constraintWidget8, type15, i14, 0);
                constraintWidget7 = constraintWidget;
                constraintWidget7.f21879E = f4;
            }
            constraintWidget6 = constraintWidget7;
            layoutParams2 = layoutParams;
            type5 = type11;
            type4 = type12;
            type10 = type13;
            type9 = type14;
        } else {
            if (i7 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i7);
                if (constraintWidget9 != null) {
                    type = type12;
                    constraintWidget7.m7065A(type, constraintWidget9, type12, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
                } else {
                    type = type12;
                }
            } else {
                type = type12;
                if (i8 != -1 && (constraintWidget2 = sparseArray.get(i8)) != null) {
                    constraintWidget.m7065A(type, constraintWidget2, type11, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
                    type2 = type;
                    type3 = type11;
                }
                if (i9 == -1) {
                    ConstraintWidget constraintWidget10 = sparseArray.get(i9);
                    if (constraintWidget10 != null) {
                        constraintWidget.m7065A(type3, constraintWidget10, type2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
                    }
                    type4 = type2;
                } else {
                    type4 = type2;
                    if (i10 != -1 && (constraintWidget3 = sparseArray.get(i10)) != null) {
                        constraintWidget.m7065A(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
                    }
                }
                type5 = type3;
                i = layoutParams.f22667i;
                if (i == -1) {
                    ConstraintWidget constraintWidget11 = sparseArray.get(i);
                    if (constraintWidget11 != null) {
                        type6 = type14;
                        constraintWidget.m7065A(type6, constraintWidget11, type14, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f22691x);
                    } else {
                        type6 = type14;
                    }
                } else {
                    type6 = type14;
                    int i15 = layoutParams.f22669j;
                    if (i15 != -1 && (constraintWidget4 = sparseArray.get(i15)) != null) {
                        constraintWidget.m7065A(type6, constraintWidget4, type13, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f22691x);
                        type7 = type6;
                        type8 = type13;
                    }
                    i2 = layoutParams.f22671k;
                    if (i2 != -1) {
                        ConstraintWidget constraintWidget12 = sparseArray.get(i2);
                        if (constraintWidget12 != null) {
                            constraintWidget.m7065A(type8, constraintWidget12, type7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f22693z);
                        }
                        type9 = type7;
                    } else {
                        type9 = type7;
                        int i16 = layoutParams.f22673l;
                        if (i16 != -1 && (constraintWidget5 = sparseArray.get(i16)) != null) {
                            constraintWidget.m7065A(type8, constraintWidget5, type8, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f22693z);
                        }
                    }
                    ConstraintAnchor.Type type16 = type8;
                    i3 = layoutParams.f22675m;
                    if (i3 != -1) {
                        layoutParams2 = layoutParams;
                        constraintLayout.m7333b(constraintWidget, layoutParams2, sparseArray, i3, ConstraintAnchor.Type.f21870f);
                    } else {
                        layoutParams2 = layoutParams;
                        int i17 = layoutParams2.f22677n;
                        if (i17 != -1) {
                            m7333b(constraintWidget, layoutParams2, sparseArray, i17, type9);
                        } else {
                            int i18 = layoutParams2.f22679o;
                            if (i18 != -1) {
                                m7333b(constraintWidget, layoutParams2, sparseArray, i18, type16);
                                constraintWidget6 = constraintWidget;
                                type10 = type16;
                            }
                            if (f3 >= 0.0f) {
                                constraintWidget6.f21914g0 = f3;
                            }
                            f = layoutParams2.f22630F;
                            if (f >= 0.0f) {
                                constraintWidget6.f21916h0 = f;
                            }
                        }
                    }
                    constraintWidget6 = constraintWidget;
                    type10 = type16;
                    if (f3 >= 0.0f) {
                    }
                    f = layoutParams2.f22630F;
                    if (f >= 0.0f) {
                    }
                }
                type7 = type6;
                type8 = type13;
                i2 = layoutParams.f22671k;
                if (i2 != -1) {
                }
                ConstraintAnchor.Type type162 = type8;
                i3 = layoutParams.f22675m;
                if (i3 != -1) {
                }
                constraintWidget6 = constraintWidget;
                type10 = type162;
                if (f3 >= 0.0f) {
                }
                f = layoutParams2.f22630F;
                if (f >= 0.0f) {
                }
            }
            type2 = type;
            type3 = type11;
            if (i9 == -1) {
            }
            type5 = type3;
            i = layoutParams.f22667i;
            if (i == -1) {
            }
            type7 = type6;
            type8 = type13;
            i2 = layoutParams.f22671k;
            if (i2 != -1) {
            }
            ConstraintAnchor.Type type1622 = type8;
            i3 = layoutParams.f22675m;
            if (i3 != -1) {
            }
            constraintWidget6 = constraintWidget;
            type10 = type1622;
            if (f3 >= 0.0f) {
            }
            f = layoutParams2.f22630F;
            if (f >= 0.0f) {
            }
        }
        if (z2 && ((i4 = layoutParams2.f22644T) != -1 || layoutParams2.f22645U != -1)) {
            int i19 = layoutParams2.f22645U;
            constraintWidget6.f21904b0 = i4;
            constraintWidget6.f21906c0 = i19;
        }
        boolean z3 = layoutParams2.f22652a0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f21950b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f21949a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f21952d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f21951c;
        if (z3) {
            constraintWidget6.m7079S(dimensionBehaviour2);
            constraintWidget6.m7083W(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                constraintWidget6.m7079S(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.f22647W) {
                constraintWidget6.m7079S(dimensionBehaviour4);
            } else {
                constraintWidget6.m7079S(dimensionBehaviour3);
            }
            constraintWidget6.mo7093n(type4).f21863g = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            constraintWidget6.mo7093n(type5).f21863g = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            constraintWidget6.m7079S(dimensionBehaviour4);
            constraintWidget6.m7083W(0);
        }
        if (layoutParams2.f22654b0) {
            constraintWidget6.m7081U(dimensionBehaviour2);
            constraintWidget6.m7078R(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                constraintWidget6.m7081U(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.f22648X) {
                constraintWidget6.m7081U(dimensionBehaviour4);
            } else {
                constraintWidget6.m7081U(dimensionBehaviour3);
            }
            constraintWidget6.mo7093n(type9).f21863g = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            constraintWidget6.mo7093n(type10).f21863g = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            constraintWidget6.m7081U(dimensionBehaviour4);
            constraintWidget6.m7078R(0);
        }
        constraintWidget6.m7075O(layoutParams2.f22631G);
        float f5 = layoutParams2.f22632H;
        float[] fArr = constraintWidget6.f21930o0;
        fArr[0] = f5;
        fArr[1] = layoutParams2.f22633I;
        constraintWidget6.f21926m0 = layoutParams2.f22634J;
        constraintWidget6.f21928n0 = layoutParams2.f22635K;
        int i20 = layoutParams2.f22650Z;
        if (i20 >= 0 && i20 <= 3) {
            constraintWidget6.f21935r = i20;
        }
        constraintWidget6.m7080T(layoutParams2.f22642R, layoutParams2.f22636L, layoutParams2.f22638N, layoutParams2.f22640P);
        constraintWidget6.m7082V(layoutParams2.f22643S, layoutParams2.f22637M, layoutParams2.f22639O, layoutParams2.f22641Q);
    }

    /* JADX INFO: renamed from: b */
    public final void m7333b(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = (ConstraintWidget) sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.f22656c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f21870f;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.f22656c0 = true;
            layoutParams2.f22684q0.f21880F = true;
        }
        constraintWidget.mo7093n(type2).m7050b(constraintWidget2.mo7093n(type), layoutParams.f22628D, layoutParams.f22627C, true);
        constraintWidget.f21880F = true;
        constraintWidget.mo7093n(ConstraintAnchor.Type.f21867b).m7058j();
        constraintWidget.mo7093n(ConstraintAnchor.Type.f21869d).m7058j();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).mo7193o(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i, int i2) {
        boolean zM7336a = false;
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        for (ValueModifier valueModifier : this.mModifiers) {
            Iterator it = this.mLayoutWidget.f22040v0.iterator();
            while (it.hasNext()) {
                View view = (View) ((ConstraintWidget) it.next()).f21918i0;
                view.getId();
                zM7336a |= valueModifier.m7336a();
            }
        }
        return zM7336a;
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.f21955B0 = metrics;
        constraintWidgetContainer.f21956C0.getClass();
        LinearSystem.f21144r = metrics;
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f21963J0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f21921k == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f21921k = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f21921k = "parent";
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        if (constraintWidgetContainer.f21924l0 == null) {
            constraintWidgetContainer.f21924l0 = constraintWidgetContainer.f21921k;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f21924l0);
        }
        for (ConstraintWidget constraintWidget : this.mLayoutWidget.f22040v0) {
            View view = (View) constraintWidget.f21918i0;
            if (view != null) {
                if (constraintWidget.f21921k == null && (id = view.getId()) != -1) {
                    constraintWidget.f21921k = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.f21924l0 == null) {
                    constraintWidget.f21924l0 = constraintWidget.f21921k;
                    Log.v(TAG, " setDebugName " + constraintWidget.f21924l0);
                }
            }
        }
        this.mLayoutWidget.mo7098s(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f22684q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f22684q0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f22684q0;
            if ((childAt.getVisibility() != 8 || layoutParams.f22658d0 || layoutParams.f22660e0 || zIsInEditMode) && !layoutParams.f22662f0) {
                int iM7100w = constraintWidget.m7100w();
                int iM7101x = constraintWidget.m7101x();
                int iM7099v = constraintWidget.m7099v() + iM7100w;
                int iM7095p = constraintWidget.m7095p() + iM7101x;
                childAt.layout(iM7100w, iM7101x, iM7099v, iM7095p);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM7100w, iM7101x, iM7099v, iM7095p);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo7192n();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z2;
        ConstraintWidget constraintWidget;
        if (this.mMetrics != null) {
            System.nanoTime();
            Metrics metrics = this.mMetrics;
            getChildCount();
            metrics.getClass();
            this.mMetrics.getClass();
        }
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i2);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        int i3 = 0;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i4++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.f21954A0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (getChildAt(i5).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (z2) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i6 = 0; i6 < childCount3; i6++) {
                    ConstraintWidget viewWidget = getViewWidget(getChildAt(i6));
                    if (viewWidget != null) {
                        viewWidget.mo7070H();
                    }
                }
                if (zIsInEditMode) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        View childAt = getChildAt(i7);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id == 0) {
                                constraintWidget = this.mLayoutWidget;
                            } else {
                                View viewFindViewById = this.mChildrenByIds.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                constraintWidget = viewFindViewById == this ? this.mLayoutWidget : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).f22684q0;
                            }
                            constraintWidget.f21924l0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                            this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                ConstraintSet constraintSet = this.mConstraintSet;
                if (constraintSet != null) {
                    constraintSet.m7350d(this);
                }
                this.mLayoutWidget.f22040v0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i9 = 0;
                    while (i9 < size) {
                        ConstraintHelper constraintHelper = this.mConstraintHelpers.get(i9);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f22620g);
                        }
                        HelperWidget helperWidget = constraintHelper.f22618d;
                        if (helperWidget != null) {
                            helperWidget.mo7120a();
                            for (int i10 = i3; i10 < constraintHelper.f22616b; i10++) {
                                int i11 = constraintHelper.f22615a[i10];
                                View viewById = getViewById(i11);
                                if (viewById == null) {
                                    Integer numValueOf = Integer.valueOf(i11);
                                    HashMap map = constraintHelper.f22623n;
                                    String str = (String) map.get(numValueOf);
                                    int iM7327h = constraintHelper.m7327h(this, str);
                                    if (iM7327h != 0) {
                                        constraintHelper.f22615a[i10] = iM7327h;
                                        map.put(Integer.valueOf(iM7327h), str);
                                        viewById = getViewById(iM7327h);
                                    }
                                }
                                if (viewById != null) {
                                    constraintHelper.f22618d.mo7121b(getViewWidget(viewById));
                                }
                            }
                            constraintHelper.f22618d.mo7122c();
                        }
                        i9++;
                        i3 = 0;
                    }
                }
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt3 = getChildAt(i12);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f22866a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f22868c);
                        }
                        View viewFindViewById2 = findViewById(placeholder.f22866a);
                        placeholder.f22867b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((LayoutParams) viewFindViewById2.getLayoutParams()).f22662f0 = true;
                            placeholder.f22867b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt4 = getChildAt(i13);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt5 = getChildAt(i14);
                    ConstraintWidget viewWidget2 = getViewWidget(childAt5);
                    if (viewWidget2 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        this.mLayoutWidget.m7127b(viewWidget2);
                        applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z2) {
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
                constraintWidgetContainer.f21972w0.m7130c(constraintWidgetContainer);
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
        Metrics metrics2 = this.mMetrics;
        constraintWidgetContainer2.f21955B0 = metrics2;
        constraintWidgetContainer2.f21956C0.getClass();
        LinearSystem.f21144r = metrics2;
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int iM7099v = this.mLayoutWidget.m7099v();
        int iM7095p = this.mLayoutWidget.m7095p();
        ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, iM7099v, iM7095p, constraintWidgetContainer3.f21964K0, constraintWidgetContainer3.f21965L0);
        if (this.mMetrics != null) {
            System.nanoTime();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.Guideline guideline = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.f22684q0 = guideline;
            layoutParams.f22658d0 = true;
            guideline.m7119a0(layoutParams.f22646V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m7331q();
            ((LayoutParams) view.getLayoutParams()).f22660e0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.f22040v0.remove(viewWidget);
        viewWidget.mo7070H();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
    }

    public void removeValueModifier(ValueModifier valueModifier) {
        if (valueModifier == null) {
            return;
        }
        this.mModifiers.remove(valueModifier);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z2, boolean z3) {
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.f22699e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + measurer.f22698d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z2) {
            iMin |= 16777216;
        }
        if (z3) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        Measurer measurer = this.mMeasurer;
        measurer.f22696b = iMax;
        measurer.f22697c = iMax2;
        measurer.f22698d = paddingWidth;
        measurer.f22699e = i4;
        measurer.f22700f = i2;
        measurer.f22701g = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            iMax3 = iMax4;
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i5, mode2, i6);
        constraintWidgetContainer.m7108c0(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.f21963J0 = i;
        LinearSystem.f21143q = constraintWidgetContainer.m7109e0(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i5;
        int i6;
        Measurer measurer = this.mMeasurer;
        int i7 = measurer.f22699e;
        int i8 = measurer.f22698d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f21949a;
        int childCount = getChildCount();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f21950b;
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    dimensionBehaviour = dimensionBehaviour2;
                } else {
                    i2 = Math.min(this.mMaxWidth - i8, i2);
                    dimensionBehaviour = dimensionBehaviour2;
                    if (i3 != Integer.MIN_VALUE) {
                        if (i3 != 0) {
                            if (i3 == 1073741824) {
                                i4 = Math.min(this.mMaxHeight - i7, i4);
                            }
                            if (i2 != constraintWidgetContainer.m7099v() || i4 != constraintWidgetContainer.m7095p()) {
                                constraintWidgetContainer.f21973x0.f22058c = true;
                            }
                            constraintWidgetContainer.f21904b0 = 0;
                            constraintWidgetContainer.f21906c0 = 0;
                            int i9 = this.mMaxWidth - i8;
                            int[] iArr = constraintWidgetContainer.f21878D;
                            iArr[0] = i9;
                            iArr[1] = this.mMaxHeight - i7;
                            constraintWidgetContainer.f21910e0 = 0;
                            constraintWidgetContainer.f21912f0 = 0;
                            constraintWidgetContainer.m7079S(dimensionBehaviour);
                            constraintWidgetContainer.m7083W(i2);
                            constraintWidgetContainer.m7081U(dimensionBehaviour2);
                            constraintWidgetContainer.m7078R(i4);
                            i5 = this.mMinWidth - i8;
                            if (i5 < 0) {
                                constraintWidgetContainer.f21910e0 = 0;
                            } else {
                                constraintWidgetContainer.f21910e0 = i5;
                            }
                            i6 = this.mMinHeight - i7;
                            if (i6 < 0) {
                                constraintWidgetContainer.f21912f0 = 0;
                                return;
                            } else {
                                constraintWidgetContainer.f21912f0 = i6;
                                return;
                            }
                        }
                        if (childCount == 0) {
                            i4 = Math.max(0, this.mMinHeight);
                        } else {
                            dimensionBehaviour2 = dimensionBehaviour3;
                        }
                        i4 = 0;
                        if (i2 != constraintWidgetContainer.m7099v()) {
                            constraintWidgetContainer.f21973x0.f22058c = true;
                        }
                        constraintWidgetContainer.f21904b0 = 0;
                        constraintWidgetContainer.f21906c0 = 0;
                        int i92 = this.mMaxWidth - i8;
                        int[] iArr2 = constraintWidgetContainer.f21878D;
                        iArr2[0] = i92;
                        iArr2[1] = this.mMaxHeight - i7;
                        constraintWidgetContainer.f21910e0 = 0;
                        constraintWidgetContainer.f21912f0 = 0;
                        constraintWidgetContainer.m7079S(dimensionBehaviour);
                        constraintWidgetContainer.m7083W(i2);
                        constraintWidgetContainer.m7081U(dimensionBehaviour2);
                        constraintWidgetContainer.m7078R(i4);
                        i5 = this.mMinWidth - i8;
                        if (i5 < 0) {
                        }
                        i6 = this.mMinHeight - i7;
                        if (i6 < 0) {
                        }
                    } else if (childCount == 0) {
                        i4 = Math.max(0, this.mMinHeight);
                    }
                    dimensionBehaviour2 = dimensionBehaviour3;
                    if (i2 != constraintWidgetContainer.m7099v()) {
                    }
                    constraintWidgetContainer.f21904b0 = 0;
                    constraintWidgetContainer.f21906c0 = 0;
                    int i922 = this.mMaxWidth - i8;
                    int[] iArr22 = constraintWidgetContainer.f21878D;
                    iArr22[0] = i922;
                    iArr22[1] = this.mMaxHeight - i7;
                    constraintWidgetContainer.f21910e0 = 0;
                    constraintWidgetContainer.f21912f0 = 0;
                    constraintWidgetContainer.m7079S(dimensionBehaviour);
                    constraintWidgetContainer.m7083W(i2);
                    constraintWidgetContainer.m7081U(dimensionBehaviour2);
                    constraintWidgetContainer.m7078R(i4);
                    i5 = this.mMinWidth - i8;
                    if (i5 < 0) {
                    }
                    i6 = this.mMinHeight - i7;
                    if (i6 < 0) {
                    }
                }
            } else if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            } else {
                dimensionBehaviour = dimensionBehaviour3;
            }
            i2 = 0;
            if (i3 != Integer.MIN_VALUE) {
            }
            dimensionBehaviour2 = dimensionBehaviour3;
            if (i2 != constraintWidgetContainer.m7099v()) {
            }
            constraintWidgetContainer.f21904b0 = 0;
            constraintWidgetContainer.f21906c0 = 0;
            int i9222 = this.mMaxWidth - i8;
            int[] iArr222 = constraintWidgetContainer.f21878D;
            iArr222[0] = i9222;
            iArr222[1] = this.mMaxHeight - i7;
            constraintWidgetContainer.f21910e0 = 0;
            constraintWidgetContainer.f21912f0 = 0;
            constraintWidgetContainer.m7079S(dimensionBehaviour);
            constraintWidgetContainer.m7083W(i2);
            constraintWidgetContainer.m7081U(dimensionBehaviour2);
            constraintWidgetContainer.m7078R(i4);
            i5 = this.mMinWidth - i8;
            if (i5 < 0) {
            }
            i6 = this.mMinHeight - i7;
            if (i6 < 0) {
            }
        } else if (childCount == 0) {
            i2 = Math.max(0, this.mMinWidth);
        }
        dimensionBehaviour = dimensionBehaviour3;
        if (i3 != Integer.MIN_VALUE) {
        }
        dimensionBehaviour2 = dimensionBehaviour3;
        if (i2 != constraintWidgetContainer.m7099v()) {
        }
        constraintWidgetContainer.f21904b0 = 0;
        constraintWidgetContainer.f21906c0 = 0;
        int i92222 = this.mMaxWidth - i8;
        int[] iArr2222 = constraintWidgetContainer.f21878D;
        iArr2222[0] = i92222;
        iArr2222[1] = this.mMaxHeight - i7;
        constraintWidgetContainer.f21910e0 = 0;
        constraintWidgetContainer.f21912f0 = 0;
        constraintWidgetContainer.m7079S(dimensionBehaviour);
        constraintWidgetContainer.m7083W(i2);
        constraintWidgetContainer.m7081U(dimensionBehaviour2);
        constraintWidgetContainer.m7078R(i4);
        i5 = this.mMinWidth - i8;
        if (i5 < 0) {
        }
        i6 = this.mMinHeight - i7;
        if (i6 < 0) {
        }
    }

    public void setState(int i, int i2, int i3) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.m7338b(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m7332a(attributeSet, i);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public int f22625A;

        /* JADX INFO: renamed from: B */
        public int f22626B;

        /* JADX INFO: renamed from: C */
        public final int f22627C;

        /* JADX INFO: renamed from: D */
        public final int f22628D;

        /* JADX INFO: renamed from: E */
        public float f22629E;

        /* JADX INFO: renamed from: F */
        public float f22630F;

        /* JADX INFO: renamed from: G */
        public String f22631G;

        /* JADX INFO: renamed from: H */
        public float f22632H;

        /* JADX INFO: renamed from: I */
        public float f22633I;

        /* JADX INFO: renamed from: J */
        public int f22634J;

        /* JADX INFO: renamed from: K */
        public int f22635K;

        /* JADX INFO: renamed from: L */
        public int f22636L;

        /* JADX INFO: renamed from: M */
        public int f22637M;

        /* JADX INFO: renamed from: N */
        public int f22638N;

        /* JADX INFO: renamed from: O */
        public int f22639O;

        /* JADX INFO: renamed from: P */
        public int f22640P;

        /* JADX INFO: renamed from: Q */
        public int f22641Q;

        /* JADX INFO: renamed from: R */
        public float f22642R;

        /* JADX INFO: renamed from: S */
        public float f22643S;

        /* JADX INFO: renamed from: T */
        public int f22644T;

        /* JADX INFO: renamed from: U */
        public int f22645U;

        /* JADX INFO: renamed from: V */
        public int f22646V;

        /* JADX INFO: renamed from: W */
        public boolean f22647W;

        /* JADX INFO: renamed from: X */
        public boolean f22648X;

        /* JADX INFO: renamed from: Y */
        public String f22649Y;

        /* JADX INFO: renamed from: Z */
        public int f22650Z;

        /* JADX INFO: renamed from: a */
        public int f22651a;

        /* JADX INFO: renamed from: a0 */
        public boolean f22652a0;

        /* JADX INFO: renamed from: b */
        public int f22653b;

        /* JADX INFO: renamed from: b0 */
        public boolean f22654b0;

        /* JADX INFO: renamed from: c */
        public float f22655c;

        /* JADX INFO: renamed from: c0 */
        public boolean f22656c0;

        /* JADX INFO: renamed from: d */
        public final boolean f22657d;

        /* JADX INFO: renamed from: d0 */
        public boolean f22658d0;

        /* JADX INFO: renamed from: e */
        public int f22659e;

        /* JADX INFO: renamed from: e0 */
        public boolean f22660e0;

        /* JADX INFO: renamed from: f */
        public int f22661f;

        /* JADX INFO: renamed from: f0 */
        public boolean f22662f0;

        /* JADX INFO: renamed from: g */
        public int f22663g;

        /* JADX INFO: renamed from: g0 */
        public int f22664g0;

        /* JADX INFO: renamed from: h */
        public int f22665h;

        /* JADX INFO: renamed from: h0 */
        public int f22666h0;

        /* JADX INFO: renamed from: i */
        public int f22667i;

        /* JADX INFO: renamed from: i0 */
        public int f22668i0;

        /* JADX INFO: renamed from: j */
        public int f22669j;

        /* JADX INFO: renamed from: j0 */
        public int f22670j0;

        /* JADX INFO: renamed from: k */
        public int f22671k;

        /* JADX INFO: renamed from: k0 */
        public int f22672k0;

        /* JADX INFO: renamed from: l */
        public int f22673l;

        /* JADX INFO: renamed from: l0 */
        public int f22674l0;

        /* JADX INFO: renamed from: m */
        public int f22675m;

        /* JADX INFO: renamed from: m0 */
        public float f22676m0;

        /* JADX INFO: renamed from: n */
        public int f22677n;

        /* JADX INFO: renamed from: n0 */
        public int f22678n0;

        /* JADX INFO: renamed from: o */
        public int f22679o;

        /* JADX INFO: renamed from: o0 */
        public int f22680o0;

        /* JADX INFO: renamed from: p */
        public int f22681p;

        /* JADX INFO: renamed from: p0 */
        public float f22682p0;

        /* JADX INFO: renamed from: q */
        public int f22683q;

        /* JADX INFO: renamed from: q0 */
        public ConstraintWidget f22684q0;

        /* JADX INFO: renamed from: r */
        public float f22685r;

        /* JADX INFO: renamed from: s */
        public int f22686s;

        /* JADX INFO: renamed from: t */
        public int f22687t;

        /* JADX INFO: renamed from: u */
        public int f22688u;

        /* JADX INFO: renamed from: v */
        public int f22689v;

        /* JADX INFO: renamed from: w */
        public final int f22690w;

        /* JADX INFO: renamed from: x */
        public int f22691x;

        /* JADX INFO: renamed from: y */
        public final int f22692y;

        /* JADX INFO: renamed from: z */
        public int f22693z;

        /* JADX INFO: compiled from: Proguard */
        public static class Table {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f22694a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f22694a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(MTObservable.WHAT_OBSERVER, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22651a = -1;
            this.f22653b = -1;
            this.f22655c = -1.0f;
            this.f22657d = true;
            this.f22659e = -1;
            this.f22661f = -1;
            this.f22663g = -1;
            this.f22665h = -1;
            this.f22667i = -1;
            this.f22669j = -1;
            this.f22671k = -1;
            this.f22673l = -1;
            this.f22675m = -1;
            this.f22677n = -1;
            this.f22679o = -1;
            this.f22681p = -1;
            this.f22683q = 0;
            this.f22685r = 0.0f;
            this.f22686s = -1;
            this.f22687t = -1;
            this.f22688u = -1;
            this.f22689v = -1;
            this.f22690w = Integer.MIN_VALUE;
            this.f22691x = Integer.MIN_VALUE;
            this.f22692y = Integer.MIN_VALUE;
            this.f22693z = Integer.MIN_VALUE;
            this.f22625A = Integer.MIN_VALUE;
            this.f22626B = Integer.MIN_VALUE;
            this.f22627C = Integer.MIN_VALUE;
            this.f22628D = 0;
            this.f22629E = 0.5f;
            this.f22630F = 0.5f;
            this.f22631G = null;
            this.f22632H = -1.0f;
            this.f22633I = -1.0f;
            this.f22634J = 0;
            this.f22635K = 0;
            this.f22636L = 0;
            this.f22637M = 0;
            this.f22638N = 0;
            this.f22639O = 0;
            this.f22640P = 0;
            this.f22641Q = 0;
            this.f22642R = 1.0f;
            this.f22643S = 1.0f;
            this.f22644T = -1;
            this.f22645U = -1;
            this.f22646V = -1;
            this.f22647W = false;
            this.f22648X = false;
            this.f22649Y = null;
            this.f22650Z = 0;
            this.f22652a0 = true;
            this.f22654b0 = true;
            this.f22656c0 = false;
            this.f22658d0 = false;
            this.f22660e0 = false;
            this.f22662f0 = false;
            this.f22664g0 = -1;
            this.f22666h0 = -1;
            this.f22668i0 = -1;
            this.f22670j0 = -1;
            this.f22672k0 = Integer.MIN_VALUE;
            this.f22674l0 = Integer.MIN_VALUE;
            this.f22676m0 = 0.5f;
            this.f22684q0 = new ConstraintWidget();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.f22651a = layoutParams2.f22651a;
                this.f22653b = layoutParams2.f22653b;
                this.f22655c = layoutParams2.f22655c;
                this.f22657d = layoutParams2.f22657d;
                this.f22659e = layoutParams2.f22659e;
                this.f22661f = layoutParams2.f22661f;
                this.f22663g = layoutParams2.f22663g;
                this.f22665h = layoutParams2.f22665h;
                this.f22667i = layoutParams2.f22667i;
                this.f22669j = layoutParams2.f22669j;
                this.f22671k = layoutParams2.f22671k;
                this.f22673l = layoutParams2.f22673l;
                this.f22675m = layoutParams2.f22675m;
                this.f22677n = layoutParams2.f22677n;
                this.f22679o = layoutParams2.f22679o;
                this.f22681p = layoutParams2.f22681p;
                this.f22683q = layoutParams2.f22683q;
                this.f22685r = layoutParams2.f22685r;
                this.f22686s = layoutParams2.f22686s;
                this.f22687t = layoutParams2.f22687t;
                this.f22688u = layoutParams2.f22688u;
                this.f22689v = layoutParams2.f22689v;
                this.f22690w = layoutParams2.f22690w;
                this.f22691x = layoutParams2.f22691x;
                this.f22692y = layoutParams2.f22692y;
                this.f22693z = layoutParams2.f22693z;
                this.f22625A = layoutParams2.f22625A;
                this.f22626B = layoutParams2.f22626B;
                this.f22627C = layoutParams2.f22627C;
                this.f22628D = layoutParams2.f22628D;
                this.f22629E = layoutParams2.f22629E;
                this.f22630F = layoutParams2.f22630F;
                this.f22631G = layoutParams2.f22631G;
                this.f22632H = layoutParams2.f22632H;
                this.f22633I = layoutParams2.f22633I;
                this.f22634J = layoutParams2.f22634J;
                this.f22635K = layoutParams2.f22635K;
                this.f22647W = layoutParams2.f22647W;
                this.f22648X = layoutParams2.f22648X;
                this.f22636L = layoutParams2.f22636L;
                this.f22637M = layoutParams2.f22637M;
                this.f22638N = layoutParams2.f22638N;
                this.f22640P = layoutParams2.f22640P;
                this.f22639O = layoutParams2.f22639O;
                this.f22641Q = layoutParams2.f22641Q;
                this.f22642R = layoutParams2.f22642R;
                this.f22643S = layoutParams2.f22643S;
                this.f22644T = layoutParams2.f22644T;
                this.f22645U = layoutParams2.f22645U;
                this.f22646V = layoutParams2.f22646V;
                this.f22652a0 = layoutParams2.f22652a0;
                this.f22654b0 = layoutParams2.f22654b0;
                this.f22656c0 = layoutParams2.f22656c0;
                this.f22658d0 = layoutParams2.f22658d0;
                this.f22664g0 = layoutParams2.f22664g0;
                this.f22666h0 = layoutParams2.f22666h0;
                this.f22668i0 = layoutParams2.f22668i0;
                this.f22670j0 = layoutParams2.f22670j0;
                this.f22672k0 = layoutParams2.f22672k0;
                this.f22674l0 = layoutParams2.f22674l0;
                this.f22676m0 = layoutParams2.f22676m0;
                this.f22649Y = layoutParams2.f22649Y;
                this.f22650Z = layoutParams2.f22650Z;
                this.f22684q0 = layoutParams2.f22684q0;
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m7334a() {
            this.f22658d0 = false;
            this.f22652a0 = true;
            this.f22654b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f22647W) {
                this.f22652a0 = false;
                if (this.f22636L == 0) {
                    this.f22636L = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f22648X) {
                this.f22654b0 = false;
                if (this.f22637M == 0) {
                    this.f22637M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f22652a0 = false;
                if (i == 0 && this.f22636L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f22647W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f22654b0 = false;
                if (i2 == 0 && this.f22637M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f22648X = true;
                }
            }
            if (this.f22655c == -1.0f && this.f22651a == -1 && this.f22653b == -1) {
                return;
            }
            this.f22658d0 = true;
            this.f22652a0 = true;
            this.f22654b0 = true;
            if (!(this.f22684q0 instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.f22684q0 = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.f22684q0).m7119a0(this.f22646V);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z2 = false;
            boolean z3 = 1 == getLayoutDirection();
            this.f22668i0 = -1;
            this.f22670j0 = -1;
            this.f22664g0 = -1;
            this.f22666h0 = -1;
            this.f22672k0 = this.f22690w;
            this.f22674l0 = this.f22692y;
            float f = this.f22629E;
            this.f22676m0 = f;
            int i8 = this.f22651a;
            this.f22678n0 = i8;
            int i9 = this.f22653b;
            this.f22680o0 = i9;
            float f2 = this.f22655c;
            this.f22682p0 = f2;
            if (z3) {
                int i10 = this.f22686s;
                if (i10 != -1) {
                    this.f22668i0 = i10;
                } else {
                    int i11 = this.f22687t;
                    if (i11 != -1) {
                        this.f22670j0 = i11;
                    }
                    i2 = this.f22688u;
                    if (i2 != -1) {
                        this.f22666h0 = i2;
                        z2 = true;
                    }
                    i3 = this.f22689v;
                    if (i3 != -1) {
                        this.f22664g0 = i3;
                        z2 = true;
                    }
                    i4 = this.f22625A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.f22674l0 = i4;
                    }
                    i5 = this.f22626B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.f22672k0 = i5;
                    }
                    if (z2) {
                        this.f22676m0 = 1.0f - f;
                    }
                    if (this.f22658d0 && this.f22646V == 1 && this.f22657d) {
                        if (f2 == -1.0f) {
                            this.f22682p0 = 1.0f - f2;
                            this.f22678n0 = -1;
                            this.f22680o0 = -1;
                        } else if (i8 != -1) {
                            this.f22680o0 = i8;
                            this.f22678n0 = -1;
                            this.f22682p0 = -1.0f;
                        } else if (i9 != -1) {
                            this.f22678n0 = i9;
                            this.f22680o0 = -1;
                            this.f22682p0 = -1.0f;
                        }
                    }
                }
                z2 = true;
                i2 = this.f22688u;
                if (i2 != -1) {
                }
                i3 = this.f22689v;
                if (i3 != -1) {
                }
                i4 = this.f22625A;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.f22626B;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z2) {
                }
                if (this.f22658d0) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.f22686s;
                if (i12 != -1) {
                    this.f22666h0 = i12;
                }
                int i13 = this.f22687t;
                if (i13 != -1) {
                    this.f22664g0 = i13;
                }
                int i14 = this.f22688u;
                if (i14 != -1) {
                    this.f22668i0 = i14;
                }
                int i15 = this.f22689v;
                if (i15 != -1) {
                    this.f22670j0 = i15;
                }
                int i16 = this.f22625A;
                if (i16 != Integer.MIN_VALUE) {
                    this.f22672k0 = i16;
                }
                int i17 = this.f22626B;
                if (i17 != Integer.MIN_VALUE) {
                    this.f22674l0 = i17;
                }
            }
            if (this.f22688u == -1 && this.f22689v == -1 && this.f22687t == -1 && this.f22686s == -1) {
                int i18 = this.f22663g;
                if (i18 != -1) {
                    this.f22668i0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f22665h;
                    if (i19 != -1) {
                        this.f22670j0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f22659e;
                if (i20 != -1) {
                    this.f22664g0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f22661f;
                if (i21 != -1) {
                    this.f22666h0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22651a = -1;
            this.f22653b = -1;
            this.f22655c = -1.0f;
            this.f22657d = true;
            this.f22659e = -1;
            this.f22661f = -1;
            this.f22663g = -1;
            this.f22665h = -1;
            this.f22667i = -1;
            this.f22669j = -1;
            this.f22671k = -1;
            this.f22673l = -1;
            this.f22675m = -1;
            this.f22677n = -1;
            this.f22679o = -1;
            this.f22681p = -1;
            this.f22683q = 0;
            this.f22685r = 0.0f;
            this.f22686s = -1;
            this.f22687t = -1;
            this.f22688u = -1;
            this.f22689v = -1;
            this.f22690w = Integer.MIN_VALUE;
            this.f22691x = Integer.MIN_VALUE;
            this.f22692y = Integer.MIN_VALUE;
            this.f22693z = Integer.MIN_VALUE;
            this.f22625A = Integer.MIN_VALUE;
            this.f22626B = Integer.MIN_VALUE;
            this.f22627C = Integer.MIN_VALUE;
            this.f22628D = 0;
            this.f22629E = 0.5f;
            this.f22630F = 0.5f;
            this.f22631G = null;
            this.f22632H = -1.0f;
            this.f22633I = -1.0f;
            this.f22634J = 0;
            this.f22635K = 0;
            this.f22636L = 0;
            this.f22637M = 0;
            this.f22638N = 0;
            this.f22639O = 0;
            this.f22640P = 0;
            this.f22641Q = 0;
            this.f22642R = 1.0f;
            this.f22643S = 1.0f;
            this.f22644T = -1;
            this.f22645U = -1;
            this.f22646V = -1;
            this.f22647W = false;
            this.f22648X = false;
            this.f22649Y = null;
            this.f22650Z = 0;
            this.f22652a0 = true;
            this.f22654b0 = true;
            this.f22656c0 = false;
            this.f22658d0 = false;
            this.f22660e0 = false;
            this.f22662f0 = false;
            this.f22664g0 = -1;
            this.f22666h0 = -1;
            this.f22668i0 = -1;
            this.f22670j0 = -1;
            this.f22672k0 = Integer.MIN_VALUE;
            this.f22674l0 = Integer.MIN_VALUE;
            this.f22676m0 = 0.5f;
            this.f22684q0 = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f22870b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = Table.f22694a.get(index);
                switch (i2) {
                    case 1:
                        this.f22646V = typedArrayObtainStyledAttributes.getInt(index, this.f22646V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22681p);
                        this.f22681p = resourceId;
                        if (resourceId == -1) {
                            this.f22681p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f22683q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22683q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f22685r) % 360.0f;
                        this.f22685r = f;
                        if (f < 0.0f) {
                            this.f22685r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f22651a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22651a);
                        break;
                    case 6:
                        this.f22653b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22653b);
                        break;
                    case 7:
                        this.f22655c = typedArrayObtainStyledAttributes.getFloat(index, this.f22655c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22659e);
                        this.f22659e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f22659e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22661f);
                        this.f22661f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f22661f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22663g);
                        this.f22663g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f22663g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22665h);
                        this.f22665h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f22665h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TYPE_BYTES_VALUE:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22667i);
                        this.f22667i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f22667i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22669j);
                        this.f22669j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f22669j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22671k);
                        this.f22671k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f22671k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22673l);
                        this.f22673l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f22673l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22675m);
                        this.f22675m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f22675m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22686s);
                        this.f22686s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f22686s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22687t);
                        this.f22687t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f22687t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22688u);
                        this.f22688u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f22688u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22689v);
                        this.f22689v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f22689v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.f22690w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22690w);
                        break;
                    case 22:
                        this.f22691x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22691x);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.f22692y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22692y);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        this.f22693z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22693z);
                        break;
                    case BuildConfig.VERSION_CODE /* 25 */:
                        this.f22625A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22625A);
                        break;
                    case 26:
                        this.f22626B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22626B);
                        break;
                    case 27:
                        this.f22647W = typedArrayObtainStyledAttributes.getBoolean(index, this.f22647W);
                        break;
                    case 28:
                        this.f22648X = typedArrayObtainStyledAttributes.getBoolean(index, this.f22648X);
                        break;
                    case 29:
                        this.f22629E = typedArrayObtainStyledAttributes.getFloat(index, this.f22629E);
                        break;
                    case 30:
                        this.f22630F = typedArrayObtainStyledAttributes.getFloat(index, this.f22630F);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f22636L = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f22637M = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        try {
                            this.f22638N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22638N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22638N) == -2) {
                                this.f22638N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f22640P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22640P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22640P) == -2) {
                                this.f22640P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f22642R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f22642R));
                        this.f22636L = 2;
                        break;
                    case 36:
                        try {
                            this.f22639O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22639O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22639O) == -2) {
                                this.f22639O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f22641Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22641Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22641Q) == -2) {
                                this.f22641Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f22643S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f22643S));
                        this.f22637M = 2;
                        break;
                    default:
                        switch (i2) {
                            case Carousel.ENTITY_TYPE /* 44 */:
                                ConstraintSet.m7345o(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f22632H = typedArrayObtainStyledAttributes.getFloat(index, this.f22632H);
                                break;
                            case 46:
                                this.f22633I = typedArrayObtainStyledAttributes.getFloat(index, this.f22633I);
                                break;
                            case 47:
                                this.f22634J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f22635K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f22644T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22644T);
                                break;
                            case 50:
                                this.f22645U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22645U);
                                break;
                            case 51:
                                this.f22649Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22677n);
                                this.f22677n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f22677n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22679o);
                                this.f22679o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f22679o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f22628D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22628D);
                                break;
                            case 55:
                                this.f22627C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22627C);
                                break;
                            default:
                                switch (i2) {
                                    case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                        ConstraintSet.m7344n(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        ConstraintSet.m7344n(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f22650Z = typedArrayObtainStyledAttributes.getInt(index, this.f22650Z);
                                        break;
                                    case 67:
                                        this.f22657d = typedArrayObtainStyledAttributes.getBoolean(index, this.f22657d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m7334a();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f22651a = -1;
            this.f22653b = -1;
            this.f22655c = -1.0f;
            this.f22657d = true;
            this.f22659e = -1;
            this.f22661f = -1;
            this.f22663g = -1;
            this.f22665h = -1;
            this.f22667i = -1;
            this.f22669j = -1;
            this.f22671k = -1;
            this.f22673l = -1;
            this.f22675m = -1;
            this.f22677n = -1;
            this.f22679o = -1;
            this.f22681p = -1;
            this.f22683q = 0;
            this.f22685r = 0.0f;
            this.f22686s = -1;
            this.f22687t = -1;
            this.f22688u = -1;
            this.f22689v = -1;
            this.f22690w = Integer.MIN_VALUE;
            this.f22691x = Integer.MIN_VALUE;
            this.f22692y = Integer.MIN_VALUE;
            this.f22693z = Integer.MIN_VALUE;
            this.f22625A = Integer.MIN_VALUE;
            this.f22626B = Integer.MIN_VALUE;
            this.f22627C = Integer.MIN_VALUE;
            this.f22628D = 0;
            this.f22629E = 0.5f;
            this.f22630F = 0.5f;
            this.f22631G = null;
            this.f22632H = -1.0f;
            this.f22633I = -1.0f;
            this.f22634J = 0;
            this.f22635K = 0;
            this.f22636L = 0;
            this.f22637M = 0;
            this.f22638N = 0;
            this.f22639O = 0;
            this.f22640P = 0;
            this.f22641Q = 0;
            this.f22642R = 1.0f;
            this.f22643S = 1.0f;
            this.f22644T = -1;
            this.f22645U = -1;
            this.f22646V = -1;
            this.f22647W = false;
            this.f22648X = false;
            this.f22649Y = null;
            this.f22650Z = 0;
            this.f22652a0 = true;
            this.f22654b0 = true;
            this.f22656c0 = false;
            this.f22658d0 = false;
            this.f22660e0 = false;
            this.f22662f0 = false;
            this.f22664g0 = -1;
            this.f22666h0 = -1;
            this.f22668i0 = -1;
            this.f22670j0 = -1;
            this.f22672k0 = Integer.MIN_VALUE;
            this.f22674l0 = Integer.MIN_VALUE;
            this.f22676m0 = 0.5f;
            this.f22684q0 = new ConstraintWidget();
        }
    }
}
