package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeEntriesIterator;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TrieNodeEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f16824c;
        this.f16824c = i + 2;
        Object[] objArr = this.f16822a;
        return new MapEntry(objArr[i], objArr[i + 1]);
    }
}
