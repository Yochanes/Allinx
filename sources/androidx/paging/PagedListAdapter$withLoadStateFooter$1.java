package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, m18302d2 = {"<anonymous>", "", "T", "", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "loadType", "Landroidx/paging/LoadType;", "loadState", "Landroidx/paging/LoadState;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class PagedListAdapter$withLoadStateFooter$1 extends Lambda implements Function2<LoadType, LoadState, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LoadType loadType = (LoadType) obj;
        LoadState loadState = (LoadState) obj2;
        Intrinsics.m18599g(loadType, "loadType");
        Intrinsics.m18599g(loadState, "loadState");
        if (loadType != LoadType.f30754c) {
            return Unit.f51459a;
        }
        throw null;
    }
}
