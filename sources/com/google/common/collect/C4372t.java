package com.google.common.collect;

import com.google.common.collect.Table;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.common.collect.t */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4372t implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f42615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f42616b;

    public /* synthetic */ C4372t(Comparator comparator, Comparator comparator2) {
        this.f42615a = comparator;
        this.f42616b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return RegularImmutableTable.m14947a(this.f42615a, this.f42616b, (Table.Cell) obj, (Table.Cell) obj2);
    }
}
