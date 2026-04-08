package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {
    private final Map<K, V> backingMap;

    @CheckForNull
    private volatile transient Map.Entry<K, V> cacheEntry;

    /* JADX INFO: renamed from: com.google.common.graph.MapIteratorCache$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C44011 extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.common.graph.MapIteratorCache$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends UnmodifiableIterator<K> {
            final /* synthetic */ C44011 this$1;
            final /* synthetic */ Iterator val$entryIterator;

            public AnonymousClass1(C44011 c44011, Iterator it) {
                this.val$entryIterator = it;
                this.this$1 = c44011;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.val$entryIterator.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.val$entryIterator.next();
                MapIteratorCache.access$102(MapIteratorCache.this, entry);
                return (K) entry.getKey();
            }
        }

        public C44011() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return MapIteratorCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapIteratorCache.access$000(MapIteratorCache.this).size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<K> iterator() {
            return new AnonymousClass1(this, MapIteratorCache.access$000(MapIteratorCache.this).entrySet().iterator());
        }
    }

    public MapIteratorCache(Map<K, V> map) {
        this.backingMap = (Map) Preconditions.checkNotNull(map);
    }

    public static /* synthetic */ Map access$000(MapIteratorCache mapIteratorCache) {
        return mapIteratorCache.backingMap;
    }

    public static /* synthetic */ Map.Entry access$102(MapIteratorCache mapIteratorCache, Map.Entry entry) {
        mapIteratorCache.cacheEntry = entry;
        return entry;
    }

    public final void clear() {
        clearCache();
        this.backingMap.clear();
    }

    public void clearCache() {
        this.cacheEntry = null;
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return getIfCached(obj) != null || this.backingMap.containsKey(obj);
    }

    @CheckForNull
    public V get(Object obj) {
        Preconditions.checkNotNull(obj);
        V ifCached = getIfCached(obj);
        return ifCached == null ? getWithoutCaching(obj) : ifCached;
    }

    @CheckForNull
    public V getIfCached(@CheckForNull Object obj) {
        Map.Entry<K, V> entry = this.cacheEntry;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    @CheckForNull
    public final V getWithoutCaching(Object obj) {
        Preconditions.checkNotNull(obj);
        return this.backingMap.get(obj);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public final V put(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        clearCache();
        return this.backingMap.put(k, v);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public final V remove(Object obj) {
        Preconditions.checkNotNull(obj);
        clearCache();
        return this.backingMap.remove(obj);
    }

    public final Set<K> unmodifiableKeySet() {
        return new C44011();
    }
}
