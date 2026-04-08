package androidx.paging;

import androidx.paging.LoadState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/MutableCombinedLoadStateCollection;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableCombinedLoadStateCollection {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f30762a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public final MutableStateFlow f30763b;

    /* JADX INFO: renamed from: c */
    public final StateFlow f30764c;

    public MutableCombinedLoadStateCollection() {
        MutableStateFlow mutableStateFlowM20803a = StateFlowKt.m20803a(null);
        this.f30763b = mutableStateFlowM20803a;
        this.f30764c = FlowKt.m20742b(mutableStateFlowM20803a);
    }

    /* JADX INFO: renamed from: a */
    public static final CombinedLoadStates m11344a(MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection, CombinedLoadStates combinedLoadStates, LoadStates loadStates, LoadStates loadStates2) {
        LoadState loadState;
        LoadState loadState2;
        LoadState loadState3;
        mutableCombinedLoadStateCollection.getClass();
        LoadState loadState4 = LoadState.NotLoading.f30745c;
        if (combinedLoadStates == null || (loadState = combinedLoadStates.f30592a) == null) {
            loadState = loadState4;
        }
        LoadState loadState5 = loadStates.f30747a;
        LoadState loadStateM11345b = m11345b(loadState, loadState5, loadState5, loadStates2 != null ? loadStates2.f30747a : null);
        if (combinedLoadStates == null || (loadState2 = combinedLoadStates.f30593b) == null) {
            loadState2 = loadState4;
        }
        LoadState loadState6 = loadStates2 != null ? loadStates2.f30748b : null;
        LoadState loadState7 = loadStates.f30748b;
        LoadState loadState8 = loadStates.f30747a;
        LoadState loadStateM11345b2 = m11345b(loadState2, loadState8, loadState7, loadState6);
        if (combinedLoadStates != null && (loadState3 = combinedLoadStates.f30594c) != null) {
            loadState4 = loadState3;
        }
        return new CombinedLoadStates(loadStateM11345b, loadStateM11345b2, m11345b(loadState4, loadState8, loadStates.f30749c, loadStates2 != null ? loadStates2.f30749c : null), loadStates, loadStates2);
    }

    /* JADX INFO: renamed from: b */
    public static LoadState m11345b(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadState loadState4) {
        return loadState4 == null ? loadState3 : loadState instanceof LoadState.Loading ? (((loadState2 instanceof LoadState.NotLoading) && (loadState4 instanceof LoadState.NotLoading)) || (loadState4 instanceof LoadState.Error)) ? loadState4 : loadState : loadState4;
    }

    /* JADX INFO: renamed from: c */
    public final void m11346c(Function1 function1) {
        Object value;
        CombinedLoadStates combinedLoadStates;
        MutableStateFlow mutableStateFlow = this.f30763b;
        do {
            value = mutableStateFlow.getValue();
            CombinedLoadStates combinedLoadStates2 = (CombinedLoadStates) value;
            combinedLoadStates = (CombinedLoadStates) function1.invoke(combinedLoadStates2);
            if (Intrinsics.m18594b(combinedLoadStates2, combinedLoadStates)) {
                return;
            }
        } while (!mutableStateFlow.mo20775c(value, combinedLoadStates));
        if (combinedLoadStates != null) {
            Iterator it = this.f30762a.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(combinedLoadStates);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11347d(LoadStates sourceLoadStates, LoadStates loadStates) {
        Intrinsics.m18599g(sourceLoadStates, "sourceLoadStates");
        m11346c(new MutableCombinedLoadStateCollection$set$1(this, sourceLoadStates, loadStates));
    }
}
