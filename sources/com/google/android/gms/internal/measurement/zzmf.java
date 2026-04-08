package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmf<K, V> extends LinkedHashMap<K, V> {
    private static final zzmf<?, ?> zza;
    private boolean zzb;

    static {
        zzmf<?, ?> zzmfVar = new zzmf<>();
        zza = zzmfVar;
        ((zzmf) zzmfVar).zzb = false;
    }

    private zzmf() {
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzle.zza((byte[]) obj);
        }
        if (obj instanceof zzlh) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                z2 = true;
                if (z2) {
                    return true;
                }
            } else {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZza = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iZza += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return iZza;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zze();
        zzle.zza(k);
        zzle.zza(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k : map.keySet()) {
            zzle.zza(k);
            zzle.zza(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final zzmf<K, V> zzb() {
        return isEmpty() ? new zzmf<>() : new zzmf<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzmf(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    public static <K, V> zzmf<K, V> zza() {
        return (zzmf<K, V>) zza;
    }

    public final void zza(zzmf<K, V> zzmfVar) {
        zze();
        if (zzmfVar.isEmpty()) {
            return;
        }
        putAll(zzmfVar);
    }
}
