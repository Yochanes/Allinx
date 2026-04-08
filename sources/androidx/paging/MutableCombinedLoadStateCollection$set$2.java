package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Landroidx/paging/CombinedLoadStates;", "currState", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class MutableCombinedLoadStateCollection$set$2 extends Lambda implements Function1<CombinedLoadStates, CombinedLoadStates> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LoadType f30768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableCombinedLoadStateCollection f30769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableCombinedLoadStateCollection$set$2(LoadType loadType, MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection) {
        super(1);
        this.f30768a = loadType;
        this.f30769b = mutableCombinedLoadStateCollection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LoadStates loadStates;
        LoadStates loadStatesM11343a;
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) obj;
        if (combinedLoadStates == null || (loadStates = combinedLoadStates.f30595d) == null) {
            loadStates = LoadStates.f30746f;
        }
        LoadStates loadStates2 = combinedLoadStates != null ? combinedLoadStates.f30596e : null;
        LoadType loadType = this.f30768a;
        loadStates.getClass();
        Intrinsics.m18599g(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            loadStatesM11343a = LoadStates.m11343a(loadStates, 6);
        } else if (iOrdinal == 1) {
            loadStatesM11343a = LoadStates.m11343a(loadStates, 5);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            loadStatesM11343a = LoadStates.m11343a(loadStates, 3);
        }
        return MutableCombinedLoadStateCollection.m11344a(this.f30769b, combinedLoadStates, loadStatesM11343a, loadStates2);
    }
}
