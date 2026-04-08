package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Builder", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PersistentCompositionLocalHashMap extends PersistentHashMap<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap {

    /* JADX INFO: renamed from: g */
    public static final PersistentCompositionLocalHashMap f16932g = new PersistentCompositionLocalHashMap(TrieNode.f16815e, 0);

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap.Builder {

        /* JADX INFO: renamed from: i */
        public PersistentCompositionLocalHashMap f16933i;

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        public final /* bridge */ /* synthetic */ PersistentMap build() {
            return m4737l();
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof CompositionLocal) {
                return super.containsKey((CompositionLocal) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof ValueHolder) {
                return super.containsValue((ValueHolder) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof CompositionLocal) {
                return (ValueHolder) super.get((CompositionLocal) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof CompositionLocal) ? obj2 : (ValueHolder) super.getOrDefault((CompositionLocal) obj, (ValueHolder) obj2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder
        /* JADX INFO: renamed from: j */
        public final /* bridge */ /* synthetic */ PersistentHashMap mo4657j() {
            return m4737l();
        }

        /* JADX INFO: renamed from: l */
        public final PersistentCompositionLocalHashMap m4737l() {
            TrieNode trieNode = this.f16800c;
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = this.f16933i;
            if (trieNode != persistentCompositionLocalHashMap.f16793c) {
                this.f16799b = new MutabilityOwnership();
                persistentCompositionLocalHashMap = new PersistentCompositionLocalHashMap(this.f16800c, getF16803g());
            }
            this.f16933i = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof CompositionLocal) {
                return (ValueHolder) super.remove((CompositionLocal) obj);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* JADX INFO: renamed from: b */
    public final PersistentMap.Builder mo4400b() {
        Builder builder = new Builder(this);
        builder.f16933i = this;
        return builder;
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    /* JADX INFO: renamed from: c */
    public final Object mo4356c(CompositionLocal compositionLocal) {
        return CompositionLocalMapKt.m4357a(this, compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof CompositionLocal) {
            return super.containsKey((CompositionLocal) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof ValueHolder) {
            return super.containsValue((ValueHolder) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof CompositionLocal) {
            return (ValueHolder) super.get((CompositionLocal) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CompositionLocal) ? obj2 : (ValueHolder) super.getOrDefault((CompositionLocal) obj, (ValueHolder) obj2);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    /* JADX INFO: renamed from: i */
    public final PersistentCompositionLocalHashMap mo4401i(ProvidableCompositionLocal providableCompositionLocal, ValueHolder valueHolder) {
        TrieNode.ModificationResult modificationResultM4682u = this.f16793c.m4682u(providableCompositionLocal, providableCompositionLocal.hashCode(), 0, valueHolder);
        if (modificationResultM4682u == null) {
            return this;
        }
        return new PersistentCompositionLocalHashMap(modificationResultM4682u.f16820a, this.f16794d + modificationResultM4682u.f16821b);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap
    /* JADX INFO: renamed from: l */
    public final PersistentHashMapBuilder mo4649l() {
        Builder builder = new Builder(this);
        builder.f16933i = this;
        return builder;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* JADX INFO: renamed from: b */
    public final Builder mo4400b() {
        Builder builder = new Builder(this);
        builder.f16933i = this;
        return builder;
    }
}
