package io.ktor.util;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/util/Entry;", "Key", "Value", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
final class Entry<Key, Value> implements Map.Entry<Key, Value>, KMutableMap.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f46470a;

    /* JADX INFO: renamed from: b */
    public Object f46471b;

    public Entry(Object obj, Object obj2) {
        this.f46470a = obj;
        this.f46471b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.m18594b(entry.getKey(), this.f46470a) && Intrinsics.m18594b(entry.getValue(), this.f46471b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f46470a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f46471b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f46470a;
        Intrinsics.m18596d(obj);
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f46471b;
        Intrinsics.m18596d(obj2);
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f46471b = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46470a);
        sb.append('=');
        sb.append(this.f46471b);
        return sb.toString();
    }
}
