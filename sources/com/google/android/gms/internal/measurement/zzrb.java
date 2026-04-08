package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrb implements zzrc {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.item_scoped_custom_parameters.client", true);
        zzb = zzizVarZza.zza("measurement.item_scoped_custom_parameters.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzrc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrc
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrc
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
