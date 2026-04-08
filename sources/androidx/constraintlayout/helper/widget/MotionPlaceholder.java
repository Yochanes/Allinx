package androidx.constraintlayout.helper.widget;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        mo7182r(null, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* JADX INFO: renamed from: r */
    public final void mo7182r(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.mo7031a0(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.f22033E0, virtualLayout.f22034F0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: p */
    public final void mo7198p(Helper helper, SparseArray sparseArray) {
    }
}
