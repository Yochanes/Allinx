package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqp implements zzqq {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.gbraid_campaign.gbraid.client", false);
        zzb = zzizVarZza.zza("measurement.gbraid_campaign.gbraid.service", false);
        zzizVarZza.zza("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqq
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqq
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqq
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
