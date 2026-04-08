package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmd<K, V> {
    public static <K, V> int zza(zzmc<K, V> zzmcVar, K k, V v) {
        return zzkv.zza(zzmcVar.zza, 1, k) + zzkv.zza(zzmcVar.zzc, 2, v);
    }

    public static <K, V> void zza(zzkl zzklVar, zzmc<K, V> zzmcVar, K k, V v) {
        zzkv.zza(zzklVar, zzmcVar.zza, 1, k);
        zzkv.zza(zzklVar, zzmcVar.zzc, 2, v);
    }
}
