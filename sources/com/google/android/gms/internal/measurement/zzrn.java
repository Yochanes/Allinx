package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrn implements zzro {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;
    private static final zzir<Boolean> zzc;
    private static final zzir<Boolean> zzd;
    private static final zzir<Boolean> zze;
    private static final zzir<Boolean> zzf;
    private static final zzir<Boolean> zzg;
    private static final zzir<Boolean> zzh;
    private static final zzir<Boolean> zzi;
    private static final zzir<Boolean> zzj;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.id.rb.attribution.bundle_on_backgrounded", 0L);
        zza = zzizVarZza.zza("measurement.rb.attribution.ad_campaign_info", false);
        zzb = zzizVarZza.zza("measurement.rb.attribution.client.bundle_on_backgrounded", false);
        zzc = zzizVarZza.zza("measurement.rb.attribution.service.bundle_on_backgrounded", false);
        zzd = zzizVarZza.zza("measurement.rb.attribution.client2", true);
        zzizVarZza.zza("measurement.rb.attribution.dma_fix", true);
        zze = zzizVarZza.zza("measurement.rb.attribution.followup1.service", false);
        zzizVarZza.zza("measurement.rb.attribution.index_out_of_bounds_fix", true);
        zzf = zzizVarZza.zza("measurement.rb.attribution.retry_disposition", false);
        zzg = zzizVarZza.zza("measurement.rb.attribution.service", true);
        zzh = zzizVarZza.zza("measurement.rb.attribution.enable_trigger_redaction", true);
        zzi = zzizVarZza.zza("measurement.rb.attribution.uuid_generation", true);
        zzizVarZza.zza("measurement.id.rb.attribution.retry_disposition", 0L);
        zzj = zzizVarZza.zza("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzf() {
        return zze.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzg() {
        return zzf.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzh() {
        return zzg.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzi() {
        return zzh.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzj() {
        return zzi.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzk() {
        return zzj.zza().booleanValue();
    }
}
