package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzho implements com.google.android.gms.internal.measurement.zzo {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzhg zzb;

    public zzho(zzhg zzhgVar, String str) {
        this.zza = str;
        this.zzb = zzhgVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) zzhg.zza(this.zzb).get(this.zza);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
