package com.google.common.collect;

import java.util.Comparator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.google.common.collect.m */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4365m implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f42607b;

    public /* synthetic */ C4365m(int i, Comparator comparator) {
        this.f42606a = i;
        this.f42607b = comparator;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Comparators.m14807a(this.f42606a, this.f42607b);
    }
}
