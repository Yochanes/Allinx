package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {

    /* JADX INFO: renamed from: a */
    public PersistentOrderedMap f16854a;

    /* JADX INFO: renamed from: b */
    public Object f16855b;

    /* JADX INFO: renamed from: c */
    public Object f16856c;

    /* JADX INFO: renamed from: d */
    public final PersistentHashMapBuilder f16857d;

    public PersistentOrderedMapBuilder(PersistentOrderedMap persistentOrderedMap) {
        this.f16854a = persistentOrderedMap;
        this.f16855b = persistentOrderedMap.f16851c;
        this.f16856c = persistentOrderedMap.f16852d;
        this.f16857d = persistentOrderedMap.f16853f.mo4649l();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public final PersistentMap build() {
        PersistentHashMap persistentHashMapMo4657j = this.f16857d.mo4657j();
        PersistentOrderedMap persistentOrderedMap = this.f16854a;
        if (persistentHashMapMo4657j != persistentOrderedMap.f16853f) {
            persistentOrderedMap = new PersistentOrderedMap(this.f16855b, this.f16856c, persistentHashMapMo4657j);
        }
        this.f16854a = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: c */
    public final Set mo4653c() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f16857d.clear();
        EndOfChain endOfChain = EndOfChain.f16897a;
        this.f16855b = endOfChain;
        this.f16856c = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f16857d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: e */
    public final Set mo4654e() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: f */
    public final int getF16803g() {
        return this.f16857d.getF16803g();
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: g */
    public final Collection mo4656g() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.f16857d.get(obj);
        if (linkedValue != null) {
            return linkedValue.f16846a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.f16857d;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.get(obj);
        if (linkedValue != null) {
            Object obj3 = linkedValue.f16846a;
            if (obj3 == obj2) {
                return obj2;
            }
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, linkedValue.f16847b, linkedValue.f16848c));
            return obj3;
        }
        boolean zIsEmpty = isEmpty();
        EndOfChain endOfChain = EndOfChain.f16897a;
        if (zIsEmpty) {
            this.f16855b = obj;
            this.f16856c = obj;
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, endOfChain, endOfChain));
            return null;
        }
        Object obj4 = this.f16856c;
        Object obj5 = persistentHashMapBuilder.get(obj4);
        Intrinsics.m18596d(obj5);
        LinkedValue linkedValue2 = (LinkedValue) obj5;
        persistentHashMapBuilder.put(obj4, new LinkedValue(linkedValue2.f16846a, linkedValue2.f16847b, obj));
        persistentHashMapBuilder.put(obj, new LinkedValue(obj2, obj4, endOfChain));
        this.f16856c = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.f16857d;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.remove(obj);
        if (linkedValue == null) {
            return null;
        }
        Object obj2 = EndOfChain.f16897a;
        Object obj3 = linkedValue.f16848c;
        Object obj4 = linkedValue.f16847b;
        if (obj4 != obj2) {
            Object obj5 = persistentHashMapBuilder.get(obj4);
            Intrinsics.m18596d(obj5);
            LinkedValue linkedValue2 = (LinkedValue) obj5;
            persistentHashMapBuilder.put(obj4, new LinkedValue(linkedValue2.f16846a, linkedValue2.f16847b, obj3));
        } else {
            this.f16855b = obj3;
        }
        if (obj3 != obj2) {
            Object obj6 = persistentHashMapBuilder.get(obj3);
            Intrinsics.m18596d(obj6);
            LinkedValue linkedValue3 = (LinkedValue) obj6;
            persistentHashMapBuilder.put(obj3, new LinkedValue(linkedValue3.f16846a, obj4, linkedValue3.f16848c));
        } else {
            this.f16856c = obj4;
        }
        return linkedValue.f16846a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.f16857d.get(obj);
        if (linkedValue == null || !Intrinsics.m18594b(linkedValue.f16846a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
