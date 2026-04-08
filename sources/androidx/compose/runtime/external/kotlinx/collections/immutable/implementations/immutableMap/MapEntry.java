package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "K", "V", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final Object f16788a;

    /* JADX INFO: renamed from: b */
    public final Object f16789b;

    public MapEntry(Object obj, Object obj2) {
        this.f16788a = obj;
        this.f16789b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.m18594b(entry.getKey(), this.f16788a) && Intrinsics.m18594b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16788a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f16789b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f16788a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16788a);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
