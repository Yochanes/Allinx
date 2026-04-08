package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/MapWrapper;", "K", "V", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
class MapWrapper<K, V> implements Map<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final ScatterMap f3729a;

    /* JADX INFO: renamed from: b */
    public Entries f3730b;

    /* JADX INFO: renamed from: c */
    public Keys f3731c;

    /* JADX INFO: renamed from: d */
    public Values f3732d;

    public MapWrapper(ScatterMap parent) {
        Intrinsics.m18599g(parent, "parent");
        this.f3729a = parent;
    }

    /* JADX INFO: renamed from: c */
    public Set mo2011c() {
        Entries entries = this.f3730b;
        if (entries != null) {
            return entries;
        }
        Entries entries2 = new Entries(this.f3729a);
        this.f3730b = entries2;
        return entries2;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f3729a.m2107c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f3729a.m2108d(obj);
    }

    /* JADX INFO: renamed from: e */
    public Set mo2012e() {
        Keys keys = this.f3731c;
        if (keys != null) {
            return keys;
        }
        Keys keys2 = new Keys(this.f3729a);
        this.f3731c = keys2;
        return keys2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo2011c();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.m18594b(this.f3729a, ((MapWrapper) obj).f3729a);
    }

    /* JADX INFO: renamed from: f */
    public Collection mo2013f() {
        Values values = this.f3732d;
        if (values != null) {
            return values;
        }
        Values values2 = new Values(this.f3729a);
        this.f3732d = values2;
        return values2;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f3729a.m2109e(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f3729a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3729a.m2110f();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return mo2012e();
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3729a.f3843e;
    }

    public final String toString() {
        return this.f3729a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return mo2013f();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
