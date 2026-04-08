package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: o */
    public boolean f22906o;

    /* JADX INFO: renamed from: p */
    public boolean f22907p;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: g */
    public final void mo7191g(ConstraintLayout constraintLayout) {
        m7326f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: k */
    public void mo7330k(AttributeSet attributeSet) {
        super.mo7330k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f22870b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f22906o = true;
                } else if (index == 22) {
                    this.f22907p = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22906o || this.f22907p) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f22616b; i++) {
                    View viewById = constraintLayout.getViewById(this.f22615a[i]);
                    if (viewById != null) {
                        if (this.f22906o) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f22907p && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m7325e();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m7325e();
    }

    /* JADX INFO: renamed from: r */
    public void mo7182r(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i, int i2) {
    }
}
