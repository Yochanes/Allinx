package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpw implements zzpt {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.dma_consent.client", true);
        zzizVarZza.zza("measurement.dma_consent.client_bow_check2", true);
        zzizVarZza.zza("measurement.dma_consent.separate_service_calls_fix", true);
        zzizVarZza.zza("measurement.dma_consent.service", true);
        zza = zzizVarZza.zza("measurement.dma_consent.service_database_update_fix", true);
        zzizVarZza.zza("measurement.dma_consent.service_dcu_event", true);
        zzb = zzizVarZza.zza("measurement.dma_consent.service_dcu_event2", true);
        zzizVarZza.zza("measurement.dma_consent.service_npa_remote_default", true);
        zzizVarZza.zza("measurement.dma_consent.service_split_batch_on_consent", true);
        zzizVarZza.zza("measurement.dma_consent.set_consent_inline_on_worker", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpt
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpt
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
