package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/MapEntry;", "K", "V", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final Object f3727a;

    /* JADX INFO: renamed from: b */
    public final Object f3728b;

    public MapEntry(Object obj, Object obj2) {
        this.f3727a = obj;
        this.f3728b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3727a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3728b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
