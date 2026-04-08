package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqd implements zzqe {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;
    private static final zzir<Boolean> zzc;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zzizVarZza.zza("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zza = zzizVarZza.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzb = zzizVarZza.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzc = zzizVarZza.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }
}
