package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class SmoothCalendarLayoutManager extends LinearLayoutManager {
    private static final float MILLISECONDS_PER_INCH = 100.0f;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.SmoothCalendarLayoutManager$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38481 extends LinearSmoothScroller {
        public C38481(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return SmoothCalendarLayoutManager.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }
    }

    public SmoothCalendarLayoutManager(Context context, int i, boolean z2) {
        super(i, z2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C38481 c38481 = new C38481(recyclerView.getContext());
        c38481.setTargetPosition(i);
        startSmoothScroll(c38481);
    }
}
