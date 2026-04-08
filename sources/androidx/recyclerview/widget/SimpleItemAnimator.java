package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {

    /* JADX INFO: renamed from: g */
    public boolean f31772g;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* JADX INFO: renamed from: a */
    public final boolean mo11666a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        if (itemHolderInfo != null && ((i = itemHolderInfo.f31711a) != (i2 = itemHolderInfo2.f31711a) || itemHolderInfo.f31712b != itemHolderInfo2.f31712b)) {
            return mo11556o(viewHolder, i, itemHolderInfo.f31712b, i2, itemHolderInfo2.f31712b);
        }
        mo11554m(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* JADX INFO: renamed from: b */
    public final boolean mo11667b(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        int i3 = itemHolderInfo.f31711a;
        int i4 = itemHolderInfo.f31712b;
        if (viewHolder2.shouldIgnore()) {
            int i5 = itemHolderInfo.f31711a;
            i2 = itemHolderInfo.f31712b;
            i = i5;
        } else {
            i = itemHolderInfo2.f31711a;
            i2 = itemHolderInfo2.f31712b;
        }
        return mo11555n(viewHolder, viewHolder2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* JADX INFO: renamed from: c */
    public final boolean mo11668c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i = itemHolderInfo.f31711a;
        int i2 = itemHolderInfo.f31712b;
        View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.f31711a;
        int top = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.f31712b;
        if (viewHolder.isRemoved() || (i == left && i2 == top)) {
            mo11557p(viewHolder);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo11556o(viewHolder, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* JADX INFO: renamed from: d */
    public final boolean mo11669d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i = itemHolderInfo.f31711a;
        int i2 = itemHolderInfo2.f31711a;
        if (i != i2 || itemHolderInfo.f31712b != itemHolderInfo2.f31712b) {
            return mo11556o(viewHolder, i, itemHolderInfo.f31712b, i2, itemHolderInfo2.f31712b);
        }
        m11671h(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* JADX INFO: renamed from: f */
    public final boolean mo11670f(RecyclerView.ViewHolder viewHolder) {
        return !this.f31772g || viewHolder.isInvalid();
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo11554m(RecyclerView.ViewHolder viewHolder);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo11555n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: o */
    public abstract boolean mo11556o(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: p */
    public abstract void mo11557p(RecyclerView.ViewHolder viewHolder);
}
