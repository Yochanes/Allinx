package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public interface LoadingCache<K, V> extends Cache<K, V>, Function<K, V> {
    @Override // com.google.common.base.Function
    @Deprecated
    V apply(K k);

    @Override // com.google.common.cache.Cache
    ConcurrentMap<K, V> asMap();

    @CanIgnoreReturnValue
    V get(K k);

    @CanIgnoreReturnValue
    ImmutableMap<K, V> getAll(Iterable<? extends K> iterable);

    @CanIgnoreReturnValue
    V getUnchecked(K k);

    void refresh(K k);
}
