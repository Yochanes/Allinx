package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrz implements zzsa {
    private static final zzir<Boolean> zza = new zziz(zzio.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzsa
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzsa
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
