package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class PersistentHashMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static final PersistentHashMap f16792f = new PersistentHashMap(TrieNode.f16815e, 0);

    /* JADX INFO: renamed from: c */
    public final TrieNode f16793c;

    /* JADX INFO: renamed from: d */
    public final int f16794d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public PersistentHashMap(TrieNode trieNode, int i) {
        this.f16793c = trieNode;
        this.f16794d = i;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ PersistentMap.Builder mo4400b() {
        return mo4649l();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f16793c.m4666d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: e */
    public final Set mo4645e() {
        return new PersistentHashMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: f */
    public final Set mo4646f() {
        return new PersistentHashMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF16794d() {
        return this.f16794d;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f16793c.m4669g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMap
    /* JADX INFO: renamed from: j */
    public final Collection mo4648j() {
        return new PersistentHashMapValues(this);
    }

    /* JADX INFO: renamed from: l */
    public PersistentHashMapBuilder mo4649l() {
        return new PersistentHashMapBuilder(this);
    }

    /* JADX INFO: renamed from: m */
    public final PersistentHashMap m4650m(Object obj, Links links) {
        TrieNode.ModificationResult modificationResultM4682u = this.f16793c.m4682u(obj, obj != null ? obj.hashCode() : 0, 0, links);
        if (modificationResultM4682u == null) {
            return this;
        }
        return new PersistentHashMap(modificationResultM4682u.f16820a, this.f16794d + modificationResultM4682u.f16821b);
    }
}
