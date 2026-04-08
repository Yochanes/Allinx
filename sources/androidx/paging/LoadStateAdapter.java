package androidx.paging;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/LoadStateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "paging-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class LoadStateAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        Intrinsics.m18599g(holder, "holder");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.m18599g(parent, "parent");
        throw null;
    }
}
