package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzry implements zzrv {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;
    private static final zzir<Boolean> zzc;
    private static final zzir<Boolean> zzd;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.sgtm.google_signal.enable", false);
        zzb = zzizVarZza.zza("measurement.sgtm.preview_mode_enabled", true);
        zzc = zzizVarZza.zza("measurement.sgtm.service", true);
        zzd = zzizVarZza.zza("measurement.sgtm.upload_queue", false);
        zzizVarZza.zza("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrv
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrv
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrv
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrv
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }
}
