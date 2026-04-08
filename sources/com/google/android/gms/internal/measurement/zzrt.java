package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrt implements zzru {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.client.sessions.background_sessions_enabled", true);
        zza = zzizVarZza.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zzizVarZza.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzb = zzizVarZza.zza("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zzizVarZza.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zzizVarZza.zza("measurement.client.sessions.session_id_enabled", true);
        zzizVarZza.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzru
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzru
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
