package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpl implements zzpm {
    private static final zzir<Boolean> zza;
    private static final zzir<Boolean> zzb;

    static {
        zziz zzizVarZza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzizVarZza.zza("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        zzb = zzizVarZza.zza("measurement.set_default_event_parameters_propagate_clear.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
