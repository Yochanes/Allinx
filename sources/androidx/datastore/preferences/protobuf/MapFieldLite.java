package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final MapFieldLite f24038b;

    /* JADX INFO: renamed from: a */
    public boolean f24039a = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f24038b = mapFieldLite;
        mapFieldLite.f24039a = false;
    }

    /* JADX INFO: renamed from: c */
    public static int m8535c(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof Internal.EnumLite) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = Internal.f24003a;
        int length = bArr.length;
        for (byte b2 : bArr) {
            length = (length * 31) + b2;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8536e();
        super.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m8536e() {
        if (!this.f24039a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        return true;
                    }
                }
                z2 = false;
                if (z2) {
                }
            } else {
                z2 = true;
                if (z2) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final MapFieldLite m8537f() {
        if (isEmpty()) {
            return new MapFieldLite();
        }
        MapFieldLite mapFieldLite = new MapFieldLite(this);
        mapFieldLite.f24039a = true;
        return mapFieldLite;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM8535c = 0;
        for (Map.Entry entry : entrySet()) {
            iM8535c += m8535c(entry.getValue()) ^ m8535c(entry.getKey());
        }
        return iM8535c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m8536e();
        Charset charset = Internal.f24003a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m8536e();
        for (K k : map.keySet()) {
            Charset charset = Internal.f24003a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8536e();
        return super.remove(obj);
    }
}
