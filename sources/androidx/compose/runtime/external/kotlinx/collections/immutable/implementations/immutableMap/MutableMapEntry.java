package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

    /* JADX INFO: renamed from: c */
    public final PersistentHashMapBuilderEntriesIterator f16790c;

    /* JADX INFO: renamed from: d */
    public Object f16791d;

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator, Object obj, Object obj2) {
        super(obj, obj2);
        this.f16790c = persistentHashMapBuilderEntriesIterator;
        this.f16791d = obj2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    /* JADX INFO: renamed from: getValue */
    public final Object getF16789b() {
        return this.f16791d;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f16791d;
        this.f16791d = obj;
        PersistentHashMapBuilderBaseIterator persistentHashMapBuilderBaseIterator = this.f16790c.f16809a;
        PersistentHashMapBuilder persistentHashMapBuilder = persistentHashMapBuilderBaseIterator.f16804d;
        Object obj3 = this.f16788a;
        if (!persistentHashMapBuilder.containsKey(obj3)) {
            return obj2;
        }
        boolean z2 = persistentHashMapBuilderBaseIterator.f16797c;
        if (!z2) {
            persistentHashMapBuilder.put(obj3, obj);
        } else {
            if (!z2) {
                throw new NoSuchElementException();
            }
            TrieNodeBaseIterator trieNodeBaseIterator = persistentHashMapBuilderBaseIterator.f16795a[persistentHashMapBuilderBaseIterator.f16796b];
            Object obj4 = trieNodeBaseIterator.f16822a[trieNodeBaseIterator.f16824c];
            persistentHashMapBuilder.put(obj3, obj);
            persistentHashMapBuilderBaseIterator.m4659f(obj4 != null ? obj4.hashCode() : 0, persistentHashMapBuilder.f16800c, obj4, 0);
        }
        persistentHashMapBuilderBaseIterator.f16807i = persistentHashMapBuilder.f16802f;
        return obj2;
    }
}
