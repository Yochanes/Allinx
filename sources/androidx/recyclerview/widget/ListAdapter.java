package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ListAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C21351 implements AsyncListDiffer.ListListener<T> {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        throw null;
    }
}
