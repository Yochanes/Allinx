package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {

    /* JADX INFO: renamed from: a */
    public int f22893a;

    /* JADX INFO: renamed from: b */
    public int f22894b;

    public int getApplyToConstraintSetId() {
        return this.f22894b;
    }

    public int getAttributeId() {
        return this.f22893a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setApplyToConstraintSetId(int i) {
        this.f22894b = i;
    }

    public void setAttributeId(int i) {
        HashSet<WeakReference> hashSet;
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f22893a;
        if (i2 != -1 && (hashSet = (HashSet) sharedValues.f22895a.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : hashSet) {
                SharedValues.SharedValuesListener sharedValuesListener = (SharedValues.SharedValuesListener) weakReference.get();
                if (sharedValuesListener == null || sharedValuesListener == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f22893a = i;
        if (i != -1) {
            sharedValues.m7373a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f22651a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f22653b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f22655c = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setAnimateChange(boolean z2) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
