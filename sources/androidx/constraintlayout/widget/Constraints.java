package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: compiled from: Proguard */
    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* JADX INFO: renamed from: A0 */
        public float f22852A0;

        /* JADX INFO: renamed from: B0 */
        public float f22853B0;

        /* JADX INFO: renamed from: C0 */
        public float f22854C0;

        /* JADX INFO: renamed from: D0 */
        public float f22855D0;

        /* JADX INFO: renamed from: r0 */
        public float f22856r0;

        /* JADX INFO: renamed from: s0 */
        public boolean f22857s0;

        /* JADX INFO: renamed from: t0 */
        public float f22858t0;

        /* JADX INFO: renamed from: u0 */
        public float f22859u0;

        /* JADX INFO: renamed from: v0 */
        public float f22860v0;

        /* JADX INFO: renamed from: w0 */
        public float f22861w0;

        /* JADX INFO: renamed from: x0 */
        public float f22862x0;

        /* JADX INFO: renamed from: y0 */
        public float f22863y0;

        /* JADX INFO: renamed from: z0 */
        public float f22864z0;

        public LayoutParams() {
            super(-2, -2);
            this.f22856r0 = 1.0f;
            this.f22857s0 = false;
            this.f22858t0 = 0.0f;
            this.f22859u0 = 0.0f;
            this.f22860v0 = 0.0f;
            this.f22861w0 = 0.0f;
            this.f22862x0 = 1.0f;
            this.f22863y0 = 1.0f;
            this.f22864z0 = 0.0f;
            this.f22852A0 = 0.0f;
            this.f22853B0 = 0.0f;
            this.f22854C0 = 0.0f;
            this.f22855D0 = 0.0f;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f22856r0 = 1.0f;
        layoutParams.f22857s0 = false;
        layoutParams.f22858t0 = 0.0f;
        layoutParams.f22859u0 = 0.0f;
        layoutParams.f22860v0 = 0.0f;
        layoutParams.f22861w0 = 0.0f;
        layoutParams.f22862x0 = 1.0f;
        layoutParams.f22863y0 = 1.0f;
        layoutParams.f22864z0 = 0.0f;
        layoutParams.f22852A0 = 0.0f;
        layoutParams.f22853B0 = 0.0f;
        layoutParams.f22854C0 = 0.0f;
        layoutParams.f22855D0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f22872d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                layoutParams.f22856r0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22856r0);
            } else if (index == 28) {
                layoutParams.f22858t0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22858t0);
                layoutParams.f22857s0 = true;
            } else if (index == 23) {
                layoutParams.f22860v0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22860v0);
            } else if (index == 24) {
                layoutParams.f22861w0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22861w0);
            } else if (index == 22) {
                layoutParams.f22859u0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22859u0);
            } else if (index == 20) {
                layoutParams.f22862x0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22862x0);
            } else if (index == 21) {
                layoutParams.f22863y0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22863y0);
            } else if (index == 16) {
                layoutParams.f22864z0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22864z0);
            } else if (index == 17) {
                layoutParams.f22852A0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22852A0);
            } else if (index == 18) {
                layoutParams.f22853B0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22853B0);
            } else if (index == 19) {
                layoutParams.f22854C0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22854C0);
            } else if (index == 27) {
                layoutParams.f22855D0 = typedArrayObtainStyledAttributes.getFloat(index, layoutParams.f22855D0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public ConstraintSet getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
