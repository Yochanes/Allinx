package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/util/CaseInsensitiveMap;", "Value", "", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CaseInsensitiveMap<Value> implements Map<String, Value>, KMutableMap {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f46438a = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f46438a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.m18599g(key, "key");
        return this.f46438a.containsKey(new CaseInsensitiveString(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f46438a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new DelegatingMutableSet(this.f46438a.entrySet(), CaseInsensitiveMap$entries$1.f46439a, CaseInsensitiveMap$entries$2.f46440a);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CaseInsensitiveMap)) {
            return false;
        }
        return Intrinsics.m18594b(((CaseInsensitiveMap) obj).f46438a, this.f46438a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.m18599g(key, "key");
        return this.f46438a.get(TextKt.m17181a(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f46438a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f46438a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return new DelegatingMutableSet(this.f46438a.keySet(), CaseInsensitiveMap$keys$1.f46441a, CaseInsensitiveMap$keys$2.f46442a);
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        String key = str;
        Intrinsics.m18599g(key, "key");
        return this.f46438a.put(TextKt.m17181a(key), obj);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.m18599g(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            Intrinsics.m18599g(key, "key");
            this.f46438a.put(TextKt.m17181a(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.m18599g(key, "key");
        return this.f46438a.remove(TextKt.m17181a(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f46438a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f46438a.values();
    }
}
