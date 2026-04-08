package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqc implements zzpz {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;
    private static final zzir<Boolean> zzc;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.client.ad_id_consent_fix", true);
        zzizVarZza.zza("measurement.service.consent.aiid_reset_fix", false);
        zzizVarZza.zza("measurement.service.consent.aiid_reset_fix2", true);
        zza = zzizVarZza.zza("measurement.service.consent.app_start_fix", true);
        zzb = zzizVarZza.zza("measurement.service.consent.params_on_fx", true);
        zzc = zzizVarZza.zza("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpz
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpz
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpz
    public final boolean zzc() {
        return zzc.zza().booleanValue();
    }
}
