package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/collection/MutableMapWrapper;", "K", "V", "Landroidx/collection/MapWrapper;", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class MutableMapWrapper<K, V> extends MapWrapper<K, V> implements Map<K, V>, KMutableMap {
    @Override // androidx.collection.MapWrapper
    /* JADX INFO: renamed from: c */
    public final Set mo2011c() {
        throw null;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final void clear() {
        throw null;
    }

    @Override // androidx.collection.MapWrapper
    /* JADX INFO: renamed from: e */
    public final Set mo2012e() {
        throw null;
    }

    @Override // androidx.collection.MapWrapper
    /* JADX INFO: renamed from: f */
    public final Collection mo2013f() {
        throw null;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw null;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final void putAll(Map from) {
        Intrinsics.m18599g(from, "from");
        Iterator<Map.Entry<K, V>> it = from.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            next.getKey();
            next.getValue();
            throw null;
        }
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public final Object remove(Object obj) {
        throw null;
    }
}
