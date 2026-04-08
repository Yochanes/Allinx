package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface ListMultimap<K, V> extends Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    boolean equals(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Collection get(@ParametricNullness Object obj) {
        return get(obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    List<V> get(@ParametricNullness K k);

    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default Collection removeAll(@CheckForNull Object obj) {
        return removeAll(obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    List<V> removeAll(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues(obj, iterable);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    List<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);
}
