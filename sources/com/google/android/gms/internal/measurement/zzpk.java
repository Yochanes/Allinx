package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpk implements zzph {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zzb = zzizVarZza.zza("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzph
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzph
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzph
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
