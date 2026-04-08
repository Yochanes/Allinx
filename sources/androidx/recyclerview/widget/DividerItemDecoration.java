package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        recyclerView.getLayoutManager();
    }
}
