package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpe implements zzpb {
    private static final zzir<Long> zza;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.client.consent_state_v1", true);
        zzizVarZza.zza("measurement.client.3p_consent_state_v1", true);
        zzizVarZza.zza("measurement.service.consent_state_v1_W36", true);
        zza = zzizVarZza.zza("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpb
    public final long zza() {
        return zza.zza().longValue();
    }
}
