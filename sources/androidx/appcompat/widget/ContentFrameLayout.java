package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.primitives.Ints;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f1243a;

    /* JADX INFO: renamed from: b */
    public TypedValue f1244b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1245c;

    /* JADX INFO: renamed from: d */
    public TypedValue f1246d;

    /* JADX INFO: renamed from: f */
    public TypedValue f1247f;

    /* JADX INFO: renamed from: g */
    public TypedValue f1248g;

    /* JADX INFO: renamed from: i */
    public final Rect f1249i;

    /* JADX INFO: renamed from: j */
    public OnAttachListener f1250j;

    /* JADX INFO: compiled from: Proguard */
    public interface OnAttachListener {
        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1249i = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1247f == null) {
            this.f1247f = new TypedValue();
        }
        return this.f1247f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1248g == null) {
            this.f1248g = new TypedValue();
        }
        return this.f1248g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1245c == null) {
            this.f1245c = new TypedValue();
        }
        return this.f1245c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1246d == null) {
            this.f1246d = new TypedValue();
        }
        return this.f1246d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1243a == null) {
            this.f1243a = new TypedValue();
        }
        return this.f1243a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1244b == null) {
            this.f1244b = new TypedValue();
        }
        return this.f1244b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.f1250j;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z2;
        int iMakeMeasureSpec2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f1249i;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z2 = false;
        } else {
            TypedValue typedValue = z4 ? this.f1246d : this.f1245c;
            if (typedValue != null && (i7 = typedValue.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 <= 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), Ints.MAX_POWER_OF_TWO);
                        z2 = true;
                    }
                }
                i8 = (int) fraction3;
                if (i8 <= 0) {
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z4 ? this.f1247f : this.f1248g;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i5 == 6) {
                    int i10 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i10, i10);
                } else {
                    i6 = 0;
                    if (i6 <= 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), Ints.MAX_POWER_OF_TWO);
                    }
                }
                i6 = (int) fraction2;
                if (i6 <= 0) {
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, Ints.MAX_POWER_OF_TWO);
        if (z2 || mode != Integer.MIN_VALUE) {
            z3 = false;
        } else {
            TypedValue typedValue3 = z4 ? this.f1244b : this.f1243a;
            if (typedValue3 != null && (i3 = typedValue3.type) != 0) {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i3 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i11, i11);
                } else {
                    i4 = 0;
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth >= i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, Ints.MAX_POWER_OF_TWO);
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth >= i4) {
                }
            }
        }
        if (z3) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.f1250j = onAttachListener;
    }
}
