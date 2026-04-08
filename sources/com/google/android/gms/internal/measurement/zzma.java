package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzma implements zzmi {
    private zzmi[] zza;

    public zzma(zzmi... zzmiVarArr) {
        this.zza = zzmiVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzmj zza(Class<?> cls) {
        for (zzmi zzmiVar : this.zza) {
            if (zzmiVar.zzb(cls)) {
                return zzmiVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final boolean zzb(Class<?> cls) {
        for (zzmi zzmiVar : this.zza) {
            if (zzmiVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
