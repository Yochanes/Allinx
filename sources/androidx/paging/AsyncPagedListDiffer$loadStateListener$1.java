package androidx.paging;

import androidx.paging.PagedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements Function2<LoadType, LoadState, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LoadType p0 = (LoadType) obj;
        LoadState p1 = (LoadState) obj2;
        Intrinsics.m18599g(p0, "p0");
        Intrinsics.m18599g(p1, "p1");
        ((PagedList.LoadStateManager) this.receiver).m11387b(p0, p1);
        return Unit.f51459a;
    }
}
