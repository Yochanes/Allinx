package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class InactiveNodeList implements Incomplete {

    /* JADX INFO: renamed from: a */
    public final NodeList f55317a;

    public InactiveNodeList(NodeList nodeList) {
        this.f55317a = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: getList, reason: from getter */
    public final NodeList getF55317a() {
        return this.f55317a;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return false;
    }
}
