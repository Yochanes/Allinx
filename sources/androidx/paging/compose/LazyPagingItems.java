package androidx.paging.compose;

import androidx.compose.p013ui.platform.AndroidUiDispatcher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.LoadStates;
import androidx.paging.PagingData;
import androidx.paging.PagingLogger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/compose/LazyPagingItems;", "", "T", "paging-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyPagingItems<T> {

    /* JADX INFO: renamed from: a */
    public final Flow f31379a;

    /* JADX INFO: renamed from: b */
    public final CoroutineContext f31380b;

    /* JADX INFO: renamed from: c */
    public final LazyPagingItems$pagingDataPresenter$1 f31381c;

    /* JADX INFO: renamed from: d */
    public final MutableState f31382d;

    /* JADX INFO: renamed from: e */
    public final MutableState f31383e;

    public LazyPagingItems(Flow flow) {
        Intrinsics.m18599g(flow, "flow");
        this.f31379a = flow;
        CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.f19286r.getValue();
        this.f31380b = coroutineContext;
        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = new LazyPagingItems$pagingDataPresenter$1(this, coroutineContext, flow instanceof SharedFlow ? (PagingData) CollectionsKt.m18402D(((SharedFlow) flow).mo20776a()) : null);
        this.f31381c = lazyPagingItems$pagingDataPresenter$1;
        this.f31382d = SnapshotStateKt.m4525g(lazyPagingItems$pagingDataPresenter$1.m11392d());
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) lazyPagingItems$pagingDataPresenter$1.f31122k.getValue();
        if (combinedLoadStates == null) {
            LoadStates loadStates = LazyPagingItemsKt.f31389a;
            combinedLoadStates = new CombinedLoadStates(loadStates.f30747a, loadStates.f30748b, loadStates.f30749c, loadStates, null);
        }
        this.f31383e = SnapshotStateKt.m4525g(combinedLoadStates);
    }

    /* JADX INFO: renamed from: a */
    public final int m11423a() {
        return m11424b().getF16756c();
    }

    /* JADX INFO: renamed from: b */
    public final ItemSnapshotList m11424b() {
        return (ItemSnapshotList) ((SnapshotMutableStateImpl) this.f31382d).getF20325a();
    }

    /* JADX INFO: renamed from: c */
    public final CombinedLoadStates m11425c() {
        return (CombinedLoadStates) ((SnapshotMutableStateImpl) this.f31383e).getF20325a();
    }

    /* JADX INFO: renamed from: d */
    public final void m11426d() {
        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = this.f31381c;
        lazyPagingItems$pagingDataPresenter$1.getClass();
        if (PagingLogger.m11396a(3)) {
            PagingLogger.m11397b(3, "Refresh signal received");
        }
        lazyPagingItems$pagingDataPresenter$1.f31114c.mo11358b();
    }
}
