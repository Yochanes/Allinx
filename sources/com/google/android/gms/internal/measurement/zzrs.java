package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrs implements zzrp {
    private static final zzir<Boolean> zza;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzizVarZza.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zza = zzizVarZza.zza("measurement.session_stitching_token_enabled", false);
        zzizVarZza.zza("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzrp
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrp
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
