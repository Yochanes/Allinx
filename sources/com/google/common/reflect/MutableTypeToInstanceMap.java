package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {
    private final Map<TypeToken<? extends B>, B> backingMap = Maps.newHashMap();

    /* JADX INFO: compiled from: Proguard */
    public static final class UnmodifiableEntry<K, V> extends ForwardingMapEntry<K, V> {
        private final Map.Entry<K, V> delegate;

        /* JADX INFO: renamed from: com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C44831 extends ForwardingSet<Map.Entry<K, V>> {
            final /* synthetic */ Set val$entries;

            public C44831(Set set) {
                this.val$entries = set;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public /* bridge */ /* synthetic */ Object delegate() {
                return delegate();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return UnmodifiableEntry.access$000(super.iterator());
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return standardToArray();
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public /* bridge */ /* synthetic */ Collection delegate() {
                return delegate();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) standardToArray(tArr);
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set<Map.Entry<K, V>> delegate() {
                return this.val$entries;
            }
        }

        private UnmodifiableEntry(Map.Entry<K, V> entry) {
            this.delegate = (Map.Entry) Preconditions.checkNotNull(entry);
        }

        public static /* synthetic */ Iterator access$000(Iterator it) {
            return transformEntries(it);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ UnmodifiableEntry m15064c(Map.Entry entry) {
            return new UnmodifiableEntry(entry);
        }

        public static <K, V> Set<Map.Entry<K, V>> transformEntries(Set<Map.Entry<K, V>> set) {
            return new C44831(set);
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
            return delegate();
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            throw new UnsupportedOperationException();
        }

        private static <K, V> Iterator<Map.Entry<K, V>> transformEntries(Iterator<Map.Entry<K, V>> it) {
            return Iterators.transform(it, new C4508b());
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public Map.Entry<K, V> delegate() {
            return this.delegate;
        }
    }

    @CheckForNull
    private <T extends B> T trustedGet(TypeToken<T> typeToken) {
        return this.backingMap.get(typeToken);
    }

    @CheckForNull
    private <T extends B> T trustedPut(TypeToken<T> typeToken, @ParametricNullness T t) {
        return this.backingMap.put(typeToken, t);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
        return delegate();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        return UnmodifiableEntry.transformEntries(super.entrySet());
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) trustedGet(TypeToken.m15066of((Class) cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, @ParametricNullness Object obj2) {
        return put((TypeToken<? extends Object>) obj, obj2);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    @CheckForNull
    public <T extends B> T putInstance(Class<T> cls, @ParametricNullness T t) {
        return (T) trustedPut(TypeToken.m15066of((Class) cls), t);
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<TypeToken<? extends B>, B> delegate() {
        return this.backingMap;
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    public <T extends B> T getInstance(TypeToken<T> typeToken) {
        return (T) trustedGet(typeToken.rejectTypeVariables());
    }

    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public B put(TypeToken<? extends B> typeToken, @ParametricNullness B b2) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    @CheckForNull
    public <T extends B> T putInstance(TypeToken<T> typeToken, @ParametricNullness T t) {
        return (T) trustedPut(typeToken.rejectTypeVariables(), t);
    }
}
