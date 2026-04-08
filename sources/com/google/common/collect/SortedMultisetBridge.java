package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
interface SortedMultisetBridge<E> extends Multiset<E> {
    @Override // com.google.common.collect.Multiset
    /* bridge */ /* synthetic */ default Set elementSet() {
        return elementSet();
    }

    @Override // com.google.common.collect.Multiset
    SortedSet<E> elementSet();
}
