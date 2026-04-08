package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {

    /* JADX INFO: renamed from: a */
    public PersistentHashMap f16798a;

    /* JADX INFO: renamed from: b */
    public MutabilityOwnership f16799b = new MutabilityOwnership();

    /* JADX INFO: renamed from: c */
    public TrieNode f16800c;

    /* JADX INFO: renamed from: d */
    public Object f16801d;

    /* JADX INFO: renamed from: f */
    public int f16802f;

    /* JADX INFO: renamed from: g */
    public int f16803g;

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        this.f16798a = persistentHashMap;
        this.f16800c = persistentHashMap.f16793c;
        this.f16803g = persistentHashMap.getF16794d();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public /* bridge */ /* synthetic */ PersistentMap build() {
        return mo4657j();
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: c */
    public final Set mo4653c() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f16800c = TrieNode.f16815e;
        m4658k(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f16800c.m4666d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: e */
    public final Set mo4654e() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF16803g() {
        return this.f16803g;
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: g */
    public final Collection mo4656g() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f16800c.m4669g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX INFO: renamed from: j */
    public PersistentHashMap mo4657j() {
        TrieNode trieNode = this.f16800c;
        PersistentHashMap persistentHashMap = this.f16798a;
        if (trieNode != persistentHashMap.f16793c) {
            this.f16799b = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap(this.f16800c, getF16803g());
        }
        this.f16798a = persistentHashMap;
        return persistentHashMap;
    }

    /* JADX INFO: renamed from: k */
    public final void m4658k(int i) {
        this.f16803g = i;
        this.f16802f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f16801d = null;
        this.f16800c = this.f16800c.m4673l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f16801d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        PersistentHashMap persistentHashMapMo4657j = null;
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            if (persistentHashMapBuilder != null) {
                persistentHashMapMo4657j = persistentHashMapBuilder.mo4657j();
            }
        } else {
            persistentHashMapMo4657j = persistentHashMap;
        }
        if (persistentHashMapMo4657j == null) {
            super.putAll(map);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i = this.f16803g;
        TrieNode trieNode = this.f16800c;
        TrieNode trieNode2 = persistentHashMapMo4657j.f16793c;
        Intrinsics.m18597e(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f16800c = trieNode.m4674m(trieNode2, 0, deltaCounter, this);
        int i2 = (persistentHashMapMo4657j.f16794d + i) - deltaCounter.f16896a;
        if (i != i2) {
            m4658k(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int f16803g = getF16803g();
        TrieNode trieNodeM4676o = this.f16800c.m4676o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (trieNodeM4676o == null) {
            trieNodeM4676o = TrieNode.f16815e;
        }
        this.f16800c = trieNodeM4676o;
        return f16803g != getF16803g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f16801d = null;
        TrieNode trieNodeM4675n = this.f16800c.m4675n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (trieNodeM4675n == null) {
            trieNodeM4675n = TrieNode.f16815e;
        }
        this.f16800c = trieNodeM4675n;
        return this.f16801d;
    }
}
