package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrg implements zzrd {
    private static final zzir<Boolean> zza;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzizVarZza.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
        zza = zzizVarZza.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzizVarZza.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrd
    public final boolean zza() {
        return zza.zza().booleanValue();
    }
}
