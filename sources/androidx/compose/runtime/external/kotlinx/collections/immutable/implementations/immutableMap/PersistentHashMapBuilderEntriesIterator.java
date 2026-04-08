package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;", "K", "V", "", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PersistentHashMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* JADX INFO: renamed from: a */
    public final PersistentHashMapBuilderBaseIterator f16809a;

    public PersistentHashMapBuilderEntriesIterator(PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeMutableEntriesIterator(this);
        }
        this.f16809a = new PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16809a.f16797c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.f16809a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16809a.remove();
    }
}
