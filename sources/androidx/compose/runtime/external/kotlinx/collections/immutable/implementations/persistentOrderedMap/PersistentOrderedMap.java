package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PersistentOrderedMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {

    /* JADX INFO: renamed from: c */
    public final Object f16851c;

    /* JADX INFO: renamed from: d */
    public final Object f16852d;

    /* JADX INFO: renamed from: f */
    public final PersistentHashMap f16853f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        PersistentHashMap persistentHashMap = PersistentHashMap.f16792f;
        PersistentHashMap persistentHashMap2 = PersistentHashMap.f16792f;
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.f16851c = obj;
        this.f16852d = obj2;
        this.f16853f = persistentHashMap;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* JADX INFO: renamed from: b */
    public final PersistentMap.Builder mo4400b() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f16853f.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: e */
    public final Set mo4645e() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: f */
    public final Set mo4646f() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: g */
    public final int getF16794d() {
        return this.f16853f.size();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.f16853f.get(obj);
        if (linkedValue != null) {
            return linkedValue.f16846a;
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: j */
    public final Collection mo4648j() {
        return new PersistentOrderedMapValues(this);
    }
}
