package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrh implements zzri {
    private static final zzir<Boolean> zza;
    private static final zzir<Long> zzb;
    private static final zzir<Double> zzc;
    private static final zzir<Long> zzd;
    private static final zzir<Long> zze;
    private static final zzir<String> zzf;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.test.boolean_flag", false);
        zzb = zzizVarZza.zza("measurement.test.cached_long_flag", -1L);
        zzc = zzizVarZza.zza("measurement.test.double_flag", -3.0d);
        zzd = zzizVarZza.zza("measurement.test.int_flag", -2L);
        zze = zzizVarZza.zza("measurement.test.long_flag", -1L);
        zzf = zzizVarZza.zza("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzri
    public final double zza() {
        return zzc.zza().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzri
    public final long zzb() {
        return zzb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzri
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzri
    public final long zzd() {
        return zze.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzri
    public final String zze() {
        return zzf.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzri
    public final boolean zzf() {
        return zza.zza().booleanValue();
    }
}
