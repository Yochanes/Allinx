package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 176)
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {
    @Override // androidx.collection.LruCache
    public final Object create(Object key) {
        Intrinsics.m18599g(key, "key");
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final void entryRemoved(boolean z2, Object key, Object oldValue, Object obj) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(oldValue, "oldValue");
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final int sizeOf(Object key, Object value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        throw null;
    }
}
