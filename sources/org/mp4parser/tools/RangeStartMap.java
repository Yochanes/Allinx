package org.mp4parser.tools;

import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class RangeStartMap<K extends Comparable, V> implements Map<K, V> {

    /* JADX INFO: renamed from: org.mp4parser.tools.RangeStartMap$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C64131 implements Comparator<K> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return -((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        throw null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw null;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Comparable) {
            throw null;
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw null;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw null;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof Comparable) {
            throw null;
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        throw null;
    }

    @Override // java.util.Map
    public final Collection values() {
        throw null;
    }
}
