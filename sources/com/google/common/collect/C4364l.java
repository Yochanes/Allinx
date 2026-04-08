package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.google.common.collect.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4364l implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CollectCollectors.EnumMapAccumulator f42605a;

    public /* synthetic */ C4364l(CollectCollectors.EnumMapAccumulator enumMapAccumulator) {
        this.f42605a = enumMapAccumulator;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        this.f42605a.put((Enum) obj, obj2);
    }
}
