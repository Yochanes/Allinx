package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    /* JADX INFO: compiled from: Proguard */
    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
        public StandardKeySet() {
            super(ForwardingSortedMap.this);
        }
    }

    public static int unsafeCompare(@CheckForNull Comparator<?> comparator, @CheckForNull Object obj, @CheckForNull Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
        return delegate();
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract SortedMap<K, V> delegate();

    @Override // java.util.SortedMap
    @ParametricNullness
    public K firstKey() {
        return delegate().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@ParametricNullness K k) {
        return delegate().headMap(k);
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public K lastKey() {
        return delegate().lastKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap
    public boolean standardContainsKey(@CheckForNull Object obj) {
        return unsafeCompare(comparator(), tailMap(obj).firstKey(), obj) == 0;
    }

    public SortedMap<K, V> standardSubMap(K k, K k2) {
        Preconditions.checkArgument(unsafeCompare(comparator(), k, k2) <= 0, "fromKey must be <= toKey");
        return tailMap(k).headMap(k2);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@ParametricNullness K k, @ParametricNullness K k2) {
        return delegate().subMap(k, k2);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@ParametricNullness K k) {
        return delegate().tailMap(k);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Map delegate() {
        return delegate();
    }
}
