package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a */
    public int[] f22615a;

    /* JADX INFO: renamed from: b */
    public int f22616b;

    /* JADX INFO: renamed from: c */
    public Context f22617c;

    /* JADX INFO: renamed from: d */
    public HelperWidget f22618d;

    /* JADX INFO: renamed from: f */
    public boolean f22619f;

    /* JADX INFO: renamed from: g */
    public String f22620g;

    /* JADX INFO: renamed from: i */
    public String f22621i;

    /* JADX INFO: renamed from: j */
    public View[] f22622j;

    /* JADX INFO: renamed from: n */
    public HashMap f22623n;

    /* JADX INFO: renamed from: b */
    public final void m7322b(String str) {
        if (str == null || str.length() == 0 || this.f22617c == null) {
            return;
        }
        String strTrim = str.trim();
        int iM7328i = m7328i(strTrim);
        if (iM7328i != 0) {
            this.f22623n.put(Integer.valueOf(iM7328i), strTrim);
            m7323c(iM7328i);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7323c(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f22616b + 1;
        int[] iArr = this.f22615a;
        if (i2 > iArr.length) {
            this.f22615a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f22615a;
        int i3 = this.f22616b;
        iArr2[i3] = i;
        this.f22616b = i3 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m7324d(String str) {
        if (str == null || str.length() == 0 || this.f22617c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f22649Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m7323c(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7325e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m7326f((ConstraintLayout) parent);
    }

    /* JADX INFO: renamed from: f */
    public final void m7326f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f22616b; i++) {
            View viewById = constraintLayout.getViewById(this.f22615a[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f22615a, this.f22616b);
    }

    /* JADX INFO: renamed from: h */
    public final int m7327h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f22617c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m7328i(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iM7327h = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iM7327h = ((Integer) designInformation).intValue();
            }
        }
        if (iM7327h == 0 && constraintLayout != null) {
            iM7327h = m7327h(constraintLayout, str);
        }
        if (iM7327h == 0) {
            try {
                iM7327h = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM7327h != 0) {
            return iM7327h;
        }
        Context context = this.f22617c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    /* JADX INFO: renamed from: j */
    public final View[] m7329j(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f22622j;
        if (viewArr == null || viewArr.length != this.f22616b) {
            this.f22622j = new View[this.f22616b];
        }
        for (int i = 0; i < this.f22616b; i++) {
            this.f22622j[i] = constraintLayout.getViewById(this.f22615a[i]);
        }
        return this.f22622j;
    }

    /* JADX INFO: renamed from: k */
    public void mo7330k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f22870b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f22620g = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f22621i = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo7180l(ConstraintSet.Constraint constraint, HelperWidget helperWidget, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        ConstraintSet.Layout layout = constraint.f22733e;
        int[] iArr = layout.f22795j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = layout.f22797k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = layout.f22797k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int iM7328i = m7328i(str2.trim());
                        if (iM7328i != 0) {
                            iArrCopyOf[i2] = iM7328i;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    layout.f22795j0 = iArrCopyOf;
                } else {
                    layout.f22795j0 = null;
                }
            }
        }
        helperWidget.mo7120a();
        if (layout.f22795j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = layout.f22795j0;
            if (i >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i]);
            if (constraintWidget != null) {
                helperWidget.mo7121b(constraintWidget);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f22620g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f22621i;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f22619f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo7198p(Helper helper, SparseArray sparseArray) {
        helper.mo7120a();
        for (int i = 0; i < this.f22616b; i++) {
            helper.mo7121b((ConstraintWidget) sparseArray.get(this.f22615a[i]));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7331q() {
        if (this.f22618d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f22684q0 = this.f22618d;
        }
    }

    public void setIds(String str) {
        this.f22620g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f22616b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m7322b(str.substring(i));
                return;
            } else {
                m7322b(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f22621i = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f22616b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m7324d(str.substring(i));
                return;
            } else {
                m7324d(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f22620g = null;
        this.f22616b = 0;
        for (int i : iArr) {
            m7323c(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f22620g == null) {
            m7323c(i);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo7192n() {
    }

    /* JADX INFO: renamed from: g */
    public void mo7191g(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: o */
    public void mo7193o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: m */
    public void mo7181m(ConstraintWidget constraintWidget, boolean z2) {
    }
}
