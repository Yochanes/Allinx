package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzmz {
    private static final zzmz zza = new zzmz();
    private final ConcurrentMap<Class<?>, zznd<?>> zzc = new ConcurrentHashMap();
    private final zznc zzb = new zzlz();

    private zzmz() {
    }

    public static zzmz zza() {
        return zza;
    }

    public final <T> zznd<T> zza(Class<T> cls) {
        zzle.zza(cls, "messageType");
        zznd<T> zzndVarZza = (zznd) this.zzc.get(cls);
        if (zzndVarZza == null) {
            zzndVarZza = this.zzb.zza(cls);
            zzle.zza(cls, "messageType");
            zzle.zza(zzndVarZza, "schema");
            zznd<T> zzndVar = (zznd) this.zzc.putIfAbsent(cls, zzndVarZza);
            if (zzndVar != null) {
                return zzndVar;
            }
        }
        return zzndVarZza;
    }

    public final <T> zznd<T> zza(T t) {
        return zza((Class) t.getClass());
    }
}
