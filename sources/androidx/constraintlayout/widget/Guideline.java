package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a */
    public boolean f22865a;

    public Guideline(Context context) {
        super(context);
        this.f22865a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f22865a = z2;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f22865a && layoutParams.f22651a == i) {
            return;
        }
        layoutParams.f22651a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f22865a && layoutParams.f22653b == i) {
            return;
        }
        layoutParams.f22653b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f22865a && layoutParams.f22655c == f) {
            return;
        }
        layoutParams.f22655c = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
