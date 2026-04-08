package androidx.compose.p013ui.platform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "", "getChildCount", "()I", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f19408a;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final void m6141a(Canvas canvas, ViewLayer viewLayer, long j) {
        super.drawChild(AndroidCanvas_androidKt.m5111b(canvas), viewLayer, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.m18597e(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).isInvalidated) {
                this.f19408a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f19408a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f19408a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
