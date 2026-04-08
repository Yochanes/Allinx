package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

    /* JADX INFO: renamed from: c */
    public final Map f16849c;

    /* JADX INFO: renamed from: d */
    public LinkedValue f16850d;

    public MutableMapEntry(Map map, Object obj, LinkedValue linkedValue) {
        super(obj, linkedValue.f16846a);
        this.f16849c = map;
        this.f16850d = linkedValue;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    /* JADX INFO: renamed from: getValue */
    public final Object getF16789b() {
        return this.f16850d.f16846a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        LinkedValue linkedValue = this.f16850d;
        LinkedValue linkedValue2 = new LinkedValue(obj, linkedValue.f16847b, linkedValue.f16848c);
        this.f16850d = linkedValue2;
        this.f16849c.put(this.f16788a, linkedValue2);
        return linkedValue.f16846a;
    }
}
