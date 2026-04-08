package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntries;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/AbstractMapBuilderEntries;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PersistentHashMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a */
    public final PersistentHashMapBuilder f16808a;

    public PersistentHashMapBuilderEntries(PersistentHashMapBuilder persistentHashMapBuilder) {
        this.f16808a = persistentHashMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* JADX INFO: renamed from: c */
    public final int getF16832f() {
        return this.f16808a.getF16803g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f16808a.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    /* JADX INFO: renamed from: e */
    public final boolean mo4643e(Map.Entry entry) {
        Object key = entry.getKey();
        PersistentHashMapBuilder persistentHashMapBuilder = this.f16808a;
        Object obj = persistentHashMapBuilder.get(key);
        return obj != null ? obj.equals(entry.getValue()) : entry.getValue() == null && persistentHashMapBuilder.containsKey(entry.getKey());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    /* JADX INFO: renamed from: f */
    public final boolean mo4644f(Map.Entry entry) {
        return this.f16808a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentHashMapBuilderEntriesIterator(this.f16808a);
    }
}
