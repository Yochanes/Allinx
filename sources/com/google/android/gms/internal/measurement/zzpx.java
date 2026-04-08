package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpx implements zzpy {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.collection.event_safelist", true);
        zza = zzizVarZza.zza("measurement.service.store_null_safelist", true);
        zzb = zzizVarZza.zza("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
