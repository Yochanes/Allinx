package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpf implements zzpg {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;
    private static final zzir<Boolean> zzc;
    private static final zzir<Boolean> zzd;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.consent.stop_reset_on_storage_denied.client", true);
        zzb = zzizVarZza.zza("measurement.consent.stop_reset_on_storage_denied.service", true);
        zzc = zzizVarZza.zza("measurement.consent.scrub_audience_data_analytics_consent", true);
        zzd = zzizVarZza.zza("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }
}
