package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.FilteredEntryMultimap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4366n implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Predicate f42608a;

    public /* synthetic */ C4366n(Predicate predicate) {
        this.f42608a = predicate;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return FilteredEntryMultimap.Keys.C41931.m14808a(this.f42608a, (Map.Entry) obj);
    }
}
