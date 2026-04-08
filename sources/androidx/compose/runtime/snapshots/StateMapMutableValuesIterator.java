package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class StateMapMutableValuesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<V>, KMutableIterator {
    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = this.f17119f;
        if (entry == null) {
            throw new IllegalStateException();
        }
        m4849c();
        return entry.getValue();
    }
}
