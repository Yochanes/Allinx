package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzlz implements zznc {
    private static final zzmi zza = new zzly();
    private final zzmi zzb;

    public zzlz() {
        this(new zzma(zzld.zza(), zza));
    }

    @Override // com.google.android.gms.internal.measurement.zznc
    public final <T> zznd<T> zza(Class<T> cls) {
        zznf.zza((Class<?>) cls);
        zzmj zzmjVarZza = this.zzb.zza(cls);
        if (zzmjVarZza.zzc()) {
            return zzmr.zza(zznf.zza(), zzks.zza(), zzmjVarZza.zza());
        }
        return zzmp.zza(cls, zzmjVarZza, zzmv.zza(), zzlx.zza(), zznf.zza(), zzmb.zza[zzmjVarZza.zzb().ordinal()] != 1 ? zzks.zza() : null, zzmg.zza());
    }

    private zzlz(zzmi zzmiVar) {
        this.zzb = (zzmi) zzle.zza(zzmiVar, "messageInfoFactory");
    }
}
